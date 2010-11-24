/**
 * GlobalLBServerMonitorAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBServerMonitorAssociation  implements java.io.Serializable {
    private java.lang.String server_name;

    private iControl.GlobalLBMonitorRule monitor_rule;

    public GlobalLBServerMonitorAssociation() {
    }

    public GlobalLBServerMonitorAssociation(
           java.lang.String server_name,
           iControl.GlobalLBMonitorRule monitor_rule) {
           this.server_name = server_name;
           this.monitor_rule = monitor_rule;
    }


    /**
     * Gets the server_name value for this GlobalLBServerMonitorAssociation.
     * 
     * @return server_name
     */
    public java.lang.String getServer_name() {
        return server_name;
    }


    /**
     * Sets the server_name value for this GlobalLBServerMonitorAssociation.
     * 
     * @param server_name
     */
    public void setServer_name(java.lang.String server_name) {
        this.server_name = server_name;
    }


    /**
     * Gets the monitor_rule value for this GlobalLBServerMonitorAssociation.
     * 
     * @return monitor_rule
     */
    public iControl.GlobalLBMonitorRule getMonitor_rule() {
        return monitor_rule;
    }


    /**
     * Sets the monitor_rule value for this GlobalLBServerMonitorAssociation.
     * 
     * @param monitor_rule
     */
    public void setMonitor_rule(iControl.GlobalLBMonitorRule monitor_rule) {
        this.monitor_rule = monitor_rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBServerMonitorAssociation)) return false;
        GlobalLBServerMonitorAssociation other = (GlobalLBServerMonitorAssociation) obj;
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
        if (getServer_name() != null) {
            _hashCode += getServer_name().hashCode();
        }
        if (getMonitor_rule() != null) {
            _hashCode += getMonitor_rule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBServerMonitorAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Server.MonitorAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "server_name"));
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
