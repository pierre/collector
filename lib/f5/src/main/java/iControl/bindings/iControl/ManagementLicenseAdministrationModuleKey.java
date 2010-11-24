/**
 * ManagementLicenseAdministrationModuleKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementLicenseAdministrationModuleKey  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String key;

    private java.lang.String[] child_description;

    private boolean active;

    public ManagementLicenseAdministrationModuleKey() {
    }

    public ManagementLicenseAdministrationModuleKey(
           java.lang.String description,
           java.lang.String key,
           java.lang.String[] child_description,
           boolean active) {
           this.description = description;
           this.key = key;
           this.child_description = child_description;
           this.active = active;
    }


    /**
     * Gets the description value for this ManagementLicenseAdministrationModuleKey.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ManagementLicenseAdministrationModuleKey.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the key value for this ManagementLicenseAdministrationModuleKey.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ManagementLicenseAdministrationModuleKey.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the child_description value for this ManagementLicenseAdministrationModuleKey.
     * 
     * @return child_description
     */
    public java.lang.String[] getChild_description() {
        return child_description;
    }


    /**
     * Sets the child_description value for this ManagementLicenseAdministrationModuleKey.
     * 
     * @param child_description
     */
    public void setChild_description(java.lang.String[] child_description) {
        this.child_description = child_description;
    }


    /**
     * Gets the active value for this ManagementLicenseAdministrationModuleKey.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ManagementLicenseAdministrationModuleKey.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementLicenseAdministrationModuleKey)) return false;
        ManagementLicenseAdministrationModuleKey other = (ManagementLicenseAdministrationModuleKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.child_description==null && other.getChild_description()==null) || 
             (this.child_description!=null &&
              java.util.Arrays.equals(this.child_description, other.getChild_description()))) &&
            this.active == other.isActive();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getChild_description() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChild_description());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChild_description(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementLicenseAdministrationModuleKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.LicenseAdministration.ModuleKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("child_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "child_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
