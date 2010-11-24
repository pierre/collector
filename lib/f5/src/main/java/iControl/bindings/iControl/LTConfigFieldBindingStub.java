/**
 * LTConfigFieldBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LTConfigFieldBindingStub extends org.apache.axis.client.Stub implements iControl.LTConfigFieldPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_application_data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_clustered_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LTConfig.Field.EnabledStateSequenceSequence"));
        oper.setReturnClass(iControl.CommonEnabledState[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_configsyncd_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LTConfig.Field.EnabledStateSequenceSequence"));
        oper.setReturnClass(iControl.CommonEnabledState[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_db_variable_mirror_information");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_default");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_display_name");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_required_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LTConfig.Field.EnabledStateSequenceSequence"));
        oper.setReturnClass(iControl.CommonEnabledState[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_type_information");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_instance_key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassInstanceKey"), iControl.LTConfigClassInstanceKey.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_instance_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_values");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_instance_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassInstanceKeySequence"), iControl.LTConfigClassInstanceKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_instance_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_version");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "create_instances_if_needed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_instance_key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassInstanceKey"), iControl.LTConfigClassInstanceKey.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_instance_name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_values");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "create_instances_if_needed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_instance_keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassInstanceKeySequence"), iControl.LTConfigClassInstanceKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field_instance_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

    }

    public LTConfigFieldBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LTConfigFieldBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LTConfigFieldBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState");
            cachedSerQNames.add(qName);
            cls = iControl.CommonEnabledState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.EnabledStateSequence");
            cachedSerQNames.add(qName);
            cls = iControl.CommonEnabledState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassInstanceKey");
            cachedSerQNames.add(qName);
            cls = iControl.LTConfigClassInstanceKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassInstanceKeySequence");
            cachedSerQNames.add(qName);
            cls = iControl.LTConfigClassInstanceKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassInstanceKey");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LTConfig.Field.EnabledStateSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.CommonEnabledState[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.EnabledStateSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }


    /**
     * Gets application data for one or more loosely-typed
     *  configuration fields for the specified classes. This is the
     *  "back-end application hook".
     */
    public java.lang.String[][] get_application_data(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_application_data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, field_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the clustered state for one or more specified
     *  loosely-typed configuration fields for the specified
     *  classes. If the field is clustered, that means don't use the
     *  default.
     */
    public iControl.CommonEnabledState[][] get_clustered_state(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_clustered_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, field_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.CommonEnabledState[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.CommonEnabledState[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.CommonEnabledState[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the configsyncd state for one or more specified
     *  loosely-typed configuration fields for the specified
     *  classes. If the field is configsyncd, that means don't use the
     *  default.
     */
    public iControl.CommonEnabledState[][] get_configsyncd_state(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_configsyncd_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, field_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.CommonEnabledState[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.CommonEnabledState[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.CommonEnabledState[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets db variable mirror information for one or more
     *  loosely-typed configuration fields for the specified
     *  classes. This, if non-empty, indicates which db variable
     *  should have its value mirrored with this field.
     */
    public java.lang.String[][] get_db_variable_mirror_information(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_db_variable_mirror_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, field_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets default value information for one or more loosely-typed
     * configuration fields for the specified classes.
     */
    public java.lang.String[][] get_default(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_default"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, field_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets display name information for one or more loosely-typed
     * configuration fields for the specified classes.
     */
    public java.lang.String[][] get_display_name(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_display_name"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, field_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of loosely-typed configuration fields for the
     *  specified classes.
     */
    public java.lang.String[][] get_list(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the required state for one or more specified
     *  loosely-typed configuration fields for the specified
     *  classes. If the field is required, that means don't use the
     *  default.
     */
    public iControl.CommonEnabledState[][] get_required_state(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_required_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, field_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.CommonEnabledState[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.CommonEnabledState[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.CommonEnabledState[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets type information for one or more loosely-typed
     *  configuration fields for the specified classes.
     *  (This is not to be confused with type; type information
     *  gives information relevant to the processing of a basic
     *  type, for example, type int might have type information
     *  specifying min and max value).
     */
    public java.lang.String[][] get_type_information(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_type_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, field_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the value for one loosely-typed configuration
     *  field instance for the specified class instance.
     * 
     *  This is for convenience, when you want to get just one
     *  value in just one class instance. Use get_values instead
     *  for greater efficiency when getting multiple field values.
     */
    public java.lang.String get_value(iControl.LTConfigClassInstanceKey class_instance_key, java.lang.String field_instance_name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_instance_key, field_instance_name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets values for one or more loosely-typed configuration
     *  field instances for the specified class instances.
     */
    public java.lang.String[][] get_values(iControl.LTConfigClassInstanceKey[] class_instance_keys, java.lang.String[][] field_instance_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_values"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_instance_keys, field_instance_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "get_version"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the value for one loosely-typed configuration
     *  field instance for the specified class instance.
     * 
     *  This is for convenience, when you want to set just one
     *  value in just one class instance. Use set_values instead
     *  for greater efficiency when setting multiple field values.
     */
    public void set_value(boolean create_instances_if_needed, iControl.LTConfigClassInstanceKey class_instance_key, java.lang.String field_instance_name, java.lang.String value) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "set_value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(create_instances_if_needed), class_instance_key, field_instance_name, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets values for one or more loosely-typed configuration
     *  field instances for the specified class instances.
     */
    public void set_values(boolean create_instances_if_needed, iControl.LTConfigClassInstanceKey[] class_instance_keys, java.lang.String[][] field_instance_names, java.lang.String[][] values) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LTConfig/Field");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LTConfig/Field", "set_values"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(create_instances_if_needed), class_instance_keys, field_instance_names, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
