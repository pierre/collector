/**
 * ManagementEventNotificationEventDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventNotificationEventDataType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementEventNotificationEventDataType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DATATYPE_BITS = "DATATYPE_BITS";
    public static final java.lang.String _DATATYPE_BLOB = "DATATYPE_BLOB";
    public static final java.lang.String _DATATYPE_BOOL = "DATATYPE_BOOL";
    public static final java.lang.String _DATATYPE_BYTE = "DATATYPE_BYTE";
    public static final java.lang.String _DATATYPE_DATE = "DATATYPE_DATE";
    public static final java.lang.String _DATATYPE_IP_ADDRESS = "DATATYPE_IP_ADDRESS";
    public static final java.lang.String _DATATYPE_LONG = "DATATYPE_LONG";
    public static final java.lang.String _DATATYPE_MAC = "DATATYPE_MAC";
    public static final java.lang.String _DATATYPE_PTR = "DATATYPE_PTR";
    public static final java.lang.String _DATATYPE_SERVICE = "DATATYPE_SERVICE";
    public static final java.lang.String _DATATYPE_STRING = "DATATYPE_STRING";
    public static final java.lang.String _DATATYPE_TAG = "DATATYPE_TAG";
    public static final java.lang.String _DATATYPE_TIME = "DATATYPE_TIME";
    public static final java.lang.String _DATATYPE_ULONG = "DATATYPE_ULONG";
    public static final java.lang.String _DATATYPE_UWORD = "DATATYPE_UWORD";
    public static final java.lang.String _DATATYPE_UQUAD = "DATATYPE_UQUAD";
    public static final ManagementEventNotificationEventDataType DATATYPE_BITS = new ManagementEventNotificationEventDataType(_DATATYPE_BITS);
    public static final ManagementEventNotificationEventDataType DATATYPE_BLOB = new ManagementEventNotificationEventDataType(_DATATYPE_BLOB);
    public static final ManagementEventNotificationEventDataType DATATYPE_BOOL = new ManagementEventNotificationEventDataType(_DATATYPE_BOOL);
    public static final ManagementEventNotificationEventDataType DATATYPE_BYTE = new ManagementEventNotificationEventDataType(_DATATYPE_BYTE);
    public static final ManagementEventNotificationEventDataType DATATYPE_DATE = new ManagementEventNotificationEventDataType(_DATATYPE_DATE);
    public static final ManagementEventNotificationEventDataType DATATYPE_IP_ADDRESS = new ManagementEventNotificationEventDataType(_DATATYPE_IP_ADDRESS);
    public static final ManagementEventNotificationEventDataType DATATYPE_LONG = new ManagementEventNotificationEventDataType(_DATATYPE_LONG);
    public static final ManagementEventNotificationEventDataType DATATYPE_MAC = new ManagementEventNotificationEventDataType(_DATATYPE_MAC);
    public static final ManagementEventNotificationEventDataType DATATYPE_PTR = new ManagementEventNotificationEventDataType(_DATATYPE_PTR);
    public static final ManagementEventNotificationEventDataType DATATYPE_SERVICE = new ManagementEventNotificationEventDataType(_DATATYPE_SERVICE);
    public static final ManagementEventNotificationEventDataType DATATYPE_STRING = new ManagementEventNotificationEventDataType(_DATATYPE_STRING);
    public static final ManagementEventNotificationEventDataType DATATYPE_TAG = new ManagementEventNotificationEventDataType(_DATATYPE_TAG);
    public static final ManagementEventNotificationEventDataType DATATYPE_TIME = new ManagementEventNotificationEventDataType(_DATATYPE_TIME);
    public static final ManagementEventNotificationEventDataType DATATYPE_ULONG = new ManagementEventNotificationEventDataType(_DATATYPE_ULONG);
    public static final ManagementEventNotificationEventDataType DATATYPE_UWORD = new ManagementEventNotificationEventDataType(_DATATYPE_UWORD);
    public static final ManagementEventNotificationEventDataType DATATYPE_UQUAD = new ManagementEventNotificationEventDataType(_DATATYPE_UQUAD);
    public java.lang.String getValue() { return _value_;}
    public static ManagementEventNotificationEventDataType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementEventNotificationEventDataType enumeration = (ManagementEventNotificationEventDataType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementEventNotificationEventDataType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementEventNotificationEventDataType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventNotification.EventDataType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
