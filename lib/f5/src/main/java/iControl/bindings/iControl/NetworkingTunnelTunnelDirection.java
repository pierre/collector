/**
 * NetworkingTunnelTunnelDirection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingTunnelTunnelDirection implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingTunnelTunnelDirection(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TUNNEL_DIRECTION_UNKNOWN = "TUNNEL_DIRECTION_UNKNOWN";
    public static final java.lang.String _TUNNEL_DIRECTION_INBOUND = "TUNNEL_DIRECTION_INBOUND";
    public static final java.lang.String _TUNNEL_DIRECTION_OUTBOUND = "TUNNEL_DIRECTION_OUTBOUND";
    public static final java.lang.String _TUNNEL_DIRECTION_BIDIRECTIONAL = "TUNNEL_DIRECTION_BIDIRECTIONAL";
    public static final NetworkingTunnelTunnelDirection TUNNEL_DIRECTION_UNKNOWN = new NetworkingTunnelTunnelDirection(_TUNNEL_DIRECTION_UNKNOWN);
    public static final NetworkingTunnelTunnelDirection TUNNEL_DIRECTION_INBOUND = new NetworkingTunnelTunnelDirection(_TUNNEL_DIRECTION_INBOUND);
    public static final NetworkingTunnelTunnelDirection TUNNEL_DIRECTION_OUTBOUND = new NetworkingTunnelTunnelDirection(_TUNNEL_DIRECTION_OUTBOUND);
    public static final NetworkingTunnelTunnelDirection TUNNEL_DIRECTION_BIDIRECTIONAL = new NetworkingTunnelTunnelDirection(_TUNNEL_DIRECTION_BIDIRECTIONAL);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingTunnelTunnelDirection fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingTunnelTunnelDirection enumeration = (NetworkingTunnelTunnelDirection)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingTunnelTunnelDirection fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingTunnelTunnelDirection.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.Tunnel.TunnelDirection"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
