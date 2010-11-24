/**
 * ManagementLicenseAdministrationModuleExpiry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementLicenseAdministrationModuleExpiry  implements java.io.Serializable {
    private iControl.CommonEnabledState enabled;

    private boolean expires;

    private long expiry_time;

    public ManagementLicenseAdministrationModuleExpiry() {
    }

    public ManagementLicenseAdministrationModuleExpiry(
           iControl.CommonEnabledState enabled,
           boolean expires,
           long expiry_time) {
           this.enabled = enabled;
           this.expires = expires;
           this.expiry_time = expiry_time;
    }


    /**
     * Gets the enabled value for this ManagementLicenseAdministrationModuleExpiry.
     * 
     * @return enabled
     */
    public iControl.CommonEnabledState getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this ManagementLicenseAdministrationModuleExpiry.
     * 
     * @param enabled
     */
    public void setEnabled(iControl.CommonEnabledState enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the expires value for this ManagementLicenseAdministrationModuleExpiry.
     * 
     * @return expires
     */
    public boolean isExpires() {
        return expires;
    }


    /**
     * Sets the expires value for this ManagementLicenseAdministrationModuleExpiry.
     * 
     * @param expires
     */
    public void setExpires(boolean expires) {
        this.expires = expires;
    }


    /**
     * Gets the expiry_time value for this ManagementLicenseAdministrationModuleExpiry.
     * 
     * @return expiry_time
     */
    public long getExpiry_time() {
        return expiry_time;
    }


    /**
     * Sets the expiry_time value for this ManagementLicenseAdministrationModuleExpiry.
     * 
     * @param expiry_time
     */
    public void setExpiry_time(long expiry_time) {
        this.expiry_time = expiry_time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementLicenseAdministrationModuleExpiry)) return false;
        ManagementLicenseAdministrationModuleExpiry other = (ManagementLicenseAdministrationModuleExpiry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            this.expires == other.isExpires() &&
            this.expiry_time == other.getExpiry_time();
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        _hashCode += (isExpires() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getExpiry_time()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementLicenseAdministrationModuleExpiry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.LicenseAdministration.ModuleExpiry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expires");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiry_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiry_time"));
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
