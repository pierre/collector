/**
 * LocalLBAddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBAddressType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBAddressType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ATYPE_UNSET = "ATYPE_UNSET";
    public static final java.lang.String _ATYPE_STAR_ADDRESS_STAR_PORT = "ATYPE_STAR_ADDRESS_STAR_PORT";
    public static final java.lang.String _ATYPE_STAR_ADDRESS_EXPLICIT_PORT = "ATYPE_STAR_ADDRESS_EXPLICIT_PORT";
    public static final java.lang.String _ATYPE_EXPLICIT_ADDRESS_EXPLICIT_PORT = "ATYPE_EXPLICIT_ADDRESS_EXPLICIT_PORT";
    public static final java.lang.String _ATYPE_STAR_ADDRESS = "ATYPE_STAR_ADDRESS";
    public static final java.lang.String _ATYPE_EXPLICIT_ADDRESS = "ATYPE_EXPLICIT_ADDRESS";
    public static final LocalLBAddressType ATYPE_UNSET = new LocalLBAddressType(_ATYPE_UNSET);
    public static final LocalLBAddressType ATYPE_STAR_ADDRESS_STAR_PORT = new LocalLBAddressType(_ATYPE_STAR_ADDRESS_STAR_PORT);
    public static final LocalLBAddressType ATYPE_STAR_ADDRESS_EXPLICIT_PORT = new LocalLBAddressType(_ATYPE_STAR_ADDRESS_EXPLICIT_PORT);
    public static final LocalLBAddressType ATYPE_EXPLICIT_ADDRESS_EXPLICIT_PORT = new LocalLBAddressType(_ATYPE_EXPLICIT_ADDRESS_EXPLICIT_PORT);
    public static final LocalLBAddressType ATYPE_STAR_ADDRESS = new LocalLBAddressType(_ATYPE_STAR_ADDRESS);
    public static final LocalLBAddressType ATYPE_EXPLICIT_ADDRESS = new LocalLBAddressType(_ATYPE_EXPLICIT_ADDRESS);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBAddressType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBAddressType enumeration = (LocalLBAddressType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBAddressType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBAddressType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.AddressType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
