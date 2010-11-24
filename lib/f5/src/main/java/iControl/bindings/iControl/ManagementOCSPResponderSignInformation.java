/**
 * ManagementOCSPResponderSignInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementOCSPResponderSignInformation  implements java.io.Serializable {
    private java.lang.String signer_certificate;

    private java.lang.String private_key;

    private java.lang.String pass_phrase;

    private java.lang.String other_certificate;

    private iControl.ManagementOCSPDigestMethod digest_method;

    public ManagementOCSPResponderSignInformation() {
    }

    public ManagementOCSPResponderSignInformation(
           java.lang.String signer_certificate,
           java.lang.String private_key,
           java.lang.String pass_phrase,
           java.lang.String other_certificate,
           iControl.ManagementOCSPDigestMethod digest_method) {
           this.signer_certificate = signer_certificate;
           this.private_key = private_key;
           this.pass_phrase = pass_phrase;
           this.other_certificate = other_certificate;
           this.digest_method = digest_method;
    }


    /**
     * Gets the signer_certificate value for this ManagementOCSPResponderSignInformation.
     * 
     * @return signer_certificate
     */
    public java.lang.String getSigner_certificate() {
        return signer_certificate;
    }


    /**
     * Sets the signer_certificate value for this ManagementOCSPResponderSignInformation.
     * 
     * @param signer_certificate
     */
    public void setSigner_certificate(java.lang.String signer_certificate) {
        this.signer_certificate = signer_certificate;
    }


    /**
     * Gets the private_key value for this ManagementOCSPResponderSignInformation.
     * 
     * @return private_key
     */
    public java.lang.String getPrivate_key() {
        return private_key;
    }


    /**
     * Sets the private_key value for this ManagementOCSPResponderSignInformation.
     * 
     * @param private_key
     */
    public void setPrivate_key(java.lang.String private_key) {
        this.private_key = private_key;
    }


    /**
     * Gets the pass_phrase value for this ManagementOCSPResponderSignInformation.
     * 
     * @return pass_phrase
     */
    public java.lang.String getPass_phrase() {
        return pass_phrase;
    }


    /**
     * Sets the pass_phrase value for this ManagementOCSPResponderSignInformation.
     * 
     * @param pass_phrase
     */
    public void setPass_phrase(java.lang.String pass_phrase) {
        this.pass_phrase = pass_phrase;
    }


    /**
     * Gets the other_certificate value for this ManagementOCSPResponderSignInformation.
     * 
     * @return other_certificate
     */
    public java.lang.String getOther_certificate() {
        return other_certificate;
    }


    /**
     * Sets the other_certificate value for this ManagementOCSPResponderSignInformation.
     * 
     * @param other_certificate
     */
    public void setOther_certificate(java.lang.String other_certificate) {
        this.other_certificate = other_certificate;
    }


    /**
     * Gets the digest_method value for this ManagementOCSPResponderSignInformation.
     * 
     * @return digest_method
     */
    public iControl.ManagementOCSPDigestMethod getDigest_method() {
        return digest_method;
    }


    /**
     * Sets the digest_method value for this ManagementOCSPResponderSignInformation.
     * 
     * @param digest_method
     */
    public void setDigest_method(iControl.ManagementOCSPDigestMethod digest_method) {
        this.digest_method = digest_method;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementOCSPResponderSignInformation)) return false;
        ManagementOCSPResponderSignInformation other = (ManagementOCSPResponderSignInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signer_certificate==null && other.getSigner_certificate()==null) || 
             (this.signer_certificate!=null &&
              this.signer_certificate.equals(other.getSigner_certificate()))) &&
            ((this.private_key==null && other.getPrivate_key()==null) || 
             (this.private_key!=null &&
              this.private_key.equals(other.getPrivate_key()))) &&
            ((this.pass_phrase==null && other.getPass_phrase()==null) || 
             (this.pass_phrase!=null &&
              this.pass_phrase.equals(other.getPass_phrase()))) &&
            ((this.other_certificate==null && other.getOther_certificate()==null) || 
             (this.other_certificate!=null &&
              this.other_certificate.equals(other.getOther_certificate()))) &&
            ((this.digest_method==null && other.getDigest_method()==null) || 
             (this.digest_method!=null &&
              this.digest_method.equals(other.getDigest_method())));
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
        if (getSigner_certificate() != null) {
            _hashCode += getSigner_certificate().hashCode();
        }
        if (getPrivate_key() != null) {
            _hashCode += getPrivate_key().hashCode();
        }
        if (getPass_phrase() != null) {
            _hashCode += getPass_phrase().hashCode();
        }
        if (getOther_certificate() != null) {
            _hashCode += getOther_certificate().hashCode();
        }
        if (getDigest_method() != null) {
            _hashCode += getDigest_method().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementOCSPResponderSignInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.OCSPResponder.SignInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signer_certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signer_certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("private_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "private_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass_phrase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pass_phrase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other_certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "other_certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digest_method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digest_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.OCSPDigestMethod"));
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
