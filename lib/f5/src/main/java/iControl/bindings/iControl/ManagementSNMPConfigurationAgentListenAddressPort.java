/**
 * ManagementSNMPConfigurationAgentListenAddressPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationAgentListenAddressPort  implements java.io.Serializable {
    private iControl.ManagementSNMPConfigurationTransportType transport;

    private iControl.CommonIPPortDefinition ipport;

    public ManagementSNMPConfigurationAgentListenAddressPort() {
    }

    public ManagementSNMPConfigurationAgentListenAddressPort(
           iControl.ManagementSNMPConfigurationTransportType transport,
           iControl.CommonIPPortDefinition ipport) {
           this.transport = transport;
           this.ipport = ipport;
    }


    /**
     * Gets the transport value for this ManagementSNMPConfigurationAgentListenAddressPort.
     * 
     * @return transport
     */
    public iControl.ManagementSNMPConfigurationTransportType getTransport() {
        return transport;
    }


    /**
     * Sets the transport value for this ManagementSNMPConfigurationAgentListenAddressPort.
     * 
     * @param transport
     */
    public void setTransport(iControl.ManagementSNMPConfigurationTransportType transport) {
        this.transport = transport;
    }


    /**
     * Gets the ipport value for this ManagementSNMPConfigurationAgentListenAddressPort.
     * 
     * @return ipport
     */
    public iControl.CommonIPPortDefinition getIpport() {
        return ipport;
    }


    /**
     * Sets the ipport value for this ManagementSNMPConfigurationAgentListenAddressPort.
     * 
     * @param ipport
     */
    public void setIpport(iControl.CommonIPPortDefinition ipport) {
        this.ipport = ipport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationAgentListenAddressPort)) return false;
        ManagementSNMPConfigurationAgentListenAddressPort other = (ManagementSNMPConfigurationAgentListenAddressPort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transport==null && other.getTransport()==null) || 
             (this.transport!=null &&
              this.transport.equals(other.getTransport()))) &&
            ((this.ipport==null && other.getIpport()==null) || 
             (this.ipport!=null &&
              this.ipport.equals(other.getIpport())));
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
        if (getTransport() != null) {
            _hashCode += getTransport().hashCode();
        }
        if (getIpport() != null) {
            _hashCode += getIpport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationAgentListenAddressPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentListenAddressPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.TransportType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
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
