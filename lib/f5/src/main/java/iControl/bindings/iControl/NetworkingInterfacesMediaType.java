/**
 * NetworkingInterfacesMediaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingInterfacesMediaType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingInterfacesMediaType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MT_NONE = "MT_NONE";
    public static final java.lang.String _MT_AUTO = "MT_AUTO";
    public static final java.lang.String _MT_LOOP = "MT_LOOP";
    public static final java.lang.String _MT_NO_PHY = "MT_NO_PHY";
    public static final java.lang.String _MT_10T_HALF = "MT_10T_HALF";
    public static final java.lang.String _MT_10T_FULL = "MT_10T_FULL";
    public static final java.lang.String _MT_100TX_HALF = "MT_100TX_HALF";
    public static final java.lang.String _MT_100TX_FULL = "MT_100TX_FULL";
    public static final java.lang.String _MT_1000TX_HALF = "MT_1000TX_HALF";
    public static final java.lang.String _MT_1000TX_FULL = "MT_1000TX_FULL";
    public static final java.lang.String _MT_1000FX_HALF = "MT_1000FX_HALF";
    public static final java.lang.String _MT_1000FX_FULL = "MT_1000FX_FULL";
    public static final java.lang.String _MT_10000TX_HALF = "MT_10000TX_HALF";
    public static final java.lang.String _MT_10000TX_FULL = "MT_10000TX_FULL";
    public static final java.lang.String _MT_10000FX_HALF = "MT_10000FX_HALF";
    public static final java.lang.String _MT_10000FX_FULL = "MT_10000FX_FULL";
    public static final java.lang.String _MT_1000SX_HALF = "MT_1000SX_HALF";
    public static final java.lang.String _MT_1000SX_FULL = "MT_1000SX_FULL";
    public static final java.lang.String _MT_1000LX_HALF = "MT_1000LX_HALF";
    public static final java.lang.String _MT_1000LX_FULL = "MT_1000LX_FULL";
    public static final java.lang.String _MT_1000T_HALF = "MT_1000T_HALF";
    public static final java.lang.String _MT_1000T_FULL = "MT_1000T_FULL";
    public static final java.lang.String _MT_10000T_FULL = "MT_10000T_FULL";
    public static final java.lang.String _MT_10000SR_FULL = "MT_10000SR_FULL";
    public static final java.lang.String _MT_10000LR_FULL = "MT_10000LR_FULL";
    public static final java.lang.String _MT_10000ER_FULL = "MT_10000ER_FULL";
    public static final NetworkingInterfacesMediaType MT_NONE = new NetworkingInterfacesMediaType(_MT_NONE);
    public static final NetworkingInterfacesMediaType MT_AUTO = new NetworkingInterfacesMediaType(_MT_AUTO);
    public static final NetworkingInterfacesMediaType MT_LOOP = new NetworkingInterfacesMediaType(_MT_LOOP);
    public static final NetworkingInterfacesMediaType MT_NO_PHY = new NetworkingInterfacesMediaType(_MT_NO_PHY);
    public static final NetworkingInterfacesMediaType MT_10T_HALF = new NetworkingInterfacesMediaType(_MT_10T_HALF);
    public static final NetworkingInterfacesMediaType MT_10T_FULL = new NetworkingInterfacesMediaType(_MT_10T_FULL);
    public static final NetworkingInterfacesMediaType MT_100TX_HALF = new NetworkingInterfacesMediaType(_MT_100TX_HALF);
    public static final NetworkingInterfacesMediaType MT_100TX_FULL = new NetworkingInterfacesMediaType(_MT_100TX_FULL);
    public static final NetworkingInterfacesMediaType MT_1000TX_HALF = new NetworkingInterfacesMediaType(_MT_1000TX_HALF);
    public static final NetworkingInterfacesMediaType MT_1000TX_FULL = new NetworkingInterfacesMediaType(_MT_1000TX_FULL);
    public static final NetworkingInterfacesMediaType MT_1000FX_HALF = new NetworkingInterfacesMediaType(_MT_1000FX_HALF);
    public static final NetworkingInterfacesMediaType MT_1000FX_FULL = new NetworkingInterfacesMediaType(_MT_1000FX_FULL);
    public static final NetworkingInterfacesMediaType MT_10000TX_HALF = new NetworkingInterfacesMediaType(_MT_10000TX_HALF);
    public static final NetworkingInterfacesMediaType MT_10000TX_FULL = new NetworkingInterfacesMediaType(_MT_10000TX_FULL);
    public static final NetworkingInterfacesMediaType MT_10000FX_HALF = new NetworkingInterfacesMediaType(_MT_10000FX_HALF);
    public static final NetworkingInterfacesMediaType MT_10000FX_FULL = new NetworkingInterfacesMediaType(_MT_10000FX_FULL);
    public static final NetworkingInterfacesMediaType MT_1000SX_HALF = new NetworkingInterfacesMediaType(_MT_1000SX_HALF);
    public static final NetworkingInterfacesMediaType MT_1000SX_FULL = new NetworkingInterfacesMediaType(_MT_1000SX_FULL);
    public static final NetworkingInterfacesMediaType MT_1000LX_HALF = new NetworkingInterfacesMediaType(_MT_1000LX_HALF);
    public static final NetworkingInterfacesMediaType MT_1000LX_FULL = new NetworkingInterfacesMediaType(_MT_1000LX_FULL);
    public static final NetworkingInterfacesMediaType MT_1000T_HALF = new NetworkingInterfacesMediaType(_MT_1000T_HALF);
    public static final NetworkingInterfacesMediaType MT_1000T_FULL = new NetworkingInterfacesMediaType(_MT_1000T_FULL);
    public static final NetworkingInterfacesMediaType MT_10000T_FULL = new NetworkingInterfacesMediaType(_MT_10000T_FULL);
    public static final NetworkingInterfacesMediaType MT_10000SR_FULL = new NetworkingInterfacesMediaType(_MT_10000SR_FULL);
    public static final NetworkingInterfacesMediaType MT_10000LR_FULL = new NetworkingInterfacesMediaType(_MT_10000LR_FULL);
    public static final NetworkingInterfacesMediaType MT_10000ER_FULL = new NetworkingInterfacesMediaType(_MT_10000ER_FULL);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingInterfacesMediaType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingInterfacesMediaType enumeration = (NetworkingInterfacesMediaType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingInterfacesMediaType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingInterfacesMediaType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.Interfaces.MediaType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
