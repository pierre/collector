/**
 * GlobalLBPoolMemberBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBPoolMemberBindingStub extends org.apache.axis.client.Stub implements iControl.GlobalLBPoolMemberPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_dependency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dependencies"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberDependencySequenceSequence"), iControl.GlobalLBPoolMemberMemberDependency[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_all_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberStatisticsSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberStatistics[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_dependency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberDependencySequenceSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberDependency[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_enabled_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberEnabledStateSequenceSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberEnabledState[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMetricLimitSequenceSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberMetricLimit[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_monitor_association");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationSequenceSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberMonitorAssociation[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_object_status");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberObjectStatusSequenceSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberObjectStatus[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_order");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberOrderSequenceSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberOrder[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ratio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberRatioSequenceSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberRatio[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberStatisticsSequence"));
        oper.setReturnClass(iControl.GlobalLBPoolMemberMemberStatistics[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_version");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_all_dependencies");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinitionSequenceSequence"), iControl.CommonIPPortDefinition[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_dependency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dependencies"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberDependencySequenceSequence"), iControl.GlobalLBPoolMemberMemberDependency[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_monitor_association");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitor_associations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationRemovalSequenceSequence"), iControl.GlobalLBPoolMemberMemberMonitorAssociationRemoval[][].class, false, false);
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
        oper.setName("set_enabled_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberEnabledStateSequenceSequence"), iControl.GlobalLBPoolMemberMemberEnabledState[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limits"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMetricLimitSequenceSequence"), iControl.GlobalLBPoolMemberMemberMetricLimit[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_monitor_association");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "monitor_associations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationSequenceSequence"), iControl.GlobalLBPoolMemberMemberMonitorAssociation[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_order");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orders"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberOrderSequenceSequence"), iControl.GlobalLBPoolMemberMemberOrder[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ratio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pool_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ratios"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberRatioSequenceSequence"), iControl.GlobalLBPoolMemberMemberRatio[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    public GlobalLBPoolMemberBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GlobalLBPoolMemberBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GlobalLBPoolMemberBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.AvailabilityStatus");
            cachedSerQNames.add(qName);
            cls = iControl.CommonAvailabilityStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState");
            cachedSerQNames.add(qName);
            cls = iControl.CommonEnabledState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.EnabledStatus");
            cachedSerQNames.add(qName);
            cls = iControl.CommonEnabledStatus.class;
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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.ObjectStatus");
            cachedSerQNames.add(qName);
            cls = iControl.CommonObjectStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.AddressType");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MetricLimit");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBMetricLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MetricLimitSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBMetricLimit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MetricLimit");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MetricLimitType");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBMetricLimitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorAssociationRemovalRule");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBMonitorAssociationRemovalRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorIPPort");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBMonitorIPPort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorRule");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBMonitorRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorRuleType");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBMonitorRuleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberDependency");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberDependency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberDependencySequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberDependency[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberDependency");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberDependencySequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberDependency[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberDependencySequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberEnabledState");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberEnabledState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberEnabledStateSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberEnabledState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberEnabledState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberEnabledStateSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberEnabledState[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberEnabledStateSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMetricLimit");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMetricLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMetricLimitSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMetricLimit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMetricLimit");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMetricLimitSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMetricLimit[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMetricLimitSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociation");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMonitorAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationRemoval");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMonitorAssociationRemoval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationRemovalSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMonitorAssociationRemoval[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationRemoval");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationRemovalSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMonitorAssociationRemoval[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationRemovalSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMonitorAssociation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberMonitorAssociation[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberObjectStatus");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberObjectStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberObjectStatusSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberObjectStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberObjectStatus");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberObjectStatusSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberObjectStatus[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberObjectStatusSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberOrder");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberOrderSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberOrder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberOrder");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberOrderSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberOrder[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberOrderSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberRatio");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberRatio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberRatioSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberRatio[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberRatio");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberRatioSequenceSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberRatio[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberRatioSequence");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberStatisticEntry");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberStatisticEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberStatisticEntrySequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberStatisticEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberStatisticEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberStatistics");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberStatisticsSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBPoolMemberMemberStatistics[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberStatistics");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.VirtualServerDefinition");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBVirtualServerDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.VirtualServerSequence");
            cachedSerQNames.add(qName);
            cls = iControl.GlobalLBVirtualServerDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "GlobalLB.VirtualServerDefinition");
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
     * Adds the virtual servers to the dependency list that the specified
     * pool members depend on.
     */
    public void add_dependency(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberDependency[][] dependencies) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "add_dependency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, dependencies});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the statistics for all pool members of the specified pools.
     */
    public iControl.GlobalLBPoolMemberMemberStatistics[] get_all_statistics(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_all_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberStatistics[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberStatistics[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberStatistics[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the list of virtual servers that the specified pool members
     * depend on.
     */
    public iControl.GlobalLBPoolMemberMemberDependency[][] get_dependency(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_dependency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberDependency[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberDependency[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberDependency[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the enabled states for the specified members in the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberEnabledState[][] get_enabled_state(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_enabled_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberEnabledState[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberEnabledState[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberEnabledState[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the metric limits for the specified members of the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberMetricLimit[][] get_limit(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberMetricLimit[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberMetricLimit[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberMetricLimit[][].class);
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
    public iControl.GlobalLBPoolMemberMemberMonitorAssociation[][] get_monitor_association(java.lang.String[] pool_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_monitor_association"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberMonitorAssociation[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberMonitorAssociation[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberMonitorAssociation[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the statuses for the specified members in the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberObjectStatus[][] get_object_status(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_object_status"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberObjectStatus[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberObjectStatus[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberObjectStatus[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the orders for the specified members in the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberOrder[][] get_order(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_order"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberOrder[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberOrder[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberOrder[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the ratios for the specified members in the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberRatio[][] get_ratio(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_ratio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberRatio[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberRatio[][]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberRatio[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the statistics for the specified set of pool members.
     */
    public iControl.GlobalLBPoolMemberMemberStatistics[] get_statistics(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.GlobalLBPoolMemberMemberStatistics[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.GlobalLBPoolMemberMemberStatistics[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.GlobalLBPoolMemberMemberStatistics[].class);
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
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "get_version"));

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
     * Removes any and all dependencies of the specified pool members.
     */
    public void remove_all_dependencies(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "remove_all_dependencies"));

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
     * Removes the virtual servers from the dependency list that the
     * specified pool members depend on.
     */
    public void remove_dependency(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberDependency[][] dependencies) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "remove_dependency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, dependencies});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
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
    public void remove_monitor_association(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberMonitorAssociationRemoval[][] monitor_associations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "remove_monitor_association"));

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
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "reset_statistics"));

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
     * Sets the enabled states for the specified pool members in the
     * specified pools.
     */
    public void set_enabled_state(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberEnabledState[][] states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "set_enabled_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the metric limits for the specified members of the specified
     * pools.
     */
    public void set_limit(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberMetricLimit[][] limits) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "set_limit"));

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
     * Sets/creates the monitor associations for the specified pool
     * members. This basically creates the monitor 
     *  associations between a pool member and a monitor rule.
     */
    public void set_monitor_association(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberMonitorAssociation[][] monitor_associations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "set_monitor_association"));

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
     * Sets the orders for the specified pool members.
     *  
     *  Note: as of v10.1.0, the members are reordered starting
     *  with 0, with no gaps, so the system maintains the relative
     *  order but not the absolute numbers originally specified for
     *  ordering.
     */
    public void set_order(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberOrder[][] orders) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "set_order"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pool_names, orders});

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
    public void set_ratio(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberRatio[][] ratios) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:GlobalLB/PoolMember");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:GlobalLB/PoolMember", "set_ratio"));

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

}
