/**
 * ManagementSNMPConfigurationWrapperSecurityInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationWrapperSecurityInformation  implements java.io.Serializable {
    private java.lang.String community;

    private java.lang.String source;

    private java.lang.String oid;

    private boolean ipv6;

    public ManagementSNMPConfigurationWrapperSecurityInformation() {
    }

    public ManagementSNMPConfigurationWrapperSecurityInformation(
           java.lang.String community,
           java.lang.String source,
           java.lang.String oid,
           boolean ipv6) {
           this.community = community;
           this.source = source;
           this.oid = oid;
           this.ipv6 = ipv6;
    }


    /**
     * Gets the community value for this ManagementSNMPConfigurationWrapperSecurityInformation.
     * 
     * @return community
     */
    public java.lang.String getCommunity() {
        return community;
    }


    /**
     * Sets the community value for this ManagementSNMPConfigurationWrapperSecurityInformation.
     * 
     * @param community
     */
    public void setCommunity(java.lang.String community) {
        this.community = community;
    }


    /**
     * Gets the source value for this ManagementSNMPConfigurationWrapperSecurityInformation.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ManagementSNMPConfigurationWrapperSecurityInformation.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the oid value for this ManagementSNMPConfigurationWrapperSecurityInformation.
     * 
     * @return oid
     */
    public java.lang.String getOid() {
        return oid;
    }


    /**
     * Sets the oid value for this ManagementSNMPConfigurationWrapperSecurityInformation.
     * 
     * @param oid
     */
    public void setOid(java.lang.String oid) {
        this.oid = oid;
    }


    /**
     * Gets the ipv6 value for this ManagementSNMPConfigurationWrapperSecurityInformation.
     * 
     * @return ipv6
     */
    public boolean isIpv6() {
        return ipv6;
    }


    /**
     * Sets the ipv6 value for this ManagementSNMPConfigurationWrapperSecurityInformation.
     * 
     * @param ipv6
     */
    public void setIpv6(boolean ipv6) {
        this.ipv6 = ipv6;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationWrapperSecurityInformation)) return false;
        ManagementSNMPConfigurationWrapperSecurityInformation other = (ManagementSNMPConfigurationWrapperSecurityInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.community==null && other.getCommunity()==null) || 
             (this.community!=null &&
              this.community.equals(other.getCommunity()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.oid==null && other.getOid()==null) || 
             (this.oid!=null &&
              this.oid.equals(other.getOid()))) &&
            this.ipv6 == other.isIpv6();
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
        if (getCommunity() != null) {
            _hashCode += getCommunity().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getOid() != null) {
            _hashCode += getOid().hashCode();
        }
        _hashCode += (isIpv6() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationWrapperSecurityInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperSecurityInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community");
        elemField.setXmlName(new javax.xml.namespace.QName("", "community"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
