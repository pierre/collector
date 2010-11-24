/**
 * GlobalLBVirtualServerVirtualServerMetricLimit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBVirtualServerVirtualServerMetricLimit  implements java.io.Serializable {
    private iControl.GlobalLBVirtualServerDefinition virtual_server;

    private iControl.GlobalLBMetricLimit[] metric_limits;

    public GlobalLBVirtualServerVirtualServerMetricLimit() {
    }

    public GlobalLBVirtualServerVirtualServerMetricLimit(
           iControl.GlobalLBVirtualServerDefinition virtual_server,
           iControl.GlobalLBMetricLimit[] metric_limits) {
           this.virtual_server = virtual_server;
           this.metric_limits = metric_limits;
    }


    /**
     * Gets the virtual_server value for this GlobalLBVirtualServerVirtualServerMetricLimit.
     * 
     * @return virtual_server
     */
    public iControl.GlobalLBVirtualServerDefinition getVirtual_server() {
        return virtual_server;
    }


    /**
     * Sets the virtual_server value for this GlobalLBVirtualServerVirtualServerMetricLimit.
     * 
     * @param virtual_server
     */
    public void setVirtual_server(iControl.GlobalLBVirtualServerDefinition virtual_server) {
        this.virtual_server = virtual_server;
    }


    /**
     * Gets the metric_limits value for this GlobalLBVirtualServerVirtualServerMetricLimit.
     * 
     * @return metric_limits
     */
    public iControl.GlobalLBMetricLimit[] getMetric_limits() {
        return metric_limits;
    }


    /**
     * Sets the metric_limits value for this GlobalLBVirtualServerVirtualServerMetricLimit.
     * 
     * @param metric_limits
     */
    public void setMetric_limits(iControl.GlobalLBMetricLimit[] metric_limits) {
        this.metric_limits = metric_limits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBVirtualServerVirtualServerMetricLimit)) return false;
        GlobalLBVirtualServerVirtualServerMetricLimit other = (GlobalLBVirtualServerVirtualServerMetricLimit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtual_server==null && other.getVirtual_server()==null) || 
             (this.virtual_server!=null &&
              this.virtual_server.equals(other.getVirtual_server()))) &&
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
        if (getVirtual_server() != null) {
            _hashCode += getVirtual_server().hashCode();
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
        new org.apache.axis.description.TypeDesc(GlobalLBVirtualServerVirtualServerMetricLimit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.VirtualServer.VirtualServerMetricLimit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtual_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtual_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.VirtualServerDefinition"));
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
