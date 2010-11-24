/**
 * ManagementDebugLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementDebugLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementDebugLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ZRD_EMERG = "ZRD_EMERG";
    public static final java.lang.String _ZRD_ALERT = "ZRD_ALERT";
    public static final java.lang.String _ZRD_CRIT = "ZRD_CRIT";
    public static final java.lang.String _ZRD_ERROR = "ZRD_ERROR";
    public static final java.lang.String _ZRD_WARN = "ZRD_WARN";
    public static final java.lang.String _ZRD_NOTICE = "ZRD_NOTICE";
    public static final java.lang.String _ZRD_INFO = "ZRD_INFO";
    public static final java.lang.String _ZRD_DEBUG = "ZRD_DEBUG";
    public static final java.lang.String _ZRD_UNSET = "ZRD_UNSET";
    public static final ManagementDebugLevel ZRD_EMERG = new ManagementDebugLevel(_ZRD_EMERG);
    public static final ManagementDebugLevel ZRD_ALERT = new ManagementDebugLevel(_ZRD_ALERT);
    public static final ManagementDebugLevel ZRD_CRIT = new ManagementDebugLevel(_ZRD_CRIT);
    public static final ManagementDebugLevel ZRD_ERROR = new ManagementDebugLevel(_ZRD_ERROR);
    public static final ManagementDebugLevel ZRD_WARN = new ManagementDebugLevel(_ZRD_WARN);
    public static final ManagementDebugLevel ZRD_NOTICE = new ManagementDebugLevel(_ZRD_NOTICE);
    public static final ManagementDebugLevel ZRD_INFO = new ManagementDebugLevel(_ZRD_INFO);
    public static final ManagementDebugLevel ZRD_DEBUG = new ManagementDebugLevel(_ZRD_DEBUG);
    public static final ManagementDebugLevel ZRD_UNSET = new ManagementDebugLevel(_ZRD_UNSET);
    public java.lang.String getValue() { return _value_;}
    public static ManagementDebugLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementDebugLevel enumeration = (ManagementDebugLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementDebugLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementDebugLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.DebugLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
