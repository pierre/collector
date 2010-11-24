/**
 * ManagementSOARecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSOARecord  implements java.io.Serializable {
    private java.lang.String domain_name;

    private java.lang.String primary;

    private java.lang.String email;

    private long serial;

    private long refresh;

    private long retry;

    private long expire;

    private long neg_ttl;

    private long ttl;

    public ManagementSOARecord() {
    }

    public ManagementSOARecord(
           java.lang.String domain_name,
           java.lang.String primary,
           java.lang.String email,
           long serial,
           long refresh,
           long retry,
           long expire,
           long neg_ttl,
           long ttl) {
           this.domain_name = domain_name;
           this.primary = primary;
           this.email = email;
           this.serial = serial;
           this.refresh = refresh;
           this.retry = retry;
           this.expire = expire;
           this.neg_ttl = neg_ttl;
           this.ttl = ttl;
    }


    /**
     * Gets the domain_name value for this ManagementSOARecord.
     * 
     * @return domain_name
     */
    public java.lang.String getDomain_name() {
        return domain_name;
    }


    /**
     * Sets the domain_name value for this ManagementSOARecord.
     * 
     * @param domain_name
     */
    public void setDomain_name(java.lang.String domain_name) {
        this.domain_name = domain_name;
    }


    /**
     * Gets the primary value for this ManagementSOARecord.
     * 
     * @return primary
     */
    public java.lang.String getPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this ManagementSOARecord.
     * 
     * @param primary
     */
    public void setPrimary(java.lang.String primary) {
        this.primary = primary;
    }


    /**
     * Gets the email value for this ManagementSOARecord.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ManagementSOARecord.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the serial value for this ManagementSOARecord.
     * 
     * @return serial
     */
    public long getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this ManagementSOARecord.
     * 
     * @param serial
     */
    public void setSerial(long serial) {
        this.serial = serial;
    }


    /**
     * Gets the refresh value for this ManagementSOARecord.
     * 
     * @return refresh
     */
    public long getRefresh() {
        return refresh;
    }


    /**
     * Sets the refresh value for this ManagementSOARecord.
     * 
     * @param refresh
     */
    public void setRefresh(long refresh) {
        this.refresh = refresh;
    }


    /**
     * Gets the retry value for this ManagementSOARecord.
     * 
     * @return retry
     */
    public long getRetry() {
        return retry;
    }


    /**
     * Sets the retry value for this ManagementSOARecord.
     * 
     * @param retry
     */
    public void setRetry(long retry) {
        this.retry = retry;
    }


    /**
     * Gets the expire value for this ManagementSOARecord.
     * 
     * @return expire
     */
    public long getExpire() {
        return expire;
    }


    /**
     * Sets the expire value for this ManagementSOARecord.
     * 
     * @param expire
     */
    public void setExpire(long expire) {
        this.expire = expire;
    }


    /**
     * Gets the neg_ttl value for this ManagementSOARecord.
     * 
     * @return neg_ttl
     */
    public long getNeg_ttl() {
        return neg_ttl;
    }


    /**
     * Sets the neg_ttl value for this ManagementSOARecord.
     * 
     * @param neg_ttl
     */
    public void setNeg_ttl(long neg_ttl) {
        this.neg_ttl = neg_ttl;
    }


    /**
     * Gets the ttl value for this ManagementSOARecord.
     * 
     * @return ttl
     */
    public long getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this ManagementSOARecord.
     * 
     * @param ttl
     */
    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSOARecord)) return false;
        ManagementSOARecord other = (ManagementSOARecord) obj;
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
            ((this.primary==null && other.getPrimary()==null) || 
             (this.primary!=null &&
              this.primary.equals(other.getPrimary()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.serial == other.getSerial() &&
            this.refresh == other.getRefresh() &&
            this.retry == other.getRetry() &&
            this.expire == other.getExpire() &&
            this.neg_ttl == other.getNeg_ttl() &&
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
        if (getPrimary() != null) {
            _hashCode += getPrimary().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += new Long(getSerial()).hashCode();
        _hashCode += new Long(getRefresh()).hashCode();
        _hashCode += new Long(getRetry()).hashCode();
        _hashCode += new Long(getExpire()).hashCode();
        _hashCode += new Long(getNeg_ttl()).hashCode();
        _hashCode += new Long(getTtl()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSOARecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SOARecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neg_ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "neg_ttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
