/**
 * LocalLBAvailabilityStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBAvailabilityStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBAvailabilityStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AVAILABILITY_STATUS_NONE = "AVAILABILITY_STATUS_NONE";
    public static final java.lang.String _AVAILABILITY_STATUS_GREEN = "AVAILABILITY_STATUS_GREEN";
    public static final java.lang.String _AVAILABILITY_STATUS_YELLOW = "AVAILABILITY_STATUS_YELLOW";
    public static final java.lang.String _AVAILABILITY_STATUS_RED = "AVAILABILITY_STATUS_RED";
    public static final java.lang.String _AVAILABILITY_STATUS_BLUE = "AVAILABILITY_STATUS_BLUE";
    public static final java.lang.String _AVAILABILITY_STATUS_GRAY = "AVAILABILITY_STATUS_GRAY";
    public static final LocalLBAvailabilityStatus AVAILABILITY_STATUS_NONE = new LocalLBAvailabilityStatus(_AVAILABILITY_STATUS_NONE);
    public static final LocalLBAvailabilityStatus AVAILABILITY_STATUS_GREEN = new LocalLBAvailabilityStatus(_AVAILABILITY_STATUS_GREEN);
    public static final LocalLBAvailabilityStatus AVAILABILITY_STATUS_YELLOW = new LocalLBAvailabilityStatus(_AVAILABILITY_STATUS_YELLOW);
    public static final LocalLBAvailabilityStatus AVAILABILITY_STATUS_RED = new LocalLBAvailabilityStatus(_AVAILABILITY_STATUS_RED);
    public static final LocalLBAvailabilityStatus AVAILABILITY_STATUS_BLUE = new LocalLBAvailabilityStatus(_AVAILABILITY_STATUS_BLUE);
    public static final LocalLBAvailabilityStatus AVAILABILITY_STATUS_GRAY = new LocalLBAvailabilityStatus(_AVAILABILITY_STATUS_GRAY);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBAvailabilityStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBAvailabilityStatus enumeration = (LocalLBAvailabilityStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBAvailabilityStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBAvailabilityStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.AvailabilityStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
