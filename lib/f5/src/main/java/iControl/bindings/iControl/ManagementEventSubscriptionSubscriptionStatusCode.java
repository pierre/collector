/**
 * ManagementEventSubscriptionSubscriptionStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventSubscriptionSubscriptionStatusCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementEventSubscriptionSubscriptionStatusCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _E_OK = "E_OK";
    public static final java.lang.String _E_GENERAL_ERROR = "E_GENERAL_ERROR";
    public static final java.lang.String _E_INVALID_EVENT_TYPE = "E_INVALID_EVENT_TYPE";
    public static final java.lang.String _E_INVALID_ID = "E_INVALID_ID";
    public static final java.lang.String _E_INVALID_URL = "E_INVALID_URL";
    public static final java.lang.String _E_INVALID_USERNAME = "E_INVALID_USERNAME";
    public static final java.lang.String _E_INVALID_PASSWORD = "E_INVALID_PASSWORD";
    public static final java.lang.String _E_INVALID_TTL = "E_INVALID_TTL";
    public static final java.lang.String _E_INVALID_MIN_EVENTS_PER_TIMESLICE = "E_INVALID_MIN_EVENTS_PER_TIMESLICE";
    public static final java.lang.String _E_INVALID_MAX_TIMESLICE = "E_INVALID_MAX_TIMESLICE";
    public static final java.lang.String _E_INVALID_ENABLED_STATE = "E_INVALID_ENABLED_STATE";
    public static final java.lang.String _E_CONNECTION_REFUSED = "E_CONNECTION_REFUSED";
    public static final java.lang.String _E_CONNECTION_TIMEDOUT = "E_CONNECTION_TIMEDOUT";
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_OK = new ManagementEventSubscriptionSubscriptionStatusCode(_E_OK);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_GENERAL_ERROR = new ManagementEventSubscriptionSubscriptionStatusCode(_E_GENERAL_ERROR);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_EVENT_TYPE = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_EVENT_TYPE);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_ID = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_ID);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_URL = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_URL);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_USERNAME = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_USERNAME);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_PASSWORD = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_PASSWORD);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_TTL = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_TTL);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_MIN_EVENTS_PER_TIMESLICE = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_MIN_EVENTS_PER_TIMESLICE);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_MAX_TIMESLICE = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_MAX_TIMESLICE);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_INVALID_ENABLED_STATE = new ManagementEventSubscriptionSubscriptionStatusCode(_E_INVALID_ENABLED_STATE);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_CONNECTION_REFUSED = new ManagementEventSubscriptionSubscriptionStatusCode(_E_CONNECTION_REFUSED);
    public static final ManagementEventSubscriptionSubscriptionStatusCode E_CONNECTION_TIMEDOUT = new ManagementEventSubscriptionSubscriptionStatusCode(_E_CONNECTION_TIMEDOUT);
    public java.lang.String getValue() { return _value_;}
    public static ManagementEventSubscriptionSubscriptionStatusCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementEventSubscriptionSubscriptionStatusCode enumeration = (ManagementEventSubscriptionSubscriptionStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementEventSubscriptionSubscriptionStatusCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementEventSubscriptionSubscriptionStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
