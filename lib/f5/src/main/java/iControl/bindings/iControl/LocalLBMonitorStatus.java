/**
 * LocalLBMonitorStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBMonitorStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBMonitorStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MONITOR_STATUS_UNCHECKED = "MONITOR_STATUS_UNCHECKED";
    public static final java.lang.String _MONITOR_STATUS_CHECKING = "MONITOR_STATUS_CHECKING";
    public static final java.lang.String _MONITOR_STATUS_UP = "MONITOR_STATUS_UP";
    public static final java.lang.String _MONITOR_STATUS_DOWN = "MONITOR_STATUS_DOWN";
    public static final java.lang.String _MONITOR_STATUS_FORCED_DOWN = "MONITOR_STATUS_FORCED_DOWN";
    public static final java.lang.String _MONITOR_STATUS_MAINT = "MONITOR_STATUS_MAINT";
    public static final java.lang.String _MONITOR_STATUS_ADDRESS_DOWN = "MONITOR_STATUS_ADDRESS_DOWN";
    public static final java.lang.String _MONITOR_STATUS_DOWN_BY_IRULE = "MONITOR_STATUS_DOWN_BY_IRULE";
    public static final java.lang.String _MONITOR_STATUS_DOWN_WAIT_FOR_MANUAL_RESUME = "MONITOR_STATUS_DOWN_WAIT_FOR_MANUAL_RESUME";
    public static final LocalLBMonitorStatus MONITOR_STATUS_UNCHECKED = new LocalLBMonitorStatus(_MONITOR_STATUS_UNCHECKED);
    public static final LocalLBMonitorStatus MONITOR_STATUS_CHECKING = new LocalLBMonitorStatus(_MONITOR_STATUS_CHECKING);
    public static final LocalLBMonitorStatus MONITOR_STATUS_UP = new LocalLBMonitorStatus(_MONITOR_STATUS_UP);
    public static final LocalLBMonitorStatus MONITOR_STATUS_DOWN = new LocalLBMonitorStatus(_MONITOR_STATUS_DOWN);
    public static final LocalLBMonitorStatus MONITOR_STATUS_FORCED_DOWN = new LocalLBMonitorStatus(_MONITOR_STATUS_FORCED_DOWN);
    public static final LocalLBMonitorStatus MONITOR_STATUS_MAINT = new LocalLBMonitorStatus(_MONITOR_STATUS_MAINT);
    public static final LocalLBMonitorStatus MONITOR_STATUS_ADDRESS_DOWN = new LocalLBMonitorStatus(_MONITOR_STATUS_ADDRESS_DOWN);
    public static final LocalLBMonitorStatus MONITOR_STATUS_DOWN_BY_IRULE = new LocalLBMonitorStatus(_MONITOR_STATUS_DOWN_BY_IRULE);
    public static final LocalLBMonitorStatus MONITOR_STATUS_DOWN_WAIT_FOR_MANUAL_RESUME = new LocalLBMonitorStatus(_MONITOR_STATUS_DOWN_WAIT_FOR_MANUAL_RESUME);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBMonitorStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBMonitorStatus enumeration = (LocalLBMonitorStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBMonitorStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBMonitorStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
