/**
 * GlobalLBMonitorStrPropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBMonitorStrPropertyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBMonitorStrPropertyType(java.lang.String value) {
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
    public static final java.lang.String _STYPE_SNMP_PORT = "STYPE_SNMP_PORT";
    public static final java.lang.String _STYPE_AGGREGATE_DYNAMIC_RATIOS = "STYPE_AGGREGATE_DYNAMIC_RATIOS";
    public static final java.lang.String _STYPE_DB_COUNT = "STYPE_DB_COUNT";
    public static final java.lang.String _STYPE_NAS_IP = "STYPE_NAS_IP";
    public static final java.lang.String _STYPE_CLIENT_KEY = "STYPE_CLIENT_KEY";
    public static final java.lang.String _STYPE_MAX_LOAD_AVERAGE = "STYPE_MAX_LOAD_AVERAGE";
    public static final java.lang.String _STYPE_CONCURRENCY_LIMIT = "STYPE_CONCURRENCY_LIMIT";
    public static final java.lang.String _STYPE_FILTER_NEG = "STYPE_FILTER_NEG";
    public static final java.lang.String _STYPE_REQUEST = "STYPE_REQUEST";
    public static final java.lang.String _STYPE_HEADERS = "STYPE_HEADERS";
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
    public static final GlobalLBMonitorStrPropertyType STYPE_UNSET = new GlobalLBMonitorStrPropertyType(_STYPE_UNSET);
    public static final GlobalLBMonitorStrPropertyType STYPE_SEND = new GlobalLBMonitorStrPropertyType(_STYPE_SEND);
    public static final GlobalLBMonitorStrPropertyType STYPE_GET = new GlobalLBMonitorStrPropertyType(_STYPE_GET);
    public static final GlobalLBMonitorStrPropertyType STYPE_RECEIVE = new GlobalLBMonitorStrPropertyType(_STYPE_RECEIVE);
    public static final GlobalLBMonitorStrPropertyType STYPE_USERNAME = new GlobalLBMonitorStrPropertyType(_STYPE_USERNAME);
    public static final GlobalLBMonitorStrPropertyType STYPE_PASSWORD = new GlobalLBMonitorStrPropertyType(_STYPE_PASSWORD);
    public static final GlobalLBMonitorStrPropertyType STYPE_RUN = new GlobalLBMonitorStrPropertyType(_STYPE_RUN);
    public static final GlobalLBMonitorStrPropertyType STYPE_NEWSGROUP = new GlobalLBMonitorStrPropertyType(_STYPE_NEWSGROUP);
    public static final GlobalLBMonitorStrPropertyType STYPE_DATABASE = new GlobalLBMonitorStrPropertyType(_STYPE_DATABASE);
    public static final GlobalLBMonitorStrPropertyType STYPE_DOMAIN = new GlobalLBMonitorStrPropertyType(_STYPE_DOMAIN);
    public static final GlobalLBMonitorStrPropertyType STYPE_ARGUMENTS = new GlobalLBMonitorStrPropertyType(_STYPE_ARGUMENTS);
    public static final GlobalLBMonitorStrPropertyType STYPE_FOLDER = new GlobalLBMonitorStrPropertyType(_STYPE_FOLDER);
    public static final GlobalLBMonitorStrPropertyType STYPE_BASE = new GlobalLBMonitorStrPropertyType(_STYPE_BASE);
    public static final GlobalLBMonitorStrPropertyType STYPE_FILTER = new GlobalLBMonitorStrPropertyType(_STYPE_FILTER);
    public static final GlobalLBMonitorStrPropertyType STYPE_SECRET = new GlobalLBMonitorStrPropertyType(_STYPE_SECRET);
    public static final GlobalLBMonitorStrPropertyType STYPE_METHOD = new GlobalLBMonitorStrPropertyType(_STYPE_METHOD);
    public static final GlobalLBMonitorStrPropertyType STYPE_URL = new GlobalLBMonitorStrPropertyType(_STYPE_URL);
    public static final GlobalLBMonitorStrPropertyType STYPE_COMMAND = new GlobalLBMonitorStrPropertyType(_STYPE_COMMAND);
    public static final GlobalLBMonitorStrPropertyType STYPE_METRICS = new GlobalLBMonitorStrPropertyType(_STYPE_METRICS);
    public static final GlobalLBMonitorStrPropertyType STYPE_POST = new GlobalLBMonitorStrPropertyType(_STYPE_POST);
    public static final GlobalLBMonitorStrPropertyType STYPE_USERAGENT = new GlobalLBMonitorStrPropertyType(_STYPE_USERAGENT);
    public static final GlobalLBMonitorStrPropertyType STYPE_AGENT_TYPE = new GlobalLBMonitorStrPropertyType(_STYPE_AGENT_TYPE);
    public static final GlobalLBMonitorStrPropertyType STYPE_CPU_COEFFICIENT = new GlobalLBMonitorStrPropertyType(_STYPE_CPU_COEFFICIENT);
    public static final GlobalLBMonitorStrPropertyType STYPE_CPU_THRESHOLD = new GlobalLBMonitorStrPropertyType(_STYPE_CPU_THRESHOLD);
    public static final GlobalLBMonitorStrPropertyType STYPE_MEMORY_COEFFICIENT = new GlobalLBMonitorStrPropertyType(_STYPE_MEMORY_COEFFICIENT);
    public static final GlobalLBMonitorStrPropertyType STYPE_MEMORY_THRESHOLD = new GlobalLBMonitorStrPropertyType(_STYPE_MEMORY_THRESHOLD);
    public static final GlobalLBMonitorStrPropertyType STYPE_DISK_COEFFICIENT = new GlobalLBMonitorStrPropertyType(_STYPE_DISK_COEFFICIENT);
    public static final GlobalLBMonitorStrPropertyType STYPE_DISK_THRESHOLD = new GlobalLBMonitorStrPropertyType(_STYPE_DISK_THRESHOLD);
    public static final GlobalLBMonitorStrPropertyType STYPE_SNMP_VERSION = new GlobalLBMonitorStrPropertyType(_STYPE_SNMP_VERSION);
    public static final GlobalLBMonitorStrPropertyType STYPE_COMMUNITY = new GlobalLBMonitorStrPropertyType(_STYPE_COMMUNITY);
    public static final GlobalLBMonitorStrPropertyType STYPE_SEND_PACKETS = new GlobalLBMonitorStrPropertyType(_STYPE_SEND_PACKETS);
    public static final GlobalLBMonitorStrPropertyType STYPE_TIMEOUT_PACKETS = new GlobalLBMonitorStrPropertyType(_STYPE_TIMEOUT_PACKETS);
    public static final GlobalLBMonitorStrPropertyType STYPE_RECEIVE_DRAIN = new GlobalLBMonitorStrPropertyType(_STYPE_RECEIVE_DRAIN);
    public static final GlobalLBMonitorStrPropertyType STYPE_RECEIVE_ROW = new GlobalLBMonitorStrPropertyType(_STYPE_RECEIVE_ROW);
    public static final GlobalLBMonitorStrPropertyType STYPE_RECEIVE_COLUMN = new GlobalLBMonitorStrPropertyType(_STYPE_RECEIVE_COLUMN);
    public static final GlobalLBMonitorStrPropertyType STYPE_DEBUG = new GlobalLBMonitorStrPropertyType(_STYPE_DEBUG);
    public static final GlobalLBMonitorStrPropertyType STYPE_SECURITY = new GlobalLBMonitorStrPropertyType(_STYPE_SECURITY);
    public static final GlobalLBMonitorStrPropertyType STYPE_MODE = new GlobalLBMonitorStrPropertyType(_STYPE_MODE);
    public static final GlobalLBMonitorStrPropertyType STYPE_CIPHER_LIST = new GlobalLBMonitorStrPropertyType(_STYPE_CIPHER_LIST);
    public static final GlobalLBMonitorStrPropertyType STYPE_NAMESPACE = new GlobalLBMonitorStrPropertyType(_STYPE_NAMESPACE);
    public static final GlobalLBMonitorStrPropertyType STYPE_PARAMETER_NAME = new GlobalLBMonitorStrPropertyType(_STYPE_PARAMETER_NAME);
    public static final GlobalLBMonitorStrPropertyType STYPE_PARAMETER_VALUE = new GlobalLBMonitorStrPropertyType(_STYPE_PARAMETER_VALUE);
    public static final GlobalLBMonitorStrPropertyType STYPE_PARAMETER_TYPE = new GlobalLBMonitorStrPropertyType(_STYPE_PARAMETER_TYPE);
    public static final GlobalLBMonitorStrPropertyType STYPE_RETURN_TYPE = new GlobalLBMonitorStrPropertyType(_STYPE_RETURN_TYPE);
    public static final GlobalLBMonitorStrPropertyType STYPE_RETURN_VALUE = new GlobalLBMonitorStrPropertyType(_STYPE_RETURN_VALUE);
    public static final GlobalLBMonitorStrPropertyType STYPE_SOAP_FAULT = new GlobalLBMonitorStrPropertyType(_STYPE_SOAP_FAULT);
    public static final GlobalLBMonitorStrPropertyType STYPE_SSL_OPTIONS = new GlobalLBMonitorStrPropertyType(_STYPE_SSL_OPTIONS);
    public static final GlobalLBMonitorStrPropertyType STYPE_CLIENT_CERTIFICATE = new GlobalLBMonitorStrPropertyType(_STYPE_CLIENT_CERTIFICATE);
    public static final GlobalLBMonitorStrPropertyType STYPE_PROTOCOL = new GlobalLBMonitorStrPropertyType(_STYPE_PROTOCOL);
    public static final GlobalLBMonitorStrPropertyType STYPE_MANDATORY_ATTRS = new GlobalLBMonitorStrPropertyType(_STYPE_MANDATORY_ATTRS);
    public static final GlobalLBMonitorStrPropertyType STYPE_FILENAME = new GlobalLBMonitorStrPropertyType(_STYPE_FILENAME);
    public static final GlobalLBMonitorStrPropertyType STYPE_ACCOUNTING_NODE = new GlobalLBMonitorStrPropertyType(_STYPE_ACCOUNTING_NODE);
    public static final GlobalLBMonitorStrPropertyType STYPE_ACCOUNTING_PORT = new GlobalLBMonitorStrPropertyType(_STYPE_ACCOUNTING_PORT);
    public static final GlobalLBMonitorStrPropertyType STYPE_SERVER_ID = new GlobalLBMonitorStrPropertyType(_STYPE_SERVER_ID);
    public static final GlobalLBMonitorStrPropertyType STYPE_CALL_ID = new GlobalLBMonitorStrPropertyType(_STYPE_CALL_ID);
    public static final GlobalLBMonitorStrPropertyType STYPE_SESSION_ID = new GlobalLBMonitorStrPropertyType(_STYPE_SESSION_ID);
    public static final GlobalLBMonitorStrPropertyType STYPE_FRAMED_ADDRESS = new GlobalLBMonitorStrPropertyType(_STYPE_FRAMED_ADDRESS);
    public static final GlobalLBMonitorStrPropertyType STYPE_SNMP_PORT = new GlobalLBMonitorStrPropertyType(_STYPE_SNMP_PORT);
    public static final GlobalLBMonitorStrPropertyType STYPE_AGGREGATE_DYNAMIC_RATIOS = new GlobalLBMonitorStrPropertyType(_STYPE_AGGREGATE_DYNAMIC_RATIOS);
    public static final GlobalLBMonitorStrPropertyType STYPE_DB_COUNT = new GlobalLBMonitorStrPropertyType(_STYPE_DB_COUNT);
    public static final GlobalLBMonitorStrPropertyType STYPE_NAS_IP = new GlobalLBMonitorStrPropertyType(_STYPE_NAS_IP);
    public static final GlobalLBMonitorStrPropertyType STYPE_CLIENT_KEY = new GlobalLBMonitorStrPropertyType(_STYPE_CLIENT_KEY);
    public static final GlobalLBMonitorStrPropertyType STYPE_MAX_LOAD_AVERAGE = new GlobalLBMonitorStrPropertyType(_STYPE_MAX_LOAD_AVERAGE);
    public static final GlobalLBMonitorStrPropertyType STYPE_CONCURRENCY_LIMIT = new GlobalLBMonitorStrPropertyType(_STYPE_CONCURRENCY_LIMIT);
    public static final GlobalLBMonitorStrPropertyType STYPE_FILTER_NEG = new GlobalLBMonitorStrPropertyType(_STYPE_FILTER_NEG);
    public static final GlobalLBMonitorStrPropertyType STYPE_REQUEST = new GlobalLBMonitorStrPropertyType(_STYPE_REQUEST);
    public static final GlobalLBMonitorStrPropertyType STYPE_HEADERS = new GlobalLBMonitorStrPropertyType(_STYPE_HEADERS);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_ACCT_APPLICATION_ID = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_ACCT_APPLICATION_ID);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_AUTH_APPLICATION_ID = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_AUTH_APPLICATION_ID);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_ORIGIN_HOST = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_ORIGIN_HOST);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_ORIGIN_REALM = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_ORIGIN_REALM);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_HOST_IP_ADDRESS = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_HOST_IP_ADDRESS);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_VENDOR_ID = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_VENDOR_ID);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_PRODUCT_NAME = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_PRODUCT_NAME);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_VENDOR_SPECIFIC_VENDOR_ID = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_VENDOR_SPECIFIC_VENDOR_ID);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_VENDOR_SPECIFIC_ACCT_APPLICATION_ID = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_VENDOR_SPECIFIC_ACCT_APPLICATION_ID);
    public static final GlobalLBMonitorStrPropertyType STYPE_DIAMETER_VENDOR_SPECIFIC_AUTH_APPLICATION_ID = new GlobalLBMonitorStrPropertyType(_STYPE_DIAMETER_VENDOR_SPECIFIC_AUTH_APPLICATION_ID);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBMonitorStrPropertyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBMonitorStrPropertyType enumeration = (GlobalLBMonitorStrPropertyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBMonitorStrPropertyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBMonitorStrPropertyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Monitor.StrPropertyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
