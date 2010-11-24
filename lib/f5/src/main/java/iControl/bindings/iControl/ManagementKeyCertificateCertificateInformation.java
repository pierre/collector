/**
 * ManagementKeyCertificateCertificateInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKeyCertificateCertificateInformation  implements java.io.Serializable {
    private boolean is_bundled;

    private java.lang.String file_name;

    private iControl.ManagementKeyCertificateCertificateDetail certificate;

    public ManagementKeyCertificateCertificateInformation() {
    }

    public ManagementKeyCertificateCertificateInformation(
           boolean is_bundled,
           java.lang.String file_name,
           iControl.ManagementKeyCertificateCertificateDetail certificate) {
           this.is_bundled = is_bundled;
           this.file_name = file_name;
           this.certificate = certificate;
    }


    /**
     * Gets the is_bundled value for this ManagementKeyCertificateCertificateInformation.
     * 
     * @return is_bundled
     */
    public boolean isIs_bundled() {
        return is_bundled;
    }


    /**
     * Sets the is_bundled value for this ManagementKeyCertificateCertificateInformation.
     * 
     * @param is_bundled
     */
    public void setIs_bundled(boolean is_bundled) {
        this.is_bundled = is_bundled;
    }


    /**
     * Gets the file_name value for this ManagementKeyCertificateCertificateInformation.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this ManagementKeyCertificateCertificateInformation.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the certificate value for this ManagementKeyCertificateCertificateInformation.
     * 
     * @return certificate
     */
    public iControl.ManagementKeyCertificateCertificateDetail getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this ManagementKeyCertificateCertificateInformation.
     * 
     * @param certificate
     */
    public void setCertificate(iControl.ManagementKeyCertificateCertificateDetail certificate) {
        this.certificate = certificate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementKeyCertificateCertificateInformation)) return false;
        ManagementKeyCertificateCertificateInformation other = (ManagementKeyCertificateCertificateInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.is_bundled == other.isIs_bundled() &&
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate())));
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
        _hashCode += (isIs_bundled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementKeyCertificateCertificateInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.CertificateInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_bundled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_bundled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.CertificateDetail"));
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
