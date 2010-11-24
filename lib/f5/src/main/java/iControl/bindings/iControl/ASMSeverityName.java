/**
 * ASMSeverityName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ASMSeverityName implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ASMSeverityName(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SEVERITY_LOG_EMERG = "SEVERITY_LOG_EMERG";
    public static final java.lang.String _SEVERITY_LOG_ALERT = "SEVERITY_LOG_ALERT";
    public static final java.lang.String _SEVERITY_LOG_CRIT = "SEVERITY_LOG_CRIT";
    public static final java.lang.String _SEVERITY_LOG_ERR = "SEVERITY_LOG_ERR";
    public static final java.lang.String _SEVERITY_LOG_WARNING = "SEVERITY_LOG_WARNING";
    public static final java.lang.String _SEVERITY_LOG_NOTICE = "SEVERITY_LOG_NOTICE";
    public static final java.lang.String _SEVERITY_LOG_INFO = "SEVERITY_LOG_INFO";
    public static final ASMSeverityName SEVERITY_LOG_EMERG = new ASMSeverityName(_SEVERITY_LOG_EMERG);
    public static final ASMSeverityName SEVERITY_LOG_ALERT = new ASMSeverityName(_SEVERITY_LOG_ALERT);
    public static final ASMSeverityName SEVERITY_LOG_CRIT = new ASMSeverityName(_SEVERITY_LOG_CRIT);
    public static final ASMSeverityName SEVERITY_LOG_ERR = new ASMSeverityName(_SEVERITY_LOG_ERR);
    public static final ASMSeverityName SEVERITY_LOG_WARNING = new ASMSeverityName(_SEVERITY_LOG_WARNING);
    public static final ASMSeverityName SEVERITY_LOG_NOTICE = new ASMSeverityName(_SEVERITY_LOG_NOTICE);
    public static final ASMSeverityName SEVERITY_LOG_INFO = new ASMSeverityName(_SEVERITY_LOG_INFO);
    public java.lang.String getValue() { return _value_;}
    public static ASMSeverityName fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ASMSeverityName enumeration = (ASMSeverityName)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ASMSeverityName fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ASMSeverityName.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.SeverityName"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
