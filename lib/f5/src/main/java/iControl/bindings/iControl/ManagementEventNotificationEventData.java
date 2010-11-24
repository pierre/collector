/**
 * ManagementEventNotificationEventData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventNotificationEventData  implements java.io.Serializable {
    private java.lang.String username;

    private long sequence_number;

    private iControl.ManagementEventSubscriptionEventType event_type;

    private iControl.ManagementEventSubscriptionObjectType object_type;

    private iControl.ManagementEventNotificationEventDataItem[] event_data_item_list;

    public ManagementEventNotificationEventData() {
    }

    public ManagementEventNotificationEventData(
           java.lang.String username,
           long sequence_number,
           iControl.ManagementEventSubscriptionEventType event_type,
           iControl.ManagementEventSubscriptionObjectType object_type,
           iControl.ManagementEventNotificationEventDataItem[] event_data_item_list) {
           this.username = username;
           this.sequence_number = sequence_number;
           this.event_type = event_type;
           this.object_type = object_type;
           this.event_data_item_list = event_data_item_list;
    }


    /**
     * Gets the username value for this ManagementEventNotificationEventData.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ManagementEventNotificationEventData.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the sequence_number value for this ManagementEventNotificationEventData.
     * 
     * @return sequence_number
     */
    public long getSequence_number() {
        return sequence_number;
    }


    /**
     * Sets the sequence_number value for this ManagementEventNotificationEventData.
     * 
     * @param sequence_number
     */
    public void setSequence_number(long sequence_number) {
        this.sequence_number = sequence_number;
    }


    /**
     * Gets the event_type value for this ManagementEventNotificationEventData.
     * 
     * @return event_type
     */
    public iControl.ManagementEventSubscriptionEventType getEvent_type() {
        return event_type;
    }


    /**
     * Sets the event_type value for this ManagementEventNotificationEventData.
     * 
     * @param event_type
     */
    public void setEvent_type(iControl.ManagementEventSubscriptionEventType event_type) {
        this.event_type = event_type;
    }


    /**
     * Gets the object_type value for this ManagementEventNotificationEventData.
     * 
     * @return object_type
     */
    public iControl.ManagementEventSubscriptionObjectType getObject_type() {
        return object_type;
    }


    /**
     * Sets the object_type value for this ManagementEventNotificationEventData.
     * 
     * @param object_type
     */
    public void setObject_type(iControl.ManagementEventSubscriptionObjectType object_type) {
        this.object_type = object_type;
    }


    /**
     * Gets the event_data_item_list value for this ManagementEventNotificationEventData.
     * 
     * @return event_data_item_list
     */
    public iControl.ManagementEventNotificationEventDataItem[] getEvent_data_item_list() {
        return event_data_item_list;
    }


    /**
     * Sets the event_data_item_list value for this ManagementEventNotificationEventData.
     * 
     * @param event_data_item_list
     */
    public void setEvent_data_item_list(iControl.ManagementEventNotificationEventDataItem[] event_data_item_list) {
        this.event_data_item_list = event_data_item_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementEventNotificationEventData)) return false;
        ManagementEventNotificationEventData other = (ManagementEventNotificationEventData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            this.sequence_number == other.getSequence_number() &&
            ((this.event_type==null && other.getEvent_type()==null) || 
             (this.event_type!=null &&
              this.event_type.equals(other.getEvent_type()))) &&
            ((this.object_type==null && other.getObject_type()==null) || 
             (this.object_type!=null &&
              this.object_type.equals(other.getObject_type()))) &&
            ((this.event_data_item_list==null && other.getEvent_data_item_list()==null) || 
             (this.event_data_item_list!=null &&
              java.util.Arrays.equals(this.event_data_item_list, other.getEvent_data_item_list())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        _hashCode += new Long(getSequence_number()).hashCode();
        if (getEvent_type() != null) {
            _hashCode += getEvent_type().hashCode();
        }
        if (getObject_type() != null) {
            _hashCode += getObject_type().hashCode();
        }
        if (getEvent_data_item_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvent_data_item_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvent_data_item_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementEventNotificationEventData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventNotification.EventData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.EventType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "object_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.ObjectType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_data_item_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_data_item_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventNotification.EventDataItem"));
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
