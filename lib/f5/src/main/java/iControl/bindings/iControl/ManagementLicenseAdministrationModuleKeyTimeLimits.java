/**
 * ManagementLicenseAdministrationModuleKeyTimeLimits.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementLicenseAdministrationModuleKeyTimeLimits  implements java.io.Serializable {
    private long current_system_time;

    private long start_time;

    private long end_time;

    public ManagementLicenseAdministrationModuleKeyTimeLimits() {
    }

    public ManagementLicenseAdministrationModuleKeyTimeLimits(
           long current_system_time,
           long start_time,
           long end_time) {
           this.current_system_time = current_system_time;
           this.start_time = start_time;
           this.end_time = end_time;
    }


    /**
     * Gets the current_system_time value for this ManagementLicenseAdministrationModuleKeyTimeLimits.
     * 
     * @return current_system_time
     */
    public long getCurrent_system_time() {
        return current_system_time;
    }


    /**
     * Sets the current_system_time value for this ManagementLicenseAdministrationModuleKeyTimeLimits.
     * 
     * @param current_system_time
     */
    public void setCurrent_system_time(long current_system_time) {
        this.current_system_time = current_system_time;
    }


    /**
     * Gets the start_time value for this ManagementLicenseAdministrationModuleKeyTimeLimits.
     * 
     * @return start_time
     */
    public long getStart_time() {
        return start_time;
    }


    /**
     * Sets the start_time value for this ManagementLicenseAdministrationModuleKeyTimeLimits.
     * 
     * @param start_time
     */
    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }


    /**
     * Gets the end_time value for this ManagementLicenseAdministrationModuleKeyTimeLimits.
     * 
     * @return end_time
     */
    public long getEnd_time() {
        return end_time;
    }


    /**
     * Sets the end_time value for this ManagementLicenseAdministrationModuleKeyTimeLimits.
     * 
     * @param end_time
     */
    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementLicenseAdministrationModuleKeyTimeLimits)) return false;
        ManagementLicenseAdministrationModuleKeyTimeLimits other = (ManagementLicenseAdministrationModuleKeyTimeLimits) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.current_system_time == other.getCurrent_system_time() &&
            this.start_time == other.getStart_time() &&
            this.end_time == other.getEnd_time();
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
        _hashCode += new Long(getCurrent_system_time()).hashCode();
        _hashCode += new Long(getStart_time()).hashCode();
        _hashCode += new Long(getEnd_time()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementLicenseAdministrationModuleKeyTimeLimits.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.LicenseAdministration.ModuleKeyTimeLimits"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_system_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_system_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_time"));
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
