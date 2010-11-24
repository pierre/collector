/**
 * LocalLBVirtualAddressStatusDependency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBVirtualAddressStatusDependency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBVirtualAddressStatusDependency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VIRTUAL_ADDRESS_STATUS_DEPENDENCY_NONE = "VIRTUAL_ADDRESS_STATUS_DEPENDENCY_NONE";
    public static final java.lang.String _VIRTUAL_ADDRESS_STATUS_DEPENDENCY_ANY = "VIRTUAL_ADDRESS_STATUS_DEPENDENCY_ANY";
    public static final java.lang.String _VIRTUAL_ADDRESS_STATUS_DEPENDENCY_ALL = "VIRTUAL_ADDRESS_STATUS_DEPENDENCY_ALL";
    public static final LocalLBVirtualAddressStatusDependency VIRTUAL_ADDRESS_STATUS_DEPENDENCY_NONE = new LocalLBVirtualAddressStatusDependency(_VIRTUAL_ADDRESS_STATUS_DEPENDENCY_NONE);
    public static final LocalLBVirtualAddressStatusDependency VIRTUAL_ADDRESS_STATUS_DEPENDENCY_ANY = new LocalLBVirtualAddressStatusDependency(_VIRTUAL_ADDRESS_STATUS_DEPENDENCY_ANY);
    public static final LocalLBVirtualAddressStatusDependency VIRTUAL_ADDRESS_STATUS_DEPENDENCY_ALL = new LocalLBVirtualAddressStatusDependency(_VIRTUAL_ADDRESS_STATUS_DEPENDENCY_ALL);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBVirtualAddressStatusDependency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBVirtualAddressStatusDependency enumeration = (LocalLBVirtualAddressStatusDependency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBVirtualAddressStatusDependency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBVirtualAddressStatusDependency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualAddressStatusDependency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
