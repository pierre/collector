/**
 * ManagementTXTRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementTXTRecord  implements java.io.Serializable {
    private java.lang.String domain_name;

    private java.lang.String text;

    private long ttl;

    public ManagementTXTRecord() {
    }

    public ManagementTXTRecord(
           java.lang.String domain_name,
           java.lang.String text,
           long ttl) {
           this.domain_name = domain_name;
           this.text = text;
           this.ttl = ttl;
    }


    /**
     * Gets the domain_name value for this ManagementTXTRecord.
     * 
     * @return domain_name
     */
    public java.lang.String getDomain_name() {
        return domain_name;
    }


    /**
     * Sets the domain_name value for this ManagementTXTRecord.
     * 
     * @param domain_name
     */
    public void setDomain_name(java.lang.String domain_name) {
        this.domain_name = domain_name;
    }


    /**
     * Gets the text value for this ManagementTXTRecord.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this ManagementTXTRecord.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the ttl value for this ManagementTXTRecord.
     * 
     * @return ttl
     */
    public long getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this ManagementTXTRecord.
     * 
     * @param ttl
     */
    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementTXTRecord)) return false;
        ManagementTXTRecord other = (ManagementTXTRecord) obj;
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
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        _hashCode += new Long(getTtl()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementTXTRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.TXTRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
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
