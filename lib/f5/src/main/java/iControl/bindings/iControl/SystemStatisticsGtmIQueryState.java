/**
 * SystemStatisticsGtmIQueryState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemStatisticsGtmIQueryState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemStatisticsGtmIQueryState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IQUERY_STATE_UNCONNECTED = "IQUERY_STATE_UNCONNECTED";
    public static final java.lang.String _IQUERY_STATE_CONNECTING = "IQUERY_STATE_CONNECTING";
    public static final java.lang.String _IQUERY_STATE_CONNECTED = "IQUERY_STATE_CONNECTED";
    public static final java.lang.String _IQUERY_STATE_BACKLOGGED = "IQUERY_STATE_BACKLOGGED";
    public static final SystemStatisticsGtmIQueryState IQUERY_STATE_UNCONNECTED = new SystemStatisticsGtmIQueryState(_IQUERY_STATE_UNCONNECTED);
    public static final SystemStatisticsGtmIQueryState IQUERY_STATE_CONNECTING = new SystemStatisticsGtmIQueryState(_IQUERY_STATE_CONNECTING);
    public static final SystemStatisticsGtmIQueryState IQUERY_STATE_CONNECTED = new SystemStatisticsGtmIQueryState(_IQUERY_STATE_CONNECTED);
    public static final SystemStatisticsGtmIQueryState IQUERY_STATE_BACKLOGGED = new SystemStatisticsGtmIQueryState(_IQUERY_STATE_BACKLOGGED);
    public java.lang.String getValue() { return _value_;}
    public static SystemStatisticsGtmIQueryState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemStatisticsGtmIQueryState enumeration = (SystemStatisticsGtmIQueryState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemStatisticsGtmIQueryState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemStatisticsGtmIQueryState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Statistics.GtmIQueryState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
