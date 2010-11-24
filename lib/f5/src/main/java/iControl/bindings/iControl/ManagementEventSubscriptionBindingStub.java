/**
 * ManagementEventSubscriptionBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventSubscriptionBindingStub extends org.apache.axis.client.Stub implements iControl.ManagementEventSubscriptionPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[21];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sub_detail_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDetailsSequence"), iControl.ManagementEventSubscriptionSubscriptionDetails[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_available_event_types");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.EventTypeSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionEventType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_list");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_max_timeslice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"), iControl.ManagementEventSubscriptionSubscriptionStatus[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "max_timeslice_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Common.LongSequence"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_min_events_per_timeslice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"), iControl.ManagementEventSubscriptionSubscriptionStatus[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "min_events_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Common.LongSequence"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"), iControl.ManagementEventSubscriptionSubscriptionStatus[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "state_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Common.EnabledStateSequence"), iControl.CommonEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"), iControl.ManagementEventSubscriptionSubscriptionStatus[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "statistics_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatisticsSequence"), iControl.ManagementEventSubscriptionSubscriptionStatistics[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ttl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"), iControl.ManagementEventSubscriptionSubscriptionStatus[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttl_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Common.LongSequence"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_url");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"), iControl.ManagementEventSubscriptionSubscriptionStatus[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_version");
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
        oper.setName("modify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sub_def_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDefinitionSequence"), iControl.ManagementEventSubscriptionSubscriptionDefinition[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ping");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatus"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "return"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"), iControl.ManagementEventSubscriptionSubscriptionStatus[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sub_def_list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDefinitionSequence"), iControl.ManagementEventSubscriptionSubscriptionDefinition[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reset_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_authentication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "credential_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.UserCredentialSequence"), iControl.ManagementEventSubscriptionUserCredential[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_max_timeslice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "max_timeslice_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.LongSequence"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_min_events_per_timeslice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "min_events_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.LongSequence"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "state_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.EnabledStateSequence"), iControl.CommonEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ttl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ttl_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.LongSequence"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_url");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url_list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence"));
        oper.setReturnClass(iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

    }

    public ManagementEventSubscriptionBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ManagementEventSubscriptionBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ManagementEventSubscriptionBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.LongSequence");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.TimeStamp");
            cachedSerQNames.add(qName);
            cls = iControl.CommonTimeStamp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.AuthenticationMode");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionAuthenticationMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.EventType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.EventTypeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionEventType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.EventType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDefinition");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDefinitionSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDefinition");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDetails");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDetailsSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDetails");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatistics");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatisticsSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionStatistics[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatistics");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatus");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusCode");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionSubscriptionStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.UserCredential");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionUserCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.UserCredentialSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementEventSubscriptionUserCredential[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.UserCredential");
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
     * Create a new subscription.  This takes an an input a list of
     * subscription details, one for each subscription requested.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] create(iControl.ManagementEventSubscriptionSubscriptionDetails[] sub_detail_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sub_detail_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Retrieve a list of event types available on this system.
     */
    public iControl.ManagementEventSubscriptionEventType[] get_available_event_types() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_available_event_types"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionEventType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionEventType[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionEventType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Retrieve the list of configured subscription identifiers.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Get the maximum timeslice (in seconds) between event notifications
     * for the list of subscription identifiers.
     */
    public void get_max_timeslice(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonLongSequenceHolder max_timeslice_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_max_timeslice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
            try {
                max_timeslice_list.value = (long[]) _output.get(new javax.xml.namespace.QName("", "max_timeslice_list"));
            } catch (java.lang.Exception _exception) {
                max_timeslice_list.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "max_timeslice_list")), long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Get the minimum number of events needed to trigger a notification
     * message.
     */
    public void get_min_events_per_timeslice(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonLongSequenceHolder min_events_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_min_events_per_timeslice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
            try {
                min_events_list.value = (long[]) _output.get(new javax.xml.namespace.QName("", "min_events_list"));
            } catch (java.lang.Exception _exception) {
                min_events_list.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "min_events_list")), long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Get the enabled state of a list of subscription identifiers.
     */
    public void get_state(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonEnabledStateSequenceHolder state_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
            try {
                state_list.value = (iControl.CommonEnabledState[]) _output.get(new javax.xml.namespace.QName("", "state_list"));
            } catch (java.lang.Exception _exception) {
                state_list.value = (iControl.CommonEnabledState[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "state_list")), iControl.CommonEnabledState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Get the statistics for the given list of subscription identifiers.
     */
    public void get_statistics(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.ManagementEventSubscriptionSubscriptionStatisticsSequenceHolder statistics_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
            try {
                statistics_list.value = (iControl.ManagementEventSubscriptionSubscriptionStatistics[]) _output.get(new javax.xml.namespace.QName("", "statistics_list"));
            } catch (java.lang.Exception _exception) {
                statistics_list.value = (iControl.ManagementEventSubscriptionSubscriptionStatistics[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "statistics_list")), iControl.ManagementEventSubscriptionSubscriptionStatistics[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Get the time to live (ttl) in seconds for the list of subscription
     * identifiers.
     */
    public void get_ttl(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonLongSequenceHolder ttl_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_ttl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
            try {
                ttl_list.value = (long[]) _output.get(new javax.xml.namespace.QName("", "ttl_list"));
            } catch (java.lang.Exception _exception) {
                ttl_list.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ttl_list")), long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Get the url endpoint that implements the EventNotification
     * interface.
     */
    public void get_url(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonStringSequenceHolder url_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_url"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
            try {
                url_list.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("", "url_list"));
            } catch (java.lang.Exception _exception) {
                url_list.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "url_list")), java.lang.String[].class);
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
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "get_version"));

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
     * Modify a list of subscriptions.  This takes a list of subscription
     * definitions representing the subscriptions that are
     * to be modified.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] modify(iControl.ManagementEventSubscriptionSubscriptionDefinition[] sub_def_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "modify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sub_def_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * A lightweight ping to determine the event notification service's
     * health.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus ping() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Retrieve the subscription definitions for a list of subscription
     * identifiers.
     */
    public void query(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.ManagementEventSubscriptionSubscriptionDefinitionSequenceHolder sub_def_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _output.get(new javax.xml.namespace.QName("", "return"));
            } catch (java.lang.Exception _exception) {
                _return.value = (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "return")), iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
            try {
                sub_def_list.value = (iControl.ManagementEventSubscriptionSubscriptionDefinition[]) _output.get(new javax.xml.namespace.QName("", "sub_def_list"));
            } catch (java.lang.Exception _exception) {
                sub_def_list.value = (iControl.ManagementEventSubscriptionSubscriptionDefinition[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sub_def_list")), iControl.ManagementEventSubscriptionSubscriptionDefinition[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Remove a list of subscriptions.  This takes as input a list
     * of subscription id's and returns a list of status
     * structures with the associated status code for each item in the id_list.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] remove(java.lang.String[] id_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "remove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Reset the statistics for the given list of subscription identifiers.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] reset_statistics(java.lang.String[] id_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "reset_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Set the credentials for the url's associated with the given
     * list of subscription identifiers.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_authentication(java.lang.String[] id_list, iControl.ManagementEventSubscriptionUserCredential[] credential_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "set_authentication"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list, credential_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Set the maximum timeslice (in seconds) between event notifications.
     * This value is used
     * to ensure that notifications are sent despite the minimum event attribute
     * not reaching
     * its threashold.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_max_timeslice(java.lang.String[] id_list, long[] max_timeslice_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "set_max_timeslice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list, max_timeslice_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Set the minimum number of events needed to trigger a notification
     * message.
     * This value is used to force a notification message to occur even if
     * the 
     * max timeslice attribute is not reached yet.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_min_events_per_timeslice(java.lang.String[] id_list, long[] min_events_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "set_min_events_per_timeslice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list, min_events_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Set the enabled state of a list of subscriptions identifiers
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_state(java.lang.String[] id_list, iControl.CommonEnabledState[] state_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "set_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list, state_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Set the time to live (ttl) in seconds for the list of subscription
     * identifiers.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_ttl(java.lang.String[] id_list, long[] ttl_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "set_ttl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list, ttl_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Set the url endpoint that implements the EventNotification
     * interface.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_url(java.lang.String[] id_list, java.lang.String[] url_list) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/EventSubscription");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/EventSubscription", "set_url"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_list, url_list});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementEventSubscriptionSubscriptionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementEventSubscriptionSubscriptionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
