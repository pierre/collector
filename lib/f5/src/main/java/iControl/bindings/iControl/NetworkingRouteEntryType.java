/**
 * NetworkingRouteEntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingRouteEntryType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingRouteEntryType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ROUTE_TYPE_GATEWAY = "ROUTE_TYPE_GATEWAY";
    public static final java.lang.String _ROUTE_TYPE_POOL = "ROUTE_TYPE_POOL";
    public static final java.lang.String _ROUTE_TYPE_INTERFACE = "ROUTE_TYPE_INTERFACE";
    public static final java.lang.String _ROUTE_TYPE_REJECT = "ROUTE_TYPE_REJECT";
    public static final NetworkingRouteEntryType ROUTE_TYPE_GATEWAY = new NetworkingRouteEntryType(_ROUTE_TYPE_GATEWAY);
    public static final NetworkingRouteEntryType ROUTE_TYPE_POOL = new NetworkingRouteEntryType(_ROUTE_TYPE_POOL);
    public static final NetworkingRouteEntryType ROUTE_TYPE_INTERFACE = new NetworkingRouteEntryType(_ROUTE_TYPE_INTERFACE);
    public static final NetworkingRouteEntryType ROUTE_TYPE_REJECT = new NetworkingRouteEntryType(_ROUTE_TYPE_REJECT);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingRouteEntryType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingRouteEntryType enumeration = (NetworkingRouteEntryType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingRouteEntryType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingRouteEntryType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.RouteEntryType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
