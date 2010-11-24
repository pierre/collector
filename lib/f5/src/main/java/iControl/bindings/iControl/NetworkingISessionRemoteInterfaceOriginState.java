/**
 * NetworkingISessionRemoteInterfaceOriginState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingISessionRemoteInterfaceOriginState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingISessionRemoteInterfaceOriginState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MCP_ORIGIN_DISCOVERED = "MCP_ORIGIN_DISCOVERED";
    public static final java.lang.String _MCP_ORIGIN_CONFIGURED = "MCP_ORIGIN_CONFIGURED";
    public static final java.lang.String _MCP_ORIGIN_PERSISTABLE = "MCP_ORIGIN_PERSISTABLE";
    public static final java.lang.String _MCP_ORIGIN_MANUALLY_SAVED = "MCP_ORIGIN_MANUALLY_SAVED";
    public static final NetworkingISessionRemoteInterfaceOriginState MCP_ORIGIN_DISCOVERED = new NetworkingISessionRemoteInterfaceOriginState(_MCP_ORIGIN_DISCOVERED);
    public static final NetworkingISessionRemoteInterfaceOriginState MCP_ORIGIN_CONFIGURED = new NetworkingISessionRemoteInterfaceOriginState(_MCP_ORIGIN_CONFIGURED);
    public static final NetworkingISessionRemoteInterfaceOriginState MCP_ORIGIN_PERSISTABLE = new NetworkingISessionRemoteInterfaceOriginState(_MCP_ORIGIN_PERSISTABLE);
    public static final NetworkingISessionRemoteInterfaceOriginState MCP_ORIGIN_MANUALLY_SAVED = new NetworkingISessionRemoteInterfaceOriginState(_MCP_ORIGIN_MANUALLY_SAVED);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingISessionRemoteInterfaceOriginState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingISessionRemoteInterfaceOriginState enumeration = (NetworkingISessionRemoteInterfaceOriginState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingISessionRemoteInterfaceOriginState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingISessionRemoteInterfaceOriginState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionRemoteInterface.OriginState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
