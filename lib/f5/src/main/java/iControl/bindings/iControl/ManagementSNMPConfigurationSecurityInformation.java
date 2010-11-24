/**
 * ManagementSNMPConfigurationSecurityInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationSecurityInformation  implements java.io.Serializable {
    private java.lang.String security_name;

    private java.lang.String source;

    private java.lang.String community_name;

    private boolean ipv6;

    public ManagementSNMPConfigurationSecurityInformation() {
    }

    public ManagementSNMPConfigurationSecurityInformation(
           java.lang.String security_name,
           java.lang.String source,
           java.lang.String community_name,
           boolean ipv6) {
           this.security_name = security_name;
           this.source = source;
           this.community_name = community_name;
           this.ipv6 = ipv6;
    }


    /**
     * Gets the security_name value for this ManagementSNMPConfigurationSecurityInformation.
     * 
     * @return security_name
     */
    public java.lang.String getSecurity_name() {
        return security_name;
    }


    /**
     * Sets the security_name value for this ManagementSNMPConfigurationSecurityInformation.
     * 
     * @param security_name
     */
    public void setSecurity_name(java.lang.String security_name) {
        this.security_name = security_name;
    }


    /**
     * Gets the source value for this ManagementSNMPConfigurationSecurityInformation.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ManagementSNMPConfigurationSecurityInformation.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the community_name value for this ManagementSNMPConfigurationSecurityInformation.
     * 
     * @return community_name
     */
    public java.lang.String getCommunity_name() {
        return community_name;
    }


    /**
     * Sets the community_name value for this ManagementSNMPConfigurationSecurityInformation.
     * 
     * @param community_name
     */
    public void setCommunity_name(java.lang.String community_name) {
        this.community_name = community_name;
    }


    /**
     * Gets the ipv6 value for this ManagementSNMPConfigurationSecurityInformation.
     * 
     * @return ipv6
     */
    public boolean isIpv6() {
        return ipv6;
    }


    /**
     * Sets the ipv6 value for this ManagementSNMPConfigurationSecurityInformation.
     * 
     * @param ipv6
     */
    public void setIpv6(boolean ipv6) {
        this.ipv6 = ipv6;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationSecurityInformation)) return false;
        ManagementSNMPConfigurationSecurityInformation other = (ManagementSNMPConfigurationSecurityInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.security_name==null && other.getSecurity_name()==null) || 
             (this.security_name!=null &&
              this.security_name.equals(other.getSecurity_name()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.community_name==null && other.getCommunity_name()==null) || 
             (this.community_name!=null &&
              this.community_name.equals(other.getCommunity_name()))) &&
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
        if (getSecurity_name() != null) {
            _hashCode += getSecurity_name().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCommunity_name() != null) {
            _hashCode += getCommunity_name().hashCode();
        }
        _hashCode += (isIpv6() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationSecurityInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SecurityInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "security_name"));
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
        elemField.setFieldName("community_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "community_name"));
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
