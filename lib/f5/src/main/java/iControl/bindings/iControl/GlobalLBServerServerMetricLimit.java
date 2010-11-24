/**
 * GlobalLBServerServerMetricLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBServerServerMetricLimit  implements java.io.Serializable {
    private java.lang.String server_name;

    private iControl.GlobalLBMetricLimit[] metric_limits;

    public GlobalLBServerServerMetricLimit() {
    }

    public GlobalLBServerServerMetricLimit(
           java.lang.String server_name,
           iControl.GlobalLBMetricLimit[] metric_limits) {
           this.server_name = server_name;
           this.metric_limits = metric_limits;
    }


    /**
     * Gets the server_name value for this GlobalLBServerServerMetricLimit.
     * 
     * @return server_name
     */
    public java.lang.String getServer_name() {
        return server_name;
    }


    /**
     * Sets the server_name value for this GlobalLBServerServerMetricLimit.
     * 
     * @param server_name
     */
    public void setServer_name(java.lang.String server_name) {
        this.server_name = server_name;
    }


    /**
     * Gets the metric_limits value for this GlobalLBServerServerMetricLimit.
     * 
     * @return metric_limits
     */
    public iControl.GlobalLBMetricLimit[] getMetric_limits() {
        return metric_limits;
    }


    /**
     * Sets the metric_limits value for this GlobalLBServerServerMetricLimit.
     * 
     * @param metric_limits
     */
    public void setMetric_limits(iControl.GlobalLBMetricLimit[] metric_limits) {
        this.metric_limits = metric_limits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBServerServerMetricLimit)) return false;
        GlobalLBServerServerMetricLimit other = (GlobalLBServerServerMetricLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.server_name==null && other.getServer_name()==null) || 
             (this.server_name!=null &&
              this.server_name.equals(other.getServer_name()))) &&
            ((this.metric_limits==null && other.getMetric_limits()==null) || 
             (this.metric_limits!=null &&
              java.util.Arrays.equals(this.metric_limits, other.getMetric_limits())));
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
        if (getServer_name() != null) {
            _hashCode += getServer_name().hashCode();
        }
        if (getMetric_limits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetric_limits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetric_limits(), i);
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
        new org.apache.axis.description.TypeDesc(GlobalLBServerServerMetricLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Server.ServerMetricLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "server_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric_limits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric_limits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MetricLimit"));
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
