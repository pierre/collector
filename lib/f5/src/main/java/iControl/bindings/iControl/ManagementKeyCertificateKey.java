/**
 * ManagementKeyCertificateKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKeyCertificateKey  implements java.io.Serializable {
    private java.lang.String id;

    private iControl.ManagementKeyCertificateKeyType key_type;

    private long bit_length;

    private iControl.ManagementKeyCertificateSecurityType security;

    public ManagementKeyCertificateKey() {
    }

    public ManagementKeyCertificateKey(
           java.lang.String id,
           iControl.ManagementKeyCertificateKeyType key_type,
           long bit_length,
           iControl.ManagementKeyCertificateSecurityType security) {
           this.id = id;
           this.key_type = key_type;
           this.bit_length = bit_length;
           this.security = security;
    }


    /**
     * Gets the id value for this ManagementKeyCertificateKey.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ManagementKeyCertificateKey.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the key_type value for this ManagementKeyCertificateKey.
     * 
     * @return key_type
     */
    public iControl.ManagementKeyCertificateKeyType getKey_type() {
        return key_type;
    }


    /**
     * Sets the key_type value for this ManagementKeyCertificateKey.
     * 
     * @param key_type
     */
    public void setKey_type(iControl.ManagementKeyCertificateKeyType key_type) {
        this.key_type = key_type;
    }


    /**
     * Gets the bit_length value for this ManagementKeyCertificateKey.
     * 
     * @return bit_length
     */
    public long getBit_length() {
        return bit_length;
    }


    /**
     * Sets the bit_length value for this ManagementKeyCertificateKey.
     * 
     * @param bit_length
     */
    public void setBit_length(long bit_length) {
        this.bit_length = bit_length;
    }


    /**
     * Gets the security value for this ManagementKeyCertificateKey.
     * 
     * @return security
     */
    public iControl.ManagementKeyCertificateSecurityType getSecurity() {
        return security;
    }


    /**
     * Sets the security value for this ManagementKeyCertificateKey.
     * 
     * @param security
     */
    public void setSecurity(iControl.ManagementKeyCertificateSecurityType security) {
        this.security = security;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementKeyCertificateKey)) return false;
        ManagementKeyCertificateKey other = (ManagementKeyCertificateKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.key_type==null && other.getKey_type()==null) || 
             (this.key_type!=null &&
              this.key_type.equals(other.getKey_type()))) &&
            this.bit_length == other.getBit_length() &&
            ((this.security==null && other.getSecurity()==null) || 
             (this.security!=null &&
              this.security.equals(other.getSecurity())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getKey_type() != null) {
            _hashCode += getKey_type().hashCode();
        }
        _hashCode += new Long(getBit_length()).hashCode();
        if (getSecurity() != null) {
            _hashCode += getSecurity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementKeyCertificateKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.Key"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.KeyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bit_length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bit_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security");
        elemField.setXmlName(new javax.xml.namespace.QName("", "security"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.SecurityType"));
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
