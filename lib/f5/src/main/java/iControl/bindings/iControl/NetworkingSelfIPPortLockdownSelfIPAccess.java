/**
 * NetworkingSelfIPPortLockdownSelfIPAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingSelfIPPortLockdownSelfIPAccess  implements java.io.Serializable {
    private java.lang.String self_ip;

    private iControl.NetworkingSelfIPPortLockdownAllowMode mode;

    private iControl.NetworkingSelfIPPortLockdownProtocolPort[] protocol_ports;

    public NetworkingSelfIPPortLockdownSelfIPAccess() {
    }

    public NetworkingSelfIPPortLockdownSelfIPAccess(
           java.lang.String self_ip,
           iControl.NetworkingSelfIPPortLockdownAllowMode mode,
           iControl.NetworkingSelfIPPortLockdownProtocolPort[] protocol_ports) {
           this.self_ip = self_ip;
           this.mode = mode;
           this.protocol_ports = protocol_ports;
    }


    /**
     * Gets the self_ip value for this NetworkingSelfIPPortLockdownSelfIPAccess.
     * 
     * @return self_ip
     */
    public java.lang.String getSelf_ip() {
        return self_ip;
    }


    /**
     * Sets the self_ip value for this NetworkingSelfIPPortLockdownSelfIPAccess.
     * 
     * @param self_ip
     */
    public void setSelf_ip(java.lang.String self_ip) {
        this.self_ip = self_ip;
    }


    /**
     * Gets the mode value for this NetworkingSelfIPPortLockdownSelfIPAccess.
     * 
     * @return mode
     */
    public iControl.NetworkingSelfIPPortLockdownAllowMode getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this NetworkingSelfIPPortLockdownSelfIPAccess.
     * 
     * @param mode
     */
    public void setMode(iControl.NetworkingSelfIPPortLockdownAllowMode mode) {
        this.mode = mode;
    }


    /**
     * Gets the protocol_ports value for this NetworkingSelfIPPortLockdownSelfIPAccess.
     * 
     * @return protocol_ports
     */
    public iControl.NetworkingSelfIPPortLockdownProtocolPort[] getProtocol_ports() {
        return protocol_ports;
    }


    /**
     * Sets the protocol_ports value for this NetworkingSelfIPPortLockdownSelfIPAccess.
     * 
     * @param protocol_ports
     */
    public void setProtocol_ports(iControl.NetworkingSelfIPPortLockdownProtocolPort[] protocol_ports) {
        this.protocol_ports = protocol_ports;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingSelfIPPortLockdownSelfIPAccess)) return false;
        NetworkingSelfIPPortLockdownSelfIPAccess other = (NetworkingSelfIPPortLockdownSelfIPAccess) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.self_ip==null && other.getSelf_ip()==null) || 
             (this.self_ip!=null &&
              this.self_ip.equals(other.getSelf_ip()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.protocol_ports==null && other.getProtocol_ports()==null) || 
             (this.protocol_ports!=null &&
              java.util.Arrays.equals(this.protocol_ports, other.getProtocol_ports())));
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
        if (getSelf_ip() != null) {
            _hashCode += getSelf_ip().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getProtocol_ports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtocol_ports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtocol_ports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingSelfIPPortLockdownSelfIPAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.SelfIPPortLockdown.SelfIPAccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("self_ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "self_ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.SelfIPPortLockdown.AllowMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol_ports");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol_ports"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.SelfIPPortLockdown.ProtocolPort"));
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
