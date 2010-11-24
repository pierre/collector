/**
 * ManagementSNMPConfigurationAgentInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationAgentInterface  implements java.io.Serializable {
    private java.lang.String intf_name;

    private java.lang.String intf_type;

    private java.lang.String intf_speed;

    public ManagementSNMPConfigurationAgentInterface() {
    }

    public ManagementSNMPConfigurationAgentInterface(
           java.lang.String intf_name,
           java.lang.String intf_type,
           java.lang.String intf_speed) {
           this.intf_name = intf_name;
           this.intf_type = intf_type;
           this.intf_speed = intf_speed;
    }


    /**
     * Gets the intf_name value for this ManagementSNMPConfigurationAgentInterface.
     * 
     * @return intf_name
     */
    public java.lang.String getIntf_name() {
        return intf_name;
    }


    /**
     * Sets the intf_name value for this ManagementSNMPConfigurationAgentInterface.
     * 
     * @param intf_name
     */
    public void setIntf_name(java.lang.String intf_name) {
        this.intf_name = intf_name;
    }


    /**
     * Gets the intf_type value for this ManagementSNMPConfigurationAgentInterface.
     * 
     * @return intf_type
     */
    public java.lang.String getIntf_type() {
        return intf_type;
    }


    /**
     * Sets the intf_type value for this ManagementSNMPConfigurationAgentInterface.
     * 
     * @param intf_type
     */
    public void setIntf_type(java.lang.String intf_type) {
        this.intf_type = intf_type;
    }


    /**
     * Gets the intf_speed value for this ManagementSNMPConfigurationAgentInterface.
     * 
     * @return intf_speed
     */
    public java.lang.String getIntf_speed() {
        return intf_speed;
    }


    /**
     * Sets the intf_speed value for this ManagementSNMPConfigurationAgentInterface.
     * 
     * @param intf_speed
     */
    public void setIntf_speed(java.lang.String intf_speed) {
        this.intf_speed = intf_speed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationAgentInterface)) return false;
        ManagementSNMPConfigurationAgentInterface other = (ManagementSNMPConfigurationAgentInterface) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intf_name==null && other.getIntf_name()==null) || 
             (this.intf_name!=null &&
              this.intf_name.equals(other.getIntf_name()))) &&
            ((this.intf_type==null && other.getIntf_type()==null) || 
             (this.intf_type!=null &&
              this.intf_type.equals(other.getIntf_type()))) &&
            ((this.intf_speed==null && other.getIntf_speed()==null) || 
             (this.intf_speed!=null &&
              this.intf_speed.equals(other.getIntf_speed())));
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
        if (getIntf_name() != null) {
            _hashCode += getIntf_name().hashCode();
        }
        if (getIntf_type() != null) {
            _hashCode += getIntf_type().hashCode();
        }
        if (getIntf_speed() != null) {
            _hashCode += getIntf_speed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationAgentInterface.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AgentInterface"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intf_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intf_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intf_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intf_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intf_speed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intf_speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
