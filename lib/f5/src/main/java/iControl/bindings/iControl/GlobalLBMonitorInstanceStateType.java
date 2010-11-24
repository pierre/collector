/**
 * GlobalLBMonitorInstanceStateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBMonitorInstanceStateType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBMonitorInstanceStateType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INSTANCE_STATE_UNCHECKED = "INSTANCE_STATE_UNCHECKED";
    public static final java.lang.String _INSTANCE_STATE_CHECKING = "INSTANCE_STATE_CHECKING";
    public static final java.lang.String _INSTANCE_STATE_UP = "INSTANCE_STATE_UP";
    public static final java.lang.String _INSTANCE_STATE_DOWN = "INSTANCE_STATE_DOWN";
    public static final java.lang.String _INSTANCE_STATE_FORCED_DOWN = "INSTANCE_STATE_FORCED_DOWN";
    public static final java.lang.String _INSTANCE_STATE_DISABLED = "INSTANCE_STATE_DISABLED";
    public static final java.lang.String _INSTANCE_STATE_DOWN_BY_IRULE = "INSTANCE_STATE_DOWN_BY_IRULE";
    public static final java.lang.String _INSTANCE_STATE_DOWN_WAIT_FOR_MANUAL_RESUME = "INSTANCE_STATE_DOWN_WAIT_FOR_MANUAL_RESUME";
    public static final GlobalLBMonitorInstanceStateType INSTANCE_STATE_UNCHECKED = new GlobalLBMonitorInstanceStateType(_INSTANCE_STATE_UNCHECKED);
    public static final GlobalLBMonitorInstanceStateType INSTANCE_STATE_CHECKING = new GlobalLBMonitorInstanceStateType(_INSTANCE_STATE_CHECKING);
    public static final GlobalLBMonitorInstanceStateType INSTANCE_STATE_UP = new GlobalLBMonitorInstanceStateType(_INSTANCE_STATE_UP);
    public static final GlobalLBMonitorInstanceStateType INSTANCE_STATE_DOWN = new GlobalLBMonitorInstanceStateType(_INSTANCE_STATE_DOWN);
    public static final GlobalLBMonitorInstanceStateType INSTANCE_STATE_FORCED_DOWN = new GlobalLBMonitorInstanceStateType(_INSTANCE_STATE_FORCED_DOWN);
    public static final GlobalLBMonitorInstanceStateType INSTANCE_STATE_DISABLED = new GlobalLBMonitorInstanceStateType(_INSTANCE_STATE_DISABLED);
    public static final GlobalLBMonitorInstanceStateType INSTANCE_STATE_DOWN_BY_IRULE = new GlobalLBMonitorInstanceStateType(_INSTANCE_STATE_DOWN_BY_IRULE);
    public static final GlobalLBMonitorInstanceStateType INSTANCE_STATE_DOWN_WAIT_FOR_MANUAL_RESUME = new GlobalLBMonitorInstanceStateType(_INSTANCE_STATE_DOWN_WAIT_FOR_MANUAL_RESUME);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBMonitorInstanceStateType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBMonitorInstanceStateType enumeration = (GlobalLBMonitorInstanceStateType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBMonitorInstanceStateType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalLBMonitorInstanceStateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorInstanceStateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
