/**
 * GlobalLBRegionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBRegionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBRegionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REGION_TYPE_CIDR = "REGION_TYPE_CIDR";
    public static final java.lang.String _REGION_TYPE_REGION = "REGION_TYPE_REGION";
    public static final java.lang.String _REGION_TYPE_CONTINENT = "REGION_TYPE_CONTINENT";
    public static final java.lang.String _REGION_TYPE_COUNTRY = "REGION_TYPE_COUNTRY";
    public static final java.lang.String _REGION_TYPE_STATE = "REGION_TYPE_STATE";
    public static final java.lang.String _REGION_TYPE_POOL = "REGION_TYPE_POOL";
    public static final java.lang.String _REGION_TYPE_DATA_CENTER = "REGION_TYPE_DATA_CENTER";
    public static final java.lang.String _REGION_TYPE_ISP_REGION = "REGION_TYPE_ISP_REGION";
    public static final GlobalLBRegionType REGION_TYPE_CIDR = new GlobalLBRegionType(_REGION_TYPE_CIDR);
    public static final GlobalLBRegionType REGION_TYPE_REGION = new GlobalLBRegionType(_REGION_TYPE_REGION);
    public static final GlobalLBRegionType REGION_TYPE_CONTINENT = new GlobalLBRegionType(_REGION_TYPE_CONTINENT);
    public static final GlobalLBRegionType REGION_TYPE_COUNTRY = new GlobalLBRegionType(_REGION_TYPE_COUNTRY);
    public static final GlobalLBRegionType REGION_TYPE_STATE = new GlobalLBRegionType(_REGION_TYPE_STATE);
    public static final GlobalLBRegionType REGION_TYPE_POOL = new GlobalLBRegionType(_REGION_TYPE_POOL);
    public static final GlobalLBRegionType REGION_TYPE_DATA_CENTER = new GlobalLBRegionType(_REGION_TYPE_DATA_CENTER);
    public static final GlobalLBRegionType REGION_TYPE_ISP_REGION = new GlobalLBRegionType(_REGION_TYPE_ISP_REGION);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBRegionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBRegionType enumeration = (GlobalLBRegionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBRegionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBRegionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.RegionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
