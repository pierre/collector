/**
 * NetworkingARPNDPState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingARPNDPState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingARPNDPState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NDP_STATE_INCOMPLETE = "NDP_STATE_INCOMPLETE";
    public static final java.lang.String _NDP_STATE_REACHABLE = "NDP_STATE_REACHABLE";
    public static final java.lang.String _NDP_STATE_STALE = "NDP_STATE_STALE";
    public static final java.lang.String _NDP_STATE_DELAY = "NDP_STATE_DELAY";
    public static final java.lang.String _NDP_STATE_PROBE = "NDP_STATE_PROBE";
    public static final java.lang.String _NDP_STATE_PERMANENT = "NDP_STATE_PERMANENT";
    public static final NetworkingARPNDPState NDP_STATE_INCOMPLETE = new NetworkingARPNDPState(_NDP_STATE_INCOMPLETE);
    public static final NetworkingARPNDPState NDP_STATE_REACHABLE = new NetworkingARPNDPState(_NDP_STATE_REACHABLE);
    public static final NetworkingARPNDPState NDP_STATE_STALE = new NetworkingARPNDPState(_NDP_STATE_STALE);
    public static final NetworkingARPNDPState NDP_STATE_DELAY = new NetworkingARPNDPState(_NDP_STATE_DELAY);
    public static final NetworkingARPNDPState NDP_STATE_PROBE = new NetworkingARPNDPState(_NDP_STATE_PROBE);
    public static final NetworkingARPNDPState NDP_STATE_PERMANENT = new NetworkingARPNDPState(_NDP_STATE_PERMANENT);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingARPNDPState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingARPNDPState enumeration = (NetworkingARPNDPState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingARPNDPState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingARPNDPState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.ARP.NDPState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
