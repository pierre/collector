/**
 * ManagementProvisionProvisionLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementProvisionProvisionLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementProvisionProvisionLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PROVISION_LEVEL_NONE = "PROVISION_LEVEL_NONE";
    public static final java.lang.String _PROVISION_LEVEL_MINIMUM = "PROVISION_LEVEL_MINIMUM";
    public static final java.lang.String _PROVISION_LEVEL_NOMINAL = "PROVISION_LEVEL_NOMINAL";
    public static final java.lang.String _PROVISION_LEVEL_DEDICATED = "PROVISION_LEVEL_DEDICATED";
    public static final java.lang.String _PROVISION_LEVEL_CUSTOM = "PROVISION_LEVEL_CUSTOM";
    public static final ManagementProvisionProvisionLevel PROVISION_LEVEL_NONE = new ManagementProvisionProvisionLevel(_PROVISION_LEVEL_NONE);
    public static final ManagementProvisionProvisionLevel PROVISION_LEVEL_MINIMUM = new ManagementProvisionProvisionLevel(_PROVISION_LEVEL_MINIMUM);
    public static final ManagementProvisionProvisionLevel PROVISION_LEVEL_NOMINAL = new ManagementProvisionProvisionLevel(_PROVISION_LEVEL_NOMINAL);
    public static final ManagementProvisionProvisionLevel PROVISION_LEVEL_DEDICATED = new ManagementProvisionProvisionLevel(_PROVISION_LEVEL_DEDICATED);
    public static final ManagementProvisionProvisionLevel PROVISION_LEVEL_CUSTOM = new ManagementProvisionProvisionLevel(_PROVISION_LEVEL_CUSTOM);
    public java.lang.String getValue() { return _value_;}
    public static ManagementProvisionProvisionLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementProvisionProvisionLevel enumeration = (ManagementProvisionProvisionLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementProvisionProvisionLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementProvisionProvisionLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.Provision.ProvisionLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
