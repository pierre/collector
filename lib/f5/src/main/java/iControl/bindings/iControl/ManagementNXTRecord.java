/**
 * ManagementNXTRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementNXTRecord  implements java.io.Serializable {
    private java.lang.String domain_name;

    private java.lang.String nxt_domain;

    private java.lang.String types;

    private long ttl;

    public ManagementNXTRecord() {
    }

    public ManagementNXTRecord(
           java.lang.String domain_name,
           java.lang.String nxt_domain,
           java.lang.String types,
           long ttl) {
           this.domain_name = domain_name;
           this.nxt_domain = nxt_domain;
           this.types = types;
           this.ttl = ttl;
    }


    /**
     * Gets the domain_name value for this ManagementNXTRecord.
     * 
     * @return domain_name
     */
    public java.lang.String getDomain_name() {
        return domain_name;
    }


    /**
     * Sets the domain_name value for this ManagementNXTRecord.
     * 
     * @param domain_name
     */
    public void setDomain_name(java.lang.String domain_name) {
        this.domain_name = domain_name;
    }


    /**
     * Gets the nxt_domain value for this ManagementNXTRecord.
     * 
     * @return nxt_domain
     */
    public java.lang.String getNxt_domain() {
        return nxt_domain;
    }


    /**
     * Sets the nxt_domain value for this ManagementNXTRecord.
     * 
     * @param nxt_domain
     */
    public void setNxt_domain(java.lang.String nxt_domain) {
        this.nxt_domain = nxt_domain;
    }


    /**
     * Gets the types value for this ManagementNXTRecord.
     * 
     * @return types
     */
    public java.lang.String getTypes() {
        return types;
    }


    /**
     * Sets the types value for this ManagementNXTRecord.
     * 
     * @param types
     */
    public void setTypes(java.lang.String types) {
        this.types = types;
    }


    /**
     * Gets the ttl value for this ManagementNXTRecord.
     * 
     * @return ttl
     */
    public long getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this ManagementNXTRecord.
     * 
     * @param ttl
     */
    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementNXTRecord)) return false;
        ManagementNXTRecord other = (ManagementNXTRecord) obj;
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
            ((this.nxt_domain==null && other.getNxt_domain()==null) || 
             (this.nxt_domain!=null &&
              this.nxt_domain.equals(other.getNxt_domain()))) &&
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              this.types.equals(other.getTypes()))) &&
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
        if (getNxt_domain() != null) {
            _hashCode += getNxt_domain().hashCode();
        }
        if (getTypes() != null) {
            _hashCode += getTypes().hashCode();
        }
        _hashCode += new Long(getTtl()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementNXTRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.NXTRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nxt_domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nxt_domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("", "types"));
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
