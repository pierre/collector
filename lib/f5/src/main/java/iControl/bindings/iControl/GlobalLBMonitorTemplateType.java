/**
 * GlobalLBMonitorTemplateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBMonitorTemplateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBMonitorTemplateType(java.lang.String value) {
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
    public static final java.lang.String _TTYPE_BIGIP = "TTYPE_BIGIP";
    public static final java.lang.String _TTYPE_BIGIP_LINK = "TTYPE_BIGIP_LINK";
    public static final java.lang.String _TTYPE_SNMP_GTM = "TTYPE_SNMP_GTM";
    public static final java.lang.String _TTYPE_SNMP_LINK = "TTYPE_SNMP_LINK";
    public static final java.lang.String _TTYPE_FIREPASS_GTM = "TTYPE_FIREPASS_GTM";
    public static final java.lang.String _TTYPE_RADIUS_ACCOUNTING = "TTYPE_RADIUS_ACCOUNTING";
    public static final java.lang.String _TTYPE_DIAMETER = "TTYPE_DIAMETER";
    public static final GlobalLBMonitorTemplateType TTYPE_UNSET = new GlobalLBMonitorTemplateType(_TTYPE_UNSET);
    public static final GlobalLBMonitorTemplateType TTYPE_ICMP = new GlobalLBMonitorTemplateType(_TTYPE_ICMP);
    public static final GlobalLBMonitorTemplateType TTYPE_TCP = new GlobalLBMonitorTemplateType(_TTYPE_TCP);
    public static final GlobalLBMonitorTemplateType TTYPE_TCP_ECHO = new GlobalLBMonitorTemplateType(_TTYPE_TCP_ECHO);
    public static final GlobalLBMonitorTemplateType TTYPE_EXTERNAL = new GlobalLBMonitorTemplateType(_TTYPE_EXTERNAL);
    public static final GlobalLBMonitorTemplateType TTYPE_HTTP = new GlobalLBMonitorTemplateType(_TTYPE_HTTP);
    public static final GlobalLBMonitorTemplateType TTYPE_HTTPS = new GlobalLBMonitorTemplateType(_TTYPE_HTTPS);
    public static final GlobalLBMonitorTemplateType TTYPE_NNTP = new GlobalLBMonitorTemplateType(_TTYPE_NNTP);
    public static final GlobalLBMonitorTemplateType TTYPE_FTP = new GlobalLBMonitorTemplateType(_TTYPE_FTP);
    public static final GlobalLBMonitorTemplateType TTYPE_POP3 = new GlobalLBMonitorTemplateType(_TTYPE_POP3);
    public static final GlobalLBMonitorTemplateType TTYPE_SMTP = new GlobalLBMonitorTemplateType(_TTYPE_SMTP);
    public static final GlobalLBMonitorTemplateType TTYPE_MSSQL = new GlobalLBMonitorTemplateType(_TTYPE_MSSQL);
    public static final GlobalLBMonitorTemplateType TTYPE_GATEWAY = new GlobalLBMonitorTemplateType(_TTYPE_GATEWAY);
    public static final GlobalLBMonitorTemplateType TTYPE_IMAP = new GlobalLBMonitorTemplateType(_TTYPE_IMAP);
    public static final GlobalLBMonitorTemplateType TTYPE_RADIUS = new GlobalLBMonitorTemplateType(_TTYPE_RADIUS);
    public static final GlobalLBMonitorTemplateType TTYPE_LDAP = new GlobalLBMonitorTemplateType(_TTYPE_LDAP);
    public static final GlobalLBMonitorTemplateType TTYPE_WMI = new GlobalLBMonitorTemplateType(_TTYPE_WMI);
    public static final GlobalLBMonitorTemplateType TTYPE_SNMP_DCA = new GlobalLBMonitorTemplateType(_TTYPE_SNMP_DCA);
    public static final GlobalLBMonitorTemplateType TTYPE_SNMP_DCA_BASE = new GlobalLBMonitorTemplateType(_TTYPE_SNMP_DCA_BASE);
    public static final GlobalLBMonitorTemplateType TTYPE_REAL_SERVER = new GlobalLBMonitorTemplateType(_TTYPE_REAL_SERVER);
    public static final GlobalLBMonitorTemplateType TTYPE_UDP = new GlobalLBMonitorTemplateType(_TTYPE_UDP);
    public static final GlobalLBMonitorTemplateType TTYPE_NONE = new GlobalLBMonitorTemplateType(_TTYPE_NONE);
    public static final GlobalLBMonitorTemplateType TTYPE_ORACLE = new GlobalLBMonitorTemplateType(_TTYPE_ORACLE);
    public static final GlobalLBMonitorTemplateType TTYPE_SOAP = new GlobalLBMonitorTemplateType(_TTYPE_SOAP);
    public static final GlobalLBMonitorTemplateType TTYPE_GATEWAY_ICMP = new GlobalLBMonitorTemplateType(_TTYPE_GATEWAY_ICMP);
    public static final GlobalLBMonitorTemplateType TTYPE_SIP = new GlobalLBMonitorTemplateType(_TTYPE_SIP);
    public static final GlobalLBMonitorTemplateType TTYPE_TCP_HALF_OPEN = new GlobalLBMonitorTemplateType(_TTYPE_TCP_HALF_OPEN);
    public static final GlobalLBMonitorTemplateType TTYPE_SCRIPTED = new GlobalLBMonitorTemplateType(_TTYPE_SCRIPTED);
    public static final GlobalLBMonitorTemplateType TTYPE_WAP = new GlobalLBMonitorTemplateType(_TTYPE_WAP);
    public static final GlobalLBMonitorTemplateType TTYPE_BIGIP = new GlobalLBMonitorTemplateType(_TTYPE_BIGIP);
    public static final GlobalLBMonitorTemplateType TTYPE_BIGIP_LINK = new GlobalLBMonitorTemplateType(_TTYPE_BIGIP_LINK);
    public static final GlobalLBMonitorTemplateType TTYPE_SNMP_GTM = new GlobalLBMonitorTemplateType(_TTYPE_SNMP_GTM);
    public static final GlobalLBMonitorTemplateType TTYPE_SNMP_LINK = new GlobalLBMonitorTemplateType(_TTYPE_SNMP_LINK);
    public static final GlobalLBMonitorTemplateType TTYPE_FIREPASS_GTM = new GlobalLBMonitorTemplateType(_TTYPE_FIREPASS_GTM);
    public static final GlobalLBMonitorTemplateType TTYPE_RADIUS_ACCOUNTING = new GlobalLBMonitorTemplateType(_TTYPE_RADIUS_ACCOUNTING);
    public static final GlobalLBMonitorTemplateType TTYPE_DIAMETER = new GlobalLBMonitorTemplateType(_TTYPE_DIAMETER);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBMonitorTemplateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBMonitorTemplateType enumeration = (GlobalLBMonitorTemplateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBMonitorTemplateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBMonitorTemplateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Monitor.TemplateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
