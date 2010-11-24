/**
 * LocalLBProfileHttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileHttpBindingStub extends org.apache.axis.client.Stub implements iControl.LocalLBProfileHttpPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[127];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_compression_content_type_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_compression_content_type_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_compression_uri_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_compression_uri_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_cookie_encryption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cookies"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_fallback_status_code");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status_codes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_permitted_response_header");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "headers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_ramcache_uri_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_ramcache_uri_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add_ramcache_uri_pinned");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_all_profiles");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete_profile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_all_statistics");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttp.ProfileHttpStatistics"));
        oper.setReturnClass(iControl.LocalLBProfileHttpProfileHttpStatistics.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_basic_auth_realm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"));
        oper.setReturnClass(iControl.LocalLBProfileString[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_allow_http_10_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"));
        oper.setReturnClass(iControl.LocalLBProfileEnabledState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_browser_workaround_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"));
        oper.setReturnClass(iControl.LocalLBProfileEnabledState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_buffer_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_content_type_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_content_type_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_cpu_saver_high_threshold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_cpu_saver_low_threshold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_cpu_saver_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"));
        oper.setReturnClass(iControl.LocalLBProfileEnabledState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_level");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_memory_level");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_minimum_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpCompressionModeSequence"));
        oper.setReturnClass(iControl.LocalLBProfileHttpCompressionMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_uri_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_uri_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_vary_header_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"));
        oper.setReturnClass(iControl.LocalLBProfileEnabledState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_compression_window_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_cookie_encryption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_cookie_encryption_passphrase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"));
        oper.setReturnClass(iControl.LocalLBProfileString[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_default_profile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_fallback_host_name");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"));
        oper.setReturnClass(iControl.LocalLBProfileString[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_fallback_status_code");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_header_erase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"));
        oper.setReturnClass(iControl.LocalLBProfileString[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_header_insert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"));
        oper.setReturnClass(iControl.LocalLBProfileString[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_insert_xforwarded_for_header_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence"));
        oper.setReturnClass(iControl.LocalLBProfileProfileMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_keep_accept_encoding_header_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"));
        oper.setReturnClass(iControl.LocalLBProfileEnabledState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_list");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_lws_maximum_column");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_lws_separator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"));
        oper.setReturnClass(iControl.LocalLBProfileString[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_maximum_header_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_maximum_requests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_oneconnect_header_transformation_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"));
        oper.setReturnClass(iControl.LocalLBProfileEnabledState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_permitted_response_header");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_pipelining_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence"));
        oper.setReturnClass(iControl.LocalLBProfileProfileMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_preferred_compression_method");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileCompressionMethodSequence"));
        oper.setReturnClass(iControl.LocalLBProfileCompressionMethod[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_aging_rate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_ignore_client_cache_control_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileRamCacheCacheControlModeSequence"));
        oper.setReturnClass(iControl.LocalLBProfileRamCacheCacheControlMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_insert_age_header_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence"));
        oper.setReturnClass(iControl.LocalLBProfileProfileMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_maximum_age");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_maximum_entry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence"));
        oper.setReturnClass(iControl.LocalLBProfileProfileMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_object_maximum_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_object_minimum_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"));
        oper.setReturnClass(iControl.LocalLBProfileULong[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_uri_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_uri_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ramcache_uri_pinned");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence"));
        oper.setReturnClass(iControl.LocalLBProfileStringArray[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_redirect_rewrite_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpRedirectRewriteModeSequence"));
        oper.setReturnClass(iControl.LocalLBProfileHttpRedirectRewriteMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_response_chunk_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpChunkModeSequence"));
        oper.setReturnClass(iControl.LocalLBProfileHttpChunkMode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_security_enabled_request_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"));
        oper.setReturnClass(iControl.LocalLBProfileEnabledState[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttp.ProfileHttpStatistics"));
        oper.setReturnClass(iControl.LocalLBProfileHttpProfileHttpStatistics.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_version");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("is_base_profile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.BooleanSequence"));
        oper.setReturnClass(boolean[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_compression_content_type_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_compression_content_type_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_compression_uri_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_compression_uri_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_cookie_encryption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cookies"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_fallback_status_code");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status_codes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_permitted_response_header");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "headers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_ramcache_uri_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_ramcache_uri_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_ramcache_uri_pinned");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reg_expressions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence"), java.lang.String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reset_statistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_basic_auth_realm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "realms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"), iControl.LocalLBProfileString[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_allow_http_10_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"), iControl.LocalLBProfileEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_browser_workaround_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"), iControl.LocalLBProfileEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_buffer_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sizes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_cpu_saver_high_threshold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "thresholds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_cpu_saver_low_threshold");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "thresholds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_cpu_saver_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"), iControl.LocalLBProfileEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_level");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_memory_level");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "levels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_minimum_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sizes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpCompressionModeSequence"), iControl.LocalLBProfileHttpCompressionMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_vary_header_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"), iControl.LocalLBProfileEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_compression_window_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sizes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_cookie_encryption_passphrase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "passphrases"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"), iControl.LocalLBProfileString[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_compression_content_type_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_compression_content_type_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_compression_uri_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_compression_uri_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_cookie_encryption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_fallback_status_code");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_permitted_response_header");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_profile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "defaults"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_ramcache_uri_exclude");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_ramcache_uri_include");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_default_ramcache_uri_pinned");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_fallback_host_name");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fallbacks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"), iControl.LocalLBProfileString[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_header_erase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "headers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"), iControl.LocalLBProfileString[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_header_insert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "headers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"), iControl.LocalLBProfileString[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_insert_xforwarded_for_header_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence"), iControl.LocalLBProfileProfileMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_keep_accept_encoding_header_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"), iControl.LocalLBProfileEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_lws_maximum_column");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sizes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_lws_separator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "separators"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence"), iControl.LocalLBProfileString[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_maximum_header_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sizes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_maximum_requests");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maximum_requests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_oneconnect_header_transformation_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"), iControl.LocalLBProfileEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_pipelining_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence"), iControl.LocalLBProfileProfileMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_preferred_compression_method");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "compression_methods"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileCompressionMethodSequence"), iControl.LocalLBProfileCompressionMethod[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_aging_rate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aging_rates"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_ignore_client_cache_control_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileRamCacheCacheControlModeSequence"), iControl.LocalLBProfileRamCacheCacheControlMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_insert_age_header_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence"), iControl.LocalLBProfileProfileMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_maximum_age");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maximum_age"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_maximum_entry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maximum_entries"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence"), iControl.LocalLBProfileProfileMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_object_maximum_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maximum_size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_object_minimum_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "minimum_size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ramcache_size");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sizes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence"), iControl.LocalLBProfileULong[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_redirect_rewrite_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpRedirectRewriteModeSequence"), iControl.LocalLBProfileHttpRedirectRewriteMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_response_chunk_mode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "modes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpChunkModeSequence"), iControl.LocalLBProfileHttpChunkMode[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_security_enabled_request_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "profile_names"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "states"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence"), iControl.LocalLBProfileEnabledState[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[126] = oper;

    }

    public LocalLBProfileHttpBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LocalLBProfileHttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LocalLBProfileHttpBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState");
            cachedSerQNames.add(qName);
            cls = iControl.CommonEnabledState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.StringSequenceSequence");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence");
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

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.CompressionMethod");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBCompressionMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.HttpChunkMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBHttpChunkMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.HttpCompressionMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBHttpCompressionMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.HttpRedirectRewriteMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBHttpRedirectRewriteMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileCompressionMethod");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileCompressionMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileCompressionMethodSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileCompressionMethod[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileCompressionMethod");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledState");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileEnabledState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledStateSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileEnabledState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileEnabledState");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttp.ProfileHttpStatisticEntry");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpProfileHttpStatisticEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttp.ProfileHttpStatisticEntrySequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpProfileHttpStatisticEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttp.ProfileHttpStatisticEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttp.ProfileHttpStatistics");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpProfileHttpStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpChunkMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpChunkMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpChunkModeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpChunkMode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpChunkMode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpCompressionMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpCompressionMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpCompressionModeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpCompressionMode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpCompressionMode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpRedirectRewriteMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpRedirectRewriteMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpRedirectRewriteModeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileHttpRedirectRewriteMode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpRedirectRewriteMode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileProfileMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileModeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileProfileMode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileProfileMode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileRamCacheCacheControlMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileRamCacheCacheControlMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileRamCacheCacheControlModeSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileRamCacheCacheControlMode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileRamCacheCacheControlMode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileString");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArray");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileStringArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArraySequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileStringArray[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringArray");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileStringSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileString[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileString");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULong");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileULong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULongSequence");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBProfileULong[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileULong");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "LocalLB.RamCacheCacheControlMode");
            cachedSerQNames.add(qName);
            cls = iControl.LocalLBRamCacheCacheControlMode.class;
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
     * Adds to the lists of regular expressions used to match the
     * MIME types in the server response's 
     *  "Content-Type:" headers. No match may be found in any of the "exclude"
     * fields. 
     *  For example, to disable compression on all PDF and image files, one
     * would use the 
     *  following in the content_type exclue fields: : "application/pdf"
     * "image/*".
     */
    public void add_compression_content_type_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_compression_content_type_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of regular expressions used to match the
     * MIME types in the server response's 
     *  "Content-Type:" headers. A match must be found in at least one of
     * the "include" fields. 
     *  For example, to enable compression on all PDF and image files, one
     * would use the 
     *  following in the content_type include fields: : "application/pdf"
     * "image/*".
     */
    public void add_compression_content_type_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_compression_content_type_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of regular expressions used to match the
     * request URI part of the 
     *  client requests during compression. (see section 5.1 of RFC2616).
     * 
     *  No match may be found in any of the "exclude" fields. For example,
     * to disable 
     *  compressing requests ending in ".txt", ".htm" and ".html", one would
     * use the 
     *  following in the URI "exclude" fields: "*.txt" "*.htm" "*.html"
     */
    public void add_compression_uri_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_compression_uri_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of regular expressions used to match the
     * request URI part of the 
     *  client requests during compression. (see section 5.1 of RFC2616).
     * 
     *  A match must be found in at least one of the "include" fields. For
     * example, to 
     *  include requests ending in ".txt", ".htm" and ".html", one would
     * use the following 
     *  in the uri include field: "*.txt" "*.htm" "*.html".
     */
    public void add_compression_uri_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_compression_uri_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of cookies to be encrypted before sending
     * them to the clients.
     */
    public void add_cookie_encryption(java.lang.String[] profile_names, java.lang.String[][] cookies) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_cookie_encryption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, cookies});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of status codes that when matched, traffic
     * will be sent to the 
     *  "fallback_host". An exception will be thrown if fallback status codes
     * are set when 
     *  "fallback_host" has not been specified.
     */
    public void add_fallback_status_code(java.lang.String[] profile_names, java.lang.String[][] status_codes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_fallback_status_code"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, status_codes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of permitted headers in the responses for
     * the specified HTTP profiles.
     */
    public void add_permitted_response_header(java.lang.String[] profile_names, java.lang.String[][] headers) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_permitted_response_header"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, headers});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of regular expressions used to match the
     * request URI part of the 
     *  client requests during caching. (see section 5.1 of RFC2616). 
     *  No match may be found in any of the "exclude" fields. For example,
     * to disable 
     *  compressing requests ending in ".txt", ".htm" and ".html", one would
     * use the 
     *  following in the URI "exclude" fields: "*.txt" "*.htm" "*.html"
     */
    public void add_ramcache_uri_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_ramcache_uri_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of regular expressions used to match the
     * request URI part of the 
     *  client requests during caching. (see section 5.1 of RFC2616). 
     *  A match must be found in at least one of the "include" fields. For
     * example, to 
     *  include requests ending in ".txt", ".htm" and ".html", one would
     * use the following 
     *  in the uri include field: "*.txt" "*.htm" "*.html".
     */
    public void add_ramcache_uri_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_ramcache_uri_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds to the lists of cachable document URIs that will never
     * be evicted from the cache.
     */
    public void add_ramcache_uri_pinned(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "add_ramcache_uri_pinned"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates the specified HTTP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Deletes all HTTP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "delete_all_profiles"));

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
     * Deletes the specified HTTP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "delete_profile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the statistics for all the HTTP profiles.
     */
    public iControl.LocalLBProfileHttpProfileHttpStatistics get_all_statistics() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_all_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileHttpProfileHttpStatistics) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileHttpProfileHttpStatistics) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileHttpProfileHttpStatistics.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the basic authentication realms for the specified HTTP
     * profiles.
     */
    public iControl.LocalLBProfileString[] get_basic_auth_realm(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_basic_auth_realm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileString[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileString[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileString[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the states that specify whether we will allow compression
     * on responses to HTTP 1.0 requests.
     *  Default will be "false", i.e. disallowing compression on HTTP 1.0
     * responses.
     */
    public iControl.LocalLBProfileEnabledState[] get_compression_allow_http_10_state(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_allow_http_10_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileEnabledState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileEnabledState[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileEnabledState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the states that specify whether to workaround browser
     * bugs when doing compression.
     */
    public iControl.LocalLBProfileEnabledState[] get_compression_browser_workaround_state(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_browser_workaround_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileEnabledState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileEnabledState[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileEnabledState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the values that specify the maximum number of uncompressed
     * bytes that the compression proxy 
     *  will buffer before it decides whether or not to compress the server's
     * response, in case the 
     *  server's response headers don't specify the content length of the
     * response.
     */
    public iControl.LocalLBProfileULong[] get_compression_buffer_size(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_buffer_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of regular expressions used to match the MIME
     * types in the server response's 
     *  "Content-Type:" headers. No match may be found in any of the "exclude"
     * fields. 
     *  For example, to disable compression on all PDF and image files, one
     * would use the 
     *  following in the content_type exclue fields: : "application/pdf"
     * "image/*".
     */
    public iControl.LocalLBProfileStringArray[] get_compression_content_type_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_content_type_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of regular expressions used to match the MIME
     * types in the server response's 
     *  "Content-Type:" headers. A match must be found in at least one of
     * the "include" fields. 
     *  For example, to enable compression on all PDF and image files, one
     * would use the 
     *  following in the content_type include fields: : "application/pdf"
     * "image/*".
     */
    public iControl.LocalLBProfileStringArray[] get_compression_content_type_include(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_content_type_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the CPU saver high threshold that basically switches to
     * NULL compression when
     *  CPU utilization exceeds this value.
     */
    public iControl.LocalLBProfileULong[] get_compression_cpu_saver_high_threshold(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_cpu_saver_high_threshold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the CPU saver low threshold that basically enables full
     * throttle on compression
     *  when CPU utilization drops below this value.
     */
    public iControl.LocalLBProfileULong[] get_compression_cpu_saver_low_threshold(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_cpu_saver_low_threshold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the states that specify whether to enable CPU saving mode
     * when doing compression.
     */
    public iControl.LocalLBProfileEnabledState[] get_compression_cpu_saver_state(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_cpu_saver_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileEnabledState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileEnabledState[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileEnabledState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the compression level used by the specified HTTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_compression_level(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_level"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the amount of memory (in bytes) that the will be used
     * for the internal compression state 
     *  for each compressed response. Smaller values will be slower and will
     * produce smaller compression ratios, 
     *  whereas larger values will be faster and produce larger compression
     * ratios.
     *  The value must be one of 1K, 2K, 4K, 8K, 16K, 32K, 64K, 128K, 256K
     * and represent power-of-2 values (kilobytes). 
     *  The default value will be 8K.
     */
    public iControl.LocalLBProfileULong[] get_compression_memory_level(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_memory_level"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the values that specify the minimmum length of the server
     * responses (in bytes) to be considered
     *  acceptable for compression.
     */
    public iControl.LocalLBProfileULong[] get_compression_minimum_size(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_minimum_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the HTTP compression modes for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileHttpCompressionMode[] get_compression_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileHttpCompressionMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileHttpCompressionMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileHttpCompressionMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of regular expressions used to match the request
     * URI part of the 
     *  client requests during compression. (see section 5.1 of RFC2616).
     * 
     *  No match may be found in any of the "exclude" fields. For example,
     * to disable 
     *  compressing requests ending in ".txt", ".htm" and ".html", one would
     * use the 
     *  following in the URI "exclude" fields: "*.txt" "*.htm" "*.html"
     */
    public iControl.LocalLBProfileStringArray[] get_compression_uri_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_uri_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of regular expressions used to match the request
     * URI part of the 
     *  client requests during compression. (see section 5.1 of RFC2616).
     * 
     *  A match must be found in at least one of the "include" fields. For
     * example, to 
     *  include requests ending in ".txt", ".htm" and ".html", one would
     * use the following 
     *  in the uri include field: "*.txt" "*.htm" "*.html".
     */
    public iControl.LocalLBProfileStringArray[] get_compression_uri_include(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_uri_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the states that specify whether we will insert the header
     * "Vary: Accept-Encoding" in the server response 
     *  for responses that have been compressed. If the "Vary:" header already
     * exists in the server response, then 
     *  the value "Accept-Encoding" will be appended to it.
     */
    public iControl.LocalLBProfileEnabledState[] get_compression_vary_header_state(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_vary_header_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileEnabledState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileEnabledState[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileEnabledState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the amount of memory (in bytes) for the window size (the
     * compression history buffer) that will be used 
     *  when compressing the server response. Higher values produce better
     * compression ratios at the expense of more memory usage.
     *  The value must be one of 1K, 2K, 4K, 8K, 16K, 32K, 64K, 128K and
     * represent power-of-2 values (kilobytes). 
     *  The default value will be 16K.
     */
    public iControl.LocalLBProfileULong[] get_compression_window_size(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_compression_window_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of cookies to be encrypted before sending them
     * to the clients.
     */
    public iControl.LocalLBProfileStringArray[] get_cookie_encryption(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_cookie_encryption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the passphrases used to encrypt the cookies for the specified
     * profiles.
     */
    public iControl.LocalLBProfileString[] get_cookie_encryption_passphrase(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_cookie_encryption_passphrase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileString[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileString[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileString[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_default_profile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

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
     * Gets the fallback host names used in HTTP redirect for the
     * specified HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_fallback_host_name(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_fallback_host_name"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileString[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileString[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileString[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of status codes that when matched, traffic will
     * be sent to the "fallback_host".
     *  An exception will be thrown if fallback status codes are set when
     * "fallback_host" has not
     *  been specified.
     */
    public iControl.LocalLBProfileStringArray[] get_fallback_status_code(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_fallback_status_code"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the headers to be erased for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_header_erase(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_header_erase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileString[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileString[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileString[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the headers to be inserted for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_header_insert(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_header_insert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileString[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileString[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileString[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the mode to indicate whether to insert X-Forwarded-For
     * headers for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_insert_xforwarded_for_header_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_insert_xforwarded_for_header_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileProfileMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileProfileMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileProfileMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the states that specify how we handle the "Accept-Encoding:"
     * header. If set to false, we will 
     *  strip the "Accept-Encoding:" header before passing the request on
     * to the server (so that the server 
     *  doesn't also compress the response). If it is set to true, we will
     * leave the "Accept-Encoding:" header 
     *  in the request so that servers are able to do compression. We will
     * not compress responses that have 
     *  already been compressed.
     */
    public iControl.LocalLBProfileEnabledState[] get_keep_accept_encoding_header_state(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_keep_accept_encoding_header_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileEnabledState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileEnabledState[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileEnabledState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of all HTTP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_list"));

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
     * Gets the linear white space maximum column sizes used to support
     * multi-line header insertion.
     */
    public iControl.LocalLBProfileULong[] get_lws_maximum_column(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_lws_maximum_column"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the linear white space separator strings for the specified
     * HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_lws_separator(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_lws_separator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileString[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileString[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileString[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the maximum header sizes for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_maximum_header_size(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_maximum_header_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the maximum number of HTTP requests allowed in the connection
     * before it is 
     *  closed automatically.
     */
    public iControl.LocalLBProfileULong[] get_maximum_requests(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_maximum_requests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the states that specify that OneConnect HTTP header transformation
     * feature is used or not.
     */
    public iControl.LocalLBProfileEnabledState[] get_oneconnect_header_transformation_state(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_oneconnect_header_transformation_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileEnabledState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileEnabledState[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileEnabledState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of permitted headers in the responses for the
     * specified HTTP profiles.
     */
    public iControl.LocalLBProfileStringArray[] get_permitted_response_header(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_permitted_response_header"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the pipelining mode for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_pipelining_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_pipelining_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileProfileMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileProfileMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileProfileMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the preferred compression methods.
     */
    public iControl.LocalLBProfileCompressionMethod[] get_preferred_compression_method(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_preferred_compression_method"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileCompressionMethod[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileCompressionMethod[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileCompressionMethod[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the aging rate for the RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_aging_rate(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_aging_rate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the mode to indicate whether to ignore the client cache
     * control headers.
     */
    public iControl.LocalLBProfileRamCacheCacheControlMode[] get_ramcache_ignore_client_cache_control_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_ignore_client_cache_control_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileRamCacheCacheControlMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileRamCacheCacheControlMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileRamCacheCacheControlMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the mode that indicates whether to insert the Age headers
     * for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_ramcache_insert_age_header_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_insert_age_header_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileProfileMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileProfileMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileProfileMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the maximum age of a cached object in the RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_maximum_age(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_maximum_age"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the maximum number of cache entries allowed in the RAM
     * cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_maximum_entry(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_maximum_entry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the RAM cache mode for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_ramcache_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileProfileMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileProfileMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileProfileMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the maximum size requirement of a cached object in the
     * RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_object_maximum_size(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_object_maximum_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the minimum size requirement of a cached object in the
     * RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_object_minimum_size(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_object_minimum_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the size (MB) of the RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_size(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileULong[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileULong[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileULong[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of regular expressions used to match the request
     * URI part of the 
     *  client requests during caching. (see section 5.1 of RFC2616). 
     *  No match may be found in any of the "exclude" fields. For example,
     * to disable 
     *  compressing requests ending in ".txt", ".htm" and ".html", one would
     * use the 
     *  following in the URI "exclude" fields: "*.txt" "*.htm" "*.html"
     */
    public iControl.LocalLBProfileStringArray[] get_ramcache_uri_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_uri_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of regular expressions used to match the request
     * URI part of the 
     *  client requests during caching. (see section 5.1 of RFC2616). 
     *  A match must be found in at least one of the "include" fields. For
     * example, to 
     *  include requests ending in ".txt", ".htm" and ".html", one would
     * use the following 
     *  in the uri include field: "*.txt" "*.htm" "*.html".
     */
    public iControl.LocalLBProfileStringArray[] get_ramcache_uri_include(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_uri_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the lists of cachable document URIs that will never be
     * evicted from the cache.
     */
    public iControl.LocalLBProfileStringArray[] get_ramcache_uri_pinned(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_ramcache_uri_pinned"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileStringArray[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileStringArray[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileStringArray[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the HTTP redirect/rewrite mode for the responses.
     */
    public iControl.LocalLBProfileHttpRedirectRewriteMode[] get_redirect_rewrite_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_redirect_rewrite_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileHttpRedirectRewriteMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileHttpRedirectRewriteMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileHttpRedirectRewriteMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the HTTP chunk mode for the responses.
     */
    public iControl.LocalLBProfileHttpChunkMode[] get_response_chunk_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_response_chunk_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileHttpChunkMode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileHttpChunkMode[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileHttpChunkMode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the state that if true, enable horizontal security for
     * the
     *  specified HTTP profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_security_enabled_request_state(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_security_enabled_request_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileEnabledState[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileEnabledState[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileEnabledState[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the statistics for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileHttpProfileHttpStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.LocalLBProfileHttpProfileHttpStatistics) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.LocalLBProfileHttpProfileHttpStatistics) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.LocalLBProfileHttpProfileHttpStatistics.class);
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
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "get_version"));

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
     * Determines whether the specified profiles are base/pre-configured
     * profiles, or user-defined profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "is_base_profile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (boolean[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (boolean[]) org.apache.axis.utils.JavaUtils.convert(_resp, boolean[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of regular expressions used to match
     * the MIME types in the server response's 
     *  "Content-Type:" headers. No match may be found in any of the "exclude"
     * fields. 
     *  For example, to disable compression on all PDF and image files, one
     * would use the 
     *  following in the content_type exclue fields: : "application/pdf"
     * "image/*".
     */
    public void remove_compression_content_type_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_compression_content_type_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of regular expressions used to match
     * the MIME types in the server response's 
     *  "Content-Type:" headers. A match must be found in at least one of
     * the "include" fields. 
     *  For example, to enable compression on all PDF and image files, one
     * would use the 
     *  following in the content_type include fields: : "application/pdf"
     * "image/*".
     */
    public void remove_compression_content_type_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_compression_content_type_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of regular expressions used to match
     * the request URI part of the 
     *  client requests during compression. (see section 5.1 of RFC2616).
     * 
     *  No match may be found in any of the "exclude" fields. For example,
     * to disable 
     *  compressing requests ending in ".txt", ".htm" and ".html", one would
     * use the 
     *  following in the URI "exclude" fields: "*.txt" "*.htm" "*.html"
     */
    public void remove_compression_uri_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_compression_uri_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of regular expressions used to match
     * the request URI part of the 
     *  client requests during compression. (see section 5.1 of RFC2616).
     * 
     *  A match must be found in at least one of the "include" fields. For
     * example, to 
     *  include requests ending in ".txt", ".htm" and ".html", one would
     * use the following 
     *  in the uri include field: "*.txt" "*.htm" "*.html".
     */
    public void remove_compression_uri_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_compression_uri_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of cookies to be encrypted before sending
     * them to the clients.
     */
    public void remove_cookie_encryption(java.lang.String[] profile_names, java.lang.String[][] cookies) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_cookie_encryption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, cookies});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of status codes that when matched, traffic
     * will be 
     *  sent to the "fallback_host". An exception will be thrown if fallback
     * status codes are 
     *  set when "fallback_host" has not been specified.
     */
    public void remove_fallback_status_code(java.lang.String[] profile_names, java.lang.String[][] status_codes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_fallback_status_code"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, status_codes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of permitted headers in the responses
     * for the specified HTTP profiles.
     */
    public void remove_permitted_response_header(java.lang.String[] profile_names, java.lang.String[][] headers) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_permitted_response_header"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, headers});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of regular expressions used to match
     * the request URI part of the 
     *  client requests during caching. (see section 5.1 of RFC2616). 
     *  No match may be found in any of the "exclude" fields. For example,
     * to disable 
     *  compressing requests ending in ".txt", ".htm" and ".html", one would
     * use the 
     *  following in the URI "exclude" fields: "*.txt" "*.htm" "*.html"
     */
    public void remove_ramcache_uri_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_ramcache_uri_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of regular expressions used to match
     * the request URI part of the 
     *  client requests during caching. (see section 5.1 of RFC2616). 
     *  A match must be found in at least one of the "include" fields. For
     * example, to 
     *  include requests ending in ".txt", ".htm" and ".html", one would
     * use the following 
     *  in the uri include field: "*.txt" "*.htm" "*.html".
     */
    public void remove_ramcache_uri_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_ramcache_uri_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes from the lists of cachable document URIs that will
     * never be evicted from the cache.
     */
    public void remove_ramcache_uri_pinned(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "remove_ramcache_uri_pinned"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, reg_expressions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the statistics for the specified HTTP profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "reset_statistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the basic authentication realms for the specified HTTP
     * profiles.
     */
    public void set_basic_auth_realm(java.lang.String[] profile_names, iControl.LocalLBProfileString[] realms) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_basic_auth_realm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, realms});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the states that specify whether we will allow compression
     * on responses to HTTP 1.0 requests.
     *  Default will be "false", i.e. disallowing compression on HTTP 1.0
     * responses.
     */
    public void set_compression_allow_http_10_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_allow_http_10_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the states that specify whether to workaround browser
     * bugs when doing compression.
     */
    public void set_compression_browser_workaround_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_browser_workaround_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the values that specify the maximum number of uncompressed
     * bytes that the compression proxy 
     *  will buffer before it decides whether or not to compress the server's
     * response, in case the 
     *  server's response headers don't specify the content length of the
     * response.
     */
    public void set_compression_buffer_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_buffer_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, sizes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the CPU saver high threshold that basically switches to
     * NULL compression when
     *  CPU utilization exceeds this value.
     */
    public void set_compression_cpu_saver_high_threshold(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] thresholds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_cpu_saver_high_threshold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, thresholds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the CPU saver low threshold that basically enables full
     * throttle on compression
     *  when CPU utilization drops below this value.
     */
    public void set_compression_cpu_saver_low_threshold(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] thresholds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_cpu_saver_low_threshold"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, thresholds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the states that specify whether to enable CPU saving mode
     * when doing compression.
     */
    public void set_compression_cpu_saver_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_cpu_saver_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the compression level used by the specified HTTP profiles.
     */
    public void set_compression_level(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] levels) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_level"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, levels});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the amount of memory (in bytes) that the will be used
     * for the internal compression state 
     *  for each compressed response. Smaller values will be slower and will
     * produce smaller compression ratios, 
     *  whereas larger values will be faster and produce larger compression
     * ratios.
     *  The value must be one of 1K, 2K, 4K, 8K, 16K, 32K, 64K, 128K, 256K
     * and represent power-of-2 values (kilobytes). 
     *  The default value will be 8K.
     */
    public void set_compression_memory_level(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] levels) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_memory_level"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, levels});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the values that specify the minimmum length of the server
     * responses (in bytes) to be considered
     *  acceptable for compression.
     */
    public void set_compression_minimum_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_minimum_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, sizes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the HTTP compression modes for the specified HTTP profiles.
     */
    public void set_compression_mode(java.lang.String[] profile_names, iControl.LocalLBProfileHttpCompressionMode[] modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the states that specify whether we will insert the header
     * "Vary: Accept-Encoding" in the server response 
     *  for responses that have been compressed. If the "Vary:" header already
     * exists in the server response, then 
     *  the value "Accept-Encoding" will be appended to it.
     */
    public void set_compression_vary_header_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_vary_header_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the amount of memory (in bytes) for the window size (the
     * compression history buffer) that will be used 
     *  when compressing the server response. Higher values produce better
     * compression ratios at the expense of more memory usage.
     *  The value must be one of 1K, 2K, 4K, 8K, 16K, 32K, 64K, 128K and
     * represent power-of-2 values (kilobytes). 
     *  The default value will be 16K.
     */
    public void set_compression_window_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_compression_window_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, sizes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the passphrases used to encrypt the cookies for the specified
     * profiles.
     */
    public void set_cookie_encryption_passphrase(java.lang.String[] profile_names, iControl.LocalLBProfileString[] passphrases) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_cookie_encryption_passphrase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, passphrases});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_compression_content_type_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_compression_content_type_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_compression_content_type_include(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_compression_content_type_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_compression_uri_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_compression_uri_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_compression_uri_include(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_compression_uri_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_cookie_encryption(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_cookie_encryption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_fallback_status_code(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_fallback_status_code"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_permitted_response_header(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_permitted_response_header"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_profile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, defaults});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_ramcache_uri_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_ramcache_uri_exclude"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_ramcache_uri_include(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_ramcache_uri_include"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_ramcache_uri_pinned(java.lang.String[] profile_names) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_default_ramcache_uri_pinned"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the fallback host names used in HTTP redirect for the
     * specified HTTP profiles.
     */
    public void set_fallback_host_name(java.lang.String[] profile_names, iControl.LocalLBProfileString[] fallbacks) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_fallback_host_name"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, fallbacks});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the headers to be erased into the HTTP headers for the
     * specified HTTP profiles.
     */
    public void set_header_erase(java.lang.String[] profile_names, iControl.LocalLBProfileString[] headers) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_header_erase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, headers});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the headers to be inserted into the HTTP headers for the
     * specified HTTP profiles.
     */
    public void set_header_insert(java.lang.String[] profile_names, iControl.LocalLBProfileString[] headers) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_header_insert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, headers});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the mode to indicate whether to insert X-Forwarded-For
     * headers for the specified profiles.
     */
    public void set_insert_xforwarded_for_header_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_insert_xforwarded_for_header_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the states that specify how we handle the "Accept-Encoding:"
     * header. If set to false, we will 
     *  strip the "Accept-Encoding:" header before passing the request on
     * to the server (so that the server 
     *  doesn't also compress the response). If it is set to true, we will
     * leave the "Accept-Encoding:" header 
     *  in the request so that servers are able to do compression. We will
     * not compress responses that have 
     *  already been compressed.
     */
    public void set_keep_accept_encoding_header_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_keep_accept_encoding_header_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the linear white space maximum column sizes used to support
     * multi-line header insertion.
     */
    public void set_lws_maximum_column(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_lws_maximum_column"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, sizes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the linear white space separator strings for the specified
     * HTTP profiles.
     */
    public void set_lws_separator(java.lang.String[] profile_names, iControl.LocalLBProfileString[] separators) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_lws_separator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, separators});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the maximum header sizes for the specified HTTP profiles.
     */
    public void set_maximum_header_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_maximum_header_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, sizes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the maximum number of HTTP requests allowed in the connection
     * before it is 
     *  closed automatically.
     */
    public void set_maximum_requests(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_requests) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_maximum_requests"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, maximum_requests});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the states that specify whether OneConnect HTTP header
     * transformation is used for the specified HTTP profiles.
     */
    public void set_oneconnect_header_transformation_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_oneconnect_header_transformation_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the pipelining mode for the specified profiles.
     */
    public void set_pipelining_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_pipelining_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the preferred compression methods.
     */
    public void set_preferred_compression_method(java.lang.String[] profile_names, iControl.LocalLBProfileCompressionMethod[] compression_methods) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_preferred_compression_method"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, compression_methods});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the aging rate for the RAM cache.
     */
    public void set_ramcache_aging_rate(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] aging_rates) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_aging_rate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, aging_rates});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the mode to indicate whether to ignore the client cache
     * control headers.
     */
    public void set_ramcache_ignore_client_cache_control_mode(java.lang.String[] profile_names, iControl.LocalLBProfileRamCacheCacheControlMode[] modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_ignore_client_cache_control_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the mode that indicates whether to insert the Age headers
     * for the specified profiles.
     */
    public void set_ramcache_insert_age_header_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_insert_age_header_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the maximum age of a cached object in the RAM cache.
     */
    public void set_ramcache_maximum_age(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_age) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_maximum_age"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, maximum_age});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the maximum number of cache entries allowed in the RAM
     * cache.
     */
    public void set_ramcache_maximum_entry(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_entries) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_maximum_entry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, maximum_entries});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the RAM cache mode for the specified profiles.
     */
    public void set_ramcache_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the maximum size requirement of a cached object in the
     * RAM cache.
     */
    public void set_ramcache_object_maximum_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_size) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_object_maximum_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, maximum_size});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the minimum size requirement of a cached object in the
     * RAM cache.
     */
    public void set_ramcache_object_minimum_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] minimum_size) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_object_minimum_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, minimum_size});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the size (MB) of the RAM cache.
     */
    public void set_ramcache_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_ramcache_size"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, sizes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the HTTP redirect/rewrite mode for the responses.
     */
    public void set_redirect_rewrite_mode(java.lang.String[] profile_names, iControl.LocalLBProfileHttpRedirectRewriteMode[] modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_redirect_rewrite_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the HTTP chunk mode for the responses.
     */
    public void set_response_chunk_mode(java.lang.String[] profile_names, iControl.LocalLBProfileHttpChunkMode[] modes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_response_chunk_mode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, modes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the state that if true, enable horizontal security for
     * the
     *  specified HTTP profiles.
     */
    public void set_security_enabled_request_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:LocalLB/ProfileHttp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:LocalLB/ProfileHttp", "set_security_enabled_request_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {profile_names, states});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
