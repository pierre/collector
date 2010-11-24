/**
 * NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct  implements java.io.Serializable {
    private iControl.NetworkingISessionAdvertisedRouteSubnetOptKey key;

    private iControl.CommonEnabledState included;

    private long metric;

    private java.lang.String label;

    public NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct() {
    }

    public NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct(
           iControl.NetworkingISessionAdvertisedRouteSubnetOptKey key,
           iControl.CommonEnabledState included,
           long metric,
           java.lang.String label) {
           this.key = key;
           this.included = included;
           this.metric = metric;
           this.label = label;
    }


    /**
     * Gets the key value for this NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.
     * 
     * @return key
     */
    public iControl.NetworkingISessionAdvertisedRouteSubnetOptKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.
     * 
     * @param key
     */
    public void setKey(iControl.NetworkingISessionAdvertisedRouteSubnetOptKey key) {
        this.key = key;
    }


    /**
     * Gets the included value for this NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.
     * 
     * @return included
     */
    public iControl.CommonEnabledState getIncluded() {
        return included;
    }


    /**
     * Sets the included value for this NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.
     * 
     * @param included
     */
    public void setIncluded(iControl.CommonEnabledState included) {
        this.included = included;
    }


    /**
     * Gets the metric value for this NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.
     * 
     * @return metric
     */
    public long getMetric() {
        return metric;
    }


    /**
     * Sets the metric value for this NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.
     * 
     * @param metric
     */
    public void setMetric(long metric) {
        this.metric = metric;
    }


    /**
     * Gets the label value for this NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct)) return false;
        NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct other = (NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.included==null && other.getIncluded()==null) || 
             (this.included!=null &&
              this.included.equals(other.getIncluded()))) &&
            this.metric == other.getMetric() &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getIncluded() != null) {
            _hashCode += getIncluded().hashCode();
        }
        _hashCode += new Long(getMetric()).hashCode();
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionAdvertisedRoute.iSessionAdvertisedRouteStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionAdvertisedRoute.SubnetOptKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("included");
        elemField.setXmlName(new javax.xml.namespace.QName("", "included"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
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
