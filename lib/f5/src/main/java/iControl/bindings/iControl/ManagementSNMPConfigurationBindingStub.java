/**
 * ManagementSNMPConfigurationBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationBindingStub extends org.apache.axis.client.Stub implements iControl.ManagementSNMPConfigurationPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[112];
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
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_access_info");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AccessInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationAccessInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_agent_group_id");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_agent_interface");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentInterface"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationAgentInterface.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_agent_listen_address");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentListenAddressPortSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationAgentListenAddressPort[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_agent_trap_state");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"));
        oper.setReturnClass(iControl.CommonEnabledState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_agent_user_id");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_agentx_information");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentXInformation"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationAgentXInformation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_auth_trap_state");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"));
        oper.setReturnClass(iControl.CommonEnabledState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_check_disk");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationDiskCheckInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_check_file");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.FileCheckInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationFileCheckInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_check_load");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.LoadAverageInformation"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationLoadAverageInformation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_check_process");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ProcessInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationProcessInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_client_access");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ClientAccessSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationClientAccess[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_community_to_security_info");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SecurityInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationSecurityInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_create_user");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.UserInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationUserInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_dynamic_loadable_module");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DynamicLoadableModuleSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationDynamicLoadableModule[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_engine_id");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_exec");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.MibnumNameProgArgsSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationMibnumNameProgArgs[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_exec_fix");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgsSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationNameProgArgs[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_generic_traps");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationGenericSinkInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_generic_traps_v2");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation2Sequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationGenericSinkInformation2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_group_info");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GroupInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationGroupInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_ignore_disk");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_pass_through");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationPassThroughInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_pass_through_persist");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationPassThroughInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_process_fix");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgsSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationNameProgArgs[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_proxy");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_readonly_community");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_readonly_user");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationWrapperUserInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_readwrite_community");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_readwrite_user");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationWrapperUserInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_smux_subagent");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SmuxSubAgentInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_storage_use_nfs");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_system_information");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SystemInformation"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationSystemInformation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_trap_community");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_trap_sinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkType"), iControl.ManagementSNMPConfigurationSinkType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationSinkInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_version");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_view_info");
        oper.setReturnType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewInformationSequence"));
        oper.setReturnClass(iControl.ManagementSNMPConfigurationViewInformation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_access_info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "access_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AccessInformationSequence"), iControl.ManagementSNMPConfigurationAccessInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_agent_group_id");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "group_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
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
        oper.setName("remove_agent_interface");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agent_intf"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentInterface"), iControl.ManagementSNMPConfigurationAgentInterface.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_agent_listen_address");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agent_listen_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentListenAddressPortSequence"), iControl.ManagementSNMPConfigurationAgentListenAddressPort[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_agent_trap_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"), iControl.CommonEnabledState.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_agent_user_id");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_agentx_information");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agentx_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentXInformation"), iControl.ManagementSNMPConfigurationAgentXInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_auth_trap_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"), iControl.CommonEnabledState.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_check_disk");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "disk_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckInformationSequence"), iControl.ManagementSNMPConfigurationDiskCheckInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_check_file");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.FileCheckInformationSequence"), iControl.ManagementSNMPConfigurationFileCheckInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_check_load");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "load_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.LoadAverageInformation"), iControl.ManagementSNMPConfigurationLoadAverageInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_check_process");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "proc_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ProcessInformationSequence"), iControl.ManagementSNMPConfigurationProcessInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_client_access");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "client_access_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ClientAccessSequence"), iControl.ManagementSNMPConfigurationClientAccess[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_community_to_security_info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "security_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SecurityInformationSequence"), iControl.ManagementSNMPConfigurationSecurityInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_create_user");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.UserInformationSequence"), iControl.ManagementSNMPConfigurationUserInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_dynamic_loadable_module");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mod_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DynamicLoadableModuleSequence"), iControl.ManagementSNMPConfigurationDynamicLoadableModule[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_engine_id");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "engine_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_exec");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exec_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.MibnumNameProgArgsSequence"), iControl.ManagementSNMPConfigurationMibnumNameProgArgs[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_exec_fix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exec_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgsSequence"), iControl.ManagementSNMPConfigurationNameProgArgs[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_generic_traps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformationSequence"), iControl.ManagementSNMPConfigurationGenericSinkInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_generic_traps_v2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation2Sequence"), iControl.ManagementSNMPConfigurationGenericSinkInformation2[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_group_info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "group_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GroupInformationSequence"), iControl.ManagementSNMPConfigurationGroupInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_ignore_disk");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ignore_disk"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_pass_through");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "passthru_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformationSequence"), iControl.ManagementSNMPConfigurationPassThroughInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_pass_through_persist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "passthru_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformationSequence"), iControl.ManagementSNMPConfigurationPassThroughInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_process_fix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fix_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgsSequence"), iControl.ManagementSNMPConfigurationNameProgArgs[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_proxy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "proxy_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_readonly_community");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ro_community_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformationSequence"), iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_readonly_user");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ro_user_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformationSequence"), iControl.ManagementSNMPConfigurationWrapperUserInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_readwrite_community");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rw_community_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformationSequence"), iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_readwrite_user");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rw_user_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformationSequence"), iControl.ManagementSNMPConfigurationWrapperUserInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_smux_subagent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subagent_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SmuxSubAgentInformationSequence"), iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[].class, false, false);
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
        oper.setName("remove_storage_use_nfs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_system_information");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "system_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SystemInformation"), iControl.ManagementSNMPConfigurationSystemInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_trap_community");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "community"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_trap_sinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkType"), iControl.ManagementSNMPConfigurationSinkType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkInformationSequence"), iControl.ManagementSNMPConfigurationSinkInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove_view_info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "view_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewInformationSequence"), iControl.ManagementSNMPConfigurationViewInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_access_info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "access_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AccessInformationSequence"), iControl.ManagementSNMPConfigurationAccessInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_agent_group_id");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "group_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_agent_interface");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agent_intf"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentInterface"), iControl.ManagementSNMPConfigurationAgentInterface.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_agent_listen_address");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agent_listen_addresses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentListenAddressPortSequence"), iControl.ManagementSNMPConfigurationAgentListenAddressPort[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_agent_trap_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"), iControl.CommonEnabledState.class, false, false);
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
        oper.setName("set_agent_user_id");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_agentx_information");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agentx_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentXInformation"), iControl.ManagementSNMPConfigurationAgentXInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_auth_trap_state");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"), iControl.CommonEnabledState.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_check_disk");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "disk_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckInformationSequence"), iControl.ManagementSNMPConfigurationDiskCheckInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_check_file");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.FileCheckInformationSequence"), iControl.ManagementSNMPConfigurationFileCheckInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_check_load");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "load_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.LoadAverageInformation"), iControl.ManagementSNMPConfigurationLoadAverageInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_check_process");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "proc_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ProcessInformationSequence"), iControl.ManagementSNMPConfigurationProcessInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_client_access");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "client_access_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ClientAccessSequence"), iControl.ManagementSNMPConfigurationClientAccess[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_community_to_security_info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "security_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SecurityInformationSequence"), iControl.ManagementSNMPConfigurationSecurityInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_create_user");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.UserInformationSequence"), iControl.ManagementSNMPConfigurationUserInformation[].class, false, false);
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
        oper.setName("set_dynamic_loadable_module");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mod_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DynamicLoadableModuleSequence"), iControl.ManagementSNMPConfigurationDynamicLoadableModule[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_engine_id");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "engine_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_exec");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exec_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.MibnumNameProgArgsSequence"), iControl.ManagementSNMPConfigurationMibnumNameProgArgs[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_exec_fix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exec_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgsSequence"), iControl.ManagementSNMPConfigurationNameProgArgs[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_generic_traps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformationSequence"), iControl.ManagementSNMPConfigurationGenericSinkInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_generic_traps_v2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation2Sequence"), iControl.ManagementSNMPConfigurationGenericSinkInformation2[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_group_info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "group_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GroupInformationSequence"), iControl.ManagementSNMPConfigurationGroupInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_ignore_disk");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ignore_disk"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_pass_through");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "passthru_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformationSequence"), iControl.ManagementSNMPConfigurationPassThroughInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_pass_through_persist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "passthru_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformationSequence"), iControl.ManagementSNMPConfigurationPassThroughInformation[].class, false, false);
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
        oper.setName("set_process_fix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fix_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgsSequence"), iControl.ManagementSNMPConfigurationNameProgArgs[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_proxy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "proxy_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_readonly_community");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ro_community_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformationSequence"), iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_readonly_user");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ro_user_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformationSequence"), iControl.ManagementSNMPConfigurationWrapperUserInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_readwrite_community");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rw_community_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformationSequence"), iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_readwrite_user");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rw_user_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformationSequence"), iControl.ManagementSNMPConfigurationWrapperUserInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_smux_subagent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subagent_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SmuxSubAgentInformationSequence"), iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_storage_use_nfs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_system_information");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "system_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SystemInformation"), iControl.ManagementSNMPConfigurationSystemInformation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_trap_community");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "community"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
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
        oper.setName("set_trap_sinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkType"), iControl.ManagementSNMPConfigurationSinkType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sink_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkInformationSequence"), iControl.ManagementSNMPConfigurationSinkInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("set_view_info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "view_info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewInformationSequence"), iControl.ManagementSNMPConfigurationViewInformation[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[111] = oper;

    }

    public ManagementSNMPConfigurationBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ManagementSNMPConfigurationBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ManagementSNMPConfigurationBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("urn:iControl", "Common.StringSequence");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AccessInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationAccessInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AccessInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationAccessInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AccessInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentInterface");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationAgentInterface.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentListenAddressPort");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationAgentListenAddressPort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentListenAddressPortSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationAgentListenAddressPort[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentListenAddressPort");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentXInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationAgentXInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AuthType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationAuthType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ClientAccess");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationClientAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ClientAccessSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationClientAccess[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ClientAccess");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationDiskCheckInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationDiskCheckInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationDiskCheckType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DynamicLoadableModule");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationDynamicLoadableModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DynamicLoadableModuleSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationDynamicLoadableModule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DynamicLoadableModule");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.FileCheckInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationFileCheckInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.FileCheckInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationFileCheckInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.FileCheckInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationGenericSinkInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation2");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationGenericSinkInformation2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation2Sequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationGenericSinkInformation2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation2");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationGenericSinkInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GroupInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationGroupInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GroupInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationGroupInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GroupInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.LevelType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.LoadAverageInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationLoadAverageInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.MibnumNameProgArgs");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationMibnumNameProgArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.MibnumNameProgArgsSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationMibnumNameProgArgs[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.MibnumNameProgArgs");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ModelType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationModelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgs");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationNameProgArgs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgsSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationNameProgArgs[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgs");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationPassThroughInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationPassThroughInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PrefixType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationPrefixType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PrivacyProtocolType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationPrivacyProtocolType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ProcessInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationProcessInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ProcessInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationProcessInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ProcessInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SecurityInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationSecurityInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SecurityInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationSecurityInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SecurityInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationSinkInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationSinkInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationSinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SmuxSubAgentInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationSmuxSubAgentInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SmuxSubAgentInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SmuxSubAgentInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SystemInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationSystemInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.TransportType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationTransportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.UserInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationUserInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.UserInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationUserInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.UserInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationViewInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationViewInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewType");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationViewType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationWrapperSecurityInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformation");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformation");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationWrapperUserInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformationSequence");
            cachedSerQNames.add(qName);
            cls = iControl.ManagementSNMPConfigurationWrapperUserInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformation");
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
     * Gets a list of access maps from group/securitymodel/security
     * level to a view.
     */
    public iControl.ManagementSNMPConfigurationAccessInformation[] get_access_info() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_access_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationAccessInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationAccessInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationAccessInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the agent group id.
     */
    public java.lang.String get_agent_group_id() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_agent_group_id"));

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
     * Gets the agent interface information.
     */
    public iControl.ManagementSNMPConfigurationAgentInterface get_agent_interface() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_agent_interface"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationAgentInterface) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationAgentInterface) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationAgentInterface.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of agent listen addresses.
     */
    public iControl.ManagementSNMPConfigurationAgentListenAddressPort[] get_agent_listen_address() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_agent_listen_address"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationAgentListenAddressPort[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationAgentListenAddressPort[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationAgentListenAddressPort[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the agent trap enabled state
     */
    public iControl.CommonEnabledState get_agent_trap_state() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_agent_trap_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.CommonEnabledState) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.CommonEnabledState) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.CommonEnabledState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the agent user id.
     */
    public java.lang.String get_agent_user_id() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_agent_user_id"));

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
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Gets the AgentX information.
     */
    public iControl.ManagementSNMPConfigurationAgentXInformation get_agentx_information() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_agentx_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationAgentXInformation) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationAgentXInformation) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationAgentXInformation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the authentication trap enabled state
     */
    public iControl.CommonEnabledState get_auth_trap_state() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_auth_trap_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.CommonEnabledState) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.CommonEnabledState) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.CommonEnabledState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of disk check instances.
     */
    public iControl.ManagementSNMPConfigurationDiskCheckInformation[] get_check_disk() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_check_disk"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationDiskCheckInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationDiskCheckInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationDiskCheckInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of available file checks.
     */
    public iControl.ManagementSNMPConfigurationFileCheckInformation[] get_check_file() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_check_file"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationFileCheckInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationFileCheckInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationFileCheckInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets load check.
     */
    public iControl.ManagementSNMPConfigurationLoadAverageInformation get_check_load() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_check_load"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationLoadAverageInformation) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationLoadAverageInformation) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationLoadAverageInformation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of process checks.  A process check is used to
     * check to see if the 
     *  process_name'd processes are running on the agent's machine.  An
     * error flag(1) and 
     *  a description message are then passed to the EXTENSIBLEDOTMIB.PROCMIBNUM.1.ERRORFLAG
     * 
     *  and EXTENSIBLEDOTMIB.PROCMIBNUM.1.ERRORMSG mib columns if the process_name'd
     * program 
     *  is not found on the process table as reported by PSCMD.
     */
    public iControl.ManagementSNMPConfigurationProcessInformation[] get_check_process() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_check_process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationProcessInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationProcessInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationProcessInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of client access controls.
     */
    public iControl.ManagementSNMPConfigurationClientAccess[] get_client_access() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_client_access"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationClientAccess[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationClientAccess[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationClientAccess[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of mappings from a source/community pair to security
     * name.
     */
    public iControl.ManagementSNMPConfigurationSecurityInformation[] get_community_to_security_info() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_community_to_security_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationSecurityInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationSecurityInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationSecurityInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of SNMPv3 users. Since the authentication and private
     * passphrases
     *  have already been munged by snmpd, this information will not be available
     * in
     *  the response.  Only the user_name, the auth_type, and priv_protocol
     * fields in 
     *  the UserInformation structure are available.
     */
    public iControl.ManagementSNMPConfigurationUserInformation[] get_create_user() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_create_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationUserInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationUserInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationUserInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Gets a list of dynamically loadable module instances.
     */
    public iControl.ManagementSNMPConfigurationDynamicLoadableModule[] get_dynamic_loadable_module() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_dynamic_loadable_module"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationDynamicLoadableModule[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationDynamicLoadableModule[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationDynamicLoadableModule[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the snmp engine identifier.
     */
    public java.lang.String get_engine_id() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_engine_id"));

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
     * Gets a list of program instances.
     */
    public iControl.ManagementSNMPConfigurationMibnumNameProgArgs[] get_exec() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_exec"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationMibnumNameProgArgs[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationMibnumNameProgArgs[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationMibnumNameProgArgs[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of exec fix instances.
     */
    public iControl.ManagementSNMPConfigurationNameProgArgs[] get_exec_fix() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_exec_fix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationNameProgArgs[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationNameProgArgs[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationNameProgArgs[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is now deprecated. Use method get_generic_traps_v2
     * instead.
     * 
     *  Gets a list of generic traps.
     */
    public iControl.ManagementSNMPConfigurationGenericSinkInformation[] get_generic_traps() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_generic_traps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationGenericSinkInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationGenericSinkInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationGenericSinkInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of generic traps.
     */
    public iControl.ManagementSNMPConfigurationGenericSinkInformation2[] get_generic_traps_v2() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_generic_traps_v2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationGenericSinkInformation2[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationGenericSinkInformation2[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationGenericSinkInformation2[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of mappings from securitymodel/securityname to
     * group.
     */
    public iControl.ManagementSNMPConfigurationGroupInformation[] get_group_info() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_group_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationGroupInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationGroupInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationGroupInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Return a list of disk devices currently ignored.
     */
    public java.lang.String[] get_ignore_disk() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_ignore_disk"));

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
     * Gets a list of pass through controls.
     */
    public iControl.ManagementSNMPConfigurationPassThroughInformation[] get_pass_through() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_pass_through"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationPassThroughInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationPassThroughInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationPassThroughInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of persist pass through controls.
     */
    public iControl.ManagementSNMPConfigurationPassThroughInformation[] get_pass_through_persist() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_pass_through_persist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationPassThroughInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationPassThroughInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationPassThroughInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Retrieves a list of the current process fix instances.
     */
    public iControl.ManagementSNMPConfigurationNameProgArgs[] get_process_fix() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_process_fix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationNameProgArgs[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationNameProgArgs[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationNameProgArgs[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of snmp proxies.
     */
    public java.lang.String[] get_proxy() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_proxy"));

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
     * Gets a list of read-only communities.
     */
    public iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] get_readonly_community() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_readonly_community"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationWrapperSecurityInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationWrapperSecurityInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of the SNMPv3 USM read-only users in the VACM access
     * configuration tables.
     */
    public iControl.ManagementSNMPConfigurationWrapperUserInformation[] get_readonly_user() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_readonly_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationWrapperUserInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationWrapperUserInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationWrapperUserInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of read-write communities.
     */
    public iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] get_readwrite_community() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_readwrite_community"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationWrapperSecurityInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationWrapperSecurityInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationWrapperSecurityInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets a list of the SNMPv3 USM read-write users in the VACM
     * access configuration tables.
     */
    public iControl.ManagementSNMPConfigurationWrapperUserInformation[] get_readwrite_user() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_readwrite_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationWrapperUserInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationWrapperUserInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationWrapperUserInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Gets a list of SMUX based sub-agents.
     */
    public iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[] get_smux_subagent() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_smux_subagent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Gets directive to indicate how file systems are marked by SNMP.
     *  Setting this directive to 1 causes all NFS and NFS-like file systems
     * 
     *  to be marked as 'Network Disks' in the hrStorageTable. This is according
     * 
     *  to RFC 2790.  Not setting storageUseNFS or setting it to 2 causes
     * NFS 
     *  and NFS-like file systems to be marked as 'Fixed Disks' as it has
     * been 
     *  in previous versions  of  the  ucd-snmp SNMP agent.
     */
    public long get_storage_use_nfs() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_storage_use_nfs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the system location, system contact, and system name for
     * the agent.  This 
     *  information is reported in the 'system' group in the mibII tree.
     */
    public iControl.ManagementSNMPConfigurationSystemInformation get_system_information() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_system_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationSystemInformation) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationSystemInformation) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationSystemInformation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Gets the trap community string.
     */
    public java.lang.String get_trap_community() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_trap_community"));

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
     * Returns a list of trap sinks.
     */
    public iControl.ManagementSNMPConfigurationSinkInformation[] get_trap_sinks(iControl.ManagementSNMPConfigurationSinkType sink_type) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_trap_sinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sink_type});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationSinkInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationSinkInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationSinkInformation[].class);
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
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_version"));

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
     * Gets a list of named views.
     */
    public iControl.ManagementSNMPConfigurationViewInformation[] get_view_info() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "get_view_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (iControl.ManagementSNMPConfigurationViewInformation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (iControl.ManagementSNMPConfigurationViewInformation[]) org.apache.axis.utils.JavaUtils.convert(_resp, iControl.ManagementSNMPConfigurationViewInformation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes access maps from group/securitymodel/security level
     * to a view.
     */
    public void remove_access_info(iControl.ManagementSNMPConfigurationAccessInformation[] access_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_access_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {access_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes the agent group id.
     */
    public void remove_agent_group_id(java.lang.String group_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_agent_group_id"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {group_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes the agent interface information.
     */
    public void remove_agent_interface(iControl.ManagementSNMPConfigurationAgentInterface agent_intf) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_agent_interface"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agent_intf});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a list of agent listen addresses.
     * 
     *  Note: As of v9.4.2, this method actually sets the agent
     *  listen addresses back to the default.
     */
    public void remove_agent_listen_address(iControl.ManagementSNMPConfigurationAgentListenAddressPort[] agent_listen_addresses) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_agent_listen_address"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agent_listen_addresses});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes the agent trap enabled state.
     * 
     *  Note: As of v9.4.2, this method actually sets the agent
     *  trap enabled state back to the default.
     */
    public void remove_agent_trap_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_agent_trap_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {state});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes the ugent ser id.
     */
    public void remove_agent_user_id(java.lang.String user_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_agent_user_id"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Removes the AgentX information.
     */
    public void remove_agentx_information(iControl.ManagementSNMPConfigurationAgentXInformation agentx_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_agentx_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agentx_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes the authentication trap enabled state.
     * 
     *  Note: As of v9.4.2, this method actually sets the authentication
     *  trap enabled state back to the default.
     */
    public void remove_auth_trap_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_auth_trap_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {state});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a disk check instance.
     */
    public void remove_check_disk(iControl.ManagementSNMPConfigurationDiskCheckInformation[] disk_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_check_disk"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {disk_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a file check.
     */
    public void remove_check_file(iControl.ManagementSNMPConfigurationFileCheckInformation[] file_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_check_file"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {file_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a load check.
     */
    public void remove_check_load(iControl.ManagementSNMPConfigurationLoadAverageInformation load_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_check_load"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {load_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a process check.  A process check is used to check
     * to see if the 
     *  process_name's processes are running on the agent's machine.  An
     * error flag(1) 
     *  and a description message are then passed to the EXTENSIBLEDOTMIB.PROCMIBNUM.1.ERRORFLAG
     * 
     *  and EXTENSIBLEDOTMIB.PROCMIBNUM.1.ERRORMSG mib columns if the process_name's
     * program 
     *  is not found on the process table as reported by PSCMD.
     */
    public void remove_check_process(iControl.ManagementSNMPConfigurationProcessInformation[] proc_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_check_process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proc_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a list of client access controls.
     */
    public void remove_client_access(iControl.ManagementSNMPConfigurationClientAccess[] client_access_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_client_access"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {client_access_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes mappings from a source/community pair to security names.
     */
    public void remove_community_to_security_info(iControl.ManagementSNMPConfigurationSecurityInformation[] security_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_community_to_security_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {security_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes SNMPv3 users.
     */
    public void remove_create_user(iControl.ManagementSNMPConfigurationUserInformation[] user_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_create_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Removes a dynamically loadable module instance.
     */
    public void remove_dynamic_loadable_module(iControl.ManagementSNMPConfigurationDynamicLoadableModule[] mod_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_dynamic_loadable_module"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mod_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes the snmp engine identifier.
     */
    public void remove_engine_id(java.lang.String engine_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_engine_id"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engine_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a program instance.
     */
    public void remove_exec(iControl.ManagementSNMPConfigurationMibnumNameProgArgs[] exec_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_exec"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exec_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes an exec fix instance.
     */
    public void remove_exec_fix(iControl.ManagementSNMPConfigurationNameProgArgs[] exec_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_exec_fix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exec_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is now deprecated. Use method remove_generic_traps_v2
     * instead.
     * 
     *  Removes a list of generic traps.
     */
    public void remove_generic_traps(iControl.ManagementSNMPConfigurationGenericSinkInformation[] sink_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_generic_traps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sink_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a list of generic traps.
     */
    public void remove_generic_traps_v2(iControl.ManagementSNMPConfigurationGenericSinkInformation2[] sink_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_generic_traps_v2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sink_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes mappings from securitymodel/securityname to group.
     */
    public void remove_group_info(iControl.ManagementSNMPConfigurationGroupInformation[] group_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_group_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {group_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a disk device from the ignore list.
     */
    public void remove_ignore_disk(java.lang.String[] ignore_disk) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_ignore_disk"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ignore_disk});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a list of pass through controls.
     */
    public void remove_pass_through(iControl.ManagementSNMPConfigurationPassThroughInformation[] passthru_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_pass_through"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {passthru_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a list of persist pass through controls.
     */
    public void remove_pass_through_persist(iControl.ManagementSNMPConfigurationPassThroughInformation[] passthru_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_pass_through_persist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {passthru_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a process fix instance.
     */
    public void remove_process_fix(iControl.ManagementSNMPConfigurationNameProgArgs[] fix_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_process_fix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fix_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a list of snmp proxies.
     */
    public void remove_proxy(java.lang.String[] proxy_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_proxy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proxy_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes read-only communities.
     */
    public void remove_readonly_community(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] ro_community_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_readonly_community"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ro_community_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes SNMPv3 USM read-only users from the VACM access configuration
     * tables.
     */
    public void remove_readonly_user(iControl.ManagementSNMPConfigurationWrapperUserInformation[] ro_user_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_readonly_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ro_user_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes read-write communities.
     */
    public void remove_readwrite_community(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] rw_community_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_readwrite_community"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rw_community_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes SNMPv3 USM read-write users from the VACM access configuration
     * tables.
     */
    public void remove_readwrite_user(iControl.ManagementSNMPConfigurationWrapperUserInformation[] rw_user_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_readwrite_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rw_user_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Removes a SMUX based sub-agent.
     */
    public void remove_smux_subagent(iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[] subagent_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_smux_subagent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subagent_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Removes directive to indicate how file systems are marked by SNMP.
     * Setting this directive to 1 causes all NFS and NFS-like file systems
     * 
     *  to be marked as 'Network Disks' in the hrStorageTable. This is according
     * 
     *  to RFC 2790.  Not setting storageUseNFS or setting it to 2 causes
     * NFS 
     *  and NFS-like file systems to be marked as 'Fixed Disks' as it has
     * been 
     *  in previous versions  of  the  ucd-snmp SNMP agent.
     */
    public void remove_storage_use_nfs(long usage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_storage_use_nfs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(usage)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes the system location, system contact, and system name
     * for the agent.  This 
     *  information is reported in the 'system' group in the mibII tree.
     * 
     *  Note: As of v9.4.2, this method actually sets the system location
     * and contact
     *  parameters and the system services parameter back to the default.
     * 
     *  As has always been the case, this method affects values only for
     * the system
     *  information items you provide (non-empty/non-zero).
     */
    public void remove_system_information(iControl.ManagementSNMPConfigurationSystemInformation system_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_system_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {system_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes the trap community string.
     * 
     *  Note: As of v9.4.2, this method actually sets the trap
     *  community string back to the default.
     */
    public void remove_trap_community(java.lang.String community) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_trap_community"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {community});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a list of trap sinks.
     */
    public void remove_trap_sinks(iControl.ManagementSNMPConfigurationSinkType sink_type, iControl.ManagementSNMPConfigurationSinkInformation[] sink_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_trap_sinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sink_type, sink_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Removes a list of named views.
     */
    public void remove_view_info(iControl.ManagementSNMPConfigurationViewInformation[] view_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "remove_view_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {view_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates access maps from group/securitymodel/security level
     * to a view.
     */
    public void set_access_info(iControl.ManagementSNMPConfigurationAccessInformation[] access_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_access_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {access_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the agent group id.  Change to this gid after opening
     * port.  The group id 
     *  may refer to a group by name or a number if the group number starts
     * with a #.
     */
    public void set_agent_group_id(java.lang.String group_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_agent_group_id"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {group_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the interface information for the agent.  For interfaces
     * where the agent 
     *  fails to guess correctly on the type and speed, this directive can
     * supply additional 
     *  information.
     */
    public void set_agent_interface(iControl.ManagementSNMPConfigurationAgentInterface agent_intf) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_agent_interface"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agent_intf});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets a list of agent listen addresses.  This makes the agent
     * listen on the 
     *  specified list of sockets instead of the default port, which is 161.
     */
    public void set_agent_listen_address(iControl.ManagementSNMPConfigurationAgentListenAddressPort[] agent_listen_addresses) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_agent_listen_address"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agent_listen_addresses});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the agent trap enabled state.
     */
    public void set_agent_trap_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_agent_trap_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {state});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the agent user id.  Change to this uid after opening port.
     * The userid 
     *  may refer to a user by name or a number if the user number starts
     * with '#'.
     */
    public void set_agent_user_id(java.lang.String user_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_agent_user_id"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Sets the AgentX information.
     */
    public void set_agentx_information(iControl.ManagementSNMPConfigurationAgentXInformation agentx_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_agentx_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {agentx_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the authentication trap enabled state.  Setting the trap
     * state to Enabled, 
     *  enables the generation of authentication failure traps.  
     *  The default value is Disabled.
     */
    public void set_auth_trap_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_auth_trap_state"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {state});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates a disk check instance.  This is used to check the named
     * disks mounted 
     *  on path for available disk space.  If the disk space is less than
     * minimum_space 
     *  (kb or %), the associated entry in the EXTENSIBLEDOTMIB.DISKMIBNUM.1.ERRORFLAG
     * mib 
     *  table will be set to (1) and a descriptive error message will be
     * returned to queries 
     *  of EXTENSIBLEDOTMIB.DISKMIBNUM.1.ERRORMSG.
     */
    public void set_check_disk(iControl.ManagementSNMPConfigurationDiskCheckInformation[] disk_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_check_disk"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {disk_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds a file check used to monitor file sizes and make sure
     * they don't grow 
     *  beyond a certain size (in kilobytes).
     */
    public void set_check_file(iControl.ManagementSNMPConfigurationFileCheckInformation[] file_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_check_file"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {file_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds a load check used to check the load average of the machine
     * and returns 
     *  an error flag (1), and a text-string error message to queries of
     * 
     *  EXTENSIBLEDOTMIB.LOADAVEMIBNUM.1.ERRORFLAG and 
     *  EXTENSIBLEDOTMIB.LOADAVEMIBNUM.1.ERRORMSG respectively when the 1-minute,
     * 
     *  5-minute, or 15-minute averages exceed the associated maximum values.
     */
    public void set_check_load(iControl.ManagementSNMPConfigurationLoadAverageInformation load_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_check_load"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {load_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates a process check.  A process check is used to check
     * to see if the 
     *  process_name's processes are running on the agent's machine.  An
     * error flag(1) 
     *  and a description message are then passed to the EXTENSIBLEDOTMIB.PROCMIBNUM.1.ERRORFLAG
     * 
     *  and EXTENSIBLEDOTMIB.PROCMIBNUM.1.ERRORMSG mib columns if the process_name'd
     * program 
     *  is not found on the process table as reported by PSCMD.
     */
    public void set_check_process(iControl.ManagementSNMPConfigurationProcessInformation[] proc_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_check_process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proc_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates a list of client access controls.  These are stored
     * in the /etc/hosts.allow 
     *  file.
     */
    public void set_client_access(iControl.ManagementSNMPConfigurationClientAccess[] client_access_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_client_access"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {client_access_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates mappings from a source/community pair to security names.
     * The first 
     *  source/community combination that matches the incoming packet is
     * selected.
     */
    public void set_community_to_security_info(iControl.ManagementSNMPConfigurationSecurityInformation[] security_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_community_to_security_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {security_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates SNMPv3 users.
     * 
     *  Note: as of v9.4.2, doing this method without having done
     *  set_readonly_user or set_readwrite_user first results in a
     *  valid (readonly) user rather than silently creating an
     *  incomplete but unusable user. However, such behavior is not
     *  guaranteed; please do one of the above methods before this
     *  method so as to define your new user fully.
     */
    public void set_create_user(iControl.ManagementSNMPConfigurationUserInformation[] user_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_create_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Creates a dynmically loadable module instance.  If the agent is built
     * with 
     *  support for the UCD-DLMOD-MIB it is cabable of loading agent MIB
     * modules 
     *  dynamically at startup through the dlmod directive and during runtime
     * through 
     *  the use of the UCD-DLMOD-MIB.  The directive loads the shared object
     * module 
     *  file path which uses the module name prefix.
     */
    public void set_dynamic_loadable_module(iControl.ManagementSNMPConfigurationDynamicLoadableModule[] mod_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_dynamic_loadable_module"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mod_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the snmp engine identifier.  The snmpd agent needs to
     * be configured with 
     *  an engine id to be able to respond to SNMPv3 messages.
     */
    public void set_engine_id(java.lang.String engine_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_engine_id"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engine_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates a program instance, used to signal the agent to execute
     * the named 
     *  program with the given arguments and returns the exit status and
     * the first 
     *  line of the STDOUT output of the program to queries of the EXTENSIBLEDOTMIB.SHELLMIBNUM.mib_num.ERRORFLAG
     * 
     *  and EXTENSIBLEDOTMIB.SHELLMIBNUM.mib_num.ERRORMSG mib columns.  The
     * mib_num.ERRORMSG 
     *  mib contains the entire STDOUT output, one mib table entry per line
     * of output.
     */
    public void set_exec(iControl.ManagementSNMPConfigurationMibnumNameProgArgs[] exec_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_exec"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exec_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets an exec fix instance that registers a command that knows
     * how to fix 
     *  errors with the given program.
     */
    public void set_exec_fix(iControl.ManagementSNMPConfigurationNameProgArgs[] exec_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_exec_fix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {exec_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is now deprecated. Use method set_generic_traps_v2
     * instead.
     * 
     *  Creates generic traps that allows any type of trap destination to
     * be specified 
     *  with any version of SNMP.
     */
    public void set_generic_traps(iControl.ManagementSNMPConfigurationGenericSinkInformation[] sink_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_generic_traps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sink_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates generic traps that allows any type of trap destination
     * to be specified 
     *  with any version of SNMP.
     */
    public void set_generic_traps_v2(iControl.ManagementSNMPConfigurationGenericSinkInformation2[] sink_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_generic_traps_v2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sink_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates mappings from securitymodel/securityname to group.
     */
    public void set_group_info(iControl.ManagementSNMPConfigurationGroupInformation[] group_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_group_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {group_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Adds disk devices to the ignore list.  When scanning for available
     * disk 
     *  devices the agent might block in trying to open all possible disk
     * devices.  
     *  This might lead to a timeout wheen walking the device tree.  Sometimes
     * it will 
     *  timeout every time you try it.  Adding a ignore disk directive will
     * specify 
     *  device names not to be checked (i.e. opened).
     */
    public void set_ignore_disk(java.lang.String[] ignore_disk) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_ignore_disk"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ignore_disk});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates a list of pass through controls.  This passes entire
     * control of the mib
     *  oid to the executing program.
     */
    public void set_pass_through(iControl.ManagementSNMPConfigurationPassThroughInformation[] passthru_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_pass_through"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {passthru_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates a list of persist pass through controls.  This passes
     * entire control 
     *  of the mib oid to the executing program.  This is similar to set_path_through(),
     * 
     *  but the executing program continues to run after the initial request
     * is answered.
     */
    public void set_pass_through_persist(iControl.ManagementSNMPConfigurationPassThroughInformation[] passthru_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_pass_through_persist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {passthru_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets a process fix instance that registers a command that knows
     * how to fix 
     *  errors with the given process.
     */
    public void set_process_fix(iControl.ManagementSNMPConfigurationNameProgArgs[] fix_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_process_fix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fix_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates a list of snmp proxies.  This specifies that any incoming
     * request under 
     *  oid should be proxied on to a remote host instead.
     */
    public void set_proxy(java.lang.String[] proxy_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_proxy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proxy_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates read-only communities that can be used to access the
     * agent.  
     *  snmpd supports the View-Based Access Control Model (vacm) as defined
     * in RFC 2275.
     */
    public void set_readonly_community(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] ro_community_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_readonly_community"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ro_community_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates SNMPv3 USM read-only users in the VACM access configuration
     * tables.
     */
    public void set_readonly_user(iControl.ManagementSNMPConfigurationWrapperUserInformation[] ro_user_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_readonly_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ro_user_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates read-write communities that can be used to access the
     * agent.  
     *  snmpd supports the View-Based Access Control Model (vacm) as defined
     * in RFC 2275.
     */
    public void set_readwrite_community(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] rw_community_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_readwrite_community"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rw_community_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates SNMPv3 USM read-write users in the VACM access configuration
     * tables.
     */
    public void set_readwrite_user(iControl.ManagementSNMPConfigurationWrapperUserInformation[] rw_user_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_readwrite_user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rw_user_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Creates a SMUX based sub-agent, such as gated.
     */
    public void set_smux_subagent(iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[] subagent_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_smux_subagent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subagent_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Adds a directive to indicate how file systems are marked by SNMP.
     * Setting this directive to 1 causes all NFS and NFS-like file systems
     * 
     *  to be marked as 'Network Disks' in the hrStorageTable. This is according
     * 
     *  to RFC 2790.  Not setting storageUseNFS or setting it to 2 causes
     * NFS 
     *  and NFS-like file systems to be marked as 'Fixed Disks' as it has
     * been 
     *  in previous versions  of  the  ucd-snmp SNMP agent.
     */
    public void set_storage_use_nfs(long usage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_storage_use_nfs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(usage)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the system location, system contact, and system name for
     * the agent.  This 
     *  information is reported in the 'system' group in the mibII tree.
     *  
     *  As has always been the case, this method sets values only for the
     * system
     *  information items you provide (non-empty/non-zero).
     */
    public void set_system_information(iControl.ManagementSNMPConfigurationSystemInformation system_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_system_information"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {system_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Sets the trap community string.  This defines the default community
     * string to be 
     *  used when sending traps.
     */
    public void set_trap_community(java.lang.String community) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_trap_community"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {community});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates a list of trap sinks.  This method create definitions
     * for hosts to 
     *  receive traps (and/or inform notifications).  The daemon sends a
     * Cold Start 
     *  trap when it starts up.  If enabled, it also sends traps on authentication
     * failures.
     */
    public void set_trap_sinks(iControl.ManagementSNMPConfigurationSinkType sink_type, iControl.ManagementSNMPConfigurationSinkInformation[] sink_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_trap_sinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sink_type, sink_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }


    /**
     * Creates named views.
     */
    public void set_view_info(iControl.ManagementSNMPConfigurationViewInformation[] view_info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:iControl:Management/SNMPConfiguration");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:iControl:Management/SNMPConfiguration", "set_view_info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {view_info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
