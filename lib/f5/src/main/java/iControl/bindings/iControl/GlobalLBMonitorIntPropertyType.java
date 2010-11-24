/**
 * GlobalLBMonitorIntPropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBMonitorIntPropertyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBMonitorIntPropertyType(java.lang.String value) {
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
    public static final GlobalLBMonitorIntPropertyType ITYPE_UNSET = new GlobalLBMonitorIntPropertyType(_ITYPE_UNSET);
    public static final GlobalLBMonitorIntPropertyType ITYPE_INTERVAL = new GlobalLBMonitorIntPropertyType(_ITYPE_INTERVAL);
    public static final GlobalLBMonitorIntPropertyType ITYPE_TIMEOUT = new GlobalLBMonitorIntPropertyType(_ITYPE_TIMEOUT);
    public static final GlobalLBMonitorIntPropertyType ITYPE_PROBE_INTERVAL = new GlobalLBMonitorIntPropertyType(_ITYPE_PROBE_INTERVAL);
    public static final GlobalLBMonitorIntPropertyType ITYPE_PROBE_TIMEOUT = new GlobalLBMonitorIntPropertyType(_ITYPE_PROBE_TIMEOUT);
    public static final GlobalLBMonitorIntPropertyType ITYPE_PROBE_NUM_PROBES = new GlobalLBMonitorIntPropertyType(_ITYPE_PROBE_NUM_PROBES);
    public static final GlobalLBMonitorIntPropertyType ITYPE_PROBE_NUM_SUCCESSES = new GlobalLBMonitorIntPropertyType(_ITYPE_PROBE_NUM_SUCCESSES);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBMonitorIntPropertyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBMonitorIntPropertyType enumeration = (GlobalLBMonitorIntPropertyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBMonitorIntPropertyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBMonitorIntPropertyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Monitor.IntPropertyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
