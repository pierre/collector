/**
 * ManagementA6Record.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementA6Record  implements java.io.Serializable {
    private java.lang.String domain_name;

    private int prefix_bits;

    private java.lang.String ip_address;

    private java.lang.String prefix_name;

    private long ttl;

    public ManagementA6Record() {
    }

    public ManagementA6Record(
           java.lang.String domain_name,
           int prefix_bits,
           java.lang.String ip_address,
           java.lang.String prefix_name,
           long ttl) {
           this.domain_name = domain_name;
           this.prefix_bits = prefix_bits;
           this.ip_address = ip_address;
           this.prefix_name = prefix_name;
           this.ttl = ttl;
    }


    /**
     * Gets the domain_name value for this ManagementA6Record.
     * 
     * @return domain_name
     */
    public java.lang.String getDomain_name() {
        return domain_name;
    }


    /**
     * Sets the domain_name value for this ManagementA6Record.
     * 
     * @param domain_name
     */
    public void setDomain_name(java.lang.String domain_name) {
        this.domain_name = domain_name;
    }


    /**
     * Gets the prefix_bits value for this ManagementA6Record.
     * 
     * @return prefix_bits
     */
    public int getPrefix_bits() {
        return prefix_bits;
    }


    /**
     * Sets the prefix_bits value for this ManagementA6Record.
     * 
     * @param prefix_bits
     */
    public void setPrefix_bits(int prefix_bits) {
        this.prefix_bits = prefix_bits;
    }


    /**
     * Gets the ip_address value for this ManagementA6Record.
     * 
     * @return ip_address
     */
    public java.lang.String getIp_address() {
        return ip_address;
    }


    /**
     * Sets the ip_address value for this ManagementA6Record.
     * 
     * @param ip_address
     */
    public void setIp_address(java.lang.String ip_address) {
        this.ip_address = ip_address;
    }


    /**
     * Gets the prefix_name value for this ManagementA6Record.
     * 
     * @return prefix_name
     */
    public java.lang.String getPrefix_name() {
        return prefix_name;
    }


    /**
     * Sets the prefix_name value for this ManagementA6Record.
     * 
     * @param prefix_name
     */
    public void setPrefix_name(java.lang.String prefix_name) {
        this.prefix_name = prefix_name;
    }


    /**
     * Gets the ttl value for this ManagementA6Record.
     * 
     * @return ttl
     */
    public long getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this ManagementA6Record.
     * 
     * @param ttl
     */
    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementA6Record)) return false;
        ManagementA6Record other = (ManagementA6Record) obj;
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
            this.prefix_bits == other.getPrefix_bits() &&
            ((this.ip_address==null && other.getIp_address()==null) || 
             (this.ip_address!=null &&
              this.ip_address.equals(other.getIp_address()))) &&
            ((this.prefix_name==null && other.getPrefix_name()==null) || 
             (this.prefix_name!=null &&
              this.prefix_name.equals(other.getPrefix_name()))) &&
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
        _hashCode += getPrefix_bits();
        if (getIp_address() != null) {
            _hashCode += getIp_address().hashCode();
        }
        if (getPrefix_name() != null) {
            _hashCode += getPrefix_name().hashCode();
        }
        _hashCode += new Long(getTtl()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementA6Record.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.A6Record"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix_bits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefix_bits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefix_name"));
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
