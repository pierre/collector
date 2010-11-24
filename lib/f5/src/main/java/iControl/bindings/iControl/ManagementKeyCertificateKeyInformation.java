/**
 * ManagementKeyCertificateKeyInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKeyCertificateKeyInformation  implements java.io.Serializable {
    private iControl.ManagementKeyCertificateKey key_info;

    private java.lang.String file_name;

    private long flags;

    public ManagementKeyCertificateKeyInformation() {
    }

    public ManagementKeyCertificateKeyInformation(
           iControl.ManagementKeyCertificateKey key_info,
           java.lang.String file_name,
           long flags) {
           this.key_info = key_info;
           this.file_name = file_name;
           this.flags = flags;
    }


    /**
     * Gets the key_info value for this ManagementKeyCertificateKeyInformation.
     * 
     * @return key_info
     */
    public iControl.ManagementKeyCertificateKey getKey_info() {
        return key_info;
    }


    /**
     * Sets the key_info value for this ManagementKeyCertificateKeyInformation.
     * 
     * @param key_info
     */
    public void setKey_info(iControl.ManagementKeyCertificateKey key_info) {
        this.key_info = key_info;
    }


    /**
     * Gets the file_name value for this ManagementKeyCertificateKeyInformation.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this ManagementKeyCertificateKeyInformation.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the flags value for this ManagementKeyCertificateKeyInformation.
     * 
     * @return flags
     */
    public long getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this ManagementKeyCertificateKeyInformation.
     * 
     * @param flags
     */
    public void setFlags(long flags) {
        this.flags = flags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementKeyCertificateKeyInformation)) return false;
        ManagementKeyCertificateKeyInformation other = (ManagementKeyCertificateKeyInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key_info==null && other.getKey_info()==null) || 
             (this.key_info!=null &&
              this.key_info.equals(other.getKey_info()))) &&
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            this.flags == other.getFlags();
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
        if (getKey_info() != null) {
            _hashCode += getKey_info().hashCode();
        }
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        _hashCode += new Long(getFlags()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementKeyCertificateKeyInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.KeyInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key_info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.Key"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
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
