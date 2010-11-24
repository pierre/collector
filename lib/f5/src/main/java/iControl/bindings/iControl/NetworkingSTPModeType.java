/**
 * NetworkingSTPModeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingSTPModeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingSTPModeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _STP_MODE_TYPE_DISABLED = "STP_MODE_TYPE_DISABLED";
    public static final java.lang.String _STP_MODE_TYPE_PASSTHROUGH = "STP_MODE_TYPE_PASSTHROUGH";
    public static final java.lang.String _STP_MODE_TYPE_STP = "STP_MODE_TYPE_STP";
    public static final java.lang.String _STP_MODE_TYPE_RSTP = "STP_MODE_TYPE_RSTP";
    public static final java.lang.String _STP_MODE_TYPE_MSTP = "STP_MODE_TYPE_MSTP";
    public static final NetworkingSTPModeType STP_MODE_TYPE_DISABLED = new NetworkingSTPModeType(_STP_MODE_TYPE_DISABLED);
    public static final NetworkingSTPModeType STP_MODE_TYPE_PASSTHROUGH = new NetworkingSTPModeType(_STP_MODE_TYPE_PASSTHROUGH);
    public static final NetworkingSTPModeType STP_MODE_TYPE_STP = new NetworkingSTPModeType(_STP_MODE_TYPE_STP);
    public static final NetworkingSTPModeType STP_MODE_TYPE_RSTP = new NetworkingSTPModeType(_STP_MODE_TYPE_RSTP);
    public static final NetworkingSTPModeType STP_MODE_TYPE_MSTP = new NetworkingSTPModeType(_STP_MODE_TYPE_MSTP);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingSTPModeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingSTPModeType enumeration = (NetworkingSTPModeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingSTPModeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingSTPModeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.STPModeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
