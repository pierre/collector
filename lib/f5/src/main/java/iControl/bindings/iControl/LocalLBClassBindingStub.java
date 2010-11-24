/**
 * LocalLBClassBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBClassBindingStub extends org.apache.axis.client.Stub implements iControl.LocalLBClassPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[44];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_address_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence"), iControl.LocalLBClassAddressClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_string_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence"), iControl.LocalLBClassStringClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_value_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence"), iControl.LocalLBClassValueClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create_address_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "classes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence"), iControl.LocalLBClassAddressClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create_external_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "external_classes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.MetaInformationSequence"), iControl.LocalLBClassMetaInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create_string_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "classes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence"), iControl.LocalLBClassStringClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create_value_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "classes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence"), iControl.LocalLBClassValueClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_address_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence"), iControl.LocalLBClassAddressClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_all_address_classes");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_all_string_classes");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_all_value_classes");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "classes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_string_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence"), iControl.LocalLBClassStringClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_value_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence"), iControl.LocalLBClassValueClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("find_address_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence"), iControl.LocalLBClassAddressClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.BooleanSequenceSequence"));
        oper.setReturnClass(boolean[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("find_string_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence"), iControl.LocalLBClassStringClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.BooleanSequenceSequence"));
        oper.setReturnClass(boolean[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("find_value_class_member");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence"), iControl.LocalLBClassValueClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.BooleanSequenceSequence"));
        oper.setReturnClass(boolean[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_address_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence"));
        oper.setReturnClass(iControl.LocalLBClassAddressClass[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_address_class_list");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_address_class_member_data_value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence"), iControl.LocalLBClassAddressClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_class_meta_information");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.MetaInformationSequence"));
        oper.setReturnClass(iControl.LocalLBClassMetaInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_class_type");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ClassTypeSequence"));
        oper.setReturnClass(iControl.LocalLBClassClassType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_data_separator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_external_class_file_format");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileFormatTypeSequence"));
        oper.setReturnClass(iControl.LocalLBClassFileFormatType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_external_class_file_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileModeTypeSequence"));
        oper.setReturnClass(iControl.LocalLBClassFileModeType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_external_class_file_name");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_external_class_list");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.MetaInformationSequence"));
        oper.setReturnClass(iControl.LocalLBClassMetaInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_string_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence"));
        oper.setReturnClass(iControl.LocalLBClassStringClass[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_string_class_list");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_string_class_member_data_value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence"), iControl.LocalLBClassStringClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_value_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence"));
        oper.setReturnClass(iControl.LocalLBClassValueClass[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_value_class_list");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_value_class_member_data_value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence"), iControl.LocalLBClassValueClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_version");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modify_address_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "classes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence"), iControl.LocalLBClassAddressClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modify_string_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "classes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence"), iControl.LocalLBClassStringClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modify_value_class");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "classes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence"), iControl.LocalLBClassValueClass[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_address_class_member_data_value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence"), iControl.LocalLBClassAddressClass[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_data_separator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "separators"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_external_class_file_format");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_formats"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileFormatTypeSequence"), iControl.LocalLBClassFileFormatType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_external_class_file_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileModeTypeSequence"), iControl.LocalLBClassFileModeType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_external_class_file_name");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_string_class_member_data_value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence"), iControl.LocalLBClassStringClass[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_value_class_member_data_value");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "class_members"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence"), iControl.LocalLBClassValueClass[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "values"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

    }

    public LocalLBClassBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LocalLBClassBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LocalLBClassBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.BooleanSequence");
            cachedSerQNames.add(qName);
            cls = boolean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.BooleanSequenceSequence");
            cachedSerQNames.add(qName);
            cls = boolean[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.BooleanSequence");
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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.ULongSequence");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClass");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassAddressClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClassSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassAddressClass[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClass");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressEntry");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassAddressEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressEntrySequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassAddressEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ClassType");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ClassTypeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassClassType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ClassType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileFormatType");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassFileFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileFormatTypeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassFileFormatType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileFormatType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileModeType");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassFileModeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileModeTypeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassFileModeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileModeType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.MetaInformation");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassMetaInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.MetaInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassMetaInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.MetaInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClass");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassStringClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClassSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassStringClass[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.StringClass");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClass");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassValueClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClassSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBClassValueClass[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ValueClass");
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
     * Incrementally adds address class members.
     */
    public void add_address_class_member(iControl.LocalLBClassAddressClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "add_address_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Incrementally adds string class members.
     */
    public void add_string_class_member(iControl.LocalLBClassStringClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "add_string_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Incrementally adds value class members.
     */
    public void add_value_class_member(iControl.LocalLBClassValueClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "add_value_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates address classes. The specified classes must not already
     * exist.
     */
    public void create_address_class(iControl.LocalLBClassAddressClass[] classes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "create_address_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {classes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates external classes.
     *  
     *  Note: As of v9.6.0, the validation on the file_name field
     *  in external_classes was improved to ensure the class file
     *  exists on pain of Common::OperationFailed exception.
     */
    public void create_external_class(iControl.LocalLBClassMetaInformation[] external_classes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "create_external_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {external_classes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates string classes. The specified classes must not already
     * exist.
     */
    public void create_string_class(iControl.LocalLBClassStringClass[] classes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "create_string_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {classes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates value classes. The specified classes must not already
     * exist.
     */
    public void create_value_class(iControl.LocalLBClassValueClass[] classes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "create_value_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {classes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Incrementally deletes address class members.
     */
    public void delete_address_class_member(iControl.LocalLBClassAddressClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "delete_address_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Deletes all address classes.
     */
    public void delete_all_address_classes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "delete_all_address_classes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Deletes all string classes.
     */
    public void delete_all_string_classes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "delete_all_string_classes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Deletes all value classes.
     */
    public void delete_all_value_classes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "delete_all_value_classes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Deletes the specified classes.  The specified classes can be
     * of any class type, even external classes.
     */
    public void delete_class(java.lang.String[] classes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "delete_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {classes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Incrementally deletes string class members.
     */
    public void delete_string_class_member(iControl.LocalLBClassStringClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "delete_string_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Incrementally deletes value class members.
     */
    public void delete_value_class_member(iControl.LocalLBClassValueClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "delete_value_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Checks to see if the specified class members are in the specified
     * class names.
     */
    public boolean[][] find_address_class_member(iControl.LocalLBClassAddressClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "find_address_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (boolean[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (boolean[][]) org.apache.axis.utils.JavaUtils.convert(_resp, boolean[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Checks to see if the specified class members are in the specified
     * class names.
     */
    public boolean[][] find_string_class_member(iControl.LocalLBClassStringClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "find_string_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (boolean[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (boolean[][]) org.apache.axis.utils.JavaUtils.convert(_resp, boolean[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Checks to see if the specified class members are in the specified
     * class names.
     */
    public boolean[][] find_value_class_member(iControl.LocalLBClassValueClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "find_value_class_member"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (boolean[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (boolean[][]) org.apache.axis.utils.JavaUtils.convert(_resp, boolean[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the specified address classes.
     */
    public iControl.LocalLBClassAddressClass[] get_address_class(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_address_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBClassAddressClass[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBClassAddressClass[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBClassAddressClass[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the list of available address classes.
     */
    public java.lang.String[] get_address_class_list() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_address_class_list"));

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
     * Gets the data values associated with a set of address class
     * members.  This method is effectively the lookup method for using
     *  the class as a value map.
     */
    public java.lang.String[][] get_address_class_member_data_value(iControl.LocalLBClassAddressClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_address_class_member_data_value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

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
     * Gets the meta data information for the specified classes. For
     * external classes,
     *  the meta information will indicate the external file and other relevant
     * information.
     *  For non-external classes, only applicable information such as class
     * name/type will be 
     *  of importance.
     */
    public iControl.LocalLBClassMetaInformation[] get_class_meta_information(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_class_meta_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBClassMetaInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBClassMetaInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBClassMetaInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the class types for the specified classes.
     */
    public iControl.LocalLBClassClassType[] get_class_type(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_class_type"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBClassClassType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBClassClassType[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBClassClassType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the strings used to separate a class member value from
     * its
     *  optional associated data value for a set of classes.
     */
    public java.lang.String[] get_data_separator(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_data_separator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

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
     * Gets the file format for the specified classes. This should
     * only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     */
    public iControl.LocalLBClassFileFormatType[] get_external_class_file_format(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_external_class_file_format"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBClassFileFormatType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBClassFileFormatType[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBClassFileFormatType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the file modes for the specified classes. This should
     * only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     */
    public iControl.LocalLBClassFileModeType[] get_external_class_file_mode(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_external_class_file_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBClassFileModeType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBClassFileModeType[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBClassFileModeType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the file names for the specified classes. This should
     * only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     */
    public java.lang.String[] get_external_class_file_name(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_external_class_file_name"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

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
     * Gets the list of all available external classes.
     */
    public iControl.LocalLBClassMetaInformation[] get_external_class_list() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_external_class_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBClassMetaInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBClassMetaInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBClassMetaInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the specified string classes.
     */
    public iControl.LocalLBClassStringClass[] get_string_class(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_string_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBClassStringClass[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBClassStringClass[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBClassStringClass[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the list of available string classes.
     */
    public java.lang.String[] get_string_class_list() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_string_class_list"));

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
     * Gets the data values associated with a set of string class
     * members.
     *  This method is effectively the lookup method for using the class
     * as
     *  a value map.
     */
    public java.lang.String[][] get_string_class_member_data_value(iControl.LocalLBClassStringClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_string_class_member_data_value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

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
     * Gets the specified value classes.
     */
    public iControl.LocalLBClassValueClass[] get_value_class(java.lang.String[] class_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_value_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBClassValueClass[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBClassValueClass[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBClassValueClass[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the list of available value classes.
     */
    public java.lang.String[] get_value_class_list() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_value_class_list"));

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
     * Gets the data values associated with a set of value class members.
     * This method is effectively the lookup method for using the class as
     * a value map.
     */
    public java.lang.String[][] get_value_class_member_data_value(iControl.LocalLBClassValueClass[] class_members) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_value_class_member_data_value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members});

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
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "get_version"));

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
     * Modifies address classes. The specified classes must already
     * exist.
     */
    public void modify_address_class(iControl.LocalLBClassAddressClass[] classes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "modify_address_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {classes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Modifies  string classes. The specified classes must already
     * exist.
     */
    public void modify_string_class(iControl.LocalLBClassStringClass[] classes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "modify_string_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {classes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Modifies value classes. The specified classes must already
     * exist.
     */
    public void modify_value_class(iControl.LocalLBClassValueClass[] classes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "modify_value_class"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {classes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the data values associated with a set of address class
     * members.  This data value is an optional arbitrary string, which
     *  can be retrieved given the class member information, allowing the
     * class to be used as a value map.
     */
    public void set_address_class_member_data_value(iControl.LocalLBClassAddressClass[] class_members, java.lang.String[][] values) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "set_address_class_member_data_value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the strings used to separate a class member value from
     * its
     *  optional associated data value for a set of classes.  This is used
     * for listing and storing both external and internal classes.
     */
    public void set_data_separator(java.lang.String[] class_names, java.lang.String[] separators) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "set_data_separator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, separators});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the file format for the specified classes. This should
     * only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     *  If called for non-external classes, it will silently accept it, but
     * nothing
     *  will be done.
     */
    public void set_external_class_file_format(java.lang.String[] class_names, iControl.LocalLBClassFileFormatType[] file_formats) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "set_external_class_file_format"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, file_formats});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the file mode for the specified classes. This should only
     * be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     *  If called for non-external classes, it will silently accept it, but
     * nothing
     *  will be done.
     */
    public void set_external_class_file_mode(java.lang.String[] class_names, iControl.LocalLBClassFileModeType[] file_modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "set_external_class_file_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, file_modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the file names for the specified external classes. This
     * should only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     *  If called for non-external classes, it will silently accept it, but
     * nothing
     *  will be done.
     */
    public void set_external_class_file_name(java.lang.String[] class_names, java.lang.String[] file_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "set_external_class_file_name"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_names, file_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the data values associated with a set of string class
     * members.
     *  This data value is an optional arbitrary string, which can be
     *  retrieved given the class member information, allowing the class
     * to
     *  be used as a value map.
     */
    public void set_string_class_member_data_value(iControl.LocalLBClassStringClass[] class_members, java.lang.String[][] values) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "set_string_class_member_data_value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the data values associated with a set of value class members.
     * This data value is an arbitrary optional string, which can be
     *  retrieved given the class member information, allowing the class
     * to
     *  be used as a value map.
     */
    public void set_value_class_member_data_value(iControl.LocalLBClassValueClass[] class_members, java.lang.String[][] values) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/Class");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/Class", "set_value_class_member_data_value"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {class_members, values});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
