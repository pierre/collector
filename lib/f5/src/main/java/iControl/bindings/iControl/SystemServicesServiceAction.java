/**
 * SystemServicesServiceAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemServicesServiceAction implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemServicesServiceAction(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SERVICE_ACTION_START = "SERVICE_ACTION_START";
    public static final java.lang.String _SERVICE_ACTION_STOP = "SERVICE_ACTION_STOP";
    public static final java.lang.String _SERVICE_ACTION_REINIT = "SERVICE_ACTION_REINIT";
    public static final java.lang.String _SERVICE_ACTION_RESTART = "SERVICE_ACTION_RESTART";
    public static final java.lang.String _SERVICE_ACTION_ADD_TO_BOOT_LIST = "SERVICE_ACTION_ADD_TO_BOOT_LIST";
    public static final java.lang.String _SERVICE_ACTION_REMOVE_FROM_BOOT_LIST = "SERVICE_ACTION_REMOVE_FROM_BOOT_LIST";
    public static final java.lang.String _SERVICE_ACTION_ADD_TO_DEFAULT_LIST = "SERVICE_ACTION_ADD_TO_DEFAULT_LIST";
    public static final java.lang.String _SERVICE_ACTION_REMOVE_FROM_DEFAULT_LIST = "SERVICE_ACTION_REMOVE_FROM_DEFAULT_LIST";
    public static final SystemServicesServiceAction SERVICE_ACTION_START = new SystemServicesServiceAction(_SERVICE_ACTION_START);
    public static final SystemServicesServiceAction SERVICE_ACTION_STOP = new SystemServicesServiceAction(_SERVICE_ACTION_STOP);
    public static final SystemServicesServiceAction SERVICE_ACTION_REINIT = new SystemServicesServiceAction(_SERVICE_ACTION_REINIT);
    public static final SystemServicesServiceAction SERVICE_ACTION_RESTART = new SystemServicesServiceAction(_SERVICE_ACTION_RESTART);
    public static final SystemServicesServiceAction SERVICE_ACTION_ADD_TO_BOOT_LIST = new SystemServicesServiceAction(_SERVICE_ACTION_ADD_TO_BOOT_LIST);
    public static final SystemServicesServiceAction SERVICE_ACTION_REMOVE_FROM_BOOT_LIST = new SystemServicesServiceAction(_SERVICE_ACTION_REMOVE_FROM_BOOT_LIST);
    public static final SystemServicesServiceAction SERVICE_ACTION_ADD_TO_DEFAULT_LIST = new SystemServicesServiceAction(_SERVICE_ACTION_ADD_TO_DEFAULT_LIST);
    public static final SystemServicesServiceAction SERVICE_ACTION_REMOVE_FROM_DEFAULT_LIST = new SystemServicesServiceAction(_SERVICE_ACTION_REMOVE_FROM_DEFAULT_LIST);
    public java.lang.String getValue() { return _value_;}
    public static SystemServicesServiceAction fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemServicesServiceAction enumeration = (SystemServicesServiceAction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemServicesServiceAction fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemServicesServiceAction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Services.ServiceAction"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
