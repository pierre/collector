/**
 * ManagementSNMPConfigurationGroupInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationGroupInformation  implements java.io.Serializable {
    private java.lang.String group_name;

    private iControl.ManagementSNMPConfigurationModelType model;

    private java.lang.String security_name;

    public ManagementSNMPConfigurationGroupInformation() {
    }

    public ManagementSNMPConfigurationGroupInformation(
           java.lang.String group_name,
           iControl.ManagementSNMPConfigurationModelType model,
           java.lang.String security_name) {
           this.group_name = group_name;
           this.model = model;
           this.security_name = security_name;
    }


    /**
     * Gets the group_name value for this ManagementSNMPConfigurationGroupInformation.
     * 
     * @return group_name
     */
    public java.lang.String getGroup_name() {
        return group_name;
    }


    /**
     * Sets the group_name value for this ManagementSNMPConfigurationGroupInformation.
     * 
     * @param group_name
     */
    public void setGroup_name(java.lang.String group_name) {
        this.group_name = group_name;
    }


    /**
     * Gets the model value for this ManagementSNMPConfigurationGroupInformation.
     * 
     * @return model
     */
    public iControl.ManagementSNMPConfigurationModelType getModel() {
        return model;
    }


    /**
     * Sets the model value for this ManagementSNMPConfigurationGroupInformation.
     * 
     * @param model
     */
    public void setModel(iControl.ManagementSNMPConfigurationModelType model) {
        this.model = model;
    }


    /**
     * Gets the security_name value for this ManagementSNMPConfigurationGroupInformation.
     * 
     * @return security_name
     */
    public java.lang.String getSecurity_name() {
        return security_name;
    }


    /**
     * Sets the security_name value for this ManagementSNMPConfigurationGroupInformation.
     * 
     * @param security_name
     */
    public void setSecurity_name(java.lang.String security_name) {
        this.security_name = security_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationGroupInformation)) return false;
        ManagementSNMPConfigurationGroupInformation other = (ManagementSNMPConfigurationGroupInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.group_name==null && other.getGroup_name()==null) || 
             (this.group_name!=null &&
              this.group_name.equals(other.getGroup_name()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.security_name==null && other.getSecurity_name()==null) || 
             (this.security_name!=null &&
              this.security_name.equals(other.getSecurity_name())));
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
        if (getGroup_name() != null) {
            _hashCode += getGroup_name().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getSecurity_name() != null) {
            _hashCode += getSecurity_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationGroupInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GroupInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ModelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "security_name"));
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
