/**
 * LocalLBRateClassPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBRateClassPortType extends java.rmi.Remote {

    /**
     * Creates the specified rate classes.
     */
    public void create(java.lang.String[] rate_classes, iControl.LocalLBRateClassRateUnit[] base_rates) throws java.rmi.RemoteException;

    /**
     * Creates the specified drop policies, given the drop policy
     * type,
     *  the general strategy used by the rate filter to throttle traffic.
     * Note that pre-defined drop policies exist with a basic
     *  configuration for each type - "tail", "red", and "fred".  Also note
     * that a rate filter class defaults to using a "tail" drop policy.
     */
    public void create_drop_policy(java.lang.String[] drop_policies, iControl.LocalLBRateClassDropPolicyType[] types) throws java.rmi.RemoteException;

    /**
     * Creates the specified queueing methods, given their queueing
     * method
     *  type.
     */
    public void create_queueing_method(java.lang.String[] queues, iControl.LocalLBRateClassQueueType[] types) throws java.rmi.RemoteException;

    /**
     * Creates the specified shaping policies.
     */
    public void create_shaping_policy(java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Deletes all drop policies
     */
    public void delete_all_drop_policies() throws java.rmi.RemoteException;

    /**
     * Deletes all queueing methods.
     */
    public void delete_all_queueing_methods() throws java.rmi.RemoteException;

    /**
     * Deletes all rate classes.
     */
    public void delete_all_rate_classes() throws java.rmi.RemoteException;

    /**
     * Deletes all shaping policies.
     */
    public void delete_all_shaping_policies() throws java.rmi.RemoteException;

    /**
     * Deletes the specified drop policies
     */
    public void delete_drop_policy(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Deletes the specified queueing methods.
     */
    public void delete_queueing_method(java.lang.String[] queues) throws java.rmi.RemoteException;

    /**
     * Deletes the specified rate classes.
     */
    public void delete_rate_class(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Deletes the specified shaping policies.
     */
    public void delete_shaping_policy(java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the rate classes.
     */
    public iControl.LocalLBRateClassRateClassStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the base rates for the specified rate classes.  The base
     * rate specifies the maximum throughput to allot to traffic 
     *  handled by the Rate Class. Packets in excess of the posted rate will
     * be dropped.
     */
    public iControl.LocalLBRateClassRateUnit[] get_base_rate(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the burst sizes for the specified rate classes. The burst
     * size specifies maximum number of 
     *  bytes that traffic is allowed to burst beyond the base rate.
     */
    public long[] get_burst_size(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the ceiling rates for the specified rate classes.  The
     * ceiling rate specifies how far beyond the base rate the traffic 
     *  is allowed to flow when bursting. The ceiling rate is an absolute
     * limit - it is impossible for traffic to flow at a higher 
     *  rate than the ceiling rate, even when bursting. If the ceiling rate
     * is omitted or is equal to the base rate, the traffic 
     *  may not exceed the base rate. It is illegal for the ceiling rate
     * to be less than the base rate.
     */
    public iControl.LocalLBRateClassRateUnit[] get_ceiling_rate(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the direction types being used by the specified rate classes.
     */
    public iControl.LocalLBRateClassDirectionType[] get_direction(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the VLAN whose outbound traffic is rate filtered.  This
     * is
     *  only valid for the DIRECTION_VLAN direction.
     */
    public java.lang.String[] get_direction_vlan(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the name of the drop policy, specifying how a rate filter
     * drops packets when the rate filter is throttling traffic.
     */
    public java.lang.String[] get_drop_policy(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the average packet (maximum transmission unit (MTU)) size.
     * This is only valid for the "fred" and "red" types.
     */
    public long[] get_drop_policy_average_packet_size(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets the drop limit factor.  This is only valid for the "fred"
     * type.
     */
    public long[] get_drop_policy_drop_limit_factor(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets a list of all drop policies
     */
    public java.lang.String[] get_drop_policy_list() throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of active connections for each queue.
     * This
     *  is only valid for the "fred" type.
     */
    public long[] get_drop_policy_maximum_active_connections(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets the maximum probability for dropping packets when the
     * average
     *  queue length is between the minimum and maximum thresholds.  This
     * is only valid for the "red" and "fred" types.
     */
    public long[] get_drop_policy_maximum_probability(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets the maximum queue size.  This is only valid for the "red"
     * type.
     */
    public long[] get_drop_policy_maximum_queue_size(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets the queue length threshold above which packets are dropped
     * when the rate filter is throttling traffic.  This is only valid for
     * the "red" and "fred" types.
     */
    public long[] get_drop_policy_maximum_queue_threshold(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets the queue length threshold below which packets are not
     * dropped when the rate filter is throttling traffic.  This is only
     *  valid for the "red" and "fred" types.
     */
    public long[] get_drop_policy_minimum_queue_threshold(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets the no-drop limit factor.  This is only valid for the
     * "fred"
     *  type.
     */
    public long[] get_drop_policy_no_drop_limit_factor(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets the drop policy type
     */
    public iControl.LocalLBRateClassDropPolicyType[] get_drop_policy_type(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets the weight used to calculate the average queue lengths.
     * This
     *  is only valid for the "red" and "fred" types.
     */
    public long[] get_drop_policy_weight(java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Gets a list of all rate classes.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the name of the parent rate class. Any child Rate Class
     * has the ability to borrow bandwidth from its parent. 
     *  If the parent rate class is not specified in the definition of a
     * rate class, the Rate Class is not a child, but 
     *  may be a parent if another Rate Class refers to it as such.
     */
    public java.lang.String[] get_parent(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the base rate, if specified as a percentage of the parent
     * rate
     *  filter class' base rate.  This is zero if the base rate is
     *  specified as bandwidth (see set/get_base_rate).
     */
    public long[] get_percent_of_parent_base_rate(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the ceiling rate, if specified as a percentage of the
     * parent's
     *  ceiling rate.  This is zero if the ceiling rate is specified as a
     * throughput (see set/get_ceiling_rate).
     */
    public long[] get_percent_of_parent_ceiling_rate(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the queue types being used by the specified rate classes.
     * See
     *  also the get_queueing_method method.
     */
    public iControl.LocalLBRateClassQueueType[] get_queue_type(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the queueing method, specifying how packets are queued
     * for
     *  rate filtering, effectively determining the class of traffic which
     * is dropped if necessary.
     */
    public java.lang.String[] get_queueing_method(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the number of the buckets used to divide the traffic for
     * each
     *  queue.  This is only valid for the stochastic fair queueing type.
     */
    public long[] get_queueing_method_bucket_count(java.lang.String[] queues) throws java.rmi.RemoteException;

    /**
     * Gets the size of the buckets used to divide the traffic for
     * each
     *  queue.  This is only valid for the stochastic fair queueing type.
     */
    public long[] get_queueing_method_bucket_size(java.lang.String[] queues) throws java.rmi.RemoteException;

    /**
     * Gets a list of all queueing methods
     */
    public java.lang.String[] get_queueing_method_list() throws java.rmi.RemoteException;

    /**
     * Gets the maximum queue size.  This is only valid for the Priority
     * FIFO queueing type.
     */
    public long[] get_queueing_method_maximum_queue_size(java.lang.String[] queues) throws java.rmi.RemoteException;

    /**
     * Gets the minimum queue size.  This is only valid for the Priority
     * FIFO queueing type.
     */
    public long[] get_queueing_method_minimum_queue_size(java.lang.String[] queues) throws java.rmi.RemoteException;

    /**
     * Gets the perburation interval, the interval at which the system
     * reconfigures the bucket hash function.  This is only valid for the
     * stochastic fair queueing type.
     */
    public long[] get_queueing_method_perturbation_interval(java.lang.String[] queues) throws java.rmi.RemoteException;

    /**
     * Gets the queueing method types, i.e., the method use to store
     * and
     *  remove traffic from the queues managed by a rate filter.
     */
    public iControl.LocalLBRateClassQueueType[] get_queueing_method_type(java.lang.String[] queues) throws java.rmi.RemoteException;

    /**
     * Gets the name of shaping policy, used to specify custom drop
     * policies and queueing methods.
     */
    public java.lang.String[] get_shaping_policy(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the burst size for a shaping policy, the maximum number
     * of
     *  bytes that traffic is allowed to burst beyond the base rate.
     */
    public long[] get_shaping_policy_burst_size(java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Gets the name of the drop policy for a shaping policy, specifying
     * how a rate filter drops packets when the rate filter is throttling
     * traffic.
     */
    public java.lang.String[] get_shaping_policy_drop_policy(java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Gets a list of all shaping policies
     */
    public java.lang.String[] get_shaping_policy_list() throws java.rmi.RemoteException;

    /**
     * Gets the base rate for a shaping policy, if specified as a
     *  percentage of the parent rate filter class' base rate.
     */
    public long[] get_shaping_policy_percent_of_parent_base_rate(java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Gets the ceiling rate for a shaping policy, if specified as
     * a
     *  percentage of the parent rate filter class' ceiling rate.
     */
    public long[] get_shaping_policy_percent_of_parent_ceiling_rate(java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Gets the queueing method for a shaping policy, specifying how
     * packets are queued for rate filtering, effectively determining the
     * class of traffic which is dropped if necessary.
     */
    public java.lang.String[] get_shaping_policy_queueing_method(java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified rate classes.
     */
    public iControl.LocalLBRateClassRateClassStatistics get_statistics(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified rate classes.
     */
    public void reset_statistics(java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Sets the base rates for the specified rate classes.  The base
     * rate specifies the maximum throughput to allot to traffic 
     *  handled by the Rate Class. Packets in excess of the posted rate will
     * be dropped.
     */
    public void set_base_rate(java.lang.String[] rate_classes, iControl.LocalLBRateClassRateUnit[] rates) throws java.rmi.RemoteException;

    /**
     * Sets the burst sizes for the specified rate classes. The burst
     * size specifies maximum number of 
     *  bytes that traffic is allowed to burst beyond the base rate.
     */
    public void set_burst_size(java.lang.String[] rate_classes, long[] burst_sizes) throws java.rmi.RemoteException;

    /**
     * Sets the ceiling rates for the specified rate classes.  The
     * ceiling rate specifies how far beyond the base rate the traffic 
     *  is allowed to flow when bursting. The ceiling rate is an absolute
     * limit - it is impossible for traffic to flow at a higher 
     *  rate than the ceiling rate, even when bursting. If the ceiling rate
     * is omitted or is equal to the base rate, the traffic 
     *  may not exceed the base rate. It is illegal for the ceiling rate
     * to be less than the base rate.
     */
    public void set_ceiling_rate(java.lang.String[] rate_classes, iControl.LocalLBRateClassRateUnit[] rates) throws java.rmi.RemoteException;

    /**
     * Sets the direction types to be used by the specified rate classes.
     * For the DIRECTION_VLAN type, it is best to use set_direction_vlan.
     */
    public void set_direction(java.lang.String[] rate_classes, iControl.LocalLBRateClassDirectionType[] direction_types) throws java.rmi.RemoteException;

    /**
     * Sets the direction type to apply rate filtering to traffic
     * leaving
     *  via a specified VLAN.
     */
    public void set_direction_vlan(java.lang.String[] rate_classes, java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * A drop policy controls which packets are dropped when a rate
     * filter
     *  needs to throttle traffic.  A rate filter collects traffic in a
     *  number of queues, classified according to the rate filter's
     *  queueing method (see set_queueing_method).  The drop policy
     *  determines how traffic is dropped from each queue with each queue's
     * being treated the same.
     * 
     *  This method sets the name of the drop policy.  Three pre-defined
     *  drop policies exist.  "fred" drops packets according to the type
     * of
     *  traffic.  "red" drops packets randomly.  "tail" drops packets from
     * the end of the queues.
     */
    public void set_drop_policy(java.lang.String[] rate_classes, java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Sets the average packet (maximum transmission unit (MTU)) size.
     * This is only valid for the "fred" and "red" types.
     */
    public void set_drop_policy_average_packet_size(java.lang.String[] drop_policies, long[] mtus) throws java.rmi.RemoteException;

    /**
     * Sets the drop limit factor.  A larger value increases the hard
     * drop
     *  limit.  This is only valid for the "fred" type.
     */
    public void set_drop_policy_drop_limit_factor(java.lang.String[] drop_policies, long[] factors) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of active connections for each queue.
     * This
     *  is only valid for the "fred" type.
     */
    public void set_drop_policy_maximum_active_connections(java.lang.String[] drop_policies, long[] max_conns) throws java.rmi.RemoteException;

    /**
     * Sets the maximum probability for dropping packets when the
     * average
     *  queue length is between the minimum and maximum thresholds.  This
     * is only used for the "red" and "fred" types.
     */
    public void set_drop_policy_maximum_probability(java.lang.String[] drop_policies, long[] probabilities) throws java.rmi.RemoteException;

    /**
     * Sets the maximum queue size.  If a queue exceeds that size,
     * any
     *  additional packets are dropped if the rate filter is throttling
     *  traffic.  This is only valid for the "red" type.
     */
    public void set_drop_policy_maximum_queue_size(java.lang.String[] drop_policies, long[] max_sizes) throws java.rmi.RemoteException;

    /**
     * Sets the queue length threshold above which packets are dropped
     * when the rate filter is throttling traffic.  This is only used for
     * the "red" and "fred" types.
     */
    public void set_drop_policy_maximum_queue_threshold(java.lang.String[] drop_policies, long[] thresholds) throws java.rmi.RemoteException;

    /**
     * Sets the queue length threshold below which packets are not
     * dropped when the rate filter is throttling traffic.  This is only
     *  used for the "red" and "fred" types.
     */
    public void set_drop_policy_minimum_queue_threshold(java.lang.String[] drop_policies, long[] thresholds) throws java.rmi.RemoteException;

    /**
     * Sets the no-drop limit factor.  A larger value prevents packets
     * from being dropped.  This is only valid for the "fred" type.
     */
    public void set_drop_policy_no_drop_limit_factor(java.lang.String[] drop_policies, long[] factors) throws java.rmi.RemoteException;

    /**
     * Sets the drop policy type, i.e., the general strategy for a
     * rate
     *  filter's dropping packets when throttling traffic.  See the
     *  DropPolicyType enumeration for details.
     */
    public void set_drop_policy_type(java.lang.String[] drop_policies, iControl.LocalLBRateClassDropPolicyType[] types) throws java.rmi.RemoteException;

    /**
     * Sets the weight used to calculate the average lengths of the
     * rate
     *  filter's queues.  This is only used for the "red" and "fred" types.
     */
    public void set_drop_policy_weight(java.lang.String[] drop_policies, long[] weights) throws java.rmi.RemoteException;

    /**
     * Sets the name of the parent rate class. Any child Rate Class
     * has the ability to borrow bandwidth from its parent. 
     *  If the parent rate class is not specified in the definition of a
     * rate class, the Rate Class is not a child, but 
     *  may be a parent if another Rate Class refers to it as such.
     */
    public void set_parent(java.lang.String[] rate_classes, java.lang.String[] parents) throws java.rmi.RemoteException;

    /**
     * Sets base rate by specifying a percentage of the parent's base
     * rate.  The base rate is the maximum throughput for traffic handled
     * by the rate filter.
     */
    public void set_percent_of_parent_base_rate(java.lang.String[] rate_classes, long[] percents) throws java.rmi.RemoteException;

    /**
     * Sets the ceiling rate by specifying a percentage of the parent's
     * ceiling rate.  The ceiling rate specifies the absolute throughput
     *  limit for traffic handled by the rate filter.
     */
    public void set_percent_of_parent_ceiling_rate(java.lang.String[] rate_classes, long[] percents) throws java.rmi.RemoteException;

    /**
     * Sets the queue types to be used by the specified rate classes.
     * See
     *  also the set_queueing_method method.
     */
    public void set_queue_type(java.lang.String[] rate_classes, iControl.LocalLBRateClassQueueType[] queue_types) throws java.rmi.RemoteException;

    /**
     * Sets the queueing method, specifying how packets are queued
     * for
     *  rate filtering, effectively determining the class of traffic which
     * is dropped, if necessary.  Two pre-defined methods exist.  "sfq"
     *  queues traffic according to the connection information, i.e., being
     * fair to individual connections.  "pfifo" queues traffic according
     *  to the Type of Service (ToS) packet field.
     * 
     *  This method is a more expansive version of the set_queue_type
     *  method, whose two enumerated types map exactly to the pre-defined
     * "pfifo" and "sfq" objects.
     */
    public void set_queueing_method(java.lang.String[] rate_classes, java.lang.String[] methods) throws java.rmi.RemoteException;

    /**
     * Sets the number of the buckets used to divide the traffic for
     * each
     *  queue.  This is only used by the stochastic fair queueing type.
     */
    public void set_queueing_method_bucket_count(java.lang.String[] queues, long[] bucket_counts) throws java.rmi.RemoteException;

    /**
     * Sets the size of the buckets used to divide the traffic for
     * each
     *  queue.  This is only used by the stochastic fair queueing type.
     */
    public void set_queueing_method_bucket_size(java.lang.String[] queues, long[] bucket_sizes) throws java.rmi.RemoteException;

    /**
     * Sets the maximum queue size.  This is only used by the Priority
     * FIFO queueing type.
     */
    public void set_queueing_method_maximum_queue_size(java.lang.String[] queues, long[] max_sizes) throws java.rmi.RemoteException;

    /**
     * Sets the minimum queue size.  This is only used by the Priority
     * FIFO queueing type.
     */
    public void set_queueing_method_minimum_queue_size(java.lang.String[] queues, long[] min_sizes) throws java.rmi.RemoteException;

    /**
     * Sets the perturbation interval, i.e. the interval at which
     * the
     *  rate filter reconfigures the bucket hash function.  This is only
     *  used by the stochastic fair queueing type.
     */
    public void set_queueing_method_perturbation_interval(java.lang.String[] queues, long[] intervals) throws java.rmi.RemoteException;

    /**
     * Sets the queueing method type, i.e., the method use to store
     * and
     *  remove traffic from the queues managed by a rate filter.  See the
     * QueueType enumeration for more details.
     */
    public void set_queueing_method_type(java.lang.String[] queues, iControl.LocalLBRateClassQueueType[] types) throws java.rmi.RemoteException;

    /**
     * Sets the shaping policy, used to specify custom drop policies
     * and
     *  queueing methods.
     * 
     *  A shaping policy encapsulates a set of rate filter class
     *  configuration attributes into a single object.  Once created, this
     * object can be used to create rate filter classes more easily, by
     *  specifying a shaping policy rather than all of its attributes
     *  individually.
     * 
     *  Note that this is purely a convenience interface.  There is nothing
     * in a shaping policy which cannot also be done via a rate filter
     *  class object.
     */
    public void set_shaping_policy(java.lang.String[] rate_classes, java.lang.String[] policies) throws java.rmi.RemoteException;

    /**
     * Sets the burst size in a shaping policy, the maximum number
     * of
     *  bytes that traffic is allowed to burst beyond the base rate.
     */
    public void set_shaping_policy_burst_size(java.lang.String[] policies, long[] burst_sizes) throws java.rmi.RemoteException;

    /**
     * Sets the name of the drop policy in a shaping policy, specifying
     * how the rate filter drops packets when throttling traffic.  Three
     *  pre-defined drop policies exist.  "fred" drops packets according
     * to
     *  the type of traffic.  "red" drops packets randomly.  "tail" drops
     * packets from the end of the queues.  See the drop policy methods
     *  for more information.
     */
    public void set_shaping_policy_drop_policy(java.lang.String[] policies, java.lang.String[] drop_policies) throws java.rmi.RemoteException;

    /**
     * Sets base rate in a shaping policy by specifying a percentage
     * of
     *  the parent's rate filter class' base rate.  The base rate is the
     *  maximum throughput for traffic handled by the rate filter.
     */
    public void set_shaping_policy_percent_of_parent_base_rate(java.lang.String[] policies, long[] percents) throws java.rmi.RemoteException;

    /**
     * Sets the ceiling rate for a shaping policy by specifying a
     *  percentage of the parent's rate filter class' ceiling rate.  The
     *  ceiling rate specifies the absolute throughput limit for traffic
     *  handled by the rate filter.
     */
    public void set_shaping_policy_percent_of_parent_ceiling_rate(java.lang.String[] policies, long[] percents) throws java.rmi.RemoteException;

    /**
     * Sets the queueing method for a shaping policy, specifying how
     * packets are queued for rate filtering, effectively determining the
     * class of traffic which is dropped if necessary.  Two pre-defined
     *  methods exist.  "sfq" queues traffic according to the connection
     *  information, i.e., fair to individual connections.  "pfifo" queues
     * traffic according to the Type of Service (ToS) packet field.  See
     *  the queueing method methods for more details.
     */
    public void set_shaping_policy_queueing_method(java.lang.String[] policies, java.lang.String[] methods) throws java.rmi.RemoteException;
}
