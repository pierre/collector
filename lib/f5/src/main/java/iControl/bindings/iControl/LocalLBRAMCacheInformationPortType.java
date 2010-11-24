/**
 * LocalLBRAMCacheInformationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBRAMCacheInformationPortType extends java.rmi.Remote {

    /**
     * Resets/evicts all cache entries.
     */
    public void evict_all_ramcache_entries() throws java.rmi.RemoteException;

    /**
     * Note: This function has been deprecated. Please use evict_ramcache_entry_v2.
     * 
     *  Resets/evicts the cache entries associated with the specified keys.
     * Note: The "max_responses" field in each RAMCacheKey key is ignored
     * in this method.
     */
    public void evict_ramcache_entry(iControl.LocalLBRAMCacheInformationRAMCacheKey[] keys) throws java.rmi.RemoteException;

    /**
     * Resets/evicts the cache entries associated with the specified
     * keys.
     *  Note: The "max_responses" field in each RAMCacheKey key is ignored
     * in this method.
     */
    public void evict_ramcache_entry_v2(iControl.LocalLBRAMCacheInformationRAMCacheKey[] keys, boolean exact_match) throws java.rmi.RemoteException;

    /**
     * Gets the RAM cache entries associated with the specified keys.
     * The "profile_name" in the key
     *  is required, however, other fields in each key are optionally specified.
     * "max_response" is 
     *  recommended to be set to avoid possible large amount of entries.
     */
    public iControl.LocalLBRAMCacheInformationRAMCacheEntry[][] get_ramcache_entry(iControl.LocalLBRAMCacheInformationRAMCacheKey[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the RAM cache entries associated with the specified keys.
     * Each field in the
     *  key must be provided, and together the key is used to extract a specific
     * entry.
     *  However, since each entry with the same profile/hostname/URI can
     * still vary based
     *  on the User-Agent or Accept-Encoding headers, a separate entry will
     * be returned
     *  for each variation, with also the specific header string that causes
     * the variation.
     */
    public iControl.LocalLBRAMCacheInformationRAMCacheEntryExactMatch[][] get_ramcache_entry_exact_match(iControl.LocalLBRAMCacheInformationRAMCacheKey[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;
}
