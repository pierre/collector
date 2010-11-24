/**
 * LocalLBTCPCongestionControlMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBTCPCongestionControlMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBTCPCongestionControlMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TCP_CONGESTION_CONTROL_NONE = "TCP_CONGESTION_CONTROL_NONE";
    public static final java.lang.String _TCP_CONGESTION_CONTROL_RENO = "TCP_CONGESTION_CONTROL_RENO";
    public static final java.lang.String _TCP_CONGESTION_CONTROL_NEWRENO = "TCP_CONGESTION_CONTROL_NEWRENO";
    public static final java.lang.String _TCP_CONGESTION_CONTROL_SCALABLE = "TCP_CONGESTION_CONTROL_SCALABLE";
    public static final java.lang.String _TCP_CONGESTION_CONTROL_HIGHSPEED = "TCP_CONGESTION_CONTROL_HIGHSPEED";
    public static final LocalLBTCPCongestionControlMode TCP_CONGESTION_CONTROL_NONE = new LocalLBTCPCongestionControlMode(_TCP_CONGESTION_CONTROL_NONE);
    public static final LocalLBTCPCongestionControlMode TCP_CONGESTION_CONTROL_RENO = new LocalLBTCPCongestionControlMode(_TCP_CONGESTION_CONTROL_RENO);
    public static final LocalLBTCPCongestionControlMode TCP_CONGESTION_CONTROL_NEWRENO = new LocalLBTCPCongestionControlMode(_TCP_CONGESTION_CONTROL_NEWRENO);
    public static final LocalLBTCPCongestionControlMode TCP_CONGESTION_CONTROL_SCALABLE = new LocalLBTCPCongestionControlMode(_TCP_CONGESTION_CONTROL_SCALABLE);
    public static final LocalLBTCPCongestionControlMode TCP_CONGESTION_CONTROL_HIGHSPEED = new LocalLBTCPCongestionControlMode(_TCP_CONGESTION_CONTROL_HIGHSPEED);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBTCPCongestionControlMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBTCPCongestionControlMode enumeration = (LocalLBTCPCongestionControlMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBTCPCongestionControlMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBTCPCongestionControlMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.TCPCongestionControlMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
