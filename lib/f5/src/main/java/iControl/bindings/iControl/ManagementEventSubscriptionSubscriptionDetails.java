/**
 * ManagementEventSubscriptionSubscriptionDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventSubscriptionSubscriptionDetails  implements java.io.Serializable {
    private java.lang.String name;

    private iControl.ManagementEventSubscriptionEventType[] event_type_list;

    private java.lang.String url;

    private iControl.ManagementEventSubscriptionUserCredential url_credentials;

    private long ttl;

    private long min_events_per_timeslice;

    private long max_timeslice;

    private iControl.CommonEnabledState enabled_state;

    public ManagementEventSubscriptionSubscriptionDetails() {
    }

    public ManagementEventSubscriptionSubscriptionDetails(
           java.lang.String name,
           iControl.ManagementEventSubscriptionEventType[] event_type_list,
           java.lang.String url,
           iControl.ManagementEventSubscriptionUserCredential url_credentials,
           long ttl,
           long min_events_per_timeslice,
           long max_timeslice,
           iControl.CommonEnabledState enabled_state) {
           this.name = name;
           this.event_type_list = event_type_list;
           this.url = url;
           this.url_credentials = url_credentials;
           this.ttl = ttl;
           this.min_events_per_timeslice = min_events_per_timeslice;
           this.max_timeslice = max_timeslice;
           this.enabled_state = enabled_state;
    }


    /**
     * Gets the name value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the event_type_list value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @return event_type_list
     */
    public iControl.ManagementEventSubscriptionEventType[] getEvent_type_list() {
        return event_type_list;
    }


    /**
     * Sets the event_type_list value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @param event_type_list
     */
    public void setEvent_type_list(iControl.ManagementEventSubscriptionEventType[] event_type_list) {
        this.event_type_list = event_type_list;
    }


    /**
     * Gets the url value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the url_credentials value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @return url_credentials
     */
    public iControl.ManagementEventSubscriptionUserCredential getUrl_credentials() {
        return url_credentials;
    }


    /**
     * Sets the url_credentials value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @param url_credentials
     */
    public void setUrl_credentials(iControl.ManagementEventSubscriptionUserCredential url_credentials) {
        this.url_credentials = url_credentials;
    }


    /**
     * Gets the ttl value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @return ttl
     */
    public long getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @param ttl
     */
    public void setTtl(long ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the min_events_per_timeslice value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @return min_events_per_timeslice
     */
    public long getMin_events_per_timeslice() {
        return min_events_per_timeslice;
    }


    /**
     * Sets the min_events_per_timeslice value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @param min_events_per_timeslice
     */
    public void setMin_events_per_timeslice(long min_events_per_timeslice) {
        this.min_events_per_timeslice = min_events_per_timeslice;
    }


    /**
     * Gets the max_timeslice value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @return max_timeslice
     */
    public long getMax_timeslice() {
        return max_timeslice;
    }


    /**
     * Sets the max_timeslice value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @param max_timeslice
     */
    public void setMax_timeslice(long max_timeslice) {
        this.max_timeslice = max_timeslice;
    }


    /**
     * Gets the enabled_state value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @return enabled_state
     */
    public iControl.CommonEnabledState getEnabled_state() {
        return enabled_state;
    }


    /**
     * Sets the enabled_state value for this ManagementEventSubscriptionSubscriptionDetails.
     * 
     * @param enabled_state
     */
    public void setEnabled_state(iControl.CommonEnabledState enabled_state) {
        this.enabled_state = enabled_state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementEventSubscriptionSubscriptionDetails)) return false;
        ManagementEventSubscriptionSubscriptionDetails other = (ManagementEventSubscriptionSubscriptionDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.event_type_list==null && other.getEvent_type_list()==null) || 
             (this.event_type_list!=null &&
              java.util.Arrays.equals(this.event_type_list, other.getEvent_type_list()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.url_credentials==null && other.getUrl_credentials()==null) || 
             (this.url_credentials!=null &&
              this.url_credentials.equals(other.getUrl_credentials()))) &&
            this.ttl == other.getTtl() &&
            this.min_events_per_timeslice == other.getMin_events_per_timeslice() &&
            this.max_timeslice == other.getMax_timeslice() &&
            ((this.enabled_state==null && other.getEnabled_state()==null) || 
             (this.enabled_state!=null &&
              this.enabled_state.equals(other.getEnabled_state())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEvent_type_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvent_type_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvent_type_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getUrl_credentials() != null) {
            _hashCode += getUrl_credentials().hashCode();
        }
        _hashCode += new Long(getTtl()).hashCode();
        _hashCode += new Long(getMin_events_per_timeslice()).hashCode();
        _hashCode += new Long(getMax_timeslice()).hashCode();
        if (getEnabled_state() != null) {
            _hashCode += getEnabled_state().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementEventSubscriptionSubscriptionDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event_type_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "event_type_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.EventType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url_credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url_credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.UserCredential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min_events_per_timeslice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min_events_per_timeslice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_timeslice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_timeslice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"));
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
