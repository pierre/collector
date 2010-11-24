/**
 * SystemSoftwareManagementRepositoryImageID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemSoftwareManagementRepositoryImageID  implements java.io.Serializable {
    private long chassis_slot_id;

    private java.lang.String filename;

    public SystemSoftwareManagementRepositoryImageID() {
    }

    public SystemSoftwareManagementRepositoryImageID(
           long chassis_slot_id,
           java.lang.String filename) {
           this.chassis_slot_id = chassis_slot_id;
           this.filename = filename;
    }


    /**
     * Gets the chassis_slot_id value for this SystemSoftwareManagementRepositoryImageID.
     * 
     * @return chassis_slot_id
     */
    public long getChassis_slot_id() {
        return chassis_slot_id;
    }


    /**
     * Sets the chassis_slot_id value for this SystemSoftwareManagementRepositoryImageID.
     * 
     * @param chassis_slot_id
     */
    public void setChassis_slot_id(long chassis_slot_id) {
        this.chassis_slot_id = chassis_slot_id;
    }


    /**
     * Gets the filename value for this SystemSoftwareManagementRepositoryImageID.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this SystemSoftwareManagementRepositoryImageID.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemSoftwareManagementRepositoryImageID)) return false;
        SystemSoftwareManagementRepositoryImageID other = (SystemSoftwareManagementRepositoryImageID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.chassis_slot_id == other.getChassis_slot_id() &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename())));
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
        _hashCode += new Long(getChassis_slot_id()).hashCode();
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemSoftwareManagementRepositoryImageID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.SoftwareManagement.repositoryImageID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chassis_slot_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chassis_slot_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
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
