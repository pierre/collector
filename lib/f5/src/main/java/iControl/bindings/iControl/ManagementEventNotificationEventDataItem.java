/**
 * ManagementEventNotificationEventDataItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventNotificationEventDataItem  implements java.io.Serializable {
    private java.lang.String event_data_name;

    private iControl.ManagementEventNotificationEventDataType event_data_type;

    private java.lang.String event_data_value;

    public ManagementEventNotificationEventDataItem() {
    }

    public ManagementEventNotificationEventDataItem(
           java.lang.String event_data_name,
           iControl.ManagementEventNotificationEventDataType event_data_type,
           java.lang.String event_data_value) {
           this.event_data_name = event_data_name;
           this.event_data_type = event_data_type;
           this.event_data_value = event_data_value;
    }


    /**
     * Gets the event_data_name value for this ManagementEventNotificationEventDataItem.
     * 
     * @return event_data_name
     */
    public java.lang.String getEvent_data_name() {
        return event_data_name;
    }


    /**
     * Sets the event_data_name value for this ManagementEventNotificationEventDataItem.
     * 
     * @param event_data_name
     */
    public void setEvent_data_name(java.lang.String event_data_name) {
        this.event_data_name = event_data_name;
    }


    /**
     * Gets the event_data_type value for this ManagementEventNotificationEventDataItem.
     * 
     * @return event_data_type
     */
    public iControl.ManagementEventNotificationEventDataType getEvent_data_type() {
        return event_data_type;
    }


    /**
     * Sets the event_data_type value for this ManagementEventNotificationEventDataItem.
     * 
     * @param event_data_type
     */
    public void setEvent_data_type(iControl.ManagementEventNotificationEventDataType event_data_type) {
        this.event_data_type = event_data_type;
    }


    /**
     * Gets the event_data_value value for this ManagementEventNotificationEventDataItem.
     * 
     * @return event_data_value
     */
    public java.lang.String getEvent_data_value() {
        return event_data_value;
    }


    /**
     * Sets the event_data_value value for this ManagementEventNotificationEventDataItem.
     * 
     * @param event_data_value
     */
    public void setEvent_data_value(java.lang.String event_data_value) {
        this.event_data_value = event_data_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementEventNotificationEventDataItem)) return false;
        ManagementEventNotificationEventDataItem other = (ManagementEventNotificationEventDataItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.event_data_name==null && other.getEvent_data_name()==null) || 
             (this.event_data_name!=null &&
              this.event_data_name.equals(other.getEvent_data_name()))) &&
            ((this.event_data_type==null && other.getEvent_data_type()==null) || 
             (this.event_data_type!=null &&
              this.event_data_type.equals(other.getEvent_data_type()))) &&
            ((this.event_data_value==null && other.getEvent_data_value()==null) || 
             (this.event_data_value!=null &&
              this.event_data_value.equals(other.getEvent_data_value())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEvent_data_name() != null) {
            _hashCode += getEvent_data_name().hashCode();
        }
        if (getEvent_data_type() != null) {
            _hashCode += getEvent_data_type().hashCode();
        }
        if (getEvent_data_value() != null) {
            _hashCode += getEvent_data_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementEventNotificationEventDataItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventNotification.EventDataItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_data_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_data_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_data_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_data_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventNotification.EventDataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_data_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_data_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
