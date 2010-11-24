/**
 * LocalLBPoolMemberMemberMonitorAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBPoolMemberMemberMonitorAssociation  implements java.io.Serializable {
    private iControl.LocalLBMonitorIPPort member;

    private iControl.LocalLBMonitorRule monitor_rule;

    public LocalLBPoolMemberMemberMonitorAssociation() {
    }

    public LocalLBPoolMemberMemberMonitorAssociation(
           iControl.LocalLBMonitorIPPort member,
           iControl.LocalLBMonitorRule monitor_rule) {
           this.member = member;
           this.monitor_rule = monitor_rule;
    }


    /**
     * Gets the member value for this LocalLBPoolMemberMemberMonitorAssociation.
     * 
     * @return member
     */
    public iControl.LocalLBMonitorIPPort getMember() {
        return member;
    }


    /**
     * Sets the member value for this LocalLBPoolMemberMemberMonitorAssociation.
     * 
     * @param member
     */
    public void setMember(iControl.LocalLBMonitorIPPort member) {
        this.member = member;
    }


    /**
     * Gets the monitor_rule value for this LocalLBPoolMemberMemberMonitorAssociation.
     * 
     * @return monitor_rule
     */
    public iControl.LocalLBMonitorRule getMonitor_rule() {
        return monitor_rule;
    }


    /**
     * Sets the monitor_rule value for this LocalLBPoolMemberMemberMonitorAssociation.
     * 
     * @param monitor_rule
     */
    public void setMonitor_rule(iControl.LocalLBMonitorRule monitor_rule) {
        this.monitor_rule = monitor_rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBPoolMemberMemberMonitorAssociation)) return false;
        LocalLBPoolMemberMemberMonitorAssociation other = (LocalLBPoolMemberMemberMonitorAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.member==null && other.getMember()==null) || 
             (this.member!=null &&
              this.member.equals(other.getMember()))) &&
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
        if (getMember() != null) {
            _hashCode += getMember().hashCode();
        }
        if (getMonitor_rule() != null) {
            _hashCode += getMonitor_rule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBPoolMemberMemberMonitorAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorIPPort"));
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
