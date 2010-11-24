/**
 * GlobalLBAutoConfigurationState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBAutoConfigurationState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBAutoConfigurationState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUTOCONFIG_DISABLED = "AUTOCONFIG_DISABLED";
    public static final java.lang.String _AUTOCONFIG_ENABLED = "AUTOCONFIG_ENABLED";
    public static final java.lang.String _AUTOCONFIG_ENABLED_AUTODELETE_DISABLED = "AUTOCONFIG_ENABLED_AUTODELETE_DISABLED";
    public static final GlobalLBAutoConfigurationState AUTOCONFIG_DISABLED = new GlobalLBAutoConfigurationState(_AUTOCONFIG_DISABLED);
    public static final GlobalLBAutoConfigurationState AUTOCONFIG_ENABLED = new GlobalLBAutoConfigurationState(_AUTOCONFIG_ENABLED);
    public static final GlobalLBAutoConfigurationState AUTOCONFIG_ENABLED_AUTODELETE_DISABLED = new GlobalLBAutoConfigurationState(_AUTOCONFIG_ENABLED_AUTODELETE_DISABLED);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBAutoConfigurationState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBAutoConfigurationState enumeration = (GlobalLBAutoConfigurationState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBAutoConfigurationState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBAutoConfigurationState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.AutoConfigurationState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
