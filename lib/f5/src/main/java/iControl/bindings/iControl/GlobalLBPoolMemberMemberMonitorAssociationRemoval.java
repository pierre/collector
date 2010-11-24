/**
 * GlobalLBPoolMemberMemberMonitorAssociationRemoval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBPoolMemberMemberMonitorAssociationRemoval  implements java.io.Serializable {
    private iControl.GlobalLBMonitorIPPort member;

    private iControl.GlobalLBMonitorAssociationRemovalRule removal_rule;

    public GlobalLBPoolMemberMemberMonitorAssociationRemoval() {
    }

    public GlobalLBPoolMemberMemberMonitorAssociationRemoval(
           iControl.GlobalLBMonitorIPPort member,
           iControl.GlobalLBMonitorAssociationRemovalRule removal_rule) {
           this.member = member;
           this.removal_rule = removal_rule;
    }


    /**
     * Gets the member value for this GlobalLBPoolMemberMemberMonitorAssociationRemoval.
     * 
     * @return member
     */
    public iControl.GlobalLBMonitorIPPort getMember() {
        return member;
    }


    /**
     * Sets the member value for this GlobalLBPoolMemberMemberMonitorAssociationRemoval.
     * 
     * @param member
     */
    public void setMember(iControl.GlobalLBMonitorIPPort member) {
        this.member = member;
    }


    /**
     * Gets the removal_rule value for this GlobalLBPoolMemberMemberMonitorAssociationRemoval.
     * 
     * @return removal_rule
     */
    public iControl.GlobalLBMonitorAssociationRemovalRule getRemoval_rule() {
        return removal_rule;
    }


    /**
     * Sets the removal_rule value for this GlobalLBPoolMemberMemberMonitorAssociationRemoval.
     * 
     * @param removal_rule
     */
    public void setRemoval_rule(iControl.GlobalLBMonitorAssociationRemovalRule removal_rule) {
        this.removal_rule = removal_rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBPoolMemberMemberMonitorAssociationRemoval)) return false;
        GlobalLBPoolMemberMemberMonitorAssociationRemoval other = (GlobalLBPoolMemberMemberMonitorAssociationRemoval) obj;
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
        if (getMember() != null) {
            _hashCode += getMember().hashCode();
        }
        if (getRemoval_rule() != null) {
            _hashCode += getRemoval_rule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBPoolMemberMemberMonitorAssociationRemoval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberMonitorAssociationRemoval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorIPPort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removal_rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removal_rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorAssociationRemovalRule"));
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
