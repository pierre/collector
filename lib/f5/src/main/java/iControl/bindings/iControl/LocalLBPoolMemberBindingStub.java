/**
 * LocalLBPoolMemberBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBPoolMemberBindingStub extends org.apache.axis.client.Stub implements iControl.LocalLBPoolMemberPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[22];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_all_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberStatisticsSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberStatistics[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_connection_limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberConnectionLimitSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberConnectionLimit[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_dynamic_ratio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberDynamicRatioSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberDynamicRatio[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_monitor_association");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberMonitorAssociation[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_monitor_instance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorInstanceStateSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberMonitorInstanceState[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_monitor_status");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStatusSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberMonitorStatus[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_object_status");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberObjectStatusSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberObjectStatus[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_priority");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberPrioritySequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberPriority[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ratio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberRatioSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberRatio[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_session_enabled_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStateSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberSessionState[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_session_status");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStatusSequenceSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberSessionStatus[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberStatisticsSequence"));
        oper.setReturnClass(iControl.LocalLBPoolMemberMemberStatistics[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_version");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_monitor_association");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitor_associations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationRemovalSequenceSequence"), iControl.LocalLBPoolMemberMemberMonitorAssociationRemoval[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reset_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_connection_limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limits"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberConnectionLimitSequenceSequence"), iControl.LocalLBPoolMemberMemberConnectionLimit[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_dynamic_ratio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dynamic_ratios"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberDynamicRatioSequenceSequence"), iControl.LocalLBPoolMemberMemberDynamicRatio[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_monitor_association");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitor_associations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationSequenceSequence"), iControl.LocalLBPoolMemberMemberMonitorAssociation[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_monitor_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitor_states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStateSequenceSequence"), iControl.LocalLBPoolMemberMemberMonitorState[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_priority");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "priorities"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberPrioritySequenceSequence"), iControl.LocalLBPoolMemberMemberPriority[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ratio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ratios"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberRatioSequenceSequence"), iControl.LocalLBPoolMemberMemberRatio[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_session_enabled_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session_states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStateSequenceSequence"), iControl.LocalLBPoolMemberMemberSessionState[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

    }

    public LocalLBPoolMemberBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LocalLBPoolMemberBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LocalLBPoolMemberBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition");
            cachedSerQNames.add(qName);
            cls = iControl.CommonIPPortDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequence");
            cachedSerQNames.add(qName);
            cls = iControl.CommonIPPortDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.CommonIPPortDefinition[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.Statistic");
            cachedSerQNames.add(qName);
            cls = iControl.CommonStatistic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.StatisticSequence");
            cachedSerQNames.add(qName);
            cls = iControl.CommonStatistic[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.Statistic");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.StatisticType");
            cachedSerQNames.add(qName);
            cls = iControl.CommonStatisticType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.ULong64");
            cachedSerQNames.add(qName);
            cls = iControl.CommonULong64.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.AddressType");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.AvailabilityStatus");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBAvailabilityStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.EnabledStatus");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBEnabledStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorAssociationRemovalRule");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorAssociationRemovalRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstance");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstanceState");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorInstanceState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstanceStateSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorInstanceState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstanceState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstanceStateType");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorInstanceStateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorIPPort");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorIPPort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorRule");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorRuleType");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorRuleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorStatus");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBMonitorStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ObjectStatus");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBObjectStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberConnectionLimit");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberConnectionLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberConnectionLimitSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberConnectionLimit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberConnectionLimit");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberConnectionLimitSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberConnectionLimit[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberConnectionLimitSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberDynamicRatio");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberDynamicRatio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberDynamicRatioSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberDynamicRatio[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberDynamicRatio");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberDynamicRatioSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberDynamicRatio[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberDynamicRatioSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociation");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationRemoval");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorAssociationRemoval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationRemovalSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorAssociationRemoval[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationRemoval");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationRemovalSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorAssociationRemoval[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationRemovalSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorAssociation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorAssociation[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociationSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorInstanceState");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorInstanceState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorInstanceStateSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorInstanceState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorInstanceState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorInstanceStateSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorInstanceState[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorInstanceStateSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorState");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStateSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStateSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorState[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStateSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStatus");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStatusSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStatusSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberMonitorStatus[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorStatusSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberObjectStatus");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberObjectStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberObjectStatusSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberObjectStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberObjectStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberObjectStatusSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberObjectStatus[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberObjectStatusSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberPriority");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberPrioritySequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberPriority[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberPriority");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberPrioritySequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberPriority[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberPrioritySequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberRatio");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberRatio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberRatioSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberRatio[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberRatio");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberRatioSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberRatio[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberRatioSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionState");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberSessionState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStateSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberSessionState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStateSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberSessionState[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStateSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStatus");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberSessionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStatusSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberSessionStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStatusSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberSessionStatus[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionStatusSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberStatisticEntry");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberStatisticEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberStatisticEntrySequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberStatisticEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberStatisticEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberStatistics");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberStatisticsSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBPoolMemberMemberStatistics[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberStatistics");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.SessionStatus");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBSessionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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
     * Gets the statistics for all pool members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberStatistics[] get_all_statistics(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_all_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberStatistics[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberStatistics[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberStatistics[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the connection limits for all members in the specified
     * pools.
     */
    public iControl.LocalLBPoolMemberMemberConnectionLimit[][] get_connection_limit(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_connection_limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberConnectionLimit[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberConnectionLimit[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberConnectionLimit[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the dynamic ratios for all members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberDynamicRatio[][] get_dynamic_ratio(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_dynamic_ratio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberDynamicRatio[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberDynamicRatio[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberDynamicRatio[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the monitor associations used by the specified pool members,
     * i.e. the monitor rules used by the pool members.
     */
    public iControl.LocalLBPoolMemberMemberMonitorAssociation[][] get_monitor_association(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_monitor_association"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberMonitorAssociation[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberMonitorAssociation[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberMonitorAssociation[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the monitor instance information for the pool members
     * in the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberMonitorInstanceState[][] get_monitor_instance(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_monitor_instance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberMonitorInstanceState[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberMonitorInstanceState[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberMonitorInstanceState[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the monitor/availability status for all members of the
     * specified pools.
     */
    public iControl.LocalLBPoolMemberMemberMonitorStatus[][] get_monitor_status(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_monitor_status"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberMonitorStatus[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberMonitorStatus[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberMonitorStatus[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the object statuses for all members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberObjectStatus[][] get_object_status(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_object_status"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberObjectStatus[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberObjectStatus[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberObjectStatus[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the priorities for all members in the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberPriority[][] get_priority(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_priority"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberPriority[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberPriority[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberPriority[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the ratios for all members in the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberRatio[][] get_ratio(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_ratio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberRatio[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberRatio[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberRatio[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Note: This function has been deprecated. Please use get_session_status.
     * 
     *  Gets the session states for all members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberSessionState[][] get_session_enabled_state(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_session_enabled_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberSessionState[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberSessionState[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberSessionState[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the session status for all members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberSessionStatus[][] get_session_status(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_session_status"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberSessionStatus[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberSessionStatus[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberSessionStatus[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the statistics for the specified set of pool members.
     */
    public iControl.LocalLBPoolMemberMemberStatistics[] get_statistics(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBPoolMemberMemberStatistics[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBPoolMemberMemberStatistics[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBPoolMemberMemberStatistics[].class);
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
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "get_version"));

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
     * Removes the monitor associations for the specified pool members.
     * Depending on the monitor association removal rule
     *  specified, this basically deletes any explicit monitor associations
     * between a pool member and a monitor rule and thus
     *  causing the pool member to use the default monitor association of
     * its parent pool, or this will delete any monitor 
     *  association for the pool members altogether, i.e. the specified pool
     * members will no longer be monitored.
     */
    public void remove_monitor_association(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberMonitorAssociationRemoval[][] monitor_associations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "remove_monitor_association"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, monitor_associations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the statistics for the specified set of pool members.
     */
    public void reset_statistics(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "reset_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the connection limits for the specified pool members.
     */
    public void set_connection_limit(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberConnectionLimit[][] limits) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "set_connection_limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, limits});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the dynamic ratios for the specified pool members.
     */
    public void set_dynamic_ratio(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberDynamicRatio[][] dynamic_ratios) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "set_dynamic_ratio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, dynamic_ratios});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets/creates the monitor associations for the specified pool
     * members. This basically creates the monitor 
     *  associations between a pool member and a monitor rule.
     */
    public void set_monitor_association(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberMonitorAssociation[][] monitor_associations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "set_monitor_association"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, monitor_associations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the monitor/availability states for the specified pool
     * members.
     */
    public void set_monitor_state(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberMonitorState[][] monitor_states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "set_monitor_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, monitor_states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the priorities for the specified pool members.
     */
    public void set_priority(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberPriority[][] priorities) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "set_priority"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, priorities});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the ratios for the specified pool members.
     */
    public void set_ratio(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberRatio[][] ratios) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "set_ratio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, ratios});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the session states for the specified pool members. If
     * session state is enabled or true,
     *  this means that new sessions will be allowed to be established with
     * the pool members.
     */
    public void set_session_enabled_state(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberSessionState[][] session_states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/PoolMember", "set_session_enabled_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, session_states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
