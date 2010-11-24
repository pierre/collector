/**
 * GlobalLBGlobalsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBGlobalsPortType extends java.rmi.Remote {

    /**
     * Gets the state to indicate whether local DNS servers that belong
     * to AOL (America Online) are recognized.
     */
    public iControl.CommonEnabledState get_aol_aware_state() throws java.rmi.RemoteException;

    /**
     * Gets the state indicating whether to auto configure BIGIP/3DNS
     * servers (automatic addition
     *  and deletion of self IPs and virtual servers.
     */
    public iControl.CommonEnabledState get_auto_configure_state() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether to autosync.  Allows automatic
     * updates of wideip.conf to/from other 3-DNSes.
     */
    public iControl.CommonEnabledState get_auto_sync_state() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether to cache LDNSes.
     */
    public iControl.CommonEnabledState get_cache_ldns_state() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether to check availability of
     * a path before it uses the path for load balancing.
     */
    public iControl.CommonEnabledState get_check_dynamic_dependency_state() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether to check the availability
     * of virtual servers.
     */
    public iControl.CommonEnabledState get_check_static_dependency_state() throws java.rmi.RemoteException;

    /**
     * Gets the default alternate LB method.
     */
    public iControl.GlobalLBLBMethod get_default_alternate_lb_method() throws java.rmi.RemoteException;

    /**
     * Gets the default fallback LB method.
     */
    public iControl.GlobalLBLBMethod get_default_fallback_lb_method() throws java.rmi.RemoteException;

    /**
     * Gets the default probe limit, the number of times to probe
     * a path.
     */
    public long get_default_probe_limit() throws java.rmi.RemoteException;

    /**
     * Gets the "down_multiple" value. If a host server or a host
     * virtual server has been marked 
     *  down for the last down_threshold probing cycles (timer_get_host_data
     * or timer_get_vs_data respectively),
     *  then perform service checks every down_multiple * timer period instead.
     */
    public long get_down_multiple() throws java.rmi.RemoteException;

    /**
     * Gets the "down_threshold" value. If a host server or a host
     * virtual server has been marked 
     *  down for the last down_threshold probing cycles (timer_get_host_data
     * or timer_get_vs_data respectively),
     *  then perform service checks every down_multiple * timer period instead.
     */
    public long get_down_threshold() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether persistent connections are
     * allowed to remain connected, until TTL expires, when disabling a pool.
     */
    public iControl.CommonEnabledState get_drain_request_state() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether to dump the topology.
     */
    public iControl.CommonEnabledState get_dump_topology_state() throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used.  It has never been functional.
     * 
     *  Gets the state to indicate whether to respect ACL.
     */
    public iControl.CommonEnabledState get_fb_respect_acl_state() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether to respect virtual server
     * status when load balancing 
     *  switches to the fallback mode.
     */
    public iControl.CommonEnabledState get_fb_respect_dependency_state() throws java.rmi.RemoteException;

    /**
     * Gets the number of seconds that an inactive LDNS remains cached.
     */
    public long get_ldns_duration() throws java.rmi.RemoteException;

    /**
     * Gets the LDNS probe protocols. The order of the protocols in
     * the sequence 
     *  will be used to indicate the preferred protocols, i.e. the first
     * protocol
     *  in the sequence is the most preferred protocol.
     */
    public iControl.GlobalLBLDNSProbeProtocol[] get_ldns_probe_protocols() throws java.rmi.RemoteException;

    /**
     * Gets the link compensate inbound state. If set, the link allotment
     * calculation will take into account 
     *  traffic which does not flow through the BIGIP, i.e. if more traffic
     * is flowing through a link 
     *  as measured by SNMP on the router than is flowing through the BIGIP.
     * This applies to inbound 
     *  traffic which the major volume will initiate from internal clients.
     */
    public iControl.CommonEnabledState get_link_compensate_inbound_state() throws java.rmi.RemoteException;

    /**
     * Gets the link compensate outbound state. If set, the link allotment
     * calculation will take into account 
     *  traffic which does not flow through the BIGIP, i.e. if more traffic
     * is flowing through a link 
     *  as measured by SNMP on the router than is flowing through the BIGIP.
     * This applies to outbound 
     *  traffic which the major volume will initiate from internal clients.
     */
    public iControl.CommonEnabledState get_link_compensate_outbound_state() throws java.rmi.RemoteException;

    /**
     * Gets the link compensation history.
     */
    public long get_link_compensation_history() throws java.rmi.RemoteException;

    /**
     * Gets the link limit factor, which is used to set a target percentage
     * for traffic. For example,
     *  if it is set to 90, the ratio cost based load-balancing will set
     * a ratio with a maximum value 
     *  equal to 90% of the limit value for the link. Default is 95%.
     */
    public long get_link_limit_factor() throws java.rmi.RemoteException;

    /**
     * Gets the link prepaid factor. Maximum percentage of traffic
     * allocated to link which has a 
     *  traffic allotment which has been prepaid. Default is 95%.
     */
    public long get_link_prepaid_factor() throws java.rmi.RemoteException;

    /**
     * Gets the lower bound percentage column options in Internet
     * Weather Map.
     */
    public long get_lower_bound_percentage_column() throws java.rmi.RemoteException;

    /**
     * Gets the lower bound percentage row options in Internet Weather
     * Map.
     */
    public long get_lower_bound_percentage_row() throws java.rmi.RemoteException;

    /**
     * Gets the maximum link over limit count. The count of how many
     * times in a row traffic may be over
     *  the defined limit for the link before it is shut off entirely. Default
     * is 1.
     */
    public long get_maximum_link_over_limit_count() throws java.rmi.RemoteException;

    /**
     * Gets the maximum synchronous monitor request, which is used
     * to control the maximum number of 
     *  monitor requests being sent out at one time for a given probing interval.
     * This will allow the 
     *  user to smooth out monitor probe requests as much as they desire.
     */
    public long get_maximum_synchronous_monitor_request() throws java.rmi.RemoteException;

    /**
     * Gets the over-limit link limit factor. If traffic on a link
     * exceeds the limit, this factor will 
     *  be used instead of the link_limit_factor until the traffic is over
     * limit for more than 
     *  max_link_over_limit_count times. Once the limit has been exceeded
     * too many times, all traffic
     *  is shut off for the link. The default for over_limit_link_limit_factor
     * is 90%.
     */
    public long get_over_limit_link_limit_factor() throws java.rmi.RemoteException;

    /**
     * Gets the number of seconds that a path remains cached after
     * its last access.
     */
    public long get_path_duration() throws java.rmi.RemoteException;

    /**
     * Gets the TTL for the path information.
     */
    public long get_path_ttl() throws java.rmi.RemoteException;

    /**
     * Gets the state indicating whether the dynamic load balancing
     * modes can use path data even after the TTL for the path data has expired..
     */
    public iControl.CommonEnabledState get_paths_never_die_state() throws java.rmi.RemoteException;

    /**
     * Gets the persistence mask.
     *  This function is deprecated and new applications should use
     *  get_static_persistence_cidr_mask.
     */
    public long get_persistence_mask() throws java.rmi.RemoteException;

    /**
     * Gets the state that if enabled, GTM will still probe disabled
     * object.
     */
    public iControl.CommonEnabledState get_probe_disabled_object_state() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize bits per second when the
     * load balancing mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_bps() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize connection rates when the
     * load balancing mode is set to LB_METHOD_QOS.
     *  This function is deprecated and new applications should use vs_score.
     */
    public long get_qos_factor_connection_rate() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize ping packet completion rates
     * when the load balancing mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_hit_ratio() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize hops when the load balancing
     * mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_hops() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize link capacity values when
     * the load balancing mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_lcs() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize packet rates when the load
     * balancing mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_packet_rate() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize round-trip time values when
     * the load balancing mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_rtt() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize topology values when the
     * load balancing mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_topology() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize virtual server capacity values
     * when the load balancing mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_vs_capacity() throws java.rmi.RemoteException;

    /**
     * Gets the factor used to normalize virtual server (VS) score
     * when the load balancing mode is set to LB_METHOD_QOS.
     */
    public long get_qos_factor_vs_score() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether ripeness value is allowed
     * to be reset.
     */
    public iControl.CommonEnabledState get_reset_ripeness_state() throws java.rmi.RemoteException;

    /**
     * Gets the length of the packet sent out in a probe request to
     * determine path information.
     */
    public long get_rtt_packet_length() throws java.rmi.RemoteException;

    /**
     * Gets the number of packets to send out in a probe request to
     * determine path information.
     */
    public long get_rtt_sample_count() throws java.rmi.RemoteException;

    /**
     * Gets the timeout for RTT, in seconds.
     */
    public long get_rtt_timeout() throws java.rmi.RemoteException;

    /**
     * Gets the CIDR mask (length) for the static persistence load
     * balancing mode.
     */
    public long get_static_persistence_cidr_mask(boolean v6) throws java.rmi.RemoteException;

    /**
     * Gets the sync group name.
     */
    public java.lang.String get_sync_group_name() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether to auto_synchronize named
     * configuration.
     *  Allows automatic updates of named.conf to/from other 3-DNSes.
     */
    public iControl.CommonEnabledState get_sync_named_configuration_state() throws java.rmi.RemoteException;

    /**
     * Gets the sync timeout. If synch'ing from a remote 3-DNS takes
     * longer than 
     *  this timeout, then abort the connection.
     */
    public long get_sync_timeout() throws java.rmi.RemoteException;

    /**
     * Gets the sync zones timeout. If synch'ing named and zone configuration
     * takes 
     *  this timeout, then abort the connection.
     */
    public long get_sync_zone_timeout() throws java.rmi.RemoteException;

    /**
     * Gets the allowable time difference for data to be out of sync
     * between members of a sync group.
     */
    public long get_time_tolerance() throws java.rmi.RemoteException;

    /**
     * Gets the frequency at which to retrieve auto-configuration
     * data.
     */
    public long get_timer_get_auto_configuration_data() throws java.rmi.RemoteException;

    /**
     * Gets the frequency at which to retrieve path and metrics data
     * from the system cache.
     */
    public long get_timer_persistence_cache() throws java.rmi.RemoteException;

    /**
     * Gets the frequency at which to retry path data.
     */
    public long get_timer_retry_path_data() throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used.  Please enable/disable pool members directly if desired.
     * 
     *  Gets the threshold for the topology ACL.
     */
    public long get_topology_acl_threshold() throws java.rmi.RemoteException;

    /**
     * Gets the state to indicate whether the 3-DNS Controller selects
     * the topology record that is most 
     *  specific and, thus, has the longest match, in cases where there are
     * several IP/netmask items that 
     *  match a particular IP address.  If you select No, the 3-DNS Controller
     * uses the first topology 
     *  record that matches (according to the order of entry) in the topology
     * statement.
     */
    public iControl.CommonEnabledState get_topology_longest_match_state() throws java.rmi.RemoteException;

    /**
     * Gets the port to use to collect traceroute (hops) data.
     */
    public long get_traceroute_port() throws java.rmi.RemoteException;

    /**
     * Gets the TTL for the traceroute information.
     */
    public long get_traceroute_ttl() throws java.rmi.RemoteException;

    /**
     * Gets the state that if enabled, it will set the recursion bit
     * in all DNS responses from GTM.
     */
    public iControl.CommonEnabledState get_use_recursion_bit_state() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether local DNS servers that belong
     * to AOL (America Online) are recognized.
     */
    public void set_aol_aware_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the state indicating whether to auto configure BIGIP/3DNS
     * servers (automatic addition
     *  and deletion of self IPs and virtual servers.
     */
    public void set_auto_configure_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether to autosync.  Allows automatic
     * updates of wideip.conf to/from other 3-DNSes.
     */
    public void set_auto_sync_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether to cache LDNSes.
     */
    public void set_cache_ldns_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether to check availability of
     * a path before it uses the path for load balancing.
     */
    public void set_check_dynamic_dependency_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether to check the availability
     * of virtual servers.
     */
    public void set_check_static_dependency_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the default alternate LB method.
     */
    public void set_default_alternate_lb_method(iControl.GlobalLBLBMethod lb_method) throws java.rmi.RemoteException;

    /**
     * Sets the default fallback LB method.
     */
    public void set_default_fallback_lb_method(iControl.GlobalLBLBMethod lb_method) throws java.rmi.RemoteException;

    /**
     * Sets the default probe limit, the number of times to probe
     * a path.
     */
    public void set_default_probe_limit(long value) throws java.rmi.RemoteException;

    /**
     * Sets the "down_multiple" value. If a host server or a host
     * virtual server has been marked 
     *  down for the last down_threshold probing cycles (timer_get_host_data
     * or timer_get_vs_data respectively),
     *  then perform service checks every down_multiple * timer period instead.
     */
    public void set_down_multiple(long value) throws java.rmi.RemoteException;

    /**
     * Sets the "down_threshold" value. If a host server or a host
     * virtual server has been marked 
     *  down for the last down_threshold probing cycles (timer_get_host_data
     * or timer_get_vs_data respectively),
     *  then perform service checks every down_multiple * timer period instead.
     */
    public void set_down_threshold(long value) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether persistent connections are
     * allowed to remain connected, until TTL expires, when disabling a pool.
     */
    public void set_drain_request_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether to dump the topology.
     */
    public void set_dump_topology_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used.  It has never been functional.
     * 
     *  Sets the state to indicate whether to respect ACL.
     */
    public void set_fb_respect_acl_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether to respect virtual server
     * status when load balancing 
     *  switches to the fallback mode.
     */
    public void set_fb_respect_dependency_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the number of seconds that an inactive LDNS remains cached.
     */
    public void set_ldns_duration(long value) throws java.rmi.RemoteException;

    /**
     * Sets the LDNS probe protocols. The order of the protocols in
     * the sequence 
     *  will be used to indicate the preferred protocols, i.e. the first
     * protocol
     *  in the sequence is the most preferred protocol.
     * 
     *  If you'd like to remove an item, get the LDNS probe protocols, remove
     * the
     *  item, then do set.
     */
    public void set_ldns_probe_protocols(iControl.GlobalLBLDNSProbeProtocol[] protocols) throws java.rmi.RemoteException;

    /**
     * Sets the link compensate inbound state. If set, the link allotment
     * calculation will take into account 
     *  traffic which does not flow through the BIGIP, i.e. if more traffic
     * is flowing through a link 
     *  as measured by SNMP on the router than is flowing through the BIGIP.
     * This applies to inbound 
     *  traffic which the major volume will initiate from internal clients.
     */
    public void set_link_compensate_inbound_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the link compensate outbound state. If set, the link allotment
     * calculation will take into account 
     *  traffic which does not flow through the BIGIP, i.e. if more traffic
     * is flowing through a link 
     *  as measured by SNMP on the router than is flowing through the BIGIP.
     * This applies to outbound 
     *  traffic which the major volume will initiate from internal clients.
     */
    public void set_link_compensate_outbound_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the link compensation history.
     */
    public void set_link_compensation_history(long value) throws java.rmi.RemoteException;

    /**
     * Sets the link limit factor, which is used to set a target percentage
     * for traffic. For example,
     *  if it is set to 90, the ratio cost based load-balancing will set
     * a ratio with a maximum value 
     *  equal to 90% of the limit value for the link. Default is 95%.
     */
    public void set_link_limit_factor(long value) throws java.rmi.RemoteException;

    /**
     * Sets the link prepaid factor. Maximum percentage of traffic
     * allocated to link which has a 
     *  traffic allotment which has been prepaid. Default is 95%.
     */
    public void set_link_prepaid_factor(long value) throws java.rmi.RemoteException;

    /**
     * Sets the number of seconds that an inactive LDNS remains cached.
     * 
     *  This function is deprecated (due to being misnamed); new applications
     * should
     *  use set_ldns_duration.
     */
    public void set_lnds_duration(long value) throws java.rmi.RemoteException;

    /**
     * Sets the lower bound percentage column options in Internet
     * Weather Map.
     */
    public void set_lower_bound_percentage_column(long value) throws java.rmi.RemoteException;

    /**
     * Sets the lower bound percentage row options in Internet Weather
     * Map.
     */
    public void set_lower_bound_percentage_row(long value) throws java.rmi.RemoteException;

    /**
     * Sets the maximum link over limit count. The count of how many
     * times in a row traffic may be over
     *  the defined limit for the link before it is shut off entirely. Default
     * is 1.
     */
    public void set_maximum_link_over_limit_count(long value) throws java.rmi.RemoteException;

    /**
     * Sets the maximum synchronous monitor request, which is used
     * to control the maximum number of 
     *  monitor requests being sent out at one time for a given probing interval.
     * This will allow the 
     *  user to smooth out monitor probe requests as much as they desire.
     */
    public void set_maximum_synchronous_monitor_request(long value) throws java.rmi.RemoteException;

    /**
     * Sets the over-limit link limit factor. If traffic on a link
     * exceeds the limit, this factor will 
     *  be used instead of the link_limit_factor until the traffic is over
     * limit for more than 
     *  max_link_over_limit_count times. Once the limit has been exceeded
     * too many times, all traffic
     *  is shut off for the link. The default for over_limit_link_limit_factor
     * is 90%.
     */
    public void set_over_limit_link_limit_factor(long value) throws java.rmi.RemoteException;

    /**
     * Sets the number of seconds that a path remains cached after
     * its last access.
     */
    public void set_path_duration(long value) throws java.rmi.RemoteException;

    /**
     * Sets the TTL for the path information.
     */
    public void set_path_ttl(long value) throws java.rmi.RemoteException;

    /**
     * Sets the state indicating whether the dynamic load balancing
     * modes can use path data even after the TTL for the path data has expired.
     */
    public void set_paths_never_die_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the persistence mask.
     *  This function is deprecated and new applications should use
     *  set_static_persistence_cidr_mask.
     */
    public void set_persistence_mask(long value) throws java.rmi.RemoteException;

    /**
     * Sets the state that if enabled, GTM will still probe disabled
     * object.
     */
    public void set_probe_disabled_object_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize bits per second when the
     * load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_bps(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize connection rates when the
     * load balancing mode is set to LB_METHOD_QOS.
     *  This function is deprecated and new applications should use vs_score.
     */
    public void set_qos_factor_connection_rate(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize ping packet completion rates
     * when the load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_hit_ratio(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize hops when the load balancing
     * mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_hops(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize link capacity values when
     * the load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_lcs(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize packet rates when the load
     * balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_packet_rate(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize round-trip time values when
     * the load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_rtt(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize topology values when the
     * load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_topology(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize virtual server capacity values
     * when the load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_vs_capacity(long value) throws java.rmi.RemoteException;

    /**
     * Sets the factor used to normalize virtual server (VS) score
     * when the load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_factor_vs_score(long value) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether ripeness value is allowed
     * to be reset.
     */
    public void set_reset_ripeness_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the length of the packet sent out in a probe request to
     * determine path information.
     */
    public void set_rtt_packet_length(long value) throws java.rmi.RemoteException;

    /**
     * Sets the number of packets to send out in a probe request to
     * determine path information.
     */
    public void set_rtt_sample_count(long value) throws java.rmi.RemoteException;

    /**
     * Sets the timeout for RTT, in seconds.
     */
    public void set_rtt_timeout(long value) throws java.rmi.RemoteException;

    /**
     * Sets the CIDR mask (length) for the static persistence load
     * balancing mode.
     */
    public void set_static_persistence_cidr_mask(long value, boolean v6) throws java.rmi.RemoteException;

    /**
     * Sets the sync group name.
     */
    public void set_sync_group_name(java.lang.String sync_group_name) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether to auto-synchronize named
     * configuration. 
     *  Allows automatic updates of named.conf to/from other 3-DNSes.
     */
    public void set_sync_named_configuration_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the sync timeout.  If synch'ing from a remote 3-DNS takes
     * longer than 
     *  this timeout, then abort the connection.
     */
    public void set_sync_timeout(long value) throws java.rmi.RemoteException;

    /**
     * Sets the sync zones timeout. If synch'ing named and zone configuration
     * takes 
     *  this timeout, then abort the connection.
     */
    public void set_sync_zone_timeout(long value) throws java.rmi.RemoteException;

    /**
     * Sets the allowable time difference for data to be out of sync
     * between members of a sync group.
     */
    public void set_time_tolerance(long value) throws java.rmi.RemoteException;

    /**
     * Sets the frequency at which to retrieve auto-configuration
     * data.
     */
    public void set_timer_get_auto_configuration_data(long value) throws java.rmi.RemoteException;

    /**
     * Sets the frequency at which to retrieve path and metrics data
     * from the system cache.
     */
    public void set_timer_persistence_cache(long value) throws java.rmi.RemoteException;

    /**
     * Sets the frequency at which to retry path data.
     */
    public void set_timer_retry_path_data(long value) throws java.rmi.RemoteException;

    /**
     * This method is deprecated (immediately) and should not be
     *  used.  Please enable/disable pool members directly if desired.
     * 
     *  Sets the threshold for the topology ACL.
     */
    public void set_topology_acl_threshold(long value) throws java.rmi.RemoteException;

    /**
     * Sets the state to indicate whether the 3-DNS Controller selects
     * the topology record that is most 
     *  specific and, thus, has the longest match, in cases where there are
     * several IP/netmask items that 
     *  match a particular IP address.  If you select No, the 3-DNS Controller
     * uses the first topology 
     *  record that matches (according to the order of entry) in the topology
     * statement.
     */
    public void set_topology_longest_match_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;

    /**
     * Sets the port to use to collect traceroute (hops) data.
     */
    public void set_traceroute_port(long value) throws java.rmi.RemoteException;

    /**
     * Sets the TTL for the traceroute information.
     */
    public void set_traceroute_ttl(long value) throws java.rmi.RemoteException;

    /**
     * Sets the state that if enabled, it will set the recursion bit
     * in all DNS responses from GTM.
     */
    public void set_use_recursion_bit_state(iControl.CommonEnabledState state) throws java.rmi.RemoteException;
}
