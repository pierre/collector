/**
 * SystemFailoverFailoverState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemFailoverFailoverState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemFailoverFailoverState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FAILOVER_STATE_STANDBY = "FAILOVER_STATE_STANDBY";
    public static final java.lang.String _FAILOVER_STATE_ACTIVE = "FAILOVER_STATE_ACTIVE";
    public static final java.lang.String _FAILOVER_STATE_FORCED_OFFLINE = "FAILOVER_STATE_FORCED_OFFLINE";
    public static final java.lang.String _FAILOVER_STATE_OFFLINE = "FAILOVER_STATE_OFFLINE";
    public static final java.lang.String _FAILOVER_STATE_UNKNOWN = "FAILOVER_STATE_UNKNOWN";
    public static final SystemFailoverFailoverState FAILOVER_STATE_STANDBY = new SystemFailoverFailoverState(_FAILOVER_STATE_STANDBY);
    public static final SystemFailoverFailoverState FAILOVER_STATE_ACTIVE = new SystemFailoverFailoverState(_FAILOVER_STATE_ACTIVE);
    public static final SystemFailoverFailoverState FAILOVER_STATE_FORCED_OFFLINE = new SystemFailoverFailoverState(_FAILOVER_STATE_FORCED_OFFLINE);
    public static final SystemFailoverFailoverState FAILOVER_STATE_OFFLINE = new SystemFailoverFailoverState(_FAILOVER_STATE_OFFLINE);
    public static final SystemFailoverFailoverState FAILOVER_STATE_UNKNOWN = new SystemFailoverFailoverState(_FAILOVER_STATE_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SystemFailoverFailoverState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemFailoverFailoverState enumeration = (SystemFailoverFailoverState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemFailoverFailoverState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemFailoverFailoverState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Failover.FailoverState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
