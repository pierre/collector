/**
 * NetworkingSelfIPPortLockdownProtocolPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingSelfIPPortLockdownProtocolPort  implements java.io.Serializable {
    private iControl.CommonProtocolType protocol;

    private long port;

    public NetworkingSelfIPPortLockdownProtocolPort() {
    }

    public NetworkingSelfIPPortLockdownProtocolPort(
           iControl.CommonProtocolType protocol,
           long port) {
           this.protocol = protocol;
           this.port = port;
    }


    /**
     * Gets the protocol value for this NetworkingSelfIPPortLockdownProtocolPort.
     * 
     * @return protocol
     */
    public iControl.CommonProtocolType getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this NetworkingSelfIPPortLockdownProtocolPort.
     * 
     * @param protocol
     */
    public void setProtocol(iControl.CommonProtocolType protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the port value for this NetworkingSelfIPPortLockdownProtocolPort.
     * 
     * @return port
     */
    public long getPort() {
        return port;
    }


    /**
     * Sets the port value for this NetworkingSelfIPPortLockdownProtocolPort.
     * 
     * @param port
     */
    public void setPort(long port) {
        this.port = port;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingSelfIPPortLockdownProtocolPort)) return false;
        NetworkingSelfIPPortLockdownProtocolPort other = (NetworkingSelfIPPortLockdownProtocolPort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            this.port == other.getPort();
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
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        _hashCode += new Long(getPort()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingSelfIPPortLockdownProtocolPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.SelfIPPortLockdown.ProtocolPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ProtocolType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
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
