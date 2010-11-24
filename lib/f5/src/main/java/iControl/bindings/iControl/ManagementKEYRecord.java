/**
 * ManagementKEYRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKEYRecord  implements java.io.Serializable {
    private java.lang.String domain_name;

    private int flags;

    private int protocol;

    private int algorithm;

    private java.lang.String public_key;

    private long ttl;

    public ManagementKEYRecord() {
    }

    public ManagementKEYRecord(
           java.lang.String domain_name,
           int flags,
           int protocol,
           int algorithm,
           java.lang.String public_key,
           long ttl) {
           this.domain_name = domain_name;
           this.flags = flags;
           this.protocol = protocol;
           this.algorithm = algorithm;
           this.public_key = public_key;
           this.ttl = ttl;
    }


    /**
     * Gets the domain_name value for this ManagementKEYRecord.
     * 
     * @return domain_name
     */
    public java.lang.String getDomain_name() {
        return domain_name;
    }


    /**
     * Sets the domain_name value for this ManagementKEYRecord.
     * 
     * @param domain_name
     */
    public void setDomain_name(java.lang.String domain_name) {
        this.domain_name = domain_name;
    }


    /**
     * Gets the flags value for this ManagementKEYRecord.
     * 
     * @return flags
     */
    public int getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this ManagementKEYRecord.
     * 
     * @param flags
     */
    public void setFlags(int flags) {
        this.flags = flags;
    }


    /**
     * Gets the protocol value for this ManagementKEYRecord.
     * 
     * @return protocol
     */
    public int getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this ManagementKEYRecord.
     * 
     * @param protocol
     */
    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the algorithm value for this ManagementKEYRecord.
     * 
     * @return algorithm
     */
    public int getAlgorithm() {
        return algorithm;
    }


    /**
     * Sets the algorithm value for this ManagementKEYRecord.
     * 
     * @param algorithm
     */
    public void setAlgorithm(int algorithm) {
        this.algorithm = algorithm;
    }


    /**
     * Gets the public_key value for this ManagementKEYRecord.
     * 
     * @return public_key
     */
    public java.lang.String getPublic_key() {
        return public_key;
    }


    /**
     * Sets the public_key value for this ManagementKEYRecord.
     * 
     * @param public_key
     */
    public void setPublic_key(java.lang.String public_key) {
        this.public_key = public_key;
    }


    /**
     * Gets the ttl value for this ManagementKEYRecord.
     * 
     * @return ttl
     */
    public long getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this ManagementKEYRecord.
     * 
     * @param ttl
     */
    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementKEYRecord)) return false;
        ManagementKEYRecord other = (ManagementKEYRecord) obj;
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
            this.flags == other.getFlags() &&
            this.protocol == other.getProtocol() &&
            this.algorithm == other.getAlgorithm() &&
            ((this.public_key==null && other.getPublic_key()==null) || 
             (this.public_key!=null &&
              this.public_key.equals(other.getPublic_key()))) &&
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
        _hashCode += getFlags();
        _hashCode += getProtocol();
        _hashCode += getAlgorithm();
        if (getPublic_key() != null) {
            _hashCode += getPublic_key().hashCode();
        }
        _hashCode += new Long(getTtl()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementKEYRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KEYRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
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
        elemField.setFieldName("public_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "public_key"));
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
