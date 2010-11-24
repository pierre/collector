/**
 * ManagementSIGRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSIGRecord  implements java.io.Serializable {
    private java.lang.String domain_name;

    private int type_covered;

    private int algorithm;

    private int labels;

    private long orig_ttl;

    private java.lang.String sig_expiration;

    private java.lang.String sig_inception;

    private int key_tag;

    private java.lang.String signer_name;

    private java.lang.String signature;

    private long ttl;

    public ManagementSIGRecord() {
    }

    public ManagementSIGRecord(
           java.lang.String domain_name,
           int type_covered,
           int algorithm,
           int labels,
           long orig_ttl,
           java.lang.String sig_expiration,
           java.lang.String sig_inception,
           int key_tag,
           java.lang.String signer_name,
           java.lang.String signature,
           long ttl) {
           this.domain_name = domain_name;
           this.type_covered = type_covered;
           this.algorithm = algorithm;
           this.labels = labels;
           this.orig_ttl = orig_ttl;
           this.sig_expiration = sig_expiration;
           this.sig_inception = sig_inception;
           this.key_tag = key_tag;
           this.signer_name = signer_name;
           this.signature = signature;
           this.ttl = ttl;
    }


    /**
     * Gets the domain_name value for this ManagementSIGRecord.
     * 
     * @return domain_name
     */
    public java.lang.String getDomain_name() {
        return domain_name;
    }


    /**
     * Sets the domain_name value for this ManagementSIGRecord.
     * 
     * @param domain_name
     */
    public void setDomain_name(java.lang.String domain_name) {
        this.domain_name = domain_name;
    }


    /**
     * Gets the type_covered value for this ManagementSIGRecord.
     * 
     * @return type_covered
     */
    public int getType_covered() {
        return type_covered;
    }


    /**
     * Sets the type_covered value for this ManagementSIGRecord.
     * 
     * @param type_covered
     */
    public void setType_covered(int type_covered) {
        this.type_covered = type_covered;
    }


    /**
     * Gets the algorithm value for this ManagementSIGRecord.
     * 
     * @return algorithm
     */
    public int getAlgorithm() {
        return algorithm;
    }


    /**
     * Sets the algorithm value for this ManagementSIGRecord.
     * 
     * @param algorithm
     */
    public void setAlgorithm(int algorithm) {
        this.algorithm = algorithm;
    }


    /**
     * Gets the labels value for this ManagementSIGRecord.
     * 
     * @return labels
     */
    public int getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this ManagementSIGRecord.
     * 
     * @param labels
     */
    public void setLabels(int labels) {
        this.labels = labels;
    }


    /**
     * Gets the orig_ttl value for this ManagementSIGRecord.
     * 
     * @return orig_ttl
     */
    public long getOrig_ttl() {
        return orig_ttl;
    }


    /**
     * Sets the orig_ttl value for this ManagementSIGRecord.
     * 
     * @param orig_ttl
     */
    public void setOrig_ttl(long orig_ttl) {
        this.orig_ttl = orig_ttl;
    }


    /**
     * Gets the sig_expiration value for this ManagementSIGRecord.
     * 
     * @return sig_expiration
     */
    public java.lang.String getSig_expiration() {
        return sig_expiration;
    }


    /**
     * Sets the sig_expiration value for this ManagementSIGRecord.
     * 
     * @param sig_expiration
     */
    public void setSig_expiration(java.lang.String sig_expiration) {
        this.sig_expiration = sig_expiration;
    }


    /**
     * Gets the sig_inception value for this ManagementSIGRecord.
     * 
     * @return sig_inception
     */
    public java.lang.String getSig_inception() {
        return sig_inception;
    }


    /**
     * Sets the sig_inception value for this ManagementSIGRecord.
     * 
     * @param sig_inception
     */
    public void setSig_inception(java.lang.String sig_inception) {
        this.sig_inception = sig_inception;
    }


    /**
     * Gets the key_tag value for this ManagementSIGRecord.
     * 
     * @return key_tag
     */
    public int getKey_tag() {
        return key_tag;
    }


    /**
     * Sets the key_tag value for this ManagementSIGRecord.
     * 
     * @param key_tag
     */
    public void setKey_tag(int key_tag) {
        this.key_tag = key_tag;
    }


    /**
     * Gets the signer_name value for this ManagementSIGRecord.
     * 
     * @return signer_name
     */
    public java.lang.String getSigner_name() {
        return signer_name;
    }


    /**
     * Sets the signer_name value for this ManagementSIGRecord.
     * 
     * @param signer_name
     */
    public void setSigner_name(java.lang.String signer_name) {
        this.signer_name = signer_name;
    }


    /**
     * Gets the signature value for this ManagementSIGRecord.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ManagementSIGRecord.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the ttl value for this ManagementSIGRecord.
     * 
     * @return ttl
     */
    public long getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this ManagementSIGRecord.
     * 
     * @param ttl
     */
    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSIGRecord)) return false;
        ManagementSIGRecord other = (ManagementSIGRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domain_name==null && other.getDomain_name()==null) || 
             (this.domain_name!=null &&
              this.domain_name.equals(other.getDomain_name()))) &&
            this.type_covered == other.getType_covered() &&
            this.algorithm == other.getAlgorithm() &&
            this.labels == other.getLabels() &&
            this.orig_ttl == other.getOrig_ttl() &&
            ((this.sig_expiration==null && other.getSig_expiration()==null) || 
             (this.sig_expiration!=null &&
              this.sig_expiration.equals(other.getSig_expiration()))) &&
            ((this.sig_inception==null && other.getSig_inception()==null) || 
             (this.sig_inception!=null &&
              this.sig_inception.equals(other.getSig_inception()))) &&
            this.key_tag == other.getKey_tag() &&
            ((this.signer_name==null && other.getSigner_name()==null) || 
             (this.signer_name!=null &&
              this.signer_name.equals(other.getSigner_name()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            this.ttl == other.getTtl();
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
        if (getDomain_name() != null) {
            _hashCode += getDomain_name().hashCode();
        }
        _hashCode += getType_covered();
        _hashCode += getAlgorithm();
        _hashCode += getLabels();
        _hashCode += new Long(getOrig_ttl()).hashCode();
        if (getSig_expiration() != null) {
            _hashCode += getSig_expiration().hashCode();
        }
        if (getSig_inception() != null) {
            _hashCode += getSig_inception().hashCode();
        }
        _hashCode += getKey_tag();
        if (getSigner_name() != null) {
            _hashCode += getSigner_name().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        _hashCode += new Long(getTtl()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSIGRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SIGRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type_covered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type_covered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("algorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "algorithm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orig_ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orig_ttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sig_expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sig_expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sig_inception");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sig_inception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key_tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key_tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signer_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signer_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttl"));
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
