/**
 * GlobalLBVirtualServerMonitorAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBVirtualServerMonitorAssociation  implements java.io.Serializable {
    private iControl.GlobalLBVirtualServerDefinition virtual_server;

    private iControl.GlobalLBMonitorRule monitor_rule;

    public GlobalLBVirtualServerMonitorAssociation() {
    }

    public GlobalLBVirtualServerMonitorAssociation(
           iControl.GlobalLBVirtualServerDefinition virtual_server,
           iControl.GlobalLBMonitorRule monitor_rule) {
           this.virtual_server = virtual_server;
           this.monitor_rule = monitor_rule;
    }


    /**
     * Gets the virtual_server value for this GlobalLBVirtualServerMonitorAssociation.
     * 
     * @return virtual_server
     */
    public iControl.GlobalLBVirtualServerDefinition getVirtual_server() {
        return virtual_server;
    }


    /**
     * Sets the virtual_server value for this GlobalLBVirtualServerMonitorAssociation.
     * 
     * @param virtual_server
     */
    public void setVirtual_server(iControl.GlobalLBVirtualServerDefinition virtual_server) {
        this.virtual_server = virtual_server;
    }


    /**
     * Gets the monitor_rule value for this GlobalLBVirtualServerMonitorAssociation.
     * 
     * @return monitor_rule
     */
    public iControl.GlobalLBMonitorRule getMonitor_rule() {
        return monitor_rule;
    }


    /**
     * Sets the monitor_rule value for this GlobalLBVirtualServerMonitorAssociation.
     * 
     * @param monitor_rule
     */
    public void setMonitor_rule(iControl.GlobalLBMonitorRule monitor_rule) {
        this.monitor_rule = monitor_rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBVirtualServerMonitorAssociation)) return false;
        GlobalLBVirtualServerMonitorAssociation other = (GlobalLBVirtualServerMonitorAssociation) obj;
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
        if (getVirtual_server() != null) {
            _hashCode += getVirtual_server().hashCode();
        }
        if (getMonitor_rule() != null) {
            _hashCode += getMonitor_rule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBVirtualServerMonitorAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.VirtualServer.MonitorAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtual_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtual_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.VirtualServerDefinition"));
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
