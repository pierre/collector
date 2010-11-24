/**
 * GlobalLBLinkMonitorAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBLinkMonitorAssociation  implements java.io.Serializable {
    private java.lang.String link;

    private iControl.GlobalLBMonitorRule monitor_rule;

    public GlobalLBLinkMonitorAssociation() {
    }

    public GlobalLBLinkMonitorAssociation(
           java.lang.String link,
           iControl.GlobalLBMonitorRule monitor_rule) {
           this.link = link;
           this.monitor_rule = monitor_rule;
    }


    /**
     * Gets the link value for this GlobalLBLinkMonitorAssociation.
     * 
     * @return link
     */
    public java.lang.String getLink() {
        return link;
    }


    /**
     * Sets the link value for this GlobalLBLinkMonitorAssociation.
     * 
     * @param link
     */
    public void setLink(java.lang.String link) {
        this.link = link;
    }


    /**
     * Gets the monitor_rule value for this GlobalLBLinkMonitorAssociation.
     * 
     * @return monitor_rule
     */
    public iControl.GlobalLBMonitorRule getMonitor_rule() {
        return monitor_rule;
    }


    /**
     * Sets the monitor_rule value for this GlobalLBLinkMonitorAssociation.
     * 
     * @param monitor_rule
     */
    public void setMonitor_rule(iControl.GlobalLBMonitorRule monitor_rule) {
        this.monitor_rule = monitor_rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBLinkMonitorAssociation)) return false;
        GlobalLBLinkMonitorAssociation other = (GlobalLBLinkMonitorAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink()))) &&
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
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        if (getMonitor_rule() != null) {
            _hashCode += getMonitor_rule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBLinkMonitorAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Link.MonitorAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
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
