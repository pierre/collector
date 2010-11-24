/**
 * NetworkingMediaStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingMediaStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingMediaStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MEDIA_STATUS_UP = "MEDIA_STATUS_UP";
    public static final java.lang.String _MEDIA_STATUS_DOWN = "MEDIA_STATUS_DOWN";
    public static final java.lang.String _MEDIA_STATUS_DISABLED = "MEDIA_STATUS_DISABLED";
    public static final java.lang.String _MEDIA_STATUS_UNINITIALIZED = "MEDIA_STATUS_UNINITIALIZED";
    public static final java.lang.String _MEDIA_STATUS_LOOPBACK = "MEDIA_STATUS_LOOPBACK";
    public static final java.lang.String _MEDIA_STATUS_UNPOPULATED = "MEDIA_STATUS_UNPOPULATED";
    public static final NetworkingMediaStatus MEDIA_STATUS_UP = new NetworkingMediaStatus(_MEDIA_STATUS_UP);
    public static final NetworkingMediaStatus MEDIA_STATUS_DOWN = new NetworkingMediaStatus(_MEDIA_STATUS_DOWN);
    public static final NetworkingMediaStatus MEDIA_STATUS_DISABLED = new NetworkingMediaStatus(_MEDIA_STATUS_DISABLED);
    public static final NetworkingMediaStatus MEDIA_STATUS_UNINITIALIZED = new NetworkingMediaStatus(_MEDIA_STATUS_UNINITIALIZED);
    public static final NetworkingMediaStatus MEDIA_STATUS_LOOPBACK = new NetworkingMediaStatus(_MEDIA_STATUS_LOOPBACK);
    public static final NetworkingMediaStatus MEDIA_STATUS_UNPOPULATED = new NetworkingMediaStatus(_MEDIA_STATUS_UNPOPULATED);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingMediaStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingMediaStatus enumeration = (NetworkingMediaStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingMediaStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingMediaStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.MediaStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
