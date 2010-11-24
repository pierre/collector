/**
 * SystemSystemInfoPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemSystemInfoPortType extends java.rmi.Remote {

    /**
     * Attempts to acquire lock with specified name for specified
     * number of seconds. 
     *  These locks can be used to synchronize work of multiple clients working
     * with this
     *  device. This call returns immediately.
     */
    public boolean acquire_lock(java.lang.String lock_name, long duration_sec, java.lang.String comment) throws java.rmi.RemoteException;

    /**
     * Gets the CPU usage extended information for this system by
     * host ID for all hosts.
     */
    public iControl.SystemCPUUsageExtendedInformation get_all_cpu_usage_extended_information() throws java.rmi.RemoteException;

    /**
     * Gets the system's base MAC address
     */
    public java.lang.String get_base_mac_address() throws java.rmi.RemoteException;

    /**
     * Gets the temperatures recorded by the blade sensors
     */
    public iControl.SystemBladeTemperature[] get_blade_temperature() throws java.rmi.RemoteException;

    /**
     * Gets connection information (see ConnectionInformation for
     *  more info).
     */
    public iControl.SystemConnectionInformation get_connection_information() throws java.rmi.RemoteException;

    /**
     * Gets the CPU metrics for the CPU(s) on the platform.
     */
    public iControl.SystemPlatformCPUs get_cpu_metrics() throws java.rmi.RemoteException;

    /**
     * Gets the CPU usage extended information for this system by
     * host ID.
     */
    public iControl.SystemCPUUsageExtendedInformation get_cpu_usage_extended_information(java.lang.String[] host_ids) throws java.rmi.RemoteException;

    /**
     * This method has been deprecated; use get_cpu_usage_extended_information
     * and
     *  related methods instead.
     * 
     *  Gets the CPU usage information for this system.
     */
    public iControl.SystemCPUUsageInformation get_cpu_usage_information() throws java.rmi.RemoteException;

    /**
     * Gets the disk usage information for this system.
     */
    public iControl.SystemDiskUsageInformation get_disk_usage_information() throws java.rmi.RemoteException;

    /**
     * Gets the Fan metrics for the Fan(s) on the platform.
     */
    public iControl.SystemPlatformFans get_fan_metrics() throws java.rmi.RemoteException;

    /**
     * Gets the global CPU usage extended information for this system.
     * 
     *  This gets one set of combined ("rolled up") statistics for
     *  all hosts.  It is not to be confused with
     *  get_all_cpu_usage_extended_information, which gets all
     *  individual cpu usage statistics, one for each host.
     */
    public iControl.SystemGlobalCPUUsageExtendedInformation get_global_cpu_usage_extended_information() throws java.rmi.RemoteException;

    /**
     * Gets a globally unique identifier for the system.
     */
    public java.lang.String get_globally_unique_identifier() throws java.rmi.RemoteException;

    /**
     * Gets the unique identifier for the configsync or sync group
     * of which this device is a member.
     */
    public java.lang.String get_group_id() throws java.rmi.RemoteException;

    /**
     * Gets the information for the hardware in the system.  This
     * includes
     *  information about CPUs, compression and encryption acceleration
     *  hardware, etc.
     */
    public iControl.SystemHardwareInformation[] get_hardware_information() throws java.rmi.RemoteException;

    /**
     * Lists all names of currently acquired locks.
     */
    public java.lang.String[] get_lock_list() throws java.rmi.RemoteException;

    /**
     * Gets lock statuses of specified locks
     */
    public iControl.SystemLockStatus[] get_lock_status(java.lang.String[] lock_names) throws java.rmi.RemoteException;

    /**
     * Gets the F5 marketing name for this platform
     */
    public java.lang.String get_marketing_name() throws java.rmi.RemoteException;

    /**
     * This method has been deprecated; use get_host_statistics and
     * related methods instead.
     * 
     *  Gets the memory information for this system.
     */
    public iControl.SystemMemoryUsageInformation get_memory_usage_information() throws java.rmi.RemoteException;

    /**
     * Gets the Power Supply metrics for the Power Supplies on the
     * platform.
     */
    public iControl.SystemPlatformPowerSupplies get_power_supply_metrics() throws java.rmi.RemoteException;

    /**
     * Gets a list of attributes of installed product.
     */
    public iControl.SystemProductInformation get_product_information() throws java.rmi.RemoteException;

    /**
     * Gets the PVA version
     */
    public java.lang.String get_pva_version() throws java.rmi.RemoteException;

    /**
     * Gets the unique identifier for the system.
     */
    public java.lang.String get_system_id() throws java.rmi.RemoteException;

    /**
     * Gets the system-identifying attributes of the operating system.
     */
    public iControl.SystemSystemInformation get_system_information() throws java.rmi.RemoteException;

    /**
     * Gets the current chassis temperatures.
     */
    public iControl.SystemPlatformTemperatures get_temperature_metrics() throws java.rmi.RemoteException;

    /**
     * Gets the system time in UTC.
     */
    public iControl.CommonTimeStamp get_time() throws java.rmi.RemoteException;

    /**
     * Gets the local time zone information.
     */
    public iControl.CommonTimeZone get_time_zone() throws java.rmi.RemoteException;

    /**
     * Gets the number of seconds the device has been running.
     */
    public long get_uptime() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Attempts to release lock with specified name. These locks can
     * be used to synchronize
     *  work of multiple clients working with this device. This call returns
     * immediately.
     *  Nothing will happen if specified lock doesn't exist.
     */
    public void release_lock(java.lang.String lock_name) throws java.rmi.RemoteException;

    /**
     * Sets the unique identifier for the configsync or sync group
     * of which this device is a member.
     */
    public void set_group_id(java.lang.String group_id) throws java.rmi.RemoteException;
}
