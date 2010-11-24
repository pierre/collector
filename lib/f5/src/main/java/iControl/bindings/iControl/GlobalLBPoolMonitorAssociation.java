/**
 * GlobalLBPoolMonitorAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBPoolMonitorAssociation  implements java.io.Serializable {
    private java.lang.String pool_name;

    private iControl.GlobalLBMonitorRule monitor_rule;

    public GlobalLBPoolMonitorAssociation() {
    }

    public GlobalLBPoolMonitorAssociation(
           java.lang.String pool_name,
           iControl.GlobalLBMonitorRule monitor_rule) {
           this.pool_name = pool_name;
           this.monitor_rule = monitor_rule;
    }


    /**
     * Gets the pool_name value for this GlobalLBPoolMonitorAssociation.
     * 
     * @return pool_name
     */
    public java.lang.String getPool_name() {
        return pool_name;
    }


    /**
     * Sets the pool_name value for this GlobalLBPoolMonitorAssociation.
     * 
     * @param pool_name
     */
    public void setPool_name(java.lang.String pool_name) {
        this.pool_name = pool_name;
    }


    /**
     * Gets the monitor_rule value for this GlobalLBPoolMonitorAssociation.
     * 
     * @return monitor_rule
     */
    public iControl.GlobalLBMonitorRule getMonitor_rule() {
        return monitor_rule;
    }


    /**
     * Sets the monitor_rule value for this GlobalLBPoolMonitorAssociation.
     * 
     * @param monitor_rule
     */
    public void setMonitor_rule(iControl.GlobalLBMonitorRule monitor_rule) {
        this.monitor_rule = monitor_rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBPoolMonitorAssociation)) return false;
        GlobalLBPoolMonitorAssociation other = (GlobalLBPoolMonitorAssociation) obj;
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
            ((this.monitor_rule==null && other.getMonitor_rule()==null) || 
             (this.monitor_rule!=null &&
              this.monitor_rule.equals(other.getMonitor_rule())));
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
        if (getMonitor_rule() != null) {
            _hashCode += getMonitor_rule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBPoolMonitorAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Pool.MonitorAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pool_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitor_rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitor_rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorRule"));
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
