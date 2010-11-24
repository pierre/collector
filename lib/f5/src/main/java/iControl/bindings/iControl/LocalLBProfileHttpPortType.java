/**
 * LocalLBProfileHttpPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileHttpPortType extends java.rmi.Remote {

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
    public void add_compression_content_type_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

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
    public void add_compression_content_type_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

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
    public void add_compression_uri_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

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
    public void add_compression_uri_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

    /**
     * Adds to the lists of cookies to be encrypted before sending
     * them to the clients.
     */
    public void add_cookie_encryption(java.lang.String[] profile_names, java.lang.String[][] cookies) throws java.rmi.RemoteException;

    /**
     * Adds to the lists of status codes that when matched, traffic
     * will be sent to the 
     *  "fallback_host". An exception will be thrown if fallback status codes
     * are set when 
     *  "fallback_host" has not been specified.
     */
    public void add_fallback_status_code(java.lang.String[] profile_names, java.lang.String[][] status_codes) throws java.rmi.RemoteException;

    /**
     * Adds to the lists of permitted headers in the responses for
     * the specified HTTP profiles.
     */
    public void add_permitted_response_header(java.lang.String[] profile_names, java.lang.String[][] headers) throws java.rmi.RemoteException;

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
    public void add_ramcache_uri_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

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
    public void add_ramcache_uri_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

    /**
     * Adds to the lists of cachable document URIs that will never
     * be evicted from the cache.
     */
    public void add_ramcache_uri_pinned(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

    /**
     * Creates the specified HTTP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all HTTP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified HTTP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the HTTP profiles.
     */
    public iControl.LocalLBProfileHttpProfileHttpStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the basic authentication realms for the specified HTTP
     * profiles.
     */
    public iControl.LocalLBProfileString[] get_basic_auth_realm(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that specify whether we will allow compression
     * on responses to HTTP 1.0 requests.
     *  Default will be "false", i.e. disallowing compression on HTTP 1.0
     * responses.
     */
    public iControl.LocalLBProfileEnabledState[] get_compression_allow_http_10_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that specify whether to workaround browser
     * bugs when doing compression.
     */
    public iControl.LocalLBProfileEnabledState[] get_compression_browser_workaround_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the values that specify the maximum number of uncompressed
     * bytes that the compression proxy 
     *  will buffer before it decides whether or not to compress the server's
     * response, in case the 
     *  server's response headers don't specify the content length of the
     * response.
     */
    public iControl.LocalLBProfileULong[] get_compression_buffer_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public iControl.LocalLBProfileStringArray[] get_compression_content_type_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public iControl.LocalLBProfileStringArray[] get_compression_content_type_include(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the CPU saver high threshold that basically switches to
     * NULL compression when
     *  CPU utilization exceeds this value.
     */
    public iControl.LocalLBProfileULong[] get_compression_cpu_saver_high_threshold(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the CPU saver low threshold that basically enables full
     * throttle on compression
     *  when CPU utilization drops below this value.
     */
    public iControl.LocalLBProfileULong[] get_compression_cpu_saver_low_threshold(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that specify whether to enable CPU saving mode
     * when doing compression.
     */
    public iControl.LocalLBProfileEnabledState[] get_compression_cpu_saver_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the compression level used by the specified HTTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_compression_level(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public iControl.LocalLBProfileULong[] get_compression_memory_level(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the values that specify the minimmum length of the server
     * responses (in bytes) to be considered
     *  acceptable for compression.
     */
    public iControl.LocalLBProfileULong[] get_compression_minimum_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the HTTP compression modes for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileHttpCompressionMode[] get_compression_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public iControl.LocalLBProfileStringArray[] get_compression_uri_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public iControl.LocalLBProfileStringArray[] get_compression_uri_include(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that specify whether we will insert the header
     * "Vary: Accept-Encoding" in the server response 
     *  for responses that have been compressed. If the "Vary:" header already
     * exists in the server response, then 
     *  the value "Accept-Encoding" will be appended to it.
     */
    public iControl.LocalLBProfileEnabledState[] get_compression_vary_header_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the amount of memory (in bytes) for the window size (the
     * compression history buffer) that will be used 
     *  when compressing the server response. Higher values produce better
     * compression ratios at the expense of more memory usage.
     *  The value must be one of 1K, 2K, 4K, 8K, 16K, 32K, 64K, 128K and
     * represent power-of-2 values (kilobytes). 
     *  The default value will be 16K.
     */
    public iControl.LocalLBProfileULong[] get_compression_window_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of cookies to be encrypted before sending them
     * to the clients.
     */
    public iControl.LocalLBProfileStringArray[] get_cookie_encryption(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the passphrases used to encrypt the cookies for the specified
     * profiles.
     */
    public iControl.LocalLBProfileString[] get_cookie_encryption_passphrase(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the fallback host names used in HTTP redirect for the
     * specified HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_fallback_host_name(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of status codes that when matched, traffic will
     * be sent to the "fallback_host".
     *  An exception will be thrown if fallback status codes are set when
     * "fallback_host" has not
     *  been specified.
     */
    public iControl.LocalLBProfileStringArray[] get_fallback_status_code(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the headers to be erased for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_header_erase(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the headers to be inserted for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_header_insert(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the mode to indicate whether to insert X-Forwarded-For
     * headers for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_insert_xforwarded_for_header_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public iControl.LocalLBProfileEnabledState[] get_keep_accept_encoding_header_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all HTTP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the linear white space maximum column sizes used to support
     * multi-line header insertion.
     */
    public iControl.LocalLBProfileULong[] get_lws_maximum_column(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the linear white space separator strings for the specified
     * HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_lws_separator(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum header sizes for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_maximum_header_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of HTTP requests allowed in the connection
     * before it is 
     *  closed automatically.
     */
    public iControl.LocalLBProfileULong[] get_maximum_requests(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that specify that OneConnect HTTP header transformation
     * feature is used or not.
     */
    public iControl.LocalLBProfileEnabledState[] get_oneconnect_header_transformation_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of permitted headers in the responses for the
     * specified HTTP profiles.
     */
    public iControl.LocalLBProfileStringArray[] get_permitted_response_header(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the pipelining mode for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_pipelining_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the preferred compression methods.
     */
    public iControl.LocalLBProfileCompressionMethod[] get_preferred_compression_method(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the aging rate for the RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_aging_rate(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the mode to indicate whether to ignore the client cache
     * control headers.
     */
    public iControl.LocalLBProfileRamCacheCacheControlMode[] get_ramcache_ignore_client_cache_control_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the mode that indicates whether to insert the Age headers
     * for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_ramcache_insert_age_header_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum age of a cached object in the RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_maximum_age(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of cache entries allowed in the RAM
     * cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_maximum_entry(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the RAM cache mode for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_ramcache_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum size requirement of a cached object in the
     * RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_object_maximum_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the minimum size requirement of a cached object in the
     * RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_object_minimum_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the size (MB) of the RAM cache.
     */
    public iControl.LocalLBProfileULong[] get_ramcache_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public iControl.LocalLBProfileStringArray[] get_ramcache_uri_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public iControl.LocalLBProfileStringArray[] get_ramcache_uri_include(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of cachable document URIs that will never be
     * evicted from the cache.
     */
    public iControl.LocalLBProfileStringArray[] get_ramcache_uri_pinned(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the HTTP redirect/rewrite mode for the responses.
     */
    public iControl.LocalLBProfileHttpRedirectRewriteMode[] get_redirect_rewrite_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the HTTP chunk mode for the responses.
     */
    public iControl.LocalLBProfileHttpChunkMode[] get_response_chunk_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, enable horizontal security for
     * the
     *  specified HTTP profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_security_enabled_request_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified HTTP profiles.
     */
    public iControl.LocalLBProfileHttpProfileHttpStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Determines whether the specified profiles are base/pre-configured
     * profiles, or user-defined profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
    public void remove_compression_content_type_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

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
    public void remove_compression_content_type_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

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
    public void remove_compression_uri_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

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
    public void remove_compression_uri_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

    /**
     * Removes from the lists of cookies to be encrypted before sending
     * them to the clients.
     */
    public void remove_cookie_encryption(java.lang.String[] profile_names, java.lang.String[][] cookies) throws java.rmi.RemoteException;

    /**
     * Removes from the lists of status codes that when matched, traffic
     * will be 
     *  sent to the "fallback_host". An exception will be thrown if fallback
     * status codes are 
     *  set when "fallback_host" has not been specified.
     */
    public void remove_fallback_status_code(java.lang.String[] profile_names, java.lang.String[][] status_codes) throws java.rmi.RemoteException;

    /**
     * Removes from the lists of permitted headers in the responses
     * for the specified HTTP profiles.
     */
    public void remove_permitted_response_header(java.lang.String[] profile_names, java.lang.String[][] headers) throws java.rmi.RemoteException;

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
    public void remove_ramcache_uri_exclude(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

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
    public void remove_ramcache_uri_include(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

    /**
     * Removes from the lists of cachable document URIs that will
     * never be evicted from the cache.
     */
    public void remove_ramcache_uri_pinned(java.lang.String[] profile_names, java.lang.String[][] reg_expressions) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified HTTP profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the basic authentication realms for the specified HTTP
     * profiles.
     */
    public void set_basic_auth_realm(java.lang.String[] profile_names, iControl.LocalLBProfileString[] realms) throws java.rmi.RemoteException;

    /**
     * Sets the states that specify whether we will allow compression
     * on responses to HTTP 1.0 requests.
     *  Default will be "false", i.e. disallowing compression on HTTP 1.0
     * responses.
     */
    public void set_compression_allow_http_10_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that specify whether to workaround browser
     * bugs when doing compression.
     */
    public void set_compression_browser_workaround_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the values that specify the maximum number of uncompressed
     * bytes that the compression proxy 
     *  will buffer before it decides whether or not to compress the server's
     * response, in case the 
     *  server's response headers don't specify the content length of the
     * response.
     */
    public void set_compression_buffer_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the CPU saver high threshold that basically switches to
     * NULL compression when
     *  CPU utilization exceeds this value.
     */
    public void set_compression_cpu_saver_high_threshold(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] thresholds) throws java.rmi.RemoteException;

    /**
     * Sets the CPU saver low threshold that basically enables full
     * throttle on compression
     *  when CPU utilization drops below this value.
     */
    public void set_compression_cpu_saver_low_threshold(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] thresholds) throws java.rmi.RemoteException;

    /**
     * Sets the states that specify whether to enable CPU saving mode
     * when doing compression.
     */
    public void set_compression_cpu_saver_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the compression level used by the specified HTTP profiles.
     */
    public void set_compression_level(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] levels) throws java.rmi.RemoteException;

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
    public void set_compression_memory_level(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] levels) throws java.rmi.RemoteException;

    /**
     * Sets the values that specify the minimmum length of the server
     * responses (in bytes) to be considered
     *  acceptable for compression.
     */
    public void set_compression_minimum_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the HTTP compression modes for the specified HTTP profiles.
     */
    public void set_compression_mode(java.lang.String[] profile_names, iControl.LocalLBProfileHttpCompressionMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the states that specify whether we will insert the header
     * "Vary: Accept-Encoding" in the server response 
     *  for responses that have been compressed. If the "Vary:" header already
     * exists in the server response, then 
     *  the value "Accept-Encoding" will be appended to it.
     */
    public void set_compression_vary_header_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the amount of memory (in bytes) for the window size (the
     * compression history buffer) that will be used 
     *  when compressing the server response. Higher values produce better
     * compression ratios at the expense of more memory usage.
     *  The value must be one of 1K, 2K, 4K, 8K, 16K, 32K, 64K, 128K and
     * represent power-of-2 values (kilobytes). 
     *  The default value will be 16K.
     */
    public void set_compression_window_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the passphrases used to encrypt the cookies for the specified
     * profiles.
     */
    public void set_cookie_encryption_passphrase(java.lang.String[] profile_names, iControl.LocalLBProfileString[] passphrases) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_compression_content_type_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_compression_content_type_include(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_compression_uri_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_compression_uri_include(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_cookie_encryption(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_fallback_status_code(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_permitted_response_header(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_ramcache_uri_exclude(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the list to the parent defaults.
     */
    public void set_default_ramcache_uri_include(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_ramcache_uri_pinned(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the fallback host names used in HTTP redirect for the
     * specified HTTP profiles.
     */
    public void set_fallback_host_name(java.lang.String[] profile_names, iControl.LocalLBProfileString[] fallbacks) throws java.rmi.RemoteException;

    /**
     * Sets the headers to be erased into the HTTP headers for the
     * specified HTTP profiles.
     */
    public void set_header_erase(java.lang.String[] profile_names, iControl.LocalLBProfileString[] headers) throws java.rmi.RemoteException;

    /**
     * Sets the headers to be inserted into the HTTP headers for the
     * specified HTTP profiles.
     */
    public void set_header_insert(java.lang.String[] profile_names, iControl.LocalLBProfileString[] headers) throws java.rmi.RemoteException;

    /**
     * Sets the mode to indicate whether to insert X-Forwarded-For
     * headers for the specified profiles.
     */
    public void set_insert_xforwarded_for_header_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException;

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
    public void set_keep_accept_encoding_header_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the linear white space maximum column sizes used to support
     * multi-line header insertion.
     */
    public void set_lws_maximum_column(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the linear white space separator strings for the specified
     * HTTP profiles.
     */
    public void set_lws_separator(java.lang.String[] profile_names, iControl.LocalLBProfileString[] separators) throws java.rmi.RemoteException;

    /**
     * Sets the maximum header sizes for the specified HTTP profiles.
     */
    public void set_maximum_header_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of HTTP requests allowed in the connection
     * before it is 
     *  closed automatically.
     */
    public void set_maximum_requests(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_requests) throws java.rmi.RemoteException;

    /**
     * Sets the states that specify whether OneConnect HTTP header
     * transformation is used for the specified HTTP profiles.
     */
    public void set_oneconnect_header_transformation_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the pipelining mode for the specified profiles.
     */
    public void set_pipelining_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the preferred compression methods.
     */
    public void set_preferred_compression_method(java.lang.String[] profile_names, iControl.LocalLBProfileCompressionMethod[] compression_methods) throws java.rmi.RemoteException;

    /**
     * Sets the aging rate for the RAM cache.
     */
    public void set_ramcache_aging_rate(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] aging_rates) throws java.rmi.RemoteException;

    /**
     * Sets the mode to indicate whether to ignore the client cache
     * control headers.
     */
    public void set_ramcache_ignore_client_cache_control_mode(java.lang.String[] profile_names, iControl.LocalLBProfileRamCacheCacheControlMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the mode that indicates whether to insert the Age headers
     * for the specified profiles.
     */
    public void set_ramcache_insert_age_header_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the maximum age of a cached object in the RAM cache.
     */
    public void set_ramcache_maximum_age(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_age) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of cache entries allowed in the RAM
     * cache.
     */
    public void set_ramcache_maximum_entry(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_entries) throws java.rmi.RemoteException;

    /**
     * Sets the RAM cache mode for the specified profiles.
     */
    public void set_ramcache_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the maximum size requirement of a cached object in the
     * RAM cache.
     */
    public void set_ramcache_object_maximum_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_size) throws java.rmi.RemoteException;

    /**
     * Sets the minimum size requirement of a cached object in the
     * RAM cache.
     */
    public void set_ramcache_object_minimum_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] minimum_size) throws java.rmi.RemoteException;

    /**
     * Sets the size (MB) of the RAM cache.
     */
    public void set_ramcache_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the HTTP redirect/rewrite mode for the responses.
     */
    public void set_redirect_rewrite_mode(java.lang.String[] profile_names, iControl.LocalLBProfileHttpRedirectRewriteMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the HTTP chunk mode for the responses.
     */
    public void set_response_chunk_mode(java.lang.String[] profile_names, iControl.LocalLBProfileHttpChunkMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, enable horizontal security for
     * the
     *  specified HTTP profiles.
     */
    public void set_security_enabled_request_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;
}
