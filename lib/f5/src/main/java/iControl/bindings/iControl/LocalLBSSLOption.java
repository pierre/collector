/**
 * LocalLBSSLOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBSSLOption implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBSSLOption(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SSL_OPTION_MICROSOFT_SESSION_ID_BUG = "SSL_OPTION_MICROSOFT_SESSION_ID_BUG";
    public static final java.lang.String _SSL_OPTION_NETSCAPE_CHALLENGE_BUG = "SSL_OPTION_NETSCAPE_CHALLENGE_BUG";
    public static final java.lang.String _SSL_OPTION_NETSCAPE_REUSE_CIPHER_CHANGE_BUG = "SSL_OPTION_NETSCAPE_REUSE_CIPHER_CHANGE_BUG";
    public static final java.lang.String _SSL_OPTION_SSLREF2_REUSE_CERT_TYPE_BUG = "SSL_OPTION_SSLREF2_REUSE_CERT_TYPE_BUG";
    public static final java.lang.String _SSL_OPTION_MICROSOFT_BIG_SSLV3_BUFFER = "SSL_OPTION_MICROSOFT_BIG_SSLV3_BUFFER";
    public static final java.lang.String _SSL_OPTION_MSIE_SSL_V2_RSA_PADDING = "SSL_OPTION_MSIE_SSL_V2_RSA_PADDING";
    public static final java.lang.String _SSL_OPTION_SSLEAY_080_CLIENT_DH_BUG = "SSL_OPTION_SSLEAY_080_CLIENT_DH_BUG";
    public static final java.lang.String _SSL_OPTION_TLS_D5_BUG = "SSL_OPTION_TLS_D5_BUG";
    public static final java.lang.String _SSL_OPTION_TLS_BLOCK_PADDING_BUG = "SSL_OPTION_TLS_BLOCK_PADDING_BUG";
    public static final java.lang.String _SSL_OPTION_DONT_INSERT_EMPTY_FRAGMENTS = "SSL_OPTION_DONT_INSERT_EMPTY_FRAGMENTS";
    public static final java.lang.String _SSL_OPTION_ALL_BUGFIXES = "SSL_OPTION_ALL_BUGFIXES";
    public static final java.lang.String _SSL_OPTION_PASSIVE_CLOSE = "SSL_OPTION_PASSIVE_CLOSE";
    public static final java.lang.String _SSL_OPTION_NO_SESSION_RESUMPTION_ON_RENEGOTIATION = "SSL_OPTION_NO_SESSION_RESUMPTION_ON_RENEGOTIATION";
    public static final java.lang.String _SSL_OPTION_SINGLE_DH_USE = "SSL_OPTION_SINGLE_DH_USE";
    public static final java.lang.String _SSL_OPTION_EPHEMERAL_RSA = "SSL_OPTION_EPHEMERAL_RSA";
    public static final java.lang.String _SSL_OPTION_CIPHER_SERVER_PREFERENCE = "SSL_OPTION_CIPHER_SERVER_PREFERENCE";
    public static final java.lang.String _SSL_OPTION_TLS_ROLLBACK_BUG = "SSL_OPTION_TLS_ROLLBACK_BUG";
    public static final java.lang.String _SSL_OPTION_NO_SSL_V2 = "SSL_OPTION_NO_SSL_V2";
    public static final java.lang.String _SSL_OPTION_NO_SSL_V3 = "SSL_OPTION_NO_SSL_V3";
    public static final java.lang.String _SSL_OPTION_NO_TLS_V1 = "SSL_OPTION_NO_TLS_V1";
    public static final java.lang.String _SSL_OPTION_PKCS1_CHECK_1 = "SSL_OPTION_PKCS1_CHECK_1";
    public static final java.lang.String _SSL_OPTION_PKCS1_CHECK_2 = "SSL_OPTION_PKCS1_CHECK_2";
    public static final java.lang.String _SSL_OPTION_NETSCAPE_CA_DN_BUG = "SSL_OPTION_NETSCAPE_CA_DN_BUG";
    public static final java.lang.String _SSL_OPTION_NETSCAPE_DEMO_CIPHER_CHANGE_BUG = "SSL_OPTION_NETSCAPE_DEMO_CIPHER_CHANGE_BUG";
    public static final LocalLBSSLOption SSL_OPTION_MICROSOFT_SESSION_ID_BUG = new LocalLBSSLOption(_SSL_OPTION_MICROSOFT_SESSION_ID_BUG);
    public static final LocalLBSSLOption SSL_OPTION_NETSCAPE_CHALLENGE_BUG = new LocalLBSSLOption(_SSL_OPTION_NETSCAPE_CHALLENGE_BUG);
    public static final LocalLBSSLOption SSL_OPTION_NETSCAPE_REUSE_CIPHER_CHANGE_BUG = new LocalLBSSLOption(_SSL_OPTION_NETSCAPE_REUSE_CIPHER_CHANGE_BUG);
    public static final LocalLBSSLOption SSL_OPTION_SSLREF2_REUSE_CERT_TYPE_BUG = new LocalLBSSLOption(_SSL_OPTION_SSLREF2_REUSE_CERT_TYPE_BUG);
    public static final LocalLBSSLOption SSL_OPTION_MICROSOFT_BIG_SSLV3_BUFFER = new LocalLBSSLOption(_SSL_OPTION_MICROSOFT_BIG_SSLV3_BUFFER);
    public static final LocalLBSSLOption SSL_OPTION_MSIE_SSL_V2_RSA_PADDING = new LocalLBSSLOption(_SSL_OPTION_MSIE_SSL_V2_RSA_PADDING);
    public static final LocalLBSSLOption SSL_OPTION_SSLEAY_080_CLIENT_DH_BUG = new LocalLBSSLOption(_SSL_OPTION_SSLEAY_080_CLIENT_DH_BUG);
    public static final LocalLBSSLOption SSL_OPTION_TLS_D5_BUG = new LocalLBSSLOption(_SSL_OPTION_TLS_D5_BUG);
    public static final LocalLBSSLOption SSL_OPTION_TLS_BLOCK_PADDING_BUG = new LocalLBSSLOption(_SSL_OPTION_TLS_BLOCK_PADDING_BUG);
    public static final LocalLBSSLOption SSL_OPTION_DONT_INSERT_EMPTY_FRAGMENTS = new LocalLBSSLOption(_SSL_OPTION_DONT_INSERT_EMPTY_FRAGMENTS);
    public static final LocalLBSSLOption SSL_OPTION_ALL_BUGFIXES = new LocalLBSSLOption(_SSL_OPTION_ALL_BUGFIXES);
    public static final LocalLBSSLOption SSL_OPTION_PASSIVE_CLOSE = new LocalLBSSLOption(_SSL_OPTION_PASSIVE_CLOSE);
    public static final LocalLBSSLOption SSL_OPTION_NO_SESSION_RESUMPTION_ON_RENEGOTIATION = new LocalLBSSLOption(_SSL_OPTION_NO_SESSION_RESUMPTION_ON_RENEGOTIATION);
    public static final LocalLBSSLOption SSL_OPTION_SINGLE_DH_USE = new LocalLBSSLOption(_SSL_OPTION_SINGLE_DH_USE);
    public static final LocalLBSSLOption SSL_OPTION_EPHEMERAL_RSA = new LocalLBSSLOption(_SSL_OPTION_EPHEMERAL_RSA);
    public static final LocalLBSSLOption SSL_OPTION_CIPHER_SERVER_PREFERENCE = new LocalLBSSLOption(_SSL_OPTION_CIPHER_SERVER_PREFERENCE);
    public static final LocalLBSSLOption SSL_OPTION_TLS_ROLLBACK_BUG = new LocalLBSSLOption(_SSL_OPTION_TLS_ROLLBACK_BUG);
    public static final LocalLBSSLOption SSL_OPTION_NO_SSL_V2 = new LocalLBSSLOption(_SSL_OPTION_NO_SSL_V2);
    public static final LocalLBSSLOption SSL_OPTION_NO_SSL_V3 = new LocalLBSSLOption(_SSL_OPTION_NO_SSL_V3);
    public static final LocalLBSSLOption SSL_OPTION_NO_TLS_V1 = new LocalLBSSLOption(_SSL_OPTION_NO_TLS_V1);
    public static final LocalLBSSLOption SSL_OPTION_PKCS1_CHECK_1 = new LocalLBSSLOption(_SSL_OPTION_PKCS1_CHECK_1);
    public static final LocalLBSSLOption SSL_OPTION_PKCS1_CHECK_2 = new LocalLBSSLOption(_SSL_OPTION_PKCS1_CHECK_2);
    public static final LocalLBSSLOption SSL_OPTION_NETSCAPE_CA_DN_BUG = new LocalLBSSLOption(_SSL_OPTION_NETSCAPE_CA_DN_BUG);
    public static final LocalLBSSLOption SSL_OPTION_NETSCAPE_DEMO_CIPHER_CHANGE_BUG = new LocalLBSSLOption(_SSL_OPTION_NETSCAPE_DEMO_CIPHER_CHANGE_BUG);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBSSLOption fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBSSLOption enumeration = (LocalLBSSLOption)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBSSLOption fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBSSLOption.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.SSLOption"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
