/**
 * ManagementKeyCertificateManagementModeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKeyCertificateManagementModeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementKeyCertificateManagementModeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MANAGEMENT_MODE_DEFAULT = "MANAGEMENT_MODE_DEFAULT";
    public static final java.lang.String _MANAGEMENT_MODE_WEBSERVER = "MANAGEMENT_MODE_WEBSERVER";
    public static final java.lang.String _MANAGEMENT_MODE_EM = "MANAGEMENT_MODE_EM";
    public static final java.lang.String _MANAGEMENT_MODE_IQUERY = "MANAGEMENT_MODE_IQUERY";
    public static final java.lang.String _MANAGEMENT_MODE_IQUERY_BIG3D = "MANAGEMENT_MODE_IQUERY_BIG3D";
    public static final ManagementKeyCertificateManagementModeType MANAGEMENT_MODE_DEFAULT = new ManagementKeyCertificateManagementModeType(_MANAGEMENT_MODE_DEFAULT);
    public static final ManagementKeyCertificateManagementModeType MANAGEMENT_MODE_WEBSERVER = new ManagementKeyCertificateManagementModeType(_MANAGEMENT_MODE_WEBSERVER);
    public static final ManagementKeyCertificateManagementModeType MANAGEMENT_MODE_EM = new ManagementKeyCertificateManagementModeType(_MANAGEMENT_MODE_EM);
    public static final ManagementKeyCertificateManagementModeType MANAGEMENT_MODE_IQUERY = new ManagementKeyCertificateManagementModeType(_MANAGEMENT_MODE_IQUERY);
    public static final ManagementKeyCertificateManagementModeType MANAGEMENT_MODE_IQUERY_BIG3D = new ManagementKeyCertificateManagementModeType(_MANAGEMENT_MODE_IQUERY_BIG3D);
    public java.lang.String getValue() { return _value_;}
    public static ManagementKeyCertificateManagementModeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementKeyCertificateManagementModeType enumeration = (ManagementKeyCertificateManagementModeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementKeyCertificateManagementModeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementKeyCertificateManagementModeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.ManagementModeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
