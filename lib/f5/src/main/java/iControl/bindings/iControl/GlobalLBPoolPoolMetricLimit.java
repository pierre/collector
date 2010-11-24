/**
 * GlobalLBPoolPoolMetricLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBPoolPoolMetricLimit  implements java.io.Serializable {
    private java.lang.String pool_name;

    private iControl.GlobalLBMetricLimit[] metric_limits;

    public GlobalLBPoolPoolMetricLimit() {
    }

    public GlobalLBPoolPoolMetricLimit(
           java.lang.String pool_name,
           iControl.GlobalLBMetricLimit[] metric_limits) {
           this.pool_name = pool_name;
           this.metric_limits = metric_limits;
    }


    /**
     * Gets the pool_name value for this GlobalLBPoolPoolMetricLimit.
     * 
     * @return pool_name
     */
    public java.lang.String getPool_name() {
        return pool_name;
    }


    /**
     * Sets the pool_name value for this GlobalLBPoolPoolMetricLimit.
     * 
     * @param pool_name
     */
    public void setPool_name(java.lang.String pool_name) {
        this.pool_name = pool_name;
    }


    /**
     * Gets the metric_limits value for this GlobalLBPoolPoolMetricLimit.
     * 
     * @return metric_limits
     */
    public iControl.GlobalLBMetricLimit[] getMetric_limits() {
        return metric_limits;
    }


    /**
     * Sets the metric_limits value for this GlobalLBPoolPoolMetricLimit.
     * 
     * @param metric_limits
     */
    public void setMetric_limits(iControl.GlobalLBMetricLimit[] metric_limits) {
        this.metric_limits = metric_limits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBPoolPoolMetricLimit)) return false;
        GlobalLBPoolPoolMetricLimit other = (GlobalLBPoolPoolMetricLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pool_name==null && other.getPool_name()==null) || 
             (this.pool_name!=null &&
              this.pool_name.equals(other.getPool_name()))) &&
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
        if (getPool_name() != null) {
            _hashCode += getPool_name().hashCode();
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
        new org.apache.axis.description.TypeDesc(GlobalLBPoolPoolMetricLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Pool.PoolMetricLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pool_name"));
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
