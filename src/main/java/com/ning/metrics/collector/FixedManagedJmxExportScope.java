/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import org.apache.log4j.Logger;

import com.ning.metrics.collector.binder.annotations.Managed;

import javax.management.Descriptor;
import javax.management.IntrospectionException;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.modelmbean.DescriptorSupport;
import javax.management.modelmbean.ModelMBeanAttributeInfo;
import javax.management.modelmbean.ModelMBeanConstructorInfo;
import javax.management.modelmbean.ModelMBeanInfo;
import javax.management.modelmbean.ModelMBeanInfoSupport;
import javax.management.modelmbean.ModelMBeanNotificationInfo;
import javax.management.modelmbean.ModelMBeanOperationInfo;
import javax.management.modelmbean.RequiredModelMBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A scope to do automatic exporting of injected objects.
 * <p/>
 * Use of this scope also binds the object as a singleton by design.
 */
public class FixedManagedJmxExportScope implements Scope
{
    private final InternalScope innerScope;

    public FixedManagedJmxExportScope(String objectName)
    {
        this(Logger.getLogger(FixedManagedJmxExportScope.class), objectName);
    }

    public FixedManagedJmxExportScope(Logger log, String objectName)
    {
        this.innerScope = new InternalScope(log, objectName);
    }

    /**
     * Scopes a provider. The returned provider returns objects from this scope.
     * If an object does not exist in this scope, the provider can use the given
     * unscoped provider to retrieve one.
     * <p/>
     * <p>Scope implementations are strongly encouraged to override
     * {@link Object#toString} in the returned provider and include the backing
     * provider's {@code toString()} output.
     *
     * @param key      binding key
     * @param unscoped locates an instance when one doesn't already exist in this
     *                 scope.
     * @return a new provider which only delegates to the given unscoped provider
     *         when an instance of the requested object doesn't already exist in this
     *         scope
     */
    @Override
    public <T> Provider<T> scope(Key<T> key, Provider<T> unscoped)
    {
        return Scopes.SINGLETON.scope(key, innerScope.scope(key, unscoped));
    }

    public static class InternalScope implements Scope
    {
        private final String objectName;
        private final MBeanServer server;

        private final Pattern getterOrSetterPattern = Pattern.compile("(get|set|is)(.)(.*)");
        private final Logger log;


        public InternalScope(Logger log, String objectName)
        {
            this.objectName = objectName;
            this.server = ManagementFactory.getPlatformMBeanServer();
            this.log = log;
        }

        @Override
        public <T> Provider<T> scope(Key<T> tKey, final Provider<T> tProvider)
        {
            return new Provider<T>()
            {
                private volatile boolean exported = false;

                @Override
                public synchronized T get()
                {
                    final T object = tProvider.get();
                    log.info(String.format("Exporting object[%s] at [%s]", object.getClass(), objectName));
                    if (!exported) {
                        export(objectName, object);
                        exported = true;
                    }
                    return object;
                }
            };
        }

