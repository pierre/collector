/**
 * LocalLBClassClassType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBClassClassType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBClassClassType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CLASS_TYPE_UNDEFINED = "CLASS_TYPE_UNDEFINED";
    public static final java.lang.String _CLASS_TYPE_ADDRESS = "CLASS_TYPE_ADDRESS";
    public static final java.lang.String _CLASS_TYPE_STRING = "CLASS_TYPE_STRING";
    public static final java.lang.String _CLASS_TYPE_VALUE = "CLASS_TYPE_VALUE";
    public static final LocalLBClassClassType CLASS_TYPE_UNDEFINED = new LocalLBClassClassType(_CLASS_TYPE_UNDEFINED);
    public static final LocalLBClassClassType CLASS_TYPE_ADDRESS = new LocalLBClassClassType(_CLASS_TYPE_ADDRESS);
    public static final LocalLBClassClassType CLASS_TYPE_STRING = new LocalLBClassClassType(_CLASS_TYPE_STRING);
    public static final LocalLBClassClassType CLASS_TYPE_VALUE = new LocalLBClassClassType(_CLASS_TYPE_VALUE);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBClassClassType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBClassClassType enumeration = (LocalLBClassClassType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBClassClassType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBClassClassType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ClassType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
