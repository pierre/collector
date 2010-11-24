/**
 * ManagementOCSPDigestMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementOCSPDigestMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementOCSPDigestMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OCSP_DIGEST_METHOD_SHA1 = "OCSP_DIGEST_METHOD_SHA1";
    public static final java.lang.String _OCSP_DIGEST_METHOD_MD5 = "OCSP_DIGEST_METHOD_MD5";
    public static final ManagementOCSPDigestMethod OCSP_DIGEST_METHOD_SHA1 = new ManagementOCSPDigestMethod(_OCSP_DIGEST_METHOD_SHA1);
    public static final ManagementOCSPDigestMethod OCSP_DIGEST_METHOD_MD5 = new ManagementOCSPDigestMethod(_OCSP_DIGEST_METHOD_MD5);
    public java.lang.String getValue() { return _value_;}
    public static ManagementOCSPDigestMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementOCSPDigestMethod enumeration = (ManagementOCSPDigestMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementOCSPDigestMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementOCSPDigestMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.OCSPDigestMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
