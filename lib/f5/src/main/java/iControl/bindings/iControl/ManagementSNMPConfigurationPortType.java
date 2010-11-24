/**
 * ManagementSNMPConfigurationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementSNMPConfigurationPortType extends java.rmi.Remote {

    /**
     * Gets a list of access maps from group/securitymodel/security
     * level to a view.
     */
    public iControl.ManagementSNMPConfigurationAccessInformation[] get_access_info() throws java.rmi.RemoteException;

    /**
     * Gets the agent group id.
     */
    public java.lang.String get_agent_group_id() throws java.rmi.RemoteException;

    /**
     * Gets the agent interface information.
     */
    public iControl.ManagementSNMPConfigurationAgentInterface get_agent_interface() throws java.rmi.RemoteException;

    /**
     * Gets a list of agent listen addresses.
     */
    public iControl.ManagementSNMPConfigurationAgentListenAddressPort[] get_agent_listen_address() throws java.rmi.RemoteException;

    /**
     * Gets the agent trap enabled state
     */
    public iControl.CommonEnabledState get_agent_trap_state() throws java.rmi.RemoteException;

    /**
     * Gets the agent user id.
     */
    public java.lang.String get_agent_user_id() throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Gets the AgentX information.
     */
    public iControl.ManagementSNMPConfigurationAgentXInformation get_agentx_information() throws java.rmi.RemoteException;

    /**
     * Gets the authentication trap enabled state
     */
    public iControl.CommonEnabledState get_auth_trap_state() throws java.rmi.RemoteException;

    /**
     * Gets a list of disk check instances.
     */
    public iControl.ManagementSNMPConfigurationDiskCheckInformation[] get_check_disk() throws java.rmi.RemoteException;

    /**
     * Gets a list of available file checks.
     */
    public iControl.ManagementSNMPConfigurationFileCheckInformation[] get_check_file() throws java.rmi.RemoteException;

    /**
     * Gets load check.
     */
    public iControl.ManagementSNMPConfigurationLoadAverageInformation get_check_load() throws java.rmi.RemoteException;

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
    public iControl.ManagementSNMPConfigurationProcessInformation[] get_check_process() throws java.rmi.RemoteException;

    /**
     * Gets a list of client access controls.
     */
    public iControl.ManagementSNMPConfigurationClientAccess[] get_client_access() throws java.rmi.RemoteException;

    /**
     * Gets a list of mappings from a source/community pair to security
     * name.
     */
    public iControl.ManagementSNMPConfigurationSecurityInformation[] get_community_to_security_info() throws java.rmi.RemoteException;

    /**
     * Gets a list of SNMPv3 users. Since the authentication and private
     * passphrases
     *  have already been munged by snmpd, this information will not be available
     * in
     *  the response.  Only the user_name, the auth_type, and priv_protocol
     * fields in 
     *  the UserInformation structure are available.
     */
    public iControl.ManagementSNMPConfigurationUserInformation[] get_create_user() throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Gets a list of dynamically loadable module instances.
     */
    public iControl.ManagementSNMPConfigurationDynamicLoadableModule[] get_dynamic_loadable_module() throws java.rmi.RemoteException;

    /**
     * Gets the snmp engine identifier.
     */
    public java.lang.String get_engine_id() throws java.rmi.RemoteException;

    /**
     * Gets a list of program instances.
     */
    public iControl.ManagementSNMPConfigurationMibnumNameProgArgs[] get_exec() throws java.rmi.RemoteException;

    /**
     * Gets a list of exec fix instances.
     */
    public iControl.ManagementSNMPConfigurationNameProgArgs[] get_exec_fix() throws java.rmi.RemoteException;

    /**
     * This method is now deprecated. Use method get_generic_traps_v2
     * instead.
     * 
     *  Gets a list of generic traps.
     */
    public iControl.ManagementSNMPConfigurationGenericSinkInformation[] get_generic_traps() throws java.rmi.RemoteException;

    /**
     * Gets a list of generic traps.
     */
    public iControl.ManagementSNMPConfigurationGenericSinkInformation2[] get_generic_traps_v2() throws java.rmi.RemoteException;

    /**
     * Gets a list of mappings from securitymodel/securityname to
     * group.
     */
    public iControl.ManagementSNMPConfigurationGroupInformation[] get_group_info() throws java.rmi.RemoteException;

    /**
     * Return a list of disk devices currently ignored.
     */
    public java.lang.String[] get_ignore_disk() throws java.rmi.RemoteException;

    /**
     * Gets a list of pass through controls.
     */
    public iControl.ManagementSNMPConfigurationPassThroughInformation[] get_pass_through() throws java.rmi.RemoteException;

    /**
     * Gets a list of persist pass through controls.
     */
    public iControl.ManagementSNMPConfigurationPassThroughInformation[] get_pass_through_persist() throws java.rmi.RemoteException;

    /**
     * Retrieves a list of the current process fix instances.
     */
    public iControl.ManagementSNMPConfigurationNameProgArgs[] get_process_fix() throws java.rmi.RemoteException;

    /**
     * Gets a list of snmp proxies.
     */
    public java.lang.String[] get_proxy() throws java.rmi.RemoteException;

    /**
     * Gets a list of read-only communities.
     */
    public iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] get_readonly_community() throws java.rmi.RemoteException;

    /**
     * Gets a list of the SNMPv3 USM read-only users in the VACM access
     * configuration tables.
     */
    public iControl.ManagementSNMPConfigurationWrapperUserInformation[] get_readonly_user() throws java.rmi.RemoteException;

    /**
     * Gets a list of read-write communities.
     */
    public iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] get_readwrite_community() throws java.rmi.RemoteException;

    /**
     * Gets a list of the SNMPv3 USM read-write users in the VACM
     * access configuration tables.
     */
    public iControl.ManagementSNMPConfigurationWrapperUserInformation[] get_readwrite_user() throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Gets a list of SMUX based sub-agents.
     */
    public iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[] get_smux_subagent() throws java.rmi.RemoteException;

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
    public long get_storage_use_nfs() throws java.rmi.RemoteException;

    /**
     * Gets the system location, system contact, and system name for
     * the agent.  This 
     *  information is reported in the 'system' group in the mibII tree.
     */
    public iControl.ManagementSNMPConfigurationSystemInformation get_system_information() throws java.rmi.RemoteException;

    /**
     * Gets the trap community string.
     */
    public java.lang.String get_trap_community() throws java.rmi.RemoteException;

    /**
     * Returns a list of trap sinks.
     */
    public iControl.ManagementSNMPConfigurationSinkInformation[] get_trap_sinks(iControl.ManagementSNMPConfigurationSinkType sink_type) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets a list of named views.
     */
    public iControl.ManagementSNMPConfigurationViewInformation[] get_view_info() throws java.rmi.RemoteException;

    /**
     * Removes access maps from group/securitymodel/security level
     * to a view.
     */
    public void remove_access_info(iControl.ManagementSNMPConfigurationAccessInformation[] access_info) throws java.rmi.RemoteException;

    /**
     * Removes the agent group id.
     */
    public void remove_agent_group_id(java.lang.String group_id) throws java.rmi.RemoteException;

    /**
     * Removes the agent interface information.
     */
    public void remove_agent_interface(iControl.ManagementSNMPConfigurationAgentInterface agent_intf) throws java.rmi.RemoteException;

    /**
     * Removes a list of agent listen addresses.
     * 
     *  Note: As of v9.4.2, this method actually sets the agent
     *  listen addresses back to the default.
     */
    public void remove_agent_listen_address(iControl.ManagementSNMPConfigurationAgentListenAddressPort[] agent_listen_addresses) throws java.rmi.RemoteException;

    /**
     * Removes the agent trap enabled state.
     * 
     *  Note: As of v9.4.2, this method actually sets the agent
     *  trap enabled state back to the default.
     */
    public void remove_agent_trap_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Removes the ugent ser id.
     */
    public void remove_agent_user_id(java.lang.String user_id) throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Removes the AgentX information.
     */
    public void remove_agentx_information(iControl.ManagementSNMPConfigurationAgentXInformation agentx_info) throws java.rmi.RemoteException;

    /**
     * Removes the authentication trap enabled state.
     * 
     *  Note: As of v9.4.2, this method actually sets the authentication
     *  trap enabled state back to the default.
     */
    public void remove_auth_trap_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Removes a disk check instance.
     */
    public void remove_check_disk(iControl.ManagementSNMPConfigurationDiskCheckInformation[] disk_info) throws java.rmi.RemoteException;

    /**
     * Removes a file check.
     */
    public void remove_check_file(iControl.ManagementSNMPConfigurationFileCheckInformation[] file_info) throws java.rmi.RemoteException;

    /**
     * Removes a load check.
     */
    public void remove_check_load(iControl.ManagementSNMPConfigurationLoadAverageInformation load_info) throws java.rmi.RemoteException;

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
    public void remove_check_process(iControl.ManagementSNMPConfigurationProcessInformation[] proc_info) throws java.rmi.RemoteException;

    /**
     * Removes a list of client access controls.
     */
    public void remove_client_access(iControl.ManagementSNMPConfigurationClientAccess[] client_access_info) throws java.rmi.RemoteException;

    /**
     * Removes mappings from a source/community pair to security names.
     */
    public void remove_community_to_security_info(iControl.ManagementSNMPConfigurationSecurityInformation[] security_info) throws java.rmi.RemoteException;

    /**
     * Removes SNMPv3 users.
     */
    public void remove_create_user(iControl.ManagementSNMPConfigurationUserInformation[] user_info) throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Removes a dynamically loadable module instance.
     */
    public void remove_dynamic_loadable_module(iControl.ManagementSNMPConfigurationDynamicLoadableModule[] mod_info) throws java.rmi.RemoteException;

    /**
     * Removes the snmp engine identifier.
     */
    public void remove_engine_id(java.lang.String engine_id) throws java.rmi.RemoteException;

    /**
     * Removes a program instance.
     */
    public void remove_exec(iControl.ManagementSNMPConfigurationMibnumNameProgArgs[] exec_info) throws java.rmi.RemoteException;

    /**
     * Removes an exec fix instance.
     */
    public void remove_exec_fix(iControl.ManagementSNMPConfigurationNameProgArgs[] exec_info) throws java.rmi.RemoteException;

    /**
     * This method is now deprecated. Use method remove_generic_traps_v2
     * instead.
     * 
     *  Removes a list of generic traps.
     */
    public void remove_generic_traps(iControl.ManagementSNMPConfigurationGenericSinkInformation[] sink_info) throws java.rmi.RemoteException;

    /**
     * Removes a list of generic traps.
     */
    public void remove_generic_traps_v2(iControl.ManagementSNMPConfigurationGenericSinkInformation2[] sink_info) throws java.rmi.RemoteException;

    /**
     * Removes mappings from securitymodel/securityname to group.
     */
    public void remove_group_info(iControl.ManagementSNMPConfigurationGroupInformation[] group_info) throws java.rmi.RemoteException;

    /**
     * Removes a disk device from the ignore list.
     */
    public void remove_ignore_disk(java.lang.String[] ignore_disk) throws java.rmi.RemoteException;

    /**
     * Removes a list of pass through controls.
     */
    public void remove_pass_through(iControl.ManagementSNMPConfigurationPassThroughInformation[] passthru_info) throws java.rmi.RemoteException;

    /**
     * Removes a list of persist pass through controls.
     */
    public void remove_pass_through_persist(iControl.ManagementSNMPConfigurationPassThroughInformation[] passthru_info) throws java.rmi.RemoteException;

    /**
     * Removes a process fix instance.
     */
    public void remove_process_fix(iControl.ManagementSNMPConfigurationNameProgArgs[] fix_info) throws java.rmi.RemoteException;

    /**
     * Removes a list of snmp proxies.
     */
    public void remove_proxy(java.lang.String[] proxy_info) throws java.rmi.RemoteException;

    /**
     * Removes read-only communities.
     */
    public void remove_readonly_community(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] ro_community_info) throws java.rmi.RemoteException;

    /**
     * Removes SNMPv3 USM read-only users from the VACM access configuration
     * tables.
     */
    public void remove_readonly_user(iControl.ManagementSNMPConfigurationWrapperUserInformation[] ro_user_info) throws java.rmi.RemoteException;

    /**
     * Removes read-write communities.
     */
    public void remove_readwrite_community(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] rw_community_info) throws java.rmi.RemoteException;

    /**
     * Removes SNMPv3 USM read-write users from the VACM access configuration
     * tables.
     */
    public void remove_readwrite_user(iControl.ManagementSNMPConfigurationWrapperUserInformation[] rw_user_info) throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Removes a SMUX based sub-agent.
     */
    public void remove_smux_subagent(iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[] subagent_info) throws java.rmi.RemoteException;

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
    public void remove_storage_use_nfs(long usage) throws java.rmi.RemoteException;

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
    public void remove_system_information(iControl.ManagementSNMPConfigurationSystemInformation system_info) throws java.rmi.RemoteException;

    /**
     * Removes the trap community string.
     * 
     *  Note: As of v9.4.2, this method actually sets the trap
     *  community string back to the default.
     */
    public void remove_trap_community(java.lang.String community) throws java.rmi.RemoteException;

    /**
     * Removes a list of trap sinks.
     */
    public void remove_trap_sinks(iControl.ManagementSNMPConfigurationSinkType sink_type, iControl.ManagementSNMPConfigurationSinkInformation[] sink_info) throws java.rmi.RemoteException;

    /**
     * Removes a list of named views.
     */
    public void remove_view_info(iControl.ManagementSNMPConfigurationViewInformation[] view_info) throws java.rmi.RemoteException;

    /**
     * Creates access maps from group/securitymodel/security level
     * to a view.
     */
    public void set_access_info(iControl.ManagementSNMPConfigurationAccessInformation[] access_info) throws java.rmi.RemoteException;

    /**
     * Sets the agent group id.  Change to this gid after opening
     * port.  The group id 
     *  may refer to a group by name or a number if the group number starts
     * with a #.
     */
    public void set_agent_group_id(java.lang.String group_id) throws java.rmi.RemoteException;

    /**
     * Sets the interface information for the agent.  For interfaces
     * where the agent 
     *  fails to guess correctly on the type and speed, this directive can
     * supply additional 
     *  information.
     */
    public void set_agent_interface(iControl.ManagementSNMPConfigurationAgentInterface agent_intf) throws java.rmi.RemoteException;

    /**
     * Sets a list of agent listen addresses.  This makes the agent
     * listen on the 
     *  specified list of sockets instead of the default port, which is 161.
     */
    public void set_agent_listen_address(iControl.ManagementSNMPConfigurationAgentListenAddressPort[] agent_listen_addresses) throws java.rmi.RemoteException;

    /**
     * Sets the agent trap enabled state.
     */
    public void set_agent_trap_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the agent user id.  Change to this uid after opening port.
     * The userid 
     *  may refer to a user by name or a number if the user number starts
     * with '#'.
     */
    public void set_agent_user_id(java.lang.String user_id) throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Sets the AgentX information.
     */
    public void set_agentx_information(iControl.ManagementSNMPConfigurationAgentXInformation agentx_info) throws java.rmi.RemoteException;

    /**
     * Sets the authentication trap enabled state.  Setting the trap
     * state to Enabled, 
     *  enables the generation of authentication failure traps.  
     *  The default value is Disabled.
     */
    public void set_auth_trap_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

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
    public void set_check_disk(iControl.ManagementSNMPConfigurationDiskCheckInformation[] disk_info) throws java.rmi.RemoteException;

    /**
     * Adds a file check used to monitor file sizes and make sure
     * they don't grow 
     *  beyond a certain size (in kilobytes).
     */
    public void set_check_file(iControl.ManagementSNMPConfigurationFileCheckInformation[] file_info) throws java.rmi.RemoteException;

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
    public void set_check_load(iControl.ManagementSNMPConfigurationLoadAverageInformation load_info) throws java.rmi.RemoteException;

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
    public void set_check_process(iControl.ManagementSNMPConfigurationProcessInformation[] proc_info) throws java.rmi.RemoteException;

    /**
     * Creates a list of client access controls.  These are stored
     * in the /etc/hosts.allow 
     *  file.
     */
    public void set_client_access(iControl.ManagementSNMPConfigurationClientAccess[] client_access_info) throws java.rmi.RemoteException;

    /**
     * Creates mappings from a source/community pair to security names.
     * The first 
     *  source/community combination that matches the incoming packet is
     * selected.
     */
    public void set_community_to_security_info(iControl.ManagementSNMPConfigurationSecurityInformation[] security_info) throws java.rmi.RemoteException;

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
    public void set_create_user(iControl.ManagementSNMPConfigurationUserInformation[] user_info) throws java.rmi.RemoteException;

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
    public void set_dynamic_loadable_module(iControl.ManagementSNMPConfigurationDynamicLoadableModule[] mod_info) throws java.rmi.RemoteException;

    /**
     * Sets the snmp engine identifier.  The snmpd agent needs to
     * be configured with 
     *  an engine id to be able to respond to SNMPv3 messages.
     */
    public void set_engine_id(java.lang.String engine_id) throws java.rmi.RemoteException;

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
    public void set_exec(iControl.ManagementSNMPConfigurationMibnumNameProgArgs[] exec_info) throws java.rmi.RemoteException;

    /**
     * Sets an exec fix instance that registers a command that knows
     * how to fix 
     *  errors with the given program.
     */
    public void set_exec_fix(iControl.ManagementSNMPConfigurationNameProgArgs[] exec_info) throws java.rmi.RemoteException;

    /**
     * This method is now deprecated. Use method set_generic_traps_v2
     * instead.
     * 
     *  Creates generic traps that allows any type of trap destination to
     * be specified 
     *  with any version of SNMP.
     */
    public void set_generic_traps(iControl.ManagementSNMPConfigurationGenericSinkInformation[] sink_info) throws java.rmi.RemoteException;

    /**
     * Creates generic traps that allows any type of trap destination
     * to be specified 
     *  with any version of SNMP.
     */
    public void set_generic_traps_v2(iControl.ManagementSNMPConfigurationGenericSinkInformation2[] sink_info) throws java.rmi.RemoteException;

    /**
     * Creates mappings from securitymodel/securityname to group.
     */
    public void set_group_info(iControl.ManagementSNMPConfigurationGroupInformation[] group_info) throws java.rmi.RemoteException;

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
    public void set_ignore_disk(java.lang.String[] ignore_disk) throws java.rmi.RemoteException;

    /**
     * Creates a list of pass through controls.  This passes entire
     * control of the mib
     *  oid to the executing program.
     */
    public void set_pass_through(iControl.ManagementSNMPConfigurationPassThroughInformation[] passthru_info) throws java.rmi.RemoteException;

    /**
     * Creates a list of persist pass through controls.  This passes
     * entire control 
     *  of the mib oid to the executing program.  This is similar to set_path_through(),
     * 
     *  but the executing program continues to run after the initial request
     * is answered.
     */
    public void set_pass_through_persist(iControl.ManagementSNMPConfigurationPassThroughInformation[] passthru_info) throws java.rmi.RemoteException;

    /**
     * Sets a process fix instance that registers a command that knows
     * how to fix 
     *  errors with the given process.
     */
    public void set_process_fix(iControl.ManagementSNMPConfigurationNameProgArgs[] fix_info) throws java.rmi.RemoteException;

    /**
     * Creates a list of snmp proxies.  This specifies that any incoming
     * request under 
     *  oid should be proxied on to a remote host instead.
     */
    public void set_proxy(java.lang.String[] proxy_info) throws java.rmi.RemoteException;

    /**
     * Creates read-only communities that can be used to access the
     * agent.  
     *  snmpd supports the View-Based Access Control Model (vacm) as defined
     * in RFC 2275.
     */
    public void set_readonly_community(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] ro_community_info) throws java.rmi.RemoteException;

    /**
     * Creates SNMPv3 USM read-only users in the VACM access configuration
     * tables.
     */
    public void set_readonly_user(iControl.ManagementSNMPConfigurationWrapperUserInformation[] ro_user_info) throws java.rmi.RemoteException;

    /**
     * Creates read-write communities that can be used to access the
     * agent.  
     *  snmpd supports the View-Based Access Control Model (vacm) as defined
     * in RFC 2275.
     */
    public void set_readwrite_community(iControl.ManagementSNMPConfigurationWrapperSecurityInformation[] rw_community_info) throws java.rmi.RemoteException;

    /**
     * Creates SNMPv3 USM read-write users in the VACM access configuration
     * tables.
     */
    public void set_readwrite_user(iControl.ManagementSNMPConfigurationWrapperUserInformation[] rw_user_info) throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used, in order to ensure proper operation of the system.
     *  
     *  Creates a SMUX based sub-agent, such as gated.
     */
    public void set_smux_subagent(iControl.ManagementSNMPConfigurationSmuxSubAgentInformation[] subagent_info) throws java.rmi.RemoteException;

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
    public void set_storage_use_nfs(long usage) throws java.rmi.RemoteException;

    /**
     * Sets the system location, system contact, and system name for
     * the agent.  This 
     *  information is reported in the 'system' group in the mibII tree.
     *  
     *  As has always been the case, this method sets values only for the
     * system
     *  information items you provide (non-empty/non-zero).
     */
    public void set_system_information(iControl.ManagementSNMPConfigurationSystemInformation system_info) throws java.rmi.RemoteException;

    /**
     * Sets the trap community string.  This defines the default community
     * string to be 
     *  used when sending traps.
     */
    public void set_trap_community(java.lang.String community) throws java.rmi.RemoteException;

    /**
     * Creates a list of trap sinks.  This method create definitions
     * for hosts to 
     *  receive traps (and/or inform notifications).  The daemon sends a
     * Cold Start 
     *  trap when it starts up.  If enabled, it also sends traps on authentication
     * failures.
     */
    public void set_trap_sinks(iControl.ManagementSNMPConfigurationSinkType sink_type, iControl.ManagementSNMPConfigurationSinkInformation[] sink_info) throws java.rmi.RemoteException;

    /**
     * Creates named views.
     */
    public void set_view_info(iControl.ManagementSNMPConfigurationViewInformation[] view_info) throws java.rmi.RemoteException;
}
