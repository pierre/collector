/**
 * LocalLBNodeAddressMonitorAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBNodeAddressMonitorAssociation  implements java.io.Serializable {
    private iControl.LocalLBMonitorIP node_address;

    private iControl.LocalLBMonitorRule monitor_rule;

    public LocalLBNodeAddressMonitorAssociation() {
    }

    public LocalLBNodeAddressMonitorAssociation(
           iControl.LocalLBMonitorIP node_address,
           iControl.LocalLBMonitorRule monitor_rule) {
           this.node_address = node_address;
           this.monitor_rule = monitor_rule;
    }


    /**
     * Gets the node_address value for this LocalLBNodeAddressMonitorAssociation.
     * 
     * @return node_address
     */
    public iControl.LocalLBMonitorIP getNode_address() {
        return node_address;
    }


    /**
     * Sets the node_address value for this LocalLBNodeAddressMonitorAssociation.
     * 
     * @param node_address
     */
    public void setNode_address(iControl.LocalLBMonitorIP node_address) {
        this.node_address = node_address;
    }


    /**
     * Gets the monitor_rule value for this LocalLBNodeAddressMonitorAssociation.
     * 
     * @return monitor_rule
     */
    public iControl.LocalLBMonitorRule getMonitor_rule() {
        return monitor_rule;
    }


    /**
     * Sets the monitor_rule value for this LocalLBNodeAddressMonitorAssociation.
     * 
     * @param monitor_rule
     */
    public void setMonitor_rule(iControl.LocalLBMonitorRule monitor_rule) {
        this.monitor_rule = monitor_rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBNodeAddressMonitorAssociation)) return false;
        LocalLBNodeAddressMonitorAssociation other = (LocalLBNodeAddressMonitorAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.node_address==null && other.getNode_address()==null) || 
             (this.node_address!=null &&
              this.node_address.equals(other.getNode_address()))) &&
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
        if (getNode_address() != null) {
            _hashCode += getNode_address().hashCode();
        }
        if (getMonitor_rule() != null) {
            _hashCode += getMonitor_rule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBNodeAddressMonitorAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.NodeAddress.MonitorAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorIP"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitor_rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitor_rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorRule"));
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
