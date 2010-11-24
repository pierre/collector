/**
 * GlobalLBServerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBServerType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBServerType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SERVER_TYPE_BIGIP_STANDALONE = "SERVER_TYPE_BIGIP_STANDALONE";
    public static final java.lang.String _SERVER_TYPE_BIGIP_REDUNDANT = "SERVER_TYPE_BIGIP_REDUNDANT";
    public static final java.lang.String _SERVER_TYPE_GENERIC_LOAD_BALANCER = "SERVER_TYPE_GENERIC_LOAD_BALANCER";
    public static final java.lang.String _SERVER_TYPE_ALTEON_ACE_DIRECTOR = "SERVER_TYPE_ALTEON_ACE_DIRECTOR";
    public static final java.lang.String _SERVER_TYPE_CISCO_CSS = "SERVER_TYPE_CISCO_CSS";
    public static final java.lang.String _SERVER_TYPE_CISCO_LOCAL_DIRECTOR_V2 = "SERVER_TYPE_CISCO_LOCAL_DIRECTOR_V2";
    public static final java.lang.String _SERVER_TYPE_CISCO_LOCAL_DIRECTOR_V3 = "SERVER_TYPE_CISCO_LOCAL_DIRECTOR_V3";
    public static final java.lang.String _SERVER_TYPE_CISCO_SERVER_LOAD_BALANCER = "SERVER_TYPE_CISCO_SERVER_LOAD_BALANCER";
    public static final java.lang.String _SERVER_TYPE_EXTREME = "SERVER_TYPE_EXTREME";
    public static final java.lang.String _SERVER_TYPE_FOUNDRY_SERVER_IRON = "SERVER_TYPE_FOUNDRY_SERVER_IRON";
    public static final java.lang.String _SERVER_TYPE_GENERIC_HOST = "SERVER_TYPE_GENERIC_HOST";
    public static final java.lang.String _SERVER_TYPE_CACHEFLOW = "SERVER_TYPE_CACHEFLOW";
    public static final java.lang.String _SERVER_TYPE_NETAPP = "SERVER_TYPE_NETAPP";
    public static final java.lang.String _SERVER_TYPE_WINDOWS_2000 = "SERVER_TYPE_WINDOWS_2000";
    public static final java.lang.String _SERVER_TYPE_NT4 = "SERVER_TYPE_NT4";
    public static final java.lang.String _SERVER_TYPE_SOLARIS = "SERVER_TYPE_SOLARIS";
    public static final java.lang.String _SERVER_TYPE_RADWARE = "SERVER_TYPE_RADWARE";
    public static final GlobalLBServerType SERVER_TYPE_BIGIP_STANDALONE = new GlobalLBServerType(_SERVER_TYPE_BIGIP_STANDALONE);
    public static final GlobalLBServerType SERVER_TYPE_BIGIP_REDUNDANT = new GlobalLBServerType(_SERVER_TYPE_BIGIP_REDUNDANT);
    public static final GlobalLBServerType SERVER_TYPE_GENERIC_LOAD_BALANCER = new GlobalLBServerType(_SERVER_TYPE_GENERIC_LOAD_BALANCER);
    public static final GlobalLBServerType SERVER_TYPE_ALTEON_ACE_DIRECTOR = new GlobalLBServerType(_SERVER_TYPE_ALTEON_ACE_DIRECTOR);
    public static final GlobalLBServerType SERVER_TYPE_CISCO_CSS = new GlobalLBServerType(_SERVER_TYPE_CISCO_CSS);
    public static final GlobalLBServerType SERVER_TYPE_CISCO_LOCAL_DIRECTOR_V2 = new GlobalLBServerType(_SERVER_TYPE_CISCO_LOCAL_DIRECTOR_V2);
    public static final GlobalLBServerType SERVER_TYPE_CISCO_LOCAL_DIRECTOR_V3 = new GlobalLBServerType(_SERVER_TYPE_CISCO_LOCAL_DIRECTOR_V3);
    public static final GlobalLBServerType SERVER_TYPE_CISCO_SERVER_LOAD_BALANCER = new GlobalLBServerType(_SERVER_TYPE_CISCO_SERVER_LOAD_BALANCER);
    public static final GlobalLBServerType SERVER_TYPE_EXTREME = new GlobalLBServerType(_SERVER_TYPE_EXTREME);
    public static final GlobalLBServerType SERVER_TYPE_FOUNDRY_SERVER_IRON = new GlobalLBServerType(_SERVER_TYPE_FOUNDRY_SERVER_IRON);
    public static final GlobalLBServerType SERVER_TYPE_GENERIC_HOST = new GlobalLBServerType(_SERVER_TYPE_GENERIC_HOST);
    public static final GlobalLBServerType SERVER_TYPE_CACHEFLOW = new GlobalLBServerType(_SERVER_TYPE_CACHEFLOW);
    public static final GlobalLBServerType SERVER_TYPE_NETAPP = new GlobalLBServerType(_SERVER_TYPE_NETAPP);
    public static final GlobalLBServerType SERVER_TYPE_WINDOWS_2000 = new GlobalLBServerType(_SERVER_TYPE_WINDOWS_2000);
    public static final GlobalLBServerType SERVER_TYPE_NT4 = new GlobalLBServerType(_SERVER_TYPE_NT4);
    public static final GlobalLBServerType SERVER_TYPE_SOLARIS = new GlobalLBServerType(_SERVER_TYPE_SOLARIS);
    public static final GlobalLBServerType SERVER_TYPE_RADWARE = new GlobalLBServerType(_SERVER_TYPE_RADWARE);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBServerType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBServerType enumeration = (GlobalLBServerType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBServerType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBServerType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.ServerType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
