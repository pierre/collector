/**
 * SystemFanMetric.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemFanMetric  implements java.io.Serializable {
    private iControl.SystemFanMetricType metric_type;

    private long value;

    public SystemFanMetric() {
    }

    public SystemFanMetric(
           iControl.SystemFanMetricType metric_type,
           long value) {
           this.metric_type = metric_type;
           this.value = value;
    }


    /**
     * Gets the metric_type value for this SystemFanMetric.
     * 
     * @return metric_type
     */
    public iControl.SystemFanMetricType getMetric_type() {
        return metric_type;
    }


    /**
     * Sets the metric_type value for this SystemFanMetric.
     * 
     * @param metric_type
     */
    public void setMetric_type(iControl.SystemFanMetricType metric_type) {
        this.metric_type = metric_type;
    }


    /**
     * Gets the value value for this SystemFanMetric.
     * 
     * @return value
     */
    public long getValue() {
        return value;
    }


    /**
     * Sets the value value for this SystemFanMetric.
     * 
     * @param value
     */
    public void setValue(long value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemFanMetric)) return false;
        SystemFanMetric other = (SystemFanMetric) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metric_type==null && other.getMetric_type()==null) || 
             (this.metric_type!=null &&
              this.metric_type.equals(other.getMetric_type()))) &&
            this.value == other.getValue();
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
        if (getMetric_type() != null) {
            _hashCode += getMetric_type().hashCode();
        }
        _hashCode += new Long(getValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemFanMetric.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.FanMetric"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.FanMetricType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
