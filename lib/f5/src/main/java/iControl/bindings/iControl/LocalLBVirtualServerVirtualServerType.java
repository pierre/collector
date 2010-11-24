/**
 * LocalLBVirtualServerVirtualServerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBVirtualServerVirtualServerType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBVirtualServerVirtualServerType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RESOURCE_TYPE_POOL = "RESOURCE_TYPE_POOL";
    public static final java.lang.String _RESOURCE_TYPE_IP_FORWARDING = "RESOURCE_TYPE_IP_FORWARDING";
    public static final java.lang.String _RESOURCE_TYPE_L2_FORWARDING = "RESOURCE_TYPE_L2_FORWARDING";
    public static final java.lang.String _RESOURCE_TYPE_REJECT = "RESOURCE_TYPE_REJECT";
    public static final java.lang.String _RESOURCE_TYPE_FAST_L4 = "RESOURCE_TYPE_FAST_L4";
    public static final java.lang.String _RESOURCE_TYPE_FAST_HTTP = "RESOURCE_TYPE_FAST_HTTP";
    public static final LocalLBVirtualServerVirtualServerType RESOURCE_TYPE_POOL = new LocalLBVirtualServerVirtualServerType(_RESOURCE_TYPE_POOL);
    public static final LocalLBVirtualServerVirtualServerType RESOURCE_TYPE_IP_FORWARDING = new LocalLBVirtualServerVirtualServerType(_RESOURCE_TYPE_IP_FORWARDING);
    public static final LocalLBVirtualServerVirtualServerType RESOURCE_TYPE_L2_FORWARDING = new LocalLBVirtualServerVirtualServerType(_RESOURCE_TYPE_L2_FORWARDING);
    public static final LocalLBVirtualServerVirtualServerType RESOURCE_TYPE_REJECT = new LocalLBVirtualServerVirtualServerType(_RESOURCE_TYPE_REJECT);
    public static final LocalLBVirtualServerVirtualServerType RESOURCE_TYPE_FAST_L4 = new LocalLBVirtualServerVirtualServerType(_RESOURCE_TYPE_FAST_L4);
    public static final LocalLBVirtualServerVirtualServerType RESOURCE_TYPE_FAST_HTTP = new LocalLBVirtualServerVirtualServerType(_RESOURCE_TYPE_FAST_HTTP);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBVirtualServerVirtualServerType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBVirtualServerVirtualServerType enumeration = (LocalLBVirtualServerVirtualServerType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBVirtualServerVirtualServerType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBVirtualServerVirtualServerType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualServer.VirtualServerType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
