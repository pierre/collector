/**
 * ManagementSNMPConfigurationSystemInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationSystemInformation  implements java.io.Serializable {
    private java.lang.String sys_name;

    private java.lang.String sys_location;

    private java.lang.String sys_contact;

    private java.lang.String sys_description;

    private java.lang.String sys_object_id;

    private long sys_services;

    public ManagementSNMPConfigurationSystemInformation() {
    }

    public ManagementSNMPConfigurationSystemInformation(
           java.lang.String sys_name,
           java.lang.String sys_location,
           java.lang.String sys_contact,
           java.lang.String sys_description,
           java.lang.String sys_object_id,
           long sys_services) {
           this.sys_name = sys_name;
           this.sys_location = sys_location;
           this.sys_contact = sys_contact;
           this.sys_description = sys_description;
           this.sys_object_id = sys_object_id;
           this.sys_services = sys_services;
    }


    /**
     * Gets the sys_name value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @return sys_name
     */
    public java.lang.String getSys_name() {
        return sys_name;
    }


    /**
     * Sets the sys_name value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @param sys_name
     */
    public void setSys_name(java.lang.String sys_name) {
        this.sys_name = sys_name;
    }


    /**
     * Gets the sys_location value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @return sys_location
     */
    public java.lang.String getSys_location() {
        return sys_location;
    }


    /**
     * Sets the sys_location value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @param sys_location
     */
    public void setSys_location(java.lang.String sys_location) {
        this.sys_location = sys_location;
    }


    /**
     * Gets the sys_contact value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @return sys_contact
     */
    public java.lang.String getSys_contact() {
        return sys_contact;
    }


    /**
     * Sets the sys_contact value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @param sys_contact
     */
    public void setSys_contact(java.lang.String sys_contact) {
        this.sys_contact = sys_contact;
    }


    /**
     * Gets the sys_description value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @return sys_description
     */
    public java.lang.String getSys_description() {
        return sys_description;
    }


    /**
     * Sets the sys_description value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @param sys_description
     */
    public void setSys_description(java.lang.String sys_description) {
        this.sys_description = sys_description;
    }


    /**
     * Gets the sys_object_id value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @return sys_object_id
     */
    public java.lang.String getSys_object_id() {
        return sys_object_id;
    }


    /**
     * Sets the sys_object_id value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @param sys_object_id
     */
    public void setSys_object_id(java.lang.String sys_object_id) {
        this.sys_object_id = sys_object_id;
    }


    /**
     * Gets the sys_services value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @return sys_services
     */
    public long getSys_services() {
        return sys_services;
    }


    /**
     * Sets the sys_services value for this ManagementSNMPConfigurationSystemInformation.
     * 
     * @param sys_services
     */
    public void setSys_services(long sys_services) {
        this.sys_services = sys_services;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationSystemInformation)) return false;
        ManagementSNMPConfigurationSystemInformation other = (ManagementSNMPConfigurationSystemInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sys_name==null && other.getSys_name()==null) || 
             (this.sys_name!=null &&
              this.sys_name.equals(other.getSys_name()))) &&
            ((this.sys_location==null && other.getSys_location()==null) || 
             (this.sys_location!=null &&
              this.sys_location.equals(other.getSys_location()))) &&
            ((this.sys_contact==null && other.getSys_contact()==null) || 
             (this.sys_contact!=null &&
              this.sys_contact.equals(other.getSys_contact()))) &&
            ((this.sys_description==null && other.getSys_description()==null) || 
             (this.sys_description!=null &&
              this.sys_description.equals(other.getSys_description()))) &&
            ((this.sys_object_id==null && other.getSys_object_id()==null) || 
             (this.sys_object_id!=null &&
              this.sys_object_id.equals(other.getSys_object_id()))) &&
            this.sys_services == other.getSys_services();
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
        if (getSys_name() != null) {
            _hashCode += getSys_name().hashCode();
        }
        if (getSys_location() != null) {
            _hashCode += getSys_location().hashCode();
        }
        if (getSys_contact() != null) {
            _hashCode += getSys_contact().hashCode();
        }
        if (getSys_description() != null) {
            _hashCode += getSys_description().hashCode();
        }
        if (getSys_object_id() != null) {
            _hashCode += getSys_object_id().hashCode();
        }
        _hashCode += new Long(getSys_services()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationSystemInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.SystemInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sys_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sys_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sys_location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sys_location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sys_contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sys_contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sys_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sys_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sys_object_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sys_object_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sys_services");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sys_services"));
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
