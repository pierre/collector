/**
 * ManagementSNMPConfigurationWrapperUserInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationWrapperUserInformation  implements java.io.Serializable {
    private java.lang.String user;

    private iControl.ManagementSNMPConfigurationLevelType level;

    private java.lang.String oid;

    public ManagementSNMPConfigurationWrapperUserInformation() {
    }

    public ManagementSNMPConfigurationWrapperUserInformation(
           java.lang.String user,
           iControl.ManagementSNMPConfigurationLevelType level,
           java.lang.String oid) {
           this.user = user;
           this.level = level;
           this.oid = oid;
    }


    /**
     * Gets the user value for this ManagementSNMPConfigurationWrapperUserInformation.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this ManagementSNMPConfigurationWrapperUserInformation.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the level value for this ManagementSNMPConfigurationWrapperUserInformation.
     * 
     * @return level
     */
    public iControl.ManagementSNMPConfigurationLevelType getLevel() {
        return level;
    }


    /**
     * Sets the level value for this ManagementSNMPConfigurationWrapperUserInformation.
     * 
     * @param level
     */
    public void setLevel(iControl.ManagementSNMPConfigurationLevelType level) {
        this.level = level;
    }


    /**
     * Gets the oid value for this ManagementSNMPConfigurationWrapperUserInformation.
     * 
     * @return oid
     */
    public java.lang.String getOid() {
        return oid;
    }


    /**
     * Sets the oid value for this ManagementSNMPConfigurationWrapperUserInformation.
     * 
     * @param oid
     */
    public void setOid(java.lang.String oid) {
        this.oid = oid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationWrapperUserInformation)) return false;
        ManagementSNMPConfigurationWrapperUserInformation other = (ManagementSNMPConfigurationWrapperUserInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.oid==null && other.getOid()==null) || 
             (this.oid!=null &&
              this.oid.equals(other.getOid())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getOid() != null) {
            _hashCode += getOid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationWrapperUserInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.WrapperUserInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.LevelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oid"));
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
