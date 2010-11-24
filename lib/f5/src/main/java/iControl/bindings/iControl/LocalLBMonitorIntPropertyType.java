/**
 * LocalLBMonitorIntPropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBMonitorIntPropertyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocalLBMonitorIntPropertyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ITYPE_UNSET = "ITYPE_UNSET";
    public static final java.lang.String _ITYPE_INTERVAL = "ITYPE_INTERVAL";
    public static final java.lang.String _ITYPE_TIMEOUT = "ITYPE_TIMEOUT";
    public static final java.lang.String _ITYPE_PROBE_INTERVAL = "ITYPE_PROBE_INTERVAL";
    public static final java.lang.String _ITYPE_PROBE_TIMEOUT = "ITYPE_PROBE_TIMEOUT";
    public static final java.lang.String _ITYPE_PROBE_NUM_PROBES = "ITYPE_PROBE_NUM_PROBES";
    public static final java.lang.String _ITYPE_PROBE_NUM_SUCCESSES = "ITYPE_PROBE_NUM_SUCCESSES";
    public static final java.lang.String _ITYPE_TIME_UNTIL_UP = "ITYPE_TIME_UNTIL_UP";
    public static final java.lang.String _ITYPE_UP_INTERVAL = "ITYPE_UP_INTERVAL";
    public static final LocalLBMonitorIntPropertyType ITYPE_UNSET = new LocalLBMonitorIntPropertyType(_ITYPE_UNSET);
    public static final LocalLBMonitorIntPropertyType ITYPE_INTERVAL = new LocalLBMonitorIntPropertyType(_ITYPE_INTERVAL);
    public static final LocalLBMonitorIntPropertyType ITYPE_TIMEOUT = new LocalLBMonitorIntPropertyType(_ITYPE_TIMEOUT);
    public static final LocalLBMonitorIntPropertyType ITYPE_PROBE_INTERVAL = new LocalLBMonitorIntPropertyType(_ITYPE_PROBE_INTERVAL);
    public static final LocalLBMonitorIntPropertyType ITYPE_PROBE_TIMEOUT = new LocalLBMonitorIntPropertyType(_ITYPE_PROBE_TIMEOUT);
    public static final LocalLBMonitorIntPropertyType ITYPE_PROBE_NUM_PROBES = new LocalLBMonitorIntPropertyType(_ITYPE_PROBE_NUM_PROBES);
    public static final LocalLBMonitorIntPropertyType ITYPE_PROBE_NUM_SUCCESSES = new LocalLBMonitorIntPropertyType(_ITYPE_PROBE_NUM_SUCCESSES);
    public static final LocalLBMonitorIntPropertyType ITYPE_TIME_UNTIL_UP = new LocalLBMonitorIntPropertyType(_ITYPE_TIME_UNTIL_UP);
    public static final LocalLBMonitorIntPropertyType ITYPE_UP_INTERVAL = new LocalLBMonitorIntPropertyType(_ITYPE_UP_INTERVAL);
    public java.lang.String getValue() { return _value_;}
    public static LocalLBMonitorIntPropertyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocalLBMonitorIntPropertyType enumeration = (LocalLBMonitorIntPropertyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocalLBMonitorIntPropertyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocalLBMonitorIntPropertyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Monitor.IntPropertyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
