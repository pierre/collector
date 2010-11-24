/**
 * ManagementKeyCertificateCertificateDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKeyCertificateCertificateDetail  implements java.io.Serializable {
    private iControl.ManagementKeyCertificateCertificate cert_info;

    private iControl.ManagementKeyCertificateCertificateType cert_type;

    private iControl.ManagementKeyCertificateKeyType key_type;

    private long bit_length;

    private long version;

    private java.lang.String serial_number;

    private java.lang.String expiration_string;

    private long expiration_date;

    private iControl.ManagementKeyCertificateX509Data subject;

    private iControl.ManagementKeyCertificateX509Data issuer;

    public ManagementKeyCertificateCertificateDetail() {
    }

    public ManagementKeyCertificateCertificateDetail(
           iControl.ManagementKeyCertificateCertificate cert_info,
           iControl.ManagementKeyCertificateCertificateType cert_type,
           iControl.ManagementKeyCertificateKeyType key_type,
           long bit_length,
           long version,
           java.lang.String serial_number,
           java.lang.String expiration_string,
           long expiration_date,
           iControl.ManagementKeyCertificateX509Data subject,
           iControl.ManagementKeyCertificateX509Data issuer) {
           this.cert_info = cert_info;
           this.cert_type = cert_type;
           this.key_type = key_type;
           this.bit_length = bit_length;
           this.version = version;
           this.serial_number = serial_number;
           this.expiration_string = expiration_string;
           this.expiration_date = expiration_date;
           this.subject = subject;
           this.issuer = issuer;
    }


    /**
     * Gets the cert_info value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return cert_info
     */
    public iControl.ManagementKeyCertificateCertificate getCert_info() {
        return cert_info;
    }


    /**
     * Sets the cert_info value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param cert_info
     */
    public void setCert_info(iControl.ManagementKeyCertificateCertificate cert_info) {
        this.cert_info = cert_info;
    }


    /**
     * Gets the cert_type value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return cert_type
     */
    public iControl.ManagementKeyCertificateCertificateType getCert_type() {
        return cert_type;
    }


    /**
     * Sets the cert_type value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param cert_type
     */
    public void setCert_type(iControl.ManagementKeyCertificateCertificateType cert_type) {
        this.cert_type = cert_type;
    }


    /**
     * Gets the key_type value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return key_type
     */
    public iControl.ManagementKeyCertificateKeyType getKey_type() {
        return key_type;
    }


    /**
     * Sets the key_type value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param key_type
     */
    public void setKey_type(iControl.ManagementKeyCertificateKeyType key_type) {
        this.key_type = key_type;
    }


    /**
     * Gets the bit_length value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return bit_length
     */
    public long getBit_length() {
        return bit_length;
    }


    /**
     * Sets the bit_length value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param bit_length
     */
    public void setBit_length(long bit_length) {
        this.bit_length = bit_length;
    }


    /**
     * Gets the version value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return version
     */
    public long getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param version
     */
    public void setVersion(long version) {
        this.version = version;
    }


    /**
     * Gets the serial_number value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return serial_number
     */
    public java.lang.String getSerial_number() {
        return serial_number;
    }


    /**
     * Sets the serial_number value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param serial_number
     */
    public void setSerial_number(java.lang.String serial_number) {
        this.serial_number = serial_number;
    }


    /**
     * Gets the expiration_string value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return expiration_string
     */
    public java.lang.String getExpiration_string() {
        return expiration_string;
    }


    /**
     * Sets the expiration_string value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param expiration_string
     */
    public void setExpiration_string(java.lang.String expiration_string) {
        this.expiration_string = expiration_string;
    }


    /**
     * Gets the expiration_date value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return expiration_date
     */
    public long getExpiration_date() {
        return expiration_date;
    }


    /**
     * Sets the expiration_date value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param expiration_date
     */
    public void setExpiration_date(long expiration_date) {
        this.expiration_date = expiration_date;
    }


    /**
     * Gets the subject value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return subject
     */
    public iControl.ManagementKeyCertificateX509Data getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param subject
     */
    public void setSubject(iControl.ManagementKeyCertificateX509Data subject) {
        this.subject = subject;
    }


    /**
     * Gets the issuer value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @return issuer
     */
    public iControl.ManagementKeyCertificateX509Data getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this ManagementKeyCertificateCertificateDetail.
     * 
     * @param issuer
     */
    public void setIssuer(iControl.ManagementKeyCertificateX509Data issuer) {
        this.issuer = issuer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementKeyCertificateCertificateDetail)) return false;
        ManagementKeyCertificateCertificateDetail other = (ManagementKeyCertificateCertificateDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cert_info==null && other.getCert_info()==null) || 
             (this.cert_info!=null &&
              this.cert_info.equals(other.getCert_info()))) &&
            ((this.cert_type==null && other.getCert_type()==null) || 
             (this.cert_type!=null &&
              this.cert_type.equals(other.getCert_type()))) &&
            ((this.key_type==null && other.getKey_type()==null) || 
             (this.key_type!=null &&
              this.key_type.equals(other.getKey_type()))) &&
            this.bit_length == other.getBit_length() &&
            this.version == other.getVersion() &&
            ((this.serial_number==null && other.getSerial_number()==null) || 
             (this.serial_number!=null &&
              this.serial_number.equals(other.getSerial_number()))) &&
            ((this.expiration_string==null && other.getExpiration_string()==null) || 
             (this.expiration_string!=null &&
              this.expiration_string.equals(other.getExpiration_string()))) &&
            this.expiration_date == other.getExpiration_date() &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer())));
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
        if (getCert_info() != null) {
            _hashCode += getCert_info().hashCode();
        }
        if (getCert_type() != null) {
            _hashCode += getCert_type().hashCode();
        }
        if (getKey_type() != null) {
            _hashCode += getKey_type().hashCode();
        }
        _hashCode += new Long(getBit_length()).hashCode();
        _hashCode += new Long(getVersion()).hashCode();
        if (getSerial_number() != null) {
            _hashCode += getSerial_number().hashCode();
        }
        if (getExpiration_string() != null) {
            _hashCode += getExpiration_string().hashCode();
        }
        _hashCode += new Long(getExpiration_date()).hashCode();
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementKeyCertificateCertificateDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.CertificateDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cert_info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cert_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.Certificate"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cert_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cert_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.CertificateType"));
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
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration_string");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiration_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiration_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.X509Data"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.X509Data"));
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
