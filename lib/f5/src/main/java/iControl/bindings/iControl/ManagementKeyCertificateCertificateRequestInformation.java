/**
 * ManagementKeyCertificateCertificateRequestInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKeyCertificateCertificateRequestInformation  implements java.io.Serializable {
    private iControl.ManagementKeyCertificateCertificateRequest csr_info;

    private java.lang.String title;

    private java.lang.String serial_number;

    private java.lang.String file_name;

    private iControl.ManagementKeyCertificateKeyType key_type;

    private long bit_length;

    private iControl.ManagementKeyCertificateX509Data subject;

    public ManagementKeyCertificateCertificateRequestInformation() {
    }

    public ManagementKeyCertificateCertificateRequestInformation(
           iControl.ManagementKeyCertificateCertificateRequest csr_info,
           java.lang.String title,
           java.lang.String serial_number,
           java.lang.String file_name,
           iControl.ManagementKeyCertificateKeyType key_type,
           long bit_length,
           iControl.ManagementKeyCertificateX509Data subject) {
           this.csr_info = csr_info;
           this.title = title;
           this.serial_number = serial_number;
           this.file_name = file_name;
           this.key_type = key_type;
           this.bit_length = bit_length;
           this.subject = subject;
    }


    /**
     * Gets the csr_info value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @return csr_info
     */
    public iControl.ManagementKeyCertificateCertificateRequest getCsr_info() {
        return csr_info;
    }


    /**
     * Sets the csr_info value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @param csr_info
     */
    public void setCsr_info(iControl.ManagementKeyCertificateCertificateRequest csr_info) {
        this.csr_info = csr_info;
    }


    /**
     * Gets the title value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the serial_number value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @return serial_number
     */
    public java.lang.String getSerial_number() {
        return serial_number;
    }


    /**
     * Sets the serial_number value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @param serial_number
     */
    public void setSerial_number(java.lang.String serial_number) {
        this.serial_number = serial_number;
    }


    /**
     * Gets the file_name value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the key_type value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @return key_type
     */
    public iControl.ManagementKeyCertificateKeyType getKey_type() {
        return key_type;
    }


    /**
     * Sets the key_type value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @param key_type
     */
    public void setKey_type(iControl.ManagementKeyCertificateKeyType key_type) {
        this.key_type = key_type;
    }


    /**
     * Gets the bit_length value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @return bit_length
     */
    public long getBit_length() {
        return bit_length;
    }


    /**
     * Sets the bit_length value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @param bit_length
     */
    public void setBit_length(long bit_length) {
        this.bit_length = bit_length;
    }


    /**
     * Gets the subject value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @return subject
     */
    public iControl.ManagementKeyCertificateX509Data getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ManagementKeyCertificateCertificateRequestInformation.
     * 
     * @param subject
     */
    public void setSubject(iControl.ManagementKeyCertificateX509Data subject) {
        this.subject = subject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementKeyCertificateCertificateRequestInformation)) return false;
        ManagementKeyCertificateCertificateRequestInformation other = (ManagementKeyCertificateCertificateRequestInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.csr_info==null && other.getCsr_info()==null) || 
             (this.csr_info!=null &&
              this.csr_info.equals(other.getCsr_info()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.serial_number==null && other.getSerial_number()==null) || 
             (this.serial_number!=null &&
              this.serial_number.equals(other.getSerial_number()))) &&
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            ((this.key_type==null && other.getKey_type()==null) || 
             (this.key_type!=null &&
              this.key_type.equals(other.getKey_type()))) &&
            this.bit_length == other.getBit_length() &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject())));
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
        if (getCsr_info() != null) {
            _hashCode += getCsr_info().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getSerial_number() != null) {
            _hashCode += getSerial_number().hashCode();
        }
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        if (getKey_type() != null) {
            _hashCode += getKey_type().hashCode();
        }
        _hashCode += new Long(getBit_length()).hashCode();
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementKeyCertificateCertificateRequestInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.CertificateRequestInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csr_info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csr_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.CertificateRequest"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
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
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
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
