/**
 * NetworkingISessionRemoteInterfaceNatSourceAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingISessionRemoteInterfaceNatSourceAddress implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingISessionRemoteInterfaceNatSourceAddress(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WOC_NAT_SOURCE_ADDRESS_NONE = "WOC_NAT_SOURCE_ADDRESS_NONE";
    public static final java.lang.String _WOC_NAT_SOURCE_ADDRESS_CLIENT = "WOC_NAT_SOURCE_ADDRESS_CLIENT";
    public static final java.lang.String _WOC_NAT_SOURCE_ADDRESS_WOM = "WOC_NAT_SOURCE_ADDRESS_WOM";
    public static final java.lang.String _WOC_NAT_SOURCE_ADDRESS_TUNNEL = "WOC_NAT_SOURCE_ADDRESS_TUNNEL";
    public static final NetworkingISessionRemoteInterfaceNatSourceAddress WOC_NAT_SOURCE_ADDRESS_NONE = new NetworkingISessionRemoteInterfaceNatSourceAddress(_WOC_NAT_SOURCE_ADDRESS_NONE);
    public static final NetworkingISessionRemoteInterfaceNatSourceAddress WOC_NAT_SOURCE_ADDRESS_CLIENT = new NetworkingISessionRemoteInterfaceNatSourceAddress(_WOC_NAT_SOURCE_ADDRESS_CLIENT);
    public static final NetworkingISessionRemoteInterfaceNatSourceAddress WOC_NAT_SOURCE_ADDRESS_WOM = new NetworkingISessionRemoteInterfaceNatSourceAddress(_WOC_NAT_SOURCE_ADDRESS_WOM);
    public static final NetworkingISessionRemoteInterfaceNatSourceAddress WOC_NAT_SOURCE_ADDRESS_TUNNEL = new NetworkingISessionRemoteInterfaceNatSourceAddress(_WOC_NAT_SOURCE_ADDRESS_TUNNEL);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingISessionRemoteInterfaceNatSourceAddress fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingISessionRemoteInterfaceNatSourceAddress enumeration = (NetworkingISessionRemoteInterfaceNatSourceAddress)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingISessionRemoteInterfaceNatSourceAddress fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingISessionRemoteInterfaceNatSourceAddress.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionRemoteInterface.NatSourceAddress"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
