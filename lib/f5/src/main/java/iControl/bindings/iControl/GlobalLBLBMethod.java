/**
 * GlobalLBLBMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBLBMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBLBMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LB_METHOD_RETURN_TO_DNS = "LB_METHOD_RETURN_TO_DNS";
    public static final java.lang.String _LB_METHOD_NULL = "LB_METHOD_NULL";
    public static final java.lang.String _LB_METHOD_ROUND_ROBIN = "LB_METHOD_ROUND_ROBIN";
    public static final java.lang.String _LB_METHOD_RATIO = "LB_METHOD_RATIO";
    public static final java.lang.String _LB_METHOD_TOPOLOGY = "LB_METHOD_TOPOLOGY";
    public static final java.lang.String _LB_METHOD_STATIC_PERSIST = "LB_METHOD_STATIC_PERSIST";
    public static final java.lang.String _LB_METHOD_GLOBAL_AVAILABILITY = "LB_METHOD_GLOBAL_AVAILABILITY";
    public static final java.lang.String _LB_METHOD_VS_CAPACITY = "LB_METHOD_VS_CAPACITY";
    public static final java.lang.String _LB_METHOD_LEAST_CONN = "LB_METHOD_LEAST_CONN";
    public static final java.lang.String _LB_METHOD_LOWEST_RTT = "LB_METHOD_LOWEST_RTT";
    public static final java.lang.String _LB_METHOD_LOWEST_HOPS = "LB_METHOD_LOWEST_HOPS";
    public static final java.lang.String _LB_METHOD_PACKET_RATE = "LB_METHOD_PACKET_RATE";
    public static final java.lang.String _LB_METHOD_CPU = "LB_METHOD_CPU";
    public static final java.lang.String _LB_METHOD_HIT_RATIO = "LB_METHOD_HIT_RATIO";
    public static final java.lang.String _LB_METHOD_QOS = "LB_METHOD_QOS";
    public static final java.lang.String _LB_METHOD_BPS = "LB_METHOD_BPS";
    public static final java.lang.String _LB_METHOD_DROP_PACKET = "LB_METHOD_DROP_PACKET";
    public static final java.lang.String _LB_METHOD_EXPLICIT_IP = "LB_METHOD_EXPLICIT_IP";
    public static final java.lang.String _LB_METHOD_CONNECTION_RATE = "LB_METHOD_CONNECTION_RATE";
    public static final java.lang.String _LB_METHOD_VS_SCORE = "LB_METHOD_VS_SCORE";
    public static final GlobalLBLBMethod LB_METHOD_RETURN_TO_DNS = new GlobalLBLBMethod(_LB_METHOD_RETURN_TO_DNS);
    public static final GlobalLBLBMethod LB_METHOD_NULL = new GlobalLBLBMethod(_LB_METHOD_NULL);
    public static final GlobalLBLBMethod LB_METHOD_ROUND_ROBIN = new GlobalLBLBMethod(_LB_METHOD_ROUND_ROBIN);
    public static final GlobalLBLBMethod LB_METHOD_RATIO = new GlobalLBLBMethod(_LB_METHOD_RATIO);
    public static final GlobalLBLBMethod LB_METHOD_TOPOLOGY = new GlobalLBLBMethod(_LB_METHOD_TOPOLOGY);
    public static final GlobalLBLBMethod LB_METHOD_STATIC_PERSIST = new GlobalLBLBMethod(_LB_METHOD_STATIC_PERSIST);
    public static final GlobalLBLBMethod LB_METHOD_GLOBAL_AVAILABILITY = new GlobalLBLBMethod(_LB_METHOD_GLOBAL_AVAILABILITY);
    public static final GlobalLBLBMethod LB_METHOD_VS_CAPACITY = new GlobalLBLBMethod(_LB_METHOD_VS_CAPACITY);
    public static final GlobalLBLBMethod LB_METHOD_LEAST_CONN = new GlobalLBLBMethod(_LB_METHOD_LEAST_CONN);
    public static final GlobalLBLBMethod LB_METHOD_LOWEST_RTT = new GlobalLBLBMethod(_LB_METHOD_LOWEST_RTT);
    public static final GlobalLBLBMethod LB_METHOD_LOWEST_HOPS = new GlobalLBLBMethod(_LB_METHOD_LOWEST_HOPS);
    public static final GlobalLBLBMethod LB_METHOD_PACKET_RATE = new GlobalLBLBMethod(_LB_METHOD_PACKET_RATE);
    public static final GlobalLBLBMethod LB_METHOD_CPU = new GlobalLBLBMethod(_LB_METHOD_CPU);
    public static final GlobalLBLBMethod LB_METHOD_HIT_RATIO = new GlobalLBLBMethod(_LB_METHOD_HIT_RATIO);
    public static final GlobalLBLBMethod LB_METHOD_QOS = new GlobalLBLBMethod(_LB_METHOD_QOS);
    public static final GlobalLBLBMethod LB_METHOD_BPS = new GlobalLBLBMethod(_LB_METHOD_BPS);
    public static final GlobalLBLBMethod LB_METHOD_DROP_PACKET = new GlobalLBLBMethod(_LB_METHOD_DROP_PACKET);
    public static final GlobalLBLBMethod LB_METHOD_EXPLICIT_IP = new GlobalLBLBMethod(_LB_METHOD_EXPLICIT_IP);
    public static final GlobalLBLBMethod LB_METHOD_CONNECTION_RATE = new GlobalLBLBMethod(_LB_METHOD_CONNECTION_RATE);
    public static final GlobalLBLBMethod LB_METHOD_VS_SCORE = new GlobalLBLBMethod(_LB_METHOD_VS_SCORE);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBLBMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBLBMethod enumeration = (GlobalLBLBMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBLBMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBLBMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.LBMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
