/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
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
import com.ning.metrics.serialization.util.FixedManagedJmxExport;
import org.apache.log4j.Logger;

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
        private final Logger log;

        public InternalScope(Logger log, String objectName)
        {
            this.objectName = objectName;
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
                        FixedManagedJmxExport.export(objectName, object);
                        exported = true;
                    }
                    return object;
                }
            };
        }
    }
}