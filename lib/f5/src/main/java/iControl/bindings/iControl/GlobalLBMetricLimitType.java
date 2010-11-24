/**
 * GlobalLBMetricLimitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBMetricLimitType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBMetricLimitType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _METRIC_LIMIT_CPU_USAGE = "METRIC_LIMIT_CPU_USAGE";
    public static final java.lang.String _METRIC_LIMIT_MEMORY_AVAILABLE = "METRIC_LIMIT_MEMORY_AVAILABLE";
    public static final java.lang.String _METRIC_LIMIT_BITS_PER_SECOND = "METRIC_LIMIT_BITS_PER_SECOND";
    public static final java.lang.String _METRIC_LIMIT_PACKETS_PER_SECOND = "METRIC_LIMIT_PACKETS_PER_SECOND";
    public static final java.lang.String _METRIC_LIMIT_CONNECTIONS = "METRIC_LIMIT_CONNECTIONS";
    public static final java.lang.String _METRIC_LIMIT_CONNECTIONS_PER_SECOND = "METRIC_LIMIT_CONNECTIONS_PER_SECOND";
    public static final GlobalLBMetricLimitType METRIC_LIMIT_CPU_USAGE = new GlobalLBMetricLimitType(_METRIC_LIMIT_CPU_USAGE);
    public static final GlobalLBMetricLimitType METRIC_LIMIT_MEMORY_AVAILABLE = new GlobalLBMetricLimitType(_METRIC_LIMIT_MEMORY_AVAILABLE);
    public static final GlobalLBMetricLimitType METRIC_LIMIT_BITS_PER_SECOND = new GlobalLBMetricLimitType(_METRIC_LIMIT_BITS_PER_SECOND);
    public static final GlobalLBMetricLimitType METRIC_LIMIT_PACKETS_PER_SECOND = new GlobalLBMetricLimitType(_METRIC_LIMIT_PACKETS_PER_SECOND);
    public static final GlobalLBMetricLimitType METRIC_LIMIT_CONNECTIONS = new GlobalLBMetricLimitType(_METRIC_LIMIT_CONNECTIONS);
    public static final GlobalLBMetricLimitType METRIC_LIMIT_CONNECTIONS_PER_SECOND = new GlobalLBMetricLimitType(_METRIC_LIMIT_CONNECTIONS_PER_SECOND);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBMetricLimitType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBMetricLimitType enumeration = (GlobalLBMetricLimitType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBMetricLimitType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBMetricLimitType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MetricLimitType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
