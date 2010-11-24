/**
 * GlobalLBAvailabilityDependency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBAvailabilityDependency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBAvailabilityDependency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AVAILABILITY_DEPENDENCY_NONE = "AVAILABILITY_DEPENDENCY_NONE";
    public static final java.lang.String _AVAILABILITY_DEPENDENCY_SERVER = "AVAILABILITY_DEPENDENCY_SERVER";
    public static final java.lang.String _AVAILABILITY_DEPENDENCY_LINK = "AVAILABILITY_DEPENDENCY_LINK";
    public static final java.lang.String _AVAILABILITY_DEPENDENCY_DATA_CENTER = "AVAILABILITY_DEPENDENCY_DATA_CENTER";
    public static final java.lang.String _AVAILABILITY_DEPENDENCY_WIDE_IP = "AVAILABILITY_DEPENDENCY_WIDE_IP";
    public static final GlobalLBAvailabilityDependency AVAILABILITY_DEPENDENCY_NONE = new GlobalLBAvailabilityDependency(_AVAILABILITY_DEPENDENCY_NONE);
    public static final GlobalLBAvailabilityDependency AVAILABILITY_DEPENDENCY_SERVER = new GlobalLBAvailabilityDependency(_AVAILABILITY_DEPENDENCY_SERVER);
    public static final GlobalLBAvailabilityDependency AVAILABILITY_DEPENDENCY_LINK = new GlobalLBAvailabilityDependency(_AVAILABILITY_DEPENDENCY_LINK);
    public static final GlobalLBAvailabilityDependency AVAILABILITY_DEPENDENCY_DATA_CENTER = new GlobalLBAvailabilityDependency(_AVAILABILITY_DEPENDENCY_DATA_CENTER);
    public static final GlobalLBAvailabilityDependency AVAILABILITY_DEPENDENCY_WIDE_IP = new GlobalLBAvailabilityDependency(_AVAILABILITY_DEPENDENCY_WIDE_IP);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBAvailabilityDependency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBAvailabilityDependency enumeration = (GlobalLBAvailabilityDependency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBAvailabilityDependency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBAvailabilityDependency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.AvailabilityDependency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
