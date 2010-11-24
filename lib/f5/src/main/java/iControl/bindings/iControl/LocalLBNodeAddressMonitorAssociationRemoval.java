/**
 * LocalLBNodeAddressMonitorAssociationRemoval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBNodeAddressMonitorAssociationRemoval  implements java.io.Serializable {
    private iControl.LocalLBMonitorIP node_address;

    private iControl.LocalLBMonitorAssociationRemovalRule removal_rule;

    public LocalLBNodeAddressMonitorAssociationRemoval() {
    }

    public LocalLBNodeAddressMonitorAssociationRemoval(
           iControl.LocalLBMonitorIP node_address,
           iControl.LocalLBMonitorAssociationRemovalRule removal_rule) {
           this.node_address = node_address;
           this.removal_rule = removal_rule;
    }


    /**
     * Gets the node_address value for this LocalLBNodeAddressMonitorAssociationRemoval.
     * 
     * @return node_address
     */
    public iControl.LocalLBMonitorIP getNode_address() {
        return node_address;
    }


    /**
     * Sets the node_address value for this LocalLBNodeAddressMonitorAssociationRemoval.
     * 
     * @param node_address
     */
    public void setNode_address(iControl.LocalLBMonitorIP node_address) {
        this.node_address = node_address;
    }


    /**
     * Gets the removal_rule value for this LocalLBNodeAddressMonitorAssociationRemoval.
     * 
     * @return removal_rule
     */
    public iControl.LocalLBMonitorAssociationRemovalRule getRemoval_rule() {
        return removal_rule;
    }


    /**
     * Sets the removal_rule value for this LocalLBNodeAddressMonitorAssociationRemoval.
     * 
     * @param removal_rule
     */
    public void setRemoval_rule(iControl.LocalLBMonitorAssociationRemovalRule removal_rule) {
        this.removal_rule = removal_rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBNodeAddressMonitorAssociationRemoval)) return false;
        LocalLBNodeAddressMonitorAssociationRemoval other = (LocalLBNodeAddressMonitorAssociationRemoval) obj;
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
            ((this.removal_rule==null && other.getRemoval_rule()==null) || 
             (this.removal_rule!=null &&
              this.removal_rule.equals(other.getRemoval_rule())));
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
        if (getRemoval_rule() != null) {
            _hashCode += getRemoval_rule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBNodeAddressMonitorAssociationRemoval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.NodeAddress.MonitorAssociationRemoval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorIP"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removal_rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removal_rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorAssociationRemovalRule"));
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
