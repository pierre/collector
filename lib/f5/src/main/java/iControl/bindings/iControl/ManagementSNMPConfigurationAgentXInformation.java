/**
 * ManagementSNMPConfigurationAgentXInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationAgentXInformation  implements java.io.Serializable {
    private java.lang.String address;

    private long timeout;

    private long retries;

    public ManagementSNMPConfigurationAgentXInformation() {
    }

    public ManagementSNMPConfigurationAgentXInformation(
           java.lang.String address,
           long timeout,
           long retries) {
           this.address = address;
           this.timeout = timeout;
           this.retries = retries;
    }


    /**
     * Gets the address value for this ManagementSNMPConfigurationAgentXInformation.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ManagementSNMPConfigurationAgentXInformation.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the timeout value for this ManagementSNMPConfigurationAgentXInformation.
     * 
     * @return timeout
     */
    public long getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this ManagementSNMPConfigurationAgentXInformation.
     * 
     * @param timeout
     */
    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the retries value for this ManagementSNMPConfigurationAgentXInformation.
     * 
     * @return retries
     */
    public long getRetries() {
        return retries;
    }


    /**
     * Sets the retries value for this ManagementSNMPConfigurationAgentXInformation.
     * 
     * @param retries
     */
    public void setRetries(long retries) {
        this.retries = retries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationAgentXInformation)) return false;
        ManagementSNMPConfigurationAgentXInformation other = (ManagementSNMPConfigurationAgentXInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.timeout == other.getTimeout() &&
            this.retries == other.getRetries();
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += new Long(getTimeout()).hashCode();
        _hashCode += new Long(getRetries()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationAgentXInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentXInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retries"));
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
