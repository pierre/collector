/**
 * ManagementSNMPConfigurationSinkInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationSinkInformation  implements java.io.Serializable {
    private java.lang.String sink_host;

    private java.lang.String sink_community;

    private long sink_port;

    public ManagementSNMPConfigurationSinkInformation() {
    }

    public ManagementSNMPConfigurationSinkInformation(
           java.lang.String sink_host,
           java.lang.String sink_community,
           long sink_port) {
           this.sink_host = sink_host;
           this.sink_community = sink_community;
           this.sink_port = sink_port;
    }


    /**
     * Gets the sink_host value for this ManagementSNMPConfigurationSinkInformation.
     * 
     * @return sink_host
     */
    public java.lang.String getSink_host() {
        return sink_host;
    }


    /**
     * Sets the sink_host value for this ManagementSNMPConfigurationSinkInformation.
     * 
     * @param sink_host
     */
    public void setSink_host(java.lang.String sink_host) {
        this.sink_host = sink_host;
    }


    /**
     * Gets the sink_community value for this ManagementSNMPConfigurationSinkInformation.
     * 
     * @return sink_community
     */
    public java.lang.String getSink_community() {
        return sink_community;
    }


    /**
     * Sets the sink_community value for this ManagementSNMPConfigurationSinkInformation.
     * 
     * @param sink_community
     */
    public void setSink_community(java.lang.String sink_community) {
        this.sink_community = sink_community;
    }


    /**
     * Gets the sink_port value for this ManagementSNMPConfigurationSinkInformation.
     * 
     * @return sink_port
     */
    public long getSink_port() {
        return sink_port;
    }


    /**
     * Sets the sink_port value for this ManagementSNMPConfigurationSinkInformation.
     * 
     * @param sink_port
     */
    public void setSink_port(long sink_port) {
        this.sink_port = sink_port;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationSinkInformation)) return false;
        ManagementSNMPConfigurationSinkInformation other = (ManagementSNMPConfigurationSinkInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sink_host==null && other.getSink_host()==null) || 
             (this.sink_host!=null &&
              this.sink_host.equals(other.getSink_host()))) &&
            ((this.sink_community==null && other.getSink_community()==null) || 
             (this.sink_community!=null &&
              this.sink_community.equals(other.getSink_community()))) &&
            this.sink_port == other.getSink_port();
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
        if (getSink_host() != null) {
            _hashCode += getSink_host().hashCode();
        }
        if (getSink_community() != null) {
            _hashCode += getSink_community().hashCode();
        }
        _hashCode += new Long(getSink_port()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationSinkInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SinkInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sink_host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sink_host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sink_community");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sink_community"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sink_port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sink_port"));
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
