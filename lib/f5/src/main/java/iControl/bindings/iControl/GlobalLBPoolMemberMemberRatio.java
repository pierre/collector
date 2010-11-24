/**
 * GlobalLBPoolMemberMemberRatio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBPoolMemberMemberRatio  implements java.io.Serializable {
    private iControl.CommonIPPortDefinition member;

    private long ratio;

    public GlobalLBPoolMemberMemberRatio() {
    }

    public GlobalLBPoolMemberMemberRatio(
           iControl.CommonIPPortDefinition member,
           long ratio) {
           this.member = member;
           this.ratio = ratio;
    }


    /**
     * Gets the member value for this GlobalLBPoolMemberMemberRatio.
     * 
     * @return member
     */
    public iControl.CommonIPPortDefinition getMember() {
        return member;
    }


    /**
     * Sets the member value for this GlobalLBPoolMemberMemberRatio.
     * 
     * @param member
     */
    public void setMember(iControl.CommonIPPortDefinition member) {
        this.member = member;
    }


    /**
     * Gets the ratio value for this GlobalLBPoolMemberMemberRatio.
     * 
     * @return ratio
     */
    public long getRatio() {
        return ratio;
    }


    /**
     * Sets the ratio value for this GlobalLBPoolMemberMemberRatio.
     * 
     * @param ratio
     */
    public void setRatio(long ratio) {
        this.ratio = ratio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBPoolMemberMemberRatio)) return false;
        GlobalLBPoolMemberMemberRatio other = (GlobalLBPoolMemberMemberRatio) obj;
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
            this.ratio == other.getRatio();
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
        _hashCode += new Long(getRatio()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBPoolMemberMemberRatio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.PoolMember.MemberRatio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
