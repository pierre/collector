/**
 * ManagementUserManagementUserPermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementUserManagementUserPermission  implements java.io.Serializable {
    private iControl.ManagementUserManagementUserRole role;

    private java.lang.String partition;

    public ManagementUserManagementUserPermission() {
    }

    public ManagementUserManagementUserPermission(
           iControl.ManagementUserManagementUserRole role,
           java.lang.String partition) {
           this.role = role;
           this.partition = partition;
    }


    /**
     * Gets the role value for this ManagementUserManagementUserPermission.
     * 
     * @return role
     */
    public iControl.ManagementUserManagementUserRole getRole() {
        return role;
    }


    /**
     * Sets the role value for this ManagementUserManagementUserPermission.
     * 
     * @param role
     */
    public void setRole(iControl.ManagementUserManagementUserRole role) {
        this.role = role;
    }


    /**
     * Gets the partition value for this ManagementUserManagementUserPermission.
     * 
     * @return partition
     */
    public java.lang.String getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this ManagementUserManagementUserPermission.
     * 
     * @param partition
     */
    public void setPartition(java.lang.String partition) {
        this.partition = partition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementUserManagementUserPermission)) return false;
        ManagementUserManagementUserPermission other = (ManagementUserManagementUserPermission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition())));
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
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementUserManagementUserPermission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserPermission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserRole"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partition"));
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
