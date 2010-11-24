/**
 * SystemServicesServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemServicesServiceType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemServicesServiceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SERVICE_UNKNOWN = "SERVICE_UNKNOWN";
    public static final java.lang.String _SERVICE_ALERTD = "SERVICE_ALERTD";
    public static final java.lang.String _SERVICE_BCM56XXD = "SERVICE_BCM56XXD";
    public static final java.lang.String _SERVICE_BIG3D = "SERVICE_BIG3D";
    public static final java.lang.String _SERVICE_BIG3DSHIM = "SERVICE_BIG3DSHIM";
    public static final java.lang.String _SERVICE_BIGD = "SERVICE_BIGD";
    public static final java.lang.String _SERVICE_BIGDBD = "SERVICE_BIGDBD";
    public static final java.lang.String _SERVICE_BIGSNMPD = "SERVICE_BIGSNMPD";
    public static final java.lang.String _SERVICE_CHMAND = "SERVICE_CHMAND";
    public static final java.lang.String _SERVICE_CSSD = "SERVICE_CSSD";
    public static final java.lang.String _SERVICE_EVENTD = "SERVICE_EVENTD";
    public static final java.lang.String _SERVICE_FPDD = "SERVICE_FPDD";
    public static final java.lang.String _SERVICE_HTTPD = "SERVICE_HTTPD";
    public static final java.lang.String _SERVICE_LACPD = "SERVICE_LACPD";
    public static final java.lang.String _SERVICE_MCPD = "SERVICE_MCPD";
    public static final java.lang.String _SERVICE_NAMED = "SERVICE_NAMED";
    public static final java.lang.String _SERVICE_NOKIASNMPD = "SERVICE_NOKIASNMPD";
    public static final java.lang.String _SERVICE_NTPD = "SERVICE_NTPD";
    public static final java.lang.String _SERVICE_OVERDOG = "SERVICE_OVERDOG";
    public static final java.lang.String _SERVICE_PVAD = "SERVICE_PVAD";
    public static final java.lang.String _SERVICE_RADVD = "SERVICE_RADVD";
    public static final java.lang.String _SERVICE_RMONSNMPD = "SERVICE_RMONSNMPD";
    public static final java.lang.String _SERVICE_SNMPD = "SERVICE_SNMPD";
    public static final java.lang.String _SERVICE_SOD = "SERVICE_SOD";
    public static final java.lang.String _SERVICE_SSHD = "SERVICE_SSHD";
    public static final java.lang.String _SERVICE_STATSD = "SERVICE_STATSD";
    public static final java.lang.String _SERVICE_STPD = "SERVICE_STPD";
    public static final java.lang.String _SERVICE_SYSCALLD = "SERVICE_SYSCALLD";
    public static final java.lang.String _SERVICE_SYSLOGD = "SERVICE_SYSLOGD";
    public static final java.lang.String _SERVICE_TAMD = "SERVICE_TAMD";
    public static final java.lang.String _SERVICE_TMM = "SERVICE_TMM";
    public static final java.lang.String _SERVICE_TMROUTED = "SERVICE_TMROUTED";
    public static final java.lang.String _SERVICE_TMSNMPD = "SERVICE_TMSNMPD";
    public static final java.lang.String _SERVICE_TOMCAT4 = "SERVICE_TOMCAT4";
    public static final java.lang.String _SERVICE_ZEBOSD = "SERVICE_ZEBOSD";
    public static final java.lang.String _SERVICE_GTMD = "SERVICE_GTMD";
    public static final java.lang.String _SERVICE_SUBSNMPD = "SERVICE_SUBSNMPD";
    public static final java.lang.String _SERVICE_ZRD = "SERVICE_ZRD";
    public static final java.lang.String _SERVICE_ASM = "SERVICE_ASM";
    public static final java.lang.String _SERVICE_PVAC = "SERVICE_PVAC";
    public static final java.lang.String _SERVICE_COMM_SRV = "SERVICE_COMM_SRV";
    public static final java.lang.String _SERVICE_HDS_PRUNE = "SERVICE_HDS_PRUNE";
    public static final java.lang.String _SERVICE_TMZD = "SERVICE_TMZD";
    public static final java.lang.String _SERVICE_WAICD = "SERVICE_WAICD";
    public static final java.lang.String _SERVICE_CLUSTERD = "SERVICE_CLUSTERD";
    public static final java.lang.String _SERVICE_CSYNCD = "SERVICE_CSYNCD";
    public static final java.lang.String _SERVICE_LIND = "SERVICE_LIND";
    public static final SystemServicesServiceType SERVICE_UNKNOWN = new SystemServicesServiceType(_SERVICE_UNKNOWN);
    public static final SystemServicesServiceType SERVICE_ALERTD = new SystemServicesServiceType(_SERVICE_ALERTD);
    public static final SystemServicesServiceType SERVICE_BCM56XXD = new SystemServicesServiceType(_SERVICE_BCM56XXD);
    public static final SystemServicesServiceType SERVICE_BIG3D = new SystemServicesServiceType(_SERVICE_BIG3D);
    public static final SystemServicesServiceType SERVICE_BIG3DSHIM = new SystemServicesServiceType(_SERVICE_BIG3DSHIM);
    public static final SystemServicesServiceType SERVICE_BIGD = new SystemServicesServiceType(_SERVICE_BIGD);
    public static final SystemServicesServiceType SERVICE_BIGDBD = new SystemServicesServiceType(_SERVICE_BIGDBD);
    public static final SystemServicesServiceType SERVICE_BIGSNMPD = new SystemServicesServiceType(_SERVICE_BIGSNMPD);
    public static final SystemServicesServiceType SERVICE_CHMAND = new SystemServicesServiceType(_SERVICE_CHMAND);
    public static final SystemServicesServiceType SERVICE_CSSD = new SystemServicesServiceType(_SERVICE_CSSD);
    public static final SystemServicesServiceType SERVICE_EVENTD = new SystemServicesServiceType(_SERVICE_EVENTD);
    public static final SystemServicesServiceType SERVICE_FPDD = new SystemServicesServiceType(_SERVICE_FPDD);
    public static final SystemServicesServiceType SERVICE_HTTPD = new SystemServicesServiceType(_SERVICE_HTTPD);
    public static final SystemServicesServiceType SERVICE_LACPD = new SystemServicesServiceType(_SERVICE_LACPD);
    public static final SystemServicesServiceType SERVICE_MCPD = new SystemServicesServiceType(_SERVICE_MCPD);
    public static final SystemServicesServiceType SERVICE_NAMED = new SystemServicesServiceType(_SERVICE_NAMED);
    public static final SystemServicesServiceType SERVICE_NOKIASNMPD = new SystemServicesServiceType(_SERVICE_NOKIASNMPD);
    public static final SystemServicesServiceType SERVICE_NTPD = new SystemServicesServiceType(_SERVICE_NTPD);
    public static final SystemServicesServiceType SERVICE_OVERDOG = new SystemServicesServiceType(_SERVICE_OVERDOG);
    public static final SystemServicesServiceType SERVICE_PVAD = new SystemServicesServiceType(_SERVICE_PVAD);
    public static final SystemServicesServiceType SERVICE_RADVD = new SystemServicesServiceType(_SERVICE_RADVD);
    public static final SystemServicesServiceType SERVICE_RMONSNMPD = new SystemServicesServiceType(_SERVICE_RMONSNMPD);
    public static final SystemServicesServiceType SERVICE_SNMPD = new SystemServicesServiceType(_SERVICE_SNMPD);
    public static final SystemServicesServiceType SERVICE_SOD = new SystemServicesServiceType(_SERVICE_SOD);
    public static final SystemServicesServiceType SERVICE_SSHD = new SystemServicesServiceType(_SERVICE_SSHD);
    public static final SystemServicesServiceType SERVICE_STATSD = new SystemServicesServiceType(_SERVICE_STATSD);
    public static final SystemServicesServiceType SERVICE_STPD = new SystemServicesServiceType(_SERVICE_STPD);
    public static final SystemServicesServiceType SERVICE_SYSCALLD = new SystemServicesServiceType(_SERVICE_SYSCALLD);
    public static final SystemServicesServiceType SERVICE_SYSLOGD = new SystemServicesServiceType(_SERVICE_SYSLOGD);
    public static final SystemServicesServiceType SERVICE_TAMD = new SystemServicesServiceType(_SERVICE_TAMD);
    public static final SystemServicesServiceType SERVICE_TMM = new SystemServicesServiceType(_SERVICE_TMM);
    public static final SystemServicesServiceType SERVICE_TMROUTED = new SystemServicesServiceType(_SERVICE_TMROUTED);
    public static final SystemServicesServiceType SERVICE_TMSNMPD = new SystemServicesServiceType(_SERVICE_TMSNMPD);
    public static final SystemServicesServiceType SERVICE_TOMCAT4 = new SystemServicesServiceType(_SERVICE_TOMCAT4);
    public static final SystemServicesServiceType SERVICE_ZEBOSD = new SystemServicesServiceType(_SERVICE_ZEBOSD);
    public static final SystemServicesServiceType SERVICE_GTMD = new SystemServicesServiceType(_SERVICE_GTMD);
    public static final SystemServicesServiceType SERVICE_SUBSNMPD = new SystemServicesServiceType(_SERVICE_SUBSNMPD);
    public static final SystemServicesServiceType SERVICE_ZRD = new SystemServicesServiceType(_SERVICE_ZRD);
    public static final SystemServicesServiceType SERVICE_ASM = new SystemServicesServiceType(_SERVICE_ASM);
    public static final SystemServicesServiceType SERVICE_PVAC = new SystemServicesServiceType(_SERVICE_PVAC);
    public static final SystemServicesServiceType SERVICE_COMM_SRV = new SystemServicesServiceType(_SERVICE_COMM_SRV);
    public static final SystemServicesServiceType SERVICE_HDS_PRUNE = new SystemServicesServiceType(_SERVICE_HDS_PRUNE);
    public static final SystemServicesServiceType SERVICE_TMZD = new SystemServicesServiceType(_SERVICE_TMZD);
    public static final SystemServicesServiceType SERVICE_WAICD = new SystemServicesServiceType(_SERVICE_WAICD);
    public static final SystemServicesServiceType SERVICE_CLUSTERD = new SystemServicesServiceType(_SERVICE_CLUSTERD);
    public static final SystemServicesServiceType SERVICE_CSYNCD = new SystemServicesServiceType(_SERVICE_CSYNCD);
    public static final SystemServicesServiceType SERVICE_LIND = new SystemServicesServiceType(_SERVICE_LIND);
    public java.lang.String getValue() { return _value_;}
    public static SystemServicesServiceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemServicesServiceType enumeration = (SystemServicesServiceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemServicesServiceType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemServicesServiceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Services.ServiceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
