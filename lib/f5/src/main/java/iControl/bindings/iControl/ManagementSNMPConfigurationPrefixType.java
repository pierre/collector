/**
 * ManagementSNMPConfigurationPrefixType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationPrefixType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementSNMPConfigurationPrefixType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PREFIX_EXACT = "PREFIX_EXACT";
    public static final java.lang.String _PREFIX_PREFIX = "PREFIX_PREFIX";
    public static final ManagementSNMPConfigurationPrefixType PREFIX_EXACT = new ManagementSNMPConfigurationPrefixType(_PREFIX_EXACT);
    public static final ManagementSNMPConfigurationPrefixType PREFIX_PREFIX = new ManagementSNMPConfigurationPrefixType(_PREFIX_PREFIX);
    public java.lang.String getValue() { return _value_;}
    public static ManagementSNMPConfigurationPrefixType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementSNMPConfigurationPrefixType enumeration = (ManagementSNMPConfigurationPrefixType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementSNMPConfigurationPrefixType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationPrefixType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PrefixType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
