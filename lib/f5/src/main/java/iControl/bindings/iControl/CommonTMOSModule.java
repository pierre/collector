/**
 * CommonTMOSModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class CommonTMOSModule implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CommonTMOSModule(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TMOS_MODULE_ASM = "TMOS_MODULE_ASM";
    public static final java.lang.String _TMOS_MODULE_SAM = "TMOS_MODULE_SAM";
    public static final java.lang.String _TMOS_MODULE_WAM = "TMOS_MODULE_WAM";
    public static final java.lang.String _TMOS_MODULE_PSM = "TMOS_MODULE_PSM";
    public static final java.lang.String _TMOS_MODULE_WOM = "TMOS_MODULE_WOM";
    public static final java.lang.String _TMOS_MODULE_LC = "TMOS_MODULE_LC";
    public static final java.lang.String _TMOS_MODULE_LTM = "TMOS_MODULE_LTM";
    public static final java.lang.String _TMOS_MODULE_GTM = "TMOS_MODULE_GTM";
    public static final java.lang.String _TMOS_MODULE_UNKNOWN = "TMOS_MODULE_UNKNOWN";
    public static final java.lang.String _TMOS_MODULE_WOML = "TMOS_MODULE_WOML";
    public static final java.lang.String _TMOS_MODULE_APML = "TMOS_MODULE_APML";
    public static final CommonTMOSModule TMOS_MODULE_ASM = new CommonTMOSModule(_TMOS_MODULE_ASM);
    public static final CommonTMOSModule TMOS_MODULE_SAM = new CommonTMOSModule(_TMOS_MODULE_SAM);
    public static final CommonTMOSModule TMOS_MODULE_WAM = new CommonTMOSModule(_TMOS_MODULE_WAM);
    public static final CommonTMOSModule TMOS_MODULE_PSM = new CommonTMOSModule(_TMOS_MODULE_PSM);
    public static final CommonTMOSModule TMOS_MODULE_WOM = new CommonTMOSModule(_TMOS_MODULE_WOM);
    public static final CommonTMOSModule TMOS_MODULE_LC = new CommonTMOSModule(_TMOS_MODULE_LC);
    public static final CommonTMOSModule TMOS_MODULE_LTM = new CommonTMOSModule(_TMOS_MODULE_LTM);
    public static final CommonTMOSModule TMOS_MODULE_GTM = new CommonTMOSModule(_TMOS_MODULE_GTM);
    public static final CommonTMOSModule TMOS_MODULE_UNKNOWN = new CommonTMOSModule(_TMOS_MODULE_UNKNOWN);
    public static final CommonTMOSModule TMOS_MODULE_WOML = new CommonTMOSModule(_TMOS_MODULE_WOML);
    public static final CommonTMOSModule TMOS_MODULE_APML = new CommonTMOSModule(_TMOS_MODULE_APML);
    public java.lang.String getValue() { return _value_;}
    public static CommonTMOSModule fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CommonTMOSModule enumeration = (CommonTMOSModule)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CommonTMOSModule fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CommonTMOSModule.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TMOSModule"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
