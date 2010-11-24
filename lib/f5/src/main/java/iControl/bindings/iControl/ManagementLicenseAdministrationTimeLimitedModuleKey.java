/**
 * ManagementLicenseAdministrationTimeLimitedModuleKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementLicenseAdministrationTimeLimitedModuleKey  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String key;

    private iControl.ManagementLicenseAdministrationModuleKeyTimeLimits limits;

    private boolean active;

    public ManagementLicenseAdministrationTimeLimitedModuleKey() {
    }

    public ManagementLicenseAdministrationTimeLimitedModuleKey(
           java.lang.String description,
           java.lang.String key,
           iControl.ManagementLicenseAdministrationModuleKeyTimeLimits limits,
           boolean active) {
           this.description = description;
           this.key = key;
           this.limits = limits;
           this.active = active;
    }


    /**
     * Gets the description value for this ManagementLicenseAdministrationTimeLimitedModuleKey.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ManagementLicenseAdministrationTimeLimitedModuleKey.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the key value for this ManagementLicenseAdministrationTimeLimitedModuleKey.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ManagementLicenseAdministrationTimeLimitedModuleKey.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the limits value for this ManagementLicenseAdministrationTimeLimitedModuleKey.
     * 
     * @return limits
     */
    public iControl.ManagementLicenseAdministrationModuleKeyTimeLimits getLimits() {
        return limits;
    }


    /**
     * Sets the limits value for this ManagementLicenseAdministrationTimeLimitedModuleKey.
     * 
     * @param limits
     */
    public void setLimits(iControl.ManagementLicenseAdministrationModuleKeyTimeLimits limits) {
        this.limits = limits;
    }


    /**
     * Gets the active value for this ManagementLicenseAdministrationTimeLimitedModuleKey.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ManagementLicenseAdministrationTimeLimitedModuleKey.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementLicenseAdministrationTimeLimitedModuleKey)) return false;
        ManagementLicenseAdministrationTimeLimitedModuleKey other = (ManagementLicenseAdministrationTimeLimitedModuleKey) obj;
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
            ((this.limits==null && other.getLimits()==null) || 
             (this.limits!=null &&
              this.limits.equals(other.getLimits()))) &&
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
        if (getLimits() != null) {
            _hashCode += getLimits().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementLicenseAdministrationTimeLimitedModuleKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.LicenseAdministration.TimeLimitedModuleKey"));
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
        elemField.setFieldName("limits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.LicenseAdministration.ModuleKeyTimeLimits"));
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
