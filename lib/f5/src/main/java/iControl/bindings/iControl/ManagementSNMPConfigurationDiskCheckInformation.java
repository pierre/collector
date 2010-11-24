/**
 * ManagementSNMPConfigurationDiskCheckInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationDiskCheckInformation  implements java.io.Serializable {
    private java.lang.String disk_path;

    private iControl.ManagementSNMPConfigurationDiskCheckType check_type;

    private long minimum_space;

    public ManagementSNMPConfigurationDiskCheckInformation() {
    }

    public ManagementSNMPConfigurationDiskCheckInformation(
           java.lang.String disk_path,
           iControl.ManagementSNMPConfigurationDiskCheckType check_type,
           long minimum_space) {
           this.disk_path = disk_path;
           this.check_type = check_type;
           this.minimum_space = minimum_space;
    }


    /**
     * Gets the disk_path value for this ManagementSNMPConfigurationDiskCheckInformation.
     * 
     * @return disk_path
     */
    public java.lang.String getDisk_path() {
        return disk_path;
    }


    /**
     * Sets the disk_path value for this ManagementSNMPConfigurationDiskCheckInformation.
     * 
     * @param disk_path
     */
    public void setDisk_path(java.lang.String disk_path) {
        this.disk_path = disk_path;
    }


    /**
     * Gets the check_type value for this ManagementSNMPConfigurationDiskCheckInformation.
     * 
     * @return check_type
     */
    public iControl.ManagementSNMPConfigurationDiskCheckType getCheck_type() {
        return check_type;
    }


    /**
     * Sets the check_type value for this ManagementSNMPConfigurationDiskCheckInformation.
     * 
     * @param check_type
     */
    public void setCheck_type(iControl.ManagementSNMPConfigurationDiskCheckType check_type) {
        this.check_type = check_type;
    }


    /**
     * Gets the minimum_space value for this ManagementSNMPConfigurationDiskCheckInformation.
     * 
     * @return minimum_space
     */
    public long getMinimum_space() {
        return minimum_space;
    }


    /**
     * Sets the minimum_space value for this ManagementSNMPConfigurationDiskCheckInformation.
     * 
     * @param minimum_space
     */
    public void setMinimum_space(long minimum_space) {
        this.minimum_space = minimum_space;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationDiskCheckInformation)) return false;
        ManagementSNMPConfigurationDiskCheckInformation other = (ManagementSNMPConfigurationDiskCheckInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.disk_path==null && other.getDisk_path()==null) || 
             (this.disk_path!=null &&
              this.disk_path.equals(other.getDisk_path()))) &&
            ((this.check_type==null && other.getCheck_type()==null) || 
             (this.check_type!=null &&
              this.check_type.equals(other.getCheck_type()))) &&
            this.minimum_space == other.getMinimum_space();
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
        if (getDisk_path() != null) {
            _hashCode += getDisk_path().hashCode();
        }
        if (getCheck_type() != null) {
            _hashCode += getCheck_type().hashCode();
        }
        _hashCode += new Long(getMinimum_space()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationDiskCheckInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk_path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disk_path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "check_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DiskCheckType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimum_space");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimum_space"));
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
