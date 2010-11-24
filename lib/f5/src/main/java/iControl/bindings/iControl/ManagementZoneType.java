/**
 * ManagementZoneType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementZoneType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementZoneType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNSET = "UNSET";
    public static final java.lang.String _MASTER = "MASTER";
    public static final java.lang.String _SLAVE = "SLAVE";
    public static final java.lang.String _STUB = "STUB";
    public static final java.lang.String _FORWARD = "FORWARD";
    public static final java.lang.String _HINT = "HINT";
    public static final ManagementZoneType UNSET = new ManagementZoneType(_UNSET);
    public static final ManagementZoneType MASTER = new ManagementZoneType(_MASTER);
    public static final ManagementZoneType SLAVE = new ManagementZoneType(_SLAVE);
    public static final ManagementZoneType STUB = new ManagementZoneType(_STUB);
    public static final ManagementZoneType FORWARD = new ManagementZoneType(_FORWARD);
    public static final ManagementZoneType HINT = new ManagementZoneType(_HINT);
    public java.lang.String getValue() { return _value_;}
    public static ManagementZoneType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementZoneType enumeration = (ManagementZoneType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementZoneType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementZoneType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.ZoneType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
