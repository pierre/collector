/**
 * LocalLBProfileType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBProfileType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PROFILE_TYPE_TCP = "PROFILE_TYPE_TCP";
    public static final java.lang.String _PROFILE_TYPE_UDP = "PROFILE_TYPE_UDP";
    public static final java.lang.String _PROFILE_TYPE_FTP = "PROFILE_TYPE_FTP";
    public static final java.lang.String _PROFILE_TYPE_FAST_L4 = "PROFILE_TYPE_FAST_L4";
    public static final java.lang.String _PROFILE_TYPE_HTTP = "PROFILE_TYPE_HTTP";
    public static final java.lang.String _PROFILE_TYPE_SERVER_SSL = "PROFILE_TYPE_SERVER_SSL";
    public static final java.lang.String _PROFILE_TYPE_CLIENT_SSL = "PROFILE_TYPE_CLIENT_SSL";
    public static final java.lang.String _PROFILE_TYPE_AUTH = "PROFILE_TYPE_AUTH";
    public static final java.lang.String _PROFILE_TYPE_PERSISTENCE = "PROFILE_TYPE_PERSISTENCE";
    public static final java.lang.String _PROFILE_TYPE_CONNECTION_POOL = "PROFILE_TYPE_CONNECTION_POOL";
    public static final java.lang.String _PROFILE_TYPE_STREAM = "PROFILE_TYPE_STREAM";
    public static final java.lang.String _PROFILE_TYPE_XML = "PROFILE_TYPE_XML";
    public static final java.lang.String _PROFILE_TYPE_FAST_HTTP = "PROFILE_TYPE_FAST_HTTP";
    public static final java.lang.String _PROFILE_TYPE_IIOP = "PROFILE_TYPE_IIOP";
    public static final java.lang.String _PROFILE_TYPE_RTSP = "PROFILE_TYPE_RTSP";
    public static final java.lang.String _PROFILE_TYPE_STATISTICS = "PROFILE_TYPE_STATISTICS";
    public static final java.lang.String _PROFILE_TYPE_HTTPCLASS = "PROFILE_TYPE_HTTPCLASS";
    public static final java.lang.String _PROFILE_TYPE_DNS = "PROFILE_TYPE_DNS";
    public static final java.lang.String _PROFILE_TYPE_SCTP = "PROFILE_TYPE_SCTP";
    public static final java.lang.String _PROFILE_TYPE_INSTANCE = "PROFILE_TYPE_INSTANCE";
    public static final java.lang.String _PROFILE_TYPE_SIPP = "PROFILE_TYPE_SIPP";
    public static final LocalLBProfileType PROFILE_TYPE_TCP = new LocalLBProfileType(_PROFILE_TYPE_TCP);
    public static final LocalLBProfileType PROFILE_TYPE_UDP = new LocalLBProfileType(_PROFILE_TYPE_UDP);
    public static final LocalLBProfileType PROFILE_TYPE_FTP = new LocalLBProfileType(_PROFILE_TYPE_FTP);
    public static final LocalLBProfileType PROFILE_TYPE_FAST_L4 = new LocalLBProfileType(_PROFILE_TYPE_FAST_L4);
    public static final LocalLBProfileType PROFILE_TYPE_HTTP = new LocalLBProfileType(_PROFILE_TYPE_HTTP);
    public static final LocalLBProfileType PROFILE_TYPE_SERVER_SSL = new LocalLBProfileType(_PROFILE_TYPE_SERVER_SSL);
    public static final LocalLBProfileType PROFILE_TYPE_CLIENT_SSL = new LocalLBProfileType(_PROFILE_TYPE_CLIENT_SSL);
    public static final LocalLBProfileType PROFILE_TYPE_AUTH = new LocalLBProfileType(_PROFILE_TYPE_AUTH);
    public static final LocalLBProfileType PROFILE_TYPE_PERSISTENCE = new LocalLBProfileType(_PROFILE_TYPE_PERSISTENCE);
    public static final LocalLBProfileType PROFILE_TYPE_CONNECTION_POOL = new LocalLBProfileType(_PROFILE_TYPE_CONNECTION_POOL);
    public static final LocalLBProfileType PROFILE_TYPE_STREAM = new LocalLBProfileType(_PROFILE_TYPE_STREAM);
    public static final LocalLBProfileType PROFILE_TYPE_XML = new LocalLBProfileType(_PROFILE_TYPE_XML);
    public static final LocalLBProfileType PROFILE_TYPE_FAST_HTTP = new LocalLBProfileType(_PROFILE_TYPE_FAST_HTTP);
    public static final LocalLBProfileType PROFILE_TYPE_IIOP = new LocalLBProfileType(_PROFILE_TYPE_IIOP);
    public static final LocalLBProfileType PROFILE_TYPE_RTSP = new LocalLBProfileType(_PROFILE_TYPE_RTSP);
    public static final LocalLBProfileType PROFILE_TYPE_STATISTICS = new LocalLBProfileType(_PROFILE_TYPE_STATISTICS);
    public static final LocalLBProfileType PROFILE_TYPE_HTTPCLASS = new LocalLBProfileType(_PROFILE_TYPE_HTTPCLASS);
    public static final LocalLBProfileType PROFILE_TYPE_DNS = new LocalLBProfileType(_PROFILE_TYPE_DNS);
    public static final LocalLBProfileType PROFILE_TYPE_SCTP = new LocalLBProfileType(_PROFILE_TYPE_SCTP);
    public static final LocalLBProfileType PROFILE_TYPE_INSTANCE = new LocalLBProfileType(_PROFILE_TYPE_INSTANCE);
    public static final LocalLBProfileType PROFILE_TYPE_SIPP = new LocalLBProfileType(_PROFILE_TYPE_SIPP);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBProfileType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBProfileType enumeration = (LocalLBProfileType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBProfileType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBProfileType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
