/**
 * LocalLBCookiePersistenceMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBCookiePersistenceMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBCookiePersistenceMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COOKIE_PERSISTENCE_METHOD_NONE = "COOKIE_PERSISTENCE_METHOD_NONE";
    public static final java.lang.String _COOKIE_PERSISTENCE_METHOD_INSERT = "COOKIE_PERSISTENCE_METHOD_INSERT";
    public static final java.lang.String _COOKIE_PERSISTENCE_METHOD_REWRITE = "COOKIE_PERSISTENCE_METHOD_REWRITE";
    public static final java.lang.String _COOKIE_PERSISTENCE_METHOD_PASSIVE = "COOKIE_PERSISTENCE_METHOD_PASSIVE";
    public static final java.lang.String _COOKIE_PERSISTENCE_METHOD_HASH = "COOKIE_PERSISTENCE_METHOD_HASH";
    public static final LocalLBCookiePersistenceMethod COOKIE_PERSISTENCE_METHOD_NONE = new LocalLBCookiePersistenceMethod(_COOKIE_PERSISTENCE_METHOD_NONE);
    public static final LocalLBCookiePersistenceMethod COOKIE_PERSISTENCE_METHOD_INSERT = new LocalLBCookiePersistenceMethod(_COOKIE_PERSISTENCE_METHOD_INSERT);
    public static final LocalLBCookiePersistenceMethod COOKIE_PERSISTENCE_METHOD_REWRITE = new LocalLBCookiePersistenceMethod(_COOKIE_PERSISTENCE_METHOD_REWRITE);
    public static final LocalLBCookiePersistenceMethod COOKIE_PERSISTENCE_METHOD_PASSIVE = new LocalLBCookiePersistenceMethod(_COOKIE_PERSISTENCE_METHOD_PASSIVE);
    public static final LocalLBCookiePersistenceMethod COOKIE_PERSISTENCE_METHOD_HASH = new LocalLBCookiePersistenceMethod(_COOKIE_PERSISTENCE_METHOD_HASH);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBCookiePersistenceMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBCookiePersistenceMethod enumeration = (LocalLBCookiePersistenceMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBCookiePersistenceMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBCookiePersistenceMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.CookiePersistenceMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
