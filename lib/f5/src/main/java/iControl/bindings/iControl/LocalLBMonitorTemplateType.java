/**
 * LocalLBMonitorTemplateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBMonitorTemplateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBMonitorTemplateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TTYPE_UNSET = "TTYPE_UNSET";
    public static final java.lang.String _TTYPE_ICMP = "TTYPE_ICMP";
    public static final java.lang.String _TTYPE_TCP = "TTYPE_TCP";
    public static final java.lang.String _TTYPE_TCP_ECHO = "TTYPE_TCP_ECHO";
    public static final java.lang.String _TTYPE_EXTERNAL = "TTYPE_EXTERNAL";
    public static final java.lang.String _TTYPE_HTTP = "TTYPE_HTTP";
    public static final java.lang.String _TTYPE_HTTPS = "TTYPE_HTTPS";
    public static final java.lang.String _TTYPE_NNTP = "TTYPE_NNTP";
    public static final java.lang.String _TTYPE_FTP = "TTYPE_FTP";
    public static final java.lang.String _TTYPE_POP3 = "TTYPE_POP3";
    public static final java.lang.String _TTYPE_SMTP = "TTYPE_SMTP";
    public static final java.lang.String _TTYPE_MSSQL = "TTYPE_MSSQL";
    public static final java.lang.String _TTYPE_GATEWAY = "TTYPE_GATEWAY";
    public static final java.lang.String _TTYPE_IMAP = "TTYPE_IMAP";
    public static final java.lang.String _TTYPE_RADIUS = "TTYPE_RADIUS";
    public static final java.lang.String _TTYPE_LDAP = "TTYPE_LDAP";
    public static final java.lang.String _TTYPE_WMI = "TTYPE_WMI";
    public static final java.lang.String _TTYPE_SNMP_DCA = "TTYPE_SNMP_DCA";
    public static final java.lang.String _TTYPE_SNMP_DCA_BASE = "TTYPE_SNMP_DCA_BASE";
    public static final java.lang.String _TTYPE_REAL_SERVER = "TTYPE_REAL_SERVER";
    public static final java.lang.String _TTYPE_UDP = "TTYPE_UDP";
    public static final java.lang.String _TTYPE_NONE = "TTYPE_NONE";
    public static final java.lang.String _TTYPE_ORACLE = "TTYPE_ORACLE";
    public static final java.lang.String _TTYPE_SOAP = "TTYPE_SOAP";
    public static final java.lang.String _TTYPE_GATEWAY_ICMP = "TTYPE_GATEWAY_ICMP";
    public static final java.lang.String _TTYPE_SIP = "TTYPE_SIP";
    public static final java.lang.String _TTYPE_TCP_HALF_OPEN = "TTYPE_TCP_HALF_OPEN";
    public static final java.lang.String _TTYPE_SCRIPTED = "TTYPE_SCRIPTED";
    public static final java.lang.String _TTYPE_WAP = "TTYPE_WAP";
    public static final java.lang.String _TTYPE_RPC = "TTYPE_RPC";
    public static final java.lang.String _TTYPE_SMB = "TTYPE_SMB";
    public static final java.lang.String _TTYPE_SASP = "TTYPE_SASP";
    public static final java.lang.String _TTYPE_MODULE_SCORE = "TTYPE_MODULE_SCORE";
    public static final java.lang.String _TTYPE_FIREPASS = "TTYPE_FIREPASS";
    public static final java.lang.String _TTYPE_INBAND = "TTYPE_INBAND";
    public static final java.lang.String _TTYPE_RADIUS_ACCOUNTING = "TTYPE_RADIUS_ACCOUNTING";
    public static final java.lang.String _TTYPE_DIAMETER = "TTYPE_DIAMETER";
    public static final java.lang.String _TTYPE_VIRTUAL_LOCATION = "TTYPE_VIRTUAL_LOCATION";
    public static final LocalLBMonitorTemplateType TTYPE_UNSET = new LocalLBMonitorTemplateType(_TTYPE_UNSET);
    public static final LocalLBMonitorTemplateType TTYPE_ICMP = new LocalLBMonitorTemplateType(_TTYPE_ICMP);
    public static final LocalLBMonitorTemplateType TTYPE_TCP = new LocalLBMonitorTemplateType(_TTYPE_TCP);
    public static final LocalLBMonitorTemplateType TTYPE_TCP_ECHO = new LocalLBMonitorTemplateType(_TTYPE_TCP_ECHO);
    public static final LocalLBMonitorTemplateType TTYPE_EXTERNAL = new LocalLBMonitorTemplateType(_TTYPE_EXTERNAL);
    public static final LocalLBMonitorTemplateType TTYPE_HTTP = new LocalLBMonitorTemplateType(_TTYPE_HTTP);
    public static final LocalLBMonitorTemplateType TTYPE_HTTPS = new LocalLBMonitorTemplateType(_TTYPE_HTTPS);
    public static final LocalLBMonitorTemplateType TTYPE_NNTP = new LocalLBMonitorTemplateType(_TTYPE_NNTP);
    public static final LocalLBMonitorTemplateType TTYPE_FTP = new LocalLBMonitorTemplateType(_TTYPE_FTP);
    public static final LocalLBMonitorTemplateType TTYPE_POP3 = new LocalLBMonitorTemplateType(_TTYPE_POP3);
    public static final LocalLBMonitorTemplateType TTYPE_SMTP = new LocalLBMonitorTemplateType(_TTYPE_SMTP);
    public static final LocalLBMonitorTemplateType TTYPE_MSSQL = new LocalLBMonitorTemplateType(_TTYPE_MSSQL);
    public static final LocalLBMonitorTemplateType TTYPE_GATEWAY = new LocalLBMonitorTemplateType(_TTYPE_GATEWAY);
    public static final LocalLBMonitorTemplateType TTYPE_IMAP = new LocalLBMonitorTemplateType(_TTYPE_IMAP);
    public static final LocalLBMonitorTemplateType TTYPE_RADIUS = new LocalLBMonitorTemplateType(_TTYPE_RADIUS);
    public static final LocalLBMonitorTemplateType TTYPE_LDAP = new LocalLBMonitorTemplateType(_TTYPE_LDAP);
    public static final LocalLBMonitorTemplateType TTYPE_WMI = new LocalLBMonitorTemplateType(_TTYPE_WMI);
    public static final LocalLBMonitorTemplateType TTYPE_SNMP_DCA = new LocalLBMonitorTemplateType(_TTYPE_SNMP_DCA);
    public static final LocalLBMonitorTemplateType TTYPE_SNMP_DCA_BASE = new LocalLBMonitorTemplateType(_TTYPE_SNMP_DCA_BASE);
    public static final LocalLBMonitorTemplateType TTYPE_REAL_SERVER = new LocalLBMonitorTemplateType(_TTYPE_REAL_SERVER);
    public static final LocalLBMonitorTemplateType TTYPE_UDP = new LocalLBMonitorTemplateType(_TTYPE_UDP);
    public static final LocalLBMonitorTemplateType TTYPE_NONE = new LocalLBMonitorTemplateType(_TTYPE_NONE);
    public static final LocalLBMonitorTemplateType TTYPE_ORACLE = new LocalLBMonitorTemplateType(_TTYPE_ORACLE);
    public static final LocalLBMonitorTemplateType TTYPE_SOAP = new LocalLBMonitorTemplateType(_TTYPE_SOAP);
    public static final LocalLBMonitorTemplateType TTYPE_GATEWAY_ICMP = new LocalLBMonitorTemplateType(_TTYPE_GATEWAY_ICMP);
    public static final LocalLBMonitorTemplateType TTYPE_SIP = new LocalLBMonitorTemplateType(_TTYPE_SIP);
    public static final LocalLBMonitorTemplateType TTYPE_TCP_HALF_OPEN = new LocalLBMonitorTemplateType(_TTYPE_TCP_HALF_OPEN);
    public static final LocalLBMonitorTemplateType TTYPE_SCRIPTED = new LocalLBMonitorTemplateType(_TTYPE_SCRIPTED);
    public static final LocalLBMonitorTemplateType TTYPE_WAP = new LocalLBMonitorTemplateType(_TTYPE_WAP);
    public static final LocalLBMonitorTemplateType TTYPE_RPC = new LocalLBMonitorTemplateType(_TTYPE_RPC);
    public static final LocalLBMonitorTemplateType TTYPE_SMB = new LocalLBMonitorTemplateType(_TTYPE_SMB);
    public static final LocalLBMonitorTemplateType TTYPE_SASP = new LocalLBMonitorTemplateType(_TTYPE_SASP);
    public static final LocalLBMonitorTemplateType TTYPE_MODULE_SCORE = new LocalLBMonitorTemplateType(_TTYPE_MODULE_SCORE);
    public static final LocalLBMonitorTemplateType TTYPE_FIREPASS = new LocalLBMonitorTemplateType(_TTYPE_FIREPASS);
    public static final LocalLBMonitorTemplateType TTYPE_INBAND = new LocalLBMonitorTemplateType(_TTYPE_INBAND);
    public static final LocalLBMonitorTemplateType TTYPE_RADIUS_ACCOUNTING = new LocalLBMonitorTemplateType(_TTYPE_RADIUS_ACCOUNTING);
    public static final LocalLBMonitorTemplateType TTYPE_DIAMETER = new LocalLBMonitorTemplateType(_TTYPE_DIAMETER);
    public static final LocalLBMonitorTemplateType TTYPE_VIRTUAL_LOCATION = new LocalLBMonitorTemplateType(_TTYPE_VIRTUAL_LOCATION);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBMonitorTemplateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBMonitorTemplateType enumeration = (LocalLBMonitorTemplateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBMonitorTemplateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBMonitorTemplateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Monitor.TemplateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
