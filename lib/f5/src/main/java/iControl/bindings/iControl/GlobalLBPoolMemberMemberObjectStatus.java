/**
 * GlobalLBPoolMemberMemberObjectStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBPoolMemberMemberObjectStatus  implements java.io.Serializable {
    private iControl.CommonIPPortDefinition member;

    private iControl.CommonObjectStatus status;

    public GlobalLBPoolMemberMemberObjectStatus() {
    }

    public GlobalLBPoolMemberMemberObjectStatus(
           iControl.CommonIPPortDefinition member,
           iControl.CommonObjectStatus status) {
           this.member = member;
           this.status = status;
    }


    /**
     * Gets the member value for this GlobalLBPoolMemberMemberObjectStatus.
     * 
     * @return member
     */
    public iControl.CommonIPPortDefinition getMember() {
        return member;
    }


    /**
     * Sets the member value for this GlobalLBPoolMemberMemberObjectStatus.
     * 
     * @param member
     */
    public void setMember(iControl.CommonIPPortDefinition member) {
        this.member = member;
    }


    /**
     * Gets the status value for this GlobalLBPoolMemberMemberObjectStatus.
     * 
     * @return status
     */
    public iControl.CommonObjectStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GlobalLBPoolMemberMemberObjectStatus.
     * 
     * @param status
     */
    public void setStatus(iControl.CommonObjectStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBPoolMemberMemberObjectStatus)) return false;
        GlobalLBPoolMemberMemberObjectStatus other = (GlobalLBPoolMemberMemberObjectStatus) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBPoolMemberMemberObjectStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberObjectStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ObjectStatus"));
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
