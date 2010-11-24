/**
 * LocalLBMonitorStrPropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBMonitorStrPropertyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBMonitorStrPropertyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _STYPE_UNSET = "STYPE_UNSET";
    public static final java.lang.String _STYPE_SEND = "STYPE_SEND";
    public static final java.lang.String _STYPE_GET = "STYPE_GET";
    public static final java.lang.String _STYPE_RECEIVE = "STYPE_RECEIVE";
    public static final java.lang.String _STYPE_USERNAME = "STYPE_USERNAME";
    public static final java.lang.String _STYPE_PASSWORD = "STYPE_PASSWORD";
    public static final java.lang.String _STYPE_RUN = "STYPE_RUN";
    public static final java.lang.String _STYPE_NEWSGROUP = "STYPE_NEWSGROUP";
    public static final java.lang.String _STYPE_DATABASE = "STYPE_DATABASE";
    public static final java.lang.String _STYPE_DOMAIN = "STYPE_DOMAIN";
    public static final java.lang.String _STYPE_ARGUMENTS = "STYPE_ARGUMENTS";
    public static final java.lang.String _STYPE_FOLDER = "STYPE_FOLDER";
    public static final java.lang.String _STYPE_BASE = "STYPE_BASE";
    public static final java.lang.String _STYPE_FILTER = "STYPE_FILTER";
    public static final java.lang.String _STYPE_SECRET = "STYPE_SECRET";
    public static final java.lang.String _STYPE_METHOD = "STYPE_METHOD";
    public static final java.lang.String _STYPE_URL = "STYPE_URL";
    public static final java.lang.String _STYPE_COMMAND = "STYPE_COMMAND";
    public static final java.lang.String _STYPE_METRICS = "STYPE_METRICS";
    public static final java.lang.String _STYPE_POST = "STYPE_POST";
    public static final java.lang.String _STYPE_USERAGENT = "STYPE_USERAGENT";
    public static final java.lang.String _STYPE_AGENT_TYPE = "STYPE_AGENT_TYPE";
    public static final java.lang.String _STYPE_CPU_COEFFICIENT = "STYPE_CPU_COEFFICIENT";
    public static final java.lang.String _STYPE_CPU_THRESHOLD = "STYPE_CPU_THRESHOLD";
    public static final java.lang.String _STYPE_MEMORY_COEFFICIENT = "STYPE_MEMORY_COEFFICIENT";
    public static final java.lang.String _STYPE_MEMORY_THRESHOLD = "STYPE_MEMORY_THRESHOLD";
    public static final java.lang.String _STYPE_DISK_COEFFICIENT = "STYPE_DISK_COEFFICIENT";
    public static final java.lang.String _STYPE_DISK_THRESHOLD = "STYPE_DISK_THRESHOLD";
    public static final java.lang.String _STYPE_SNMP_VERSION = "STYPE_SNMP_VERSION";
    public static final java.lang.String _STYPE_COMMUNITY = "STYPE_COMMUNITY";
    public static final java.lang.String _STYPE_SEND_PACKETS = "STYPE_SEND_PACKETS";
    public static final java.lang.String _STYPE_TIMEOUT_PACKETS = "STYPE_TIMEOUT_PACKETS";
    public static final java.lang.String _STYPE_RECEIVE_DRAIN = "STYPE_RECEIVE_DRAIN";
    public static final java.lang.String _STYPE_RECEIVE_ROW = "STYPE_RECEIVE_ROW";
    public static final java.lang.String _STYPE_RECEIVE_COLUMN = "STYPE_RECEIVE_COLUMN";
    public static final java.lang.String _STYPE_DEBUG = "STYPE_DEBUG";
    public static final java.lang.String _STYPE_SECURITY = "STYPE_SECURITY";
    public static final java.lang.String _STYPE_MODE = "STYPE_MODE";
    public static final java.lang.String _STYPE_CIPHER_LIST = "STYPE_CIPHER_LIST";
    public static final java.lang.String _STYPE_NAMESPACE = "STYPE_NAMESPACE";
    public static final java.lang.String _STYPE_PARAMETER_NAME = "STYPE_PARAMETER_NAME";
    public static final java.lang.String _STYPE_PARAMETER_VALUE = "STYPE_PARAMETER_VALUE";
    public static final java.lang.String _STYPE_PARAMETER_TYPE = "STYPE_PARAMETER_TYPE";
    public static final java.lang.String _STYPE_RETURN_TYPE = "STYPE_RETURN_TYPE";
    public static final java.lang.String _STYPE_RETURN_VALUE = "STYPE_RETURN_VALUE";
    public static final java.lang.String _STYPE_SOAP_FAULT = "STYPE_SOAP_FAULT";
    public static final java.lang.String _STYPE_SSL_OPTIONS = "STYPE_SSL_OPTIONS";
    public static final java.lang.String _STYPE_CLIENT_CERTIFICATE = "STYPE_CLIENT_CERTIFICATE";
    public static final java.lang.String _STYPE_PROTOCOL = "STYPE_PROTOCOL";
    public static final java.lang.String _STYPE_MANDATORY_ATTRS = "STYPE_MANDATORY_ATTRS";
    public static final java.lang.String _STYPE_FILENAME = "STYPE_FILENAME";
    public static final java.lang.String _STYPE_ACCOUNTING_NODE = "STYPE_ACCOUNTING_NODE";
    public static final java.lang.String _STYPE_ACCOUNTING_PORT = "STYPE_ACCOUNTING_PORT";
    public static final java.lang.String _STYPE_SERVER_ID = "STYPE_SERVER_ID";
    public static final java.lang.String _STYPE_CALL_ID = "STYPE_CALL_ID";
    public static final java.lang.String _STYPE_SESSION_ID = "STYPE_SESSION_ID";
    public static final java.lang.String _STYPE_FRAMED_ADDRESS = "STYPE_FRAMED_ADDRESS";
    public static final java.lang.String _STYPE_PROGRAM = "STYPE_PROGRAM";
    public static final java.lang.String _STYPE_VERSION = "STYPE_VERSION";
    public static final java.lang.String _STYPE_SERVER = "STYPE_SERVER";
    public static final java.lang.String _STYPE_SERVICE = "STYPE_SERVICE";
    public static final java.lang.String _STYPE_GW_MONITOR_ADDRESS = "STYPE_GW_MONITOR_ADDRESS";
    public static final java.lang.String _STYPE_GW_MONITOR_SERVICE = "STYPE_GW_MONITOR_SERVICE";
    public static final java.lang.String _STYPE_GW_MONITOR_INTERVAL = "STYPE_GW_MONITOR_INTERVAL";
    public static final java.lang.String _STYPE_GW_MONITOR_PROTOCOL = "STYPE_GW_MONITOR_PROTOCOL";
    public static final java.lang.String _STYPE_DB_COUNT = "STYPE_DB_COUNT";
    public static final java.lang.String _STYPE_REQUEST = "STYPE_REQUEST";
    public static final java.lang.String _STYPE_HEADERS = "STYPE_HEADERS";
    public static final java.lang.String _STYPE_FILTER_NEG = "STYPE_FILTER_NEG";
    public static final java.lang.String _STYPE_SERVER_IP = "STYPE_SERVER_IP";
    public static final java.lang.String _STYPE_SNMP_PORT = "STYPE_SNMP_PORT";
    public static final java.lang.String _STYPE_POOL_NAME = "STYPE_POOL_NAME";
    public static final java.lang.String _STYPE_NAS_IP = "STYPE_NAS_IP";
    public static final java.lang.String _STYPE_CLIENT_KEY = "STYPE_CLIENT_KEY";
    public static final java.lang.String _STYPE_MAX_LOAD_AVERAGE = "STYPE_MAX_LOAD_AVERAGE";
    public static final java.lang.String _STYPE_CONCURRENCY_LIMIT = "STYPE_CONCURRENCY_LIMIT";
    public static final java.lang.String _STYPE_FAILURES = "STYPE_FAILURES";
    public static final java.lang.String _STYPE_FAILURE_INTERVAL = "STYPE_FAILURE_INTERVAL";
    public static final java.lang.String _STYPE_RESPONSE_TIME = "STYPE_RESPONSE_TIME";
    public static final java.lang.String _STYPE_RETRY_TIME = "STYPE_RETRY_TIME";
    public static final java.lang.String _STYPE_DIAMETER_ACCT_APPLICATION_ID = "STYPE_DIAMETER_ACCT_APPLICATION_ID";
    public static final java.lang.String _STYPE_DIAMETER_AUTH_APPLICATION_ID = "STYPE_DIAMETER_AUTH_APPLICATION_ID";
    public static final java.lang.String _STYPE_DIAMETER_ORIGIN_HOST = "STYPE_DIAMETER_ORIGIN_HOST";
    public static final java.lang.String _STYPE_DIAMETER_ORIGIN_REALM = "STYPE_DIAMETER_ORIGIN_REALM";
    public static final java.lang.String _STYPE_DIAMETER_HOST_IP_ADDRESS = "STYPE_DIAMETER_HOST_IP_ADDRESS";
    public static final java.lang.String _STYPE_DIAMETER_VENDOR_ID = "STYPE_DIAMETER_VENDOR_ID";
    public static final java.lang.String _STYPE_DIAMETER_PRODUCT_NAME = "STYPE_DIAMETER_PRODUCT_NAME";
    public static final java.lang.String _STYPE_DIAMETER_VENDOR_SPECIFIC_VENDOR_ID = "STYPE_DIAMETER_VENDOR_SPECIFIC_VENDOR_ID";
    public static final java.lang.String _STYPE_DIAMETER_VENDOR_SPECIFIC_ACCT_APPLICATION_ID = "STYPE_DIAMETER_VENDOR_SPECIFIC_ACCT_APPLICATION_ID";
    public static final java.lang.String _STYPE_DIAMETER_VENDOR_SPECIFIC_AUTH_APPLICATION_ID = "STYPE_DIAMETER_VENDOR_SPECIFIC_AUTH_APPLICATION_ID";
    public static final LocalLBMonitorStrPropertyType STYPE_UNSET = new LocalLBMonitorStrPropertyType(_STYPE_UNSET);
    public static final LocalLBMonitorStrPropertyType STYPE_SEND = new LocalLBMonitorStrPropertyType(_STYPE_SEND);
    public static final LocalLBMonitorStrPropertyType STYPE_GET = new LocalLBMonitorStrPropertyType(_STYPE_GET);
    public static final LocalLBMonitorStrPropertyType STYPE_RECEIVE = new LocalLBMonitorStrPropertyType(_STYPE_RECEIVE);
    public static final LocalLBMonitorStrPropertyType STYPE_USERNAME = new LocalLBMonitorStrPropertyType(_STYPE_USERNAME);
    public static final LocalLBMonitorStrPropertyType STYPE_PASSWORD = new LocalLBMonitorStrPropertyType(_STYPE_PASSWORD);
    public static final LocalLBMonitorStrPropertyType STYPE_RUN = new LocalLBMonitorStrPropertyType(_STYPE_RUN);
    public static final LocalLBMonitorStrPropertyType STYPE_NEWSGROUP = new LocalLBMonitorStrPropertyType(_STYPE_NEWSGROUP);
    public static final LocalLBMonitorStrPropertyType STYPE_DATABASE = new LocalLBMonitorStrPropertyType(_STYPE_DATABASE);
    public static final LocalLBMonitorStrPropertyType STYPE_DOMAIN = new LocalLBMonitorStrPropertyType(_STYPE_DOMAIN);
    public static final LocalLBMonitorStrPropertyType STYPE_ARGUMENTS = new LocalLBMonitorStrPropertyType(_STYPE_ARGUMENTS);
    public static final LocalLBMonitorStrPropertyType STYPE_FOLDER = new LocalLBMonitorStrPropertyType(_STYPE_FOLDER);
    public static final LocalLBMonitorStrPropertyType STYPE_BASE = new LocalLBMonitorStrPropertyType(_STYPE_BASE);
    public static final LocalLBMonitorStrPropertyType STYPE_FILTER = new LocalLBMonitorStrPropertyType(_STYPE_FILTER);
    public static final LocalLBMonitorStrPropertyType STYPE_SECRET = new LocalLBMonitorStrPropertyType(_STYPE_SECRET);
    public static final LocalLBMonitorStrPropertyType STYPE_METHOD = new LocalLBMonitorStrPropertyType(_STYPE_METHOD);
    public static final LocalLBMonitorStrPropertyType STYPE_URL = new LocalLBMonitorStrPropertyType(_STYPE_URL);
    public static final LocalLBMonitorStrPropertyType STYPE_COMMAND = new LocalLBMonitorStrPropertyType(_STYPE_COMMAND);
    public static final LocalLBMonitorStrPropertyType STYPE_METRICS = new LocalLBMonitorStrPropertyType(_STYPE_METRICS);
    public static final LocalLBMonitorStrPropertyType STYPE_POST = new LocalLBMonitorStrPropertyType(_STYPE_POST);
    public static final LocalLBMonitorStrPropertyType STYPE_USERAGENT = new LocalLBMonitorStrPropertyType(_STYPE_USERAGENT);
    public static final LocalLBMonitorStrPropertyType STYPE_AGENT_TYPE = new LocalLBMonitorStrPropertyType(_STYPE_AGENT_TYPE);
    public static final LocalLBMonitorStrPropertyType STYPE_CPU_COEFFICIENT = new LocalLBMonitorStrPropertyType(_STYPE_CPU_COEFFICIENT);
    public static final LocalLBMonitorStrPropertyType STYPE_CPU_THRESHOLD = new LocalLBMonitorStrPropertyType(_STYPE_CPU_THRESHOLD);
    public static final LocalLBMonitorStrPropertyType STYPE_MEMORY_COEFFICIENT = new LocalLBMonitorStrPropertyType(_STYPE_MEMORY_COEFFICIENT);
    public static final LocalLBMonitorStrPropertyType STYPE_MEMORY_THRESHOLD = new LocalLBMonitorStrPropertyType(_STYPE_MEMORY_THRESHOLD);
    public static final LocalLBMonitorStrPropertyType STYPE_DISK_COEFFICIENT = new LocalLBMonitorStrPropertyType(_STYPE_DISK_COEFFICIENT);
    public static final LocalLBMonitorStrPropertyType STYPE_DISK_THRESHOLD = new LocalLBMonitorStrPropertyType(_STYPE_DISK_THRESHOLD);
    public static final LocalLBMonitorStrPropertyType STYPE_SNMP_VERSION = new LocalLBMonitorStrPropertyType(_STYPE_SNMP_VERSION);
    public static final LocalLBMonitorStrPropertyType STYPE_COMMUNITY = new LocalLBMonitorStrPropertyType(_STYPE_COMMUNITY);
    public static final LocalLBMonitorStrPropertyType STYPE_SEND_PACKETS = new LocalLBMonitorStrPropertyType(_STYPE_SEND_PACKETS);
    public static final LocalLBMonitorStrPropertyType STYPE_TIMEOUT_PACKETS = new LocalLBMonitorStrPropertyType(_STYPE_TIMEOUT_PACKETS);
    public static final LocalLBMonitorStrPropertyType STYPE_RECEIVE_DRAIN = new LocalLBMonitorStrPropertyType(_STYPE_RECEIVE_DRAIN);
    public static final LocalLBMonitorStrPropertyType STYPE_RECEIVE_ROW = new LocalLBMonitorStrPropertyType(_STYPE_RECEIVE_ROW);
    public static final LocalLBMonitorStrPropertyType STYPE_RECEIVE_COLUMN = new LocalLBMonitorStrPropertyType(_STYPE_RECEIVE_COLUMN);
    public static final LocalLBMonitorStrPropertyType STYPE_DEBUG = new LocalLBMonitorStrPropertyType(_STYPE_DEBUG);
    public static final LocalLBMonitorStrPropertyType STYPE_SECURITY = new LocalLBMonitorStrPropertyType(_STYPE_SECURITY);
    public static final LocalLBMonitorStrPropertyType STYPE_MODE = new LocalLBMonitorStrPropertyType(_STYPE_MODE);
    public static final LocalLBMonitorStrPropertyType STYPE_CIPHER_LIST = new LocalLBMonitorStrPropertyType(_STYPE_CIPHER_LIST);
    public static final LocalLBMonitorStrPropertyType STYPE_NAMESPACE = new LocalLBMonitorStrPropertyType(_STYPE_NAMESPACE);
    public static final LocalLBMonitorStrPropertyType STYPE_PARAMETER_NAME = new LocalLBMonitorStrPropertyType(_STYPE_PARAMETER_NAME);
    public static final LocalLBMonitorStrPropertyType STYPE_PARAMETER_VALUE = new LocalLBMonitorStrPropertyType(_STYPE_PARAMETER_VALUE);
    public static final LocalLBMonitorStrPropertyType STYPE_PARAMETER_TYPE = new LocalLBMonitorStrPropertyType(_STYPE_PARAMETER_TYPE);
    public static final LocalLBMonitorStrPropertyType STYPE_RETURN_TYPE = new LocalLBMonitorStrPropertyType(_STYPE_RETURN_TYPE);
    public static final LocalLBMonitorStrPropertyType STYPE_RETURN_VALUE = new LocalLBMonitorStrPropertyType(_STYPE_RETURN_VALUE);
    public static final LocalLBMonitorStrPropertyType STYPE_SOAP_FAULT = new LocalLBMonitorStrPropertyType(_STYPE_SOAP_FAULT);
    public static final LocalLBMonitorStrPropertyType STYPE_SSL_OPTIONS = new LocalLBMonitorStrPropertyType(_STYPE_SSL_OPTIONS);
    public static final LocalLBMonitorStrPropertyType STYPE_CLIENT_CERTIFICATE = new LocalLBMonitorStrPropertyType(_STYPE_CLIENT_CERTIFICATE);
    public static final LocalLBMonitorStrPropertyType STYPE_PROTOCOL = new LocalLBMonitorStrPropertyType(_STYPE_PROTOCOL);
    public static final LocalLBMonitorStrPropertyType STYPE_MANDATORY_ATTRS = new LocalLBMonitorStrPropertyType(_STYPE_MANDATORY_ATTRS);
    public static final LocalLBMonitorStrPropertyType STYPE_FILENAME = new LocalLBMonitorStrPropertyType(_STYPE_FILENAME);
    public static final LocalLBMonitorStrPropertyType STYPE_ACCOUNTING_NODE = new LocalLBMonitorStrPropertyType(_STYPE_ACCOUNTING_NODE);
    public static final LocalLBMonitorStrPropertyType STYPE_ACCOUNTING_PORT = new LocalLBMonitorStrPropertyType(_STYPE_ACCOUNTING_PORT);
    public static final LocalLBMonitorStrPropertyType STYPE_SERVER_ID = new LocalLBMonitorStrPropertyType(_STYPE_SERVER_ID);
    public static final LocalLBMonitorStrPropertyType STYPE_CALL_ID = new LocalLBMonitorStrPropertyType(_STYPE_CALL_ID);
    public static final LocalLBMonitorStrPropertyType STYPE_SESSION_ID = new LocalLBMonitorStrPropertyType(_STYPE_SESSION_ID);
    public static final LocalLBMonitorStrPropertyType STYPE_FRAMED_ADDRESS = new LocalLBMonitorStrPropertyType(_STYPE_FRAMED_ADDRESS);
    public static final LocalLBMonitorStrPropertyType STYPE_PROGRAM = new LocalLBMonitorStrPropertyType(_STYPE_PROGRAM);
    public static final LocalLBMonitorStrPropertyType STYPE_VERSION = new LocalLBMonitorStrPropertyType(_STYPE_VERSION);
    public static final LocalLBMonitorStrPropertyType STYPE_SERVER = new LocalLBMonitorStrPropertyType(_STYPE_SERVER);
    public static final LocalLBMonitorStrPropertyType STYPE_SERVICE = new LocalLBMonitorStrPropertyType(_STYPE_SERVICE);
    public static final LocalLBMonitorStrPropertyType STYPE_GW_MONITOR_ADDRESS = new LocalLBMonitorStrPropertyType(_STYPE_GW_MONITOR_ADDRESS);
    public static final LocalLBMonitorStrPropertyType STYPE_GW_MONITOR_SERVICE = new LocalLBMonitorStrPropertyType(_STYPE_GW_MONITOR_SERVICE);
    public static final LocalLBMonitorStrPropertyType STYPE_GW_MONITOR_INTERVAL = new LocalLBMonitorStrPropertyType(_STYPE_GW_MONITOR_INTERVAL);
    public static final LocalLBMonitorStrPropertyType STYPE_GW_MONITOR_PROTOCOL = new LocalLBMonitorStrPropertyType(_STYPE_GW_MONITOR_PROTOCOL);
    public static final LocalLBMonitorStrPropertyType STYPE_DB_COUNT = new LocalLBMonitorStrPropertyType(_STYPE_DB_COUNT);
    public static final LocalLBMonitorStrPropertyType STYPE_REQUEST = new LocalLBMonitorStrPropertyType(_STYPE_REQUEST);
    public static final LocalLBMonitorStrPropertyType STYPE_HEADERS = new LocalLBMonitorStrPropertyType(_STYPE_HEADERS);
    public static final LocalLBMonitorStrPropertyType STYPE_FILTER_NEG = new LocalLBMonitorStrPropertyType(_STYPE_FILTER_NEG);
    public static final LocalLBMonitorStrPropertyType STYPE_SERVER_IP = new LocalLBMonitorStrPropertyType(_STYPE_SERVER_IP);
    public static final LocalLBMonitorStrPropertyType STYPE_SNMP_PORT = new LocalLBMonitorStrPropertyType(_STYPE_SNMP_PORT);
    public static final LocalLBMonitorStrPropertyType STYPE_POOL_NAME = new LocalLBMonitorStrPropertyType(_STYPE_POOL_NAME);
    public static final LocalLBMonitorStrPropertyType STYPE_NAS_IP = new LocalLBMonitorStrPropertyType(_STYPE_NAS_IP);
    public static final LocalLBMonitorStrPropertyType STYPE_CLIENT_KEY = new LocalLBMonitorStrPropertyType(_STYPE_CLIENT_KEY);
    public static final LocalLBMonitorStrPropertyType STYPE_MAX_LOAD_AVERAGE = new LocalLBMonitorStrPropertyType(_STYPE_MAX_LOAD_AVERAGE);
    public static final LocalLBMonitorStrPropertyType STYPE_CONCURRENCY_LIMIT = new LocalLBMonitorStrPropertyType(_STYPE_CONCURRENCY_LIMIT);
    public static final LocalLBMonitorStrPropertyType STYPE_FAILURES = new LocalLBMonitorStrPropertyType(_STYPE_FAILURES);
    public static final LocalLBMonitorStrPropertyType STYPE_FAILURE_INTERVAL = new LocalLBMonitorStrPropertyType(_STYPE_FAILURE_INTERVAL);
    public static final LocalLBMonitorStrPropertyType STYPE_RESPONSE_TIME = new LocalLBMonitorStrPropertyType(_STYPE_RESPONSE_TIME);
    public static final LocalLBMonitorStrPropertyType STYPE_RETRY_TIME = new LocalLBMonitorStrPropertyType(_STYPE_RETRY_TIME);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_ACCT_APPLICATION_ID = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_ACCT_APPLICATION_ID);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_AUTH_APPLICATION_ID = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_AUTH_APPLICATION_ID);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_ORIGIN_HOST = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_ORIGIN_HOST);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_ORIGIN_REALM = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_ORIGIN_REALM);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_HOST_IP_ADDRESS = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_HOST_IP_ADDRESS);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_VENDOR_ID = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_VENDOR_ID);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_PRODUCT_NAME = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_PRODUCT_NAME);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_VENDOR_SPECIFIC_VENDOR_ID = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_VENDOR_SPECIFIC_VENDOR_ID);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_VENDOR_SPECIFIC_ACCT_APPLICATION_ID = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_VENDOR_SPECIFIC_ACCT_APPLICATION_ID);
    public static final LocalLBMonitorStrPropertyType STYPE_DIAMETER_VENDOR_SPECIFIC_AUTH_APPLICATION_ID = new LocalLBMonitorStrPropertyType(_STYPE_DIAMETER_VENDOR_SPECIFIC_AUTH_APPLICATION_ID);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBMonitorStrPropertyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBMonitorStrPropertyType enumeration = (LocalLBMonitorStrPropertyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBMonitorStrPropertyType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBMonitorStrPropertyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Monitor.StrPropertyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
