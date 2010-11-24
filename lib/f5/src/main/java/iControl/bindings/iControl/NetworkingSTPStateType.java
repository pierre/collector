/**
 * NetworkingSTPStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingSTPStateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingSTPStateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _STP_STATE_TYPE_DETACH = "STP_STATE_TYPE_DETACH";
    public static final java.lang.String _STP_STATE_TYPE_BLOCK = "STP_STATE_TYPE_BLOCK";
    public static final java.lang.String _STP_STATE_TYPE_LISTEN = "STP_STATE_TYPE_LISTEN";
    public static final java.lang.String _STP_STATE_TYPE_LEARN = "STP_STATE_TYPE_LEARN";
    public static final java.lang.String _STP_STATE_TYPE_FORWARD = "STP_STATE_TYPE_FORWARD";
    public static final java.lang.String _STP_STATE_TYPE_DISABLE = "STP_STATE_TYPE_DISABLE";
    public static final NetworkingSTPStateType STP_STATE_TYPE_DETACH = new NetworkingSTPStateType(_STP_STATE_TYPE_DETACH);
    public static final NetworkingSTPStateType STP_STATE_TYPE_BLOCK = new NetworkingSTPStateType(_STP_STATE_TYPE_BLOCK);
    public static final NetworkingSTPStateType STP_STATE_TYPE_LISTEN = new NetworkingSTPStateType(_STP_STATE_TYPE_LISTEN);
    public static final NetworkingSTPStateType STP_STATE_TYPE_LEARN = new NetworkingSTPStateType(_STP_STATE_TYPE_LEARN);
    public static final NetworkingSTPStateType STP_STATE_TYPE_FORWARD = new NetworkingSTPStateType(_STP_STATE_TYPE_FORWARD);
    public static final NetworkingSTPStateType STP_STATE_TYPE_DISABLE = new NetworkingSTPStateType(_STP_STATE_TYPE_DISABLE);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingSTPStateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingSTPStateType enumeration = (NetworkingSTPStateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingSTPStateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingSTPStateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.STPStateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