        private void export(String name, Object monitoredObject)
        {
            try {
                ObjectName objectName = new ObjectName(name);

                RequiredModelMBean mbean = getMBean(monitoredObject);
                mbean.setManagedResource(monitoredObject, "objectReference");

                // register the model MBean in the MBean server
                server.registerMBean(mbean, objectName);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private RequiredModelMBean getMBean(Object monitoredObject)
        {
            try {
                ModelMBeanInfo info = buildInfo(monitoredObject.getClass());

                return new RequiredModelMBean(new ModelMBeanInfoSupport(info));
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public boolean includeMethod(Method method)
        {
            log.debug(String.format("Include method[%s]? %s", method.getName(), method.getAnnotation(Managed.class) != null));
            return method.getAnnotation(Managed.class) != null;
        }

        public String getDescription(Method method)
        {
            Managed annotation = method.getAnnotation(Managed.class);
            if (annotation == null) {
                throw new RuntimeException("FixedManagedJmxExportScope is trying to export a method without a managed annotation.  Method name: " + method.getName());
            }

            log.debug(String.format("Method[%s] given description[%s].", method.getName(), annotation.description()));
            return annotation.description();
        }

        public void addAttribute(String attributeName, Method method)
        {
            Managed annotation = method.getAnnotation(Managed.class);
            if (annotation == null) {
                throw new RuntimeException("FixedManagedJmxExportScope is trying to export a method without a managed annotation.  Method name: " + method.getName());
            }
        }

        private ModelMBeanInfo buildInfo(Class clazz)
            throws IntrospectionException
        {
            List<OperationDescriptor> operations = new ArrayList<OperationDescriptor>();
            Map<String, AttributeDescriptor> attributeDescriptors = new HashMap<String, AttributeDescriptor>();

            String className = clazz.getName();

            while (clazz != null) {
                for (Method method : clazz.getMethods()) {
                    if (!includeMethod(method)) {
                        continue;
                    }

                    String name = method.getName();
                    String description = getDescription(method);

                    Matcher matcher = getterOrSetterPattern.matcher(name);
                    OperationDescriptor operation = null;

                    if (matcher.matches()) {
                        String type = matcher.group(1);
                        String first = matcher.group(2);
                        String rest = matcher.group(3);

                        String attributeName = first + (rest != null ? rest : "");

                        AttributeDescriptor descriptor = attributeDescriptors.get(attributeName);
                        if (descriptor == null) {
                            descriptor = new AttributeDescriptor(attributeName, description);
                        }

                        if ((type.equals("get") || type.equals("is")) && method.getParameterTypes().length == 0) {
                            descriptor.setGetter(method);
                            operation = new OperationDescriptor(method, "getter");
                            attributeDescriptors.put(attributeName, descriptor);
                            addAttribute(attributeName, method);
                        }
                        else if (type.equals("set") && method.getParameterTypes().length == 1) {
                            descriptor.setSetter(method);
                            operation = new OperationDescriptor(method, "setter");
                            attributeDescriptors.put(attributeName, descriptor);
                        }
                    }

                    if (operation == null) {
                        operation = new OperationDescriptor(method, "operation");
                    }

                    operations.add(operation);
                }

                clazz = clazz.getSuperclass();
            }


            List<ModelMBeanAttributeInfo> attributeInfos = new ArrayList<ModelMBeanAttributeInfo>();

            for (AttributeDescriptor attribute : attributeDescriptors.values()) {
                Descriptor descriptor = new DescriptorSupport();
                descriptor.setField("name", attribute.getName());
                descriptor.setField("descriptorType", "attribute");
                if (attribute.getGetter() != null) {
                    descriptor.setField("getMethod", attribute.getGetter().getName());
                }
                if (attribute.getSetter() != null) {
                    descriptor.setField("setMethod", attribute.getSetter().getName());
                }

                attributeInfos.add(new ModelMBeanAttributeInfo(attribute.getName(),
                    attribute.getDescription(),
                    attribute.getGetter(),
                    attribute.getSetter(),
                    descriptor));
            }

            List<ModelMBeanOperationInfo> operationInfos = new ArrayList<ModelMBeanOperationInfo>();

            for (OperationDescriptor operation : operations) {
                Descriptor descriptor = new DescriptorSupport();
                descriptor.setField("name", operation.getMethod().getName());
                descriptor.setField("class", className);
                descriptor.setField("descriptorType", "operation");
                descriptor.setField("role", operation.getRole());

                operationInfos.add(new ModelMBeanOperationInfo("",
                    operation.getMethod(),
                    descriptor));

                // TODO: discover parameter names
                // see http://jroller.com/eu/entry/using_asm_to_read_mathod

            }

            return new ModelMBeanInfoSupport(className, null,
                attributeInfos.toArray(new ModelMBeanAttributeInfo[attributeInfos.size()]),
                new ModelMBeanConstructorInfo[0],
                operationInfos.toArray(new ModelMBeanOperationInfo[attributeInfos.size()]),
                new ModelMBeanNotificationInfo[0]);
        }

        private static class OperationDescriptor
        {
            private final Method method;
            private final String role;

            public OperationDescriptor(Method method, String role)
            {
                this.method = method;
                this.role = role;
            }

            public Method getMethod()
            {
                return method;
            }

            public String getRole()
            {
                return role;
            }
        }

        private static class AttributeDescriptor
        {
            private Method getter = null;
            private Method setter = null;
            private final String description;
            private final String name;

            private AttributeDescriptor(String name, String description)
            {
                this.name = name;
                this.description = description;
            }

            public String getName()
            {
                return name;
            }

            public Method getGetter()
            {
                return getter;
            }

            public void setGetter(Method getter)
            {
                this.getter = getter;
            }

            public Method getSetter()
            {
                return setter;
            }

            public void setSetter(Method setter)
            {
                this.setter = setter;
            }

            public String getDescription()
            {
                return description;
            }
        }
    }
}