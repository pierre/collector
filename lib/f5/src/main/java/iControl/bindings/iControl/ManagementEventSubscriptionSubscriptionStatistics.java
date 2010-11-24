/**
 * ManagementEventSubscriptionSubscriptionStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventSubscriptionSubscriptionStatistics  implements java.io.Serializable {
    private java.lang.String id;

    private iControl.CommonTimeStamp time_created;

    private iControl.CommonTimeStamp time_last_modified;

    private iControl.CommonTimeStamp time_last_notified;

    private long notifications_sent;

    private iControl.ManagementEventSubscriptionSubscriptionStatus last_status;

    public ManagementEventSubscriptionSubscriptionStatistics() {
    }

    public ManagementEventSubscriptionSubscriptionStatistics(
           java.lang.String id,
           iControl.CommonTimeStamp time_created,
           iControl.CommonTimeStamp time_last_modified,
           iControl.CommonTimeStamp time_last_notified,
           long notifications_sent,
           iControl.ManagementEventSubscriptionSubscriptionStatus last_status) {
           this.id = id;
           this.time_created = time_created;
           this.time_last_modified = time_last_modified;
           this.time_last_notified = time_last_notified;
           this.notifications_sent = notifications_sent;
           this.last_status = last_status;
    }


    /**
     * Gets the id value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the time_created value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @return time_created
     */
    public iControl.CommonTimeStamp getTime_created() {
        return time_created;
    }


    /**
     * Sets the time_created value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @param time_created
     */
    public void setTime_created(iControl.CommonTimeStamp time_created) {
        this.time_created = time_created;
    }


    /**
     * Gets the time_last_modified value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @return time_last_modified
     */
    public iControl.CommonTimeStamp getTime_last_modified() {
        return time_last_modified;
    }


    /**
     * Sets the time_last_modified value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @param time_last_modified
     */
    public void setTime_last_modified(iControl.CommonTimeStamp time_last_modified) {
        this.time_last_modified = time_last_modified;
    }


    /**
     * Gets the time_last_notified value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @return time_last_notified
     */
    public iControl.CommonTimeStamp getTime_last_notified() {
        return time_last_notified;
    }


    /**
     * Sets the time_last_notified value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @param time_last_notified
     */
    public void setTime_last_notified(iControl.CommonTimeStamp time_last_notified) {
        this.time_last_notified = time_last_notified;
    }


    /**
     * Gets the notifications_sent value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @return notifications_sent
     */
    public long getNotifications_sent() {
        return notifications_sent;
    }


    /**
     * Sets the notifications_sent value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @param notifications_sent
     */
    public void setNotifications_sent(long notifications_sent) {
        this.notifications_sent = notifications_sent;
    }


    /**
     * Gets the last_status value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @return last_status
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus getLast_status() {
        return last_status;
    }


    /**
     * Sets the last_status value for this ManagementEventSubscriptionSubscriptionStatistics.
     * 
     * @param last_status
     */
    public void setLast_status(iControl.ManagementEventSubscriptionSubscriptionStatus last_status) {
        this.last_status = last_status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementEventSubscriptionSubscriptionStatistics)) return false;
        ManagementEventSubscriptionSubscriptionStatistics other = (ManagementEventSubscriptionSubscriptionStatistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.time_created==null && other.getTime_created()==null) || 
             (this.time_created!=null &&
              this.time_created.equals(other.getTime_created()))) &&
            ((this.time_last_modified==null && other.getTime_last_modified()==null) || 
             (this.time_last_modified!=null &&
              this.time_last_modified.equals(other.getTime_last_modified()))) &&
            ((this.time_last_notified==null && other.getTime_last_notified()==null) || 
             (this.time_last_notified!=null &&
              this.time_last_notified.equals(other.getTime_last_notified()))) &&
            this.notifications_sent == other.getNotifications_sent() &&
            ((this.last_status==null && other.getLast_status()==null) || 
             (this.last_status!=null &&
              this.last_status.equals(other.getLast_status())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTime_created() != null) {
            _hashCode += getTime_created().hashCode();
        }
        if (getTime_last_modified() != null) {
            _hashCode += getTime_last_modified().hashCode();
        }
        if (getTime_last_notified() != null) {
            _hashCode += getTime_last_notified().hashCode();
        }
        _hashCode += new Long(getNotifications_sent()).hashCode();
        if (getLast_status() != null) {
            _hashCode += getLast_status().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementEventSubscriptionSubscriptionStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_created"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TimeStamp"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_last_modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_last_modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TimeStamp"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_last_notified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_last_notified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TimeStamp"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications_sent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifications_sent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatus"));
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
