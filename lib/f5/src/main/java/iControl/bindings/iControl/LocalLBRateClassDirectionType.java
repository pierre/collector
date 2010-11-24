/**
 * LocalLBRateClassDirectionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBRateClassDirectionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBRateClassDirectionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DIRECTION_ANY = "DIRECTION_ANY";
    public static final java.lang.String _DIRECTION_CLIENT = "DIRECTION_CLIENT";
    public static final java.lang.String _DIRECTION_SERVER = "DIRECTION_SERVER";
    public static final java.lang.String _DIRECTION_VLAN = "DIRECTION_VLAN";
    public static final LocalLBRateClassDirectionType DIRECTION_ANY = new LocalLBRateClassDirectionType(_DIRECTION_ANY);
    public static final LocalLBRateClassDirectionType DIRECTION_CLIENT = new LocalLBRateClassDirectionType(_DIRECTION_CLIENT);
    public static final LocalLBRateClassDirectionType DIRECTION_SERVER = new LocalLBRateClassDirectionType(_DIRECTION_SERVER);
    public static final LocalLBRateClassDirectionType DIRECTION_VLAN = new LocalLBRateClassDirectionType(_DIRECTION_VLAN);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBRateClassDirectionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBRateClassDirectionType enumeration = (LocalLBRateClassDirectionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBRateClassDirectionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBRateClassDirectionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RateClass.DirectionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
