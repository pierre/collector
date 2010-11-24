/**
 * LocalLBVirtualServerVirtualServerPersistence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBVirtualServerVirtualServerPersistence  implements java.io.Serializable {
    private java.lang.String profile_name;

    private boolean default_profile;

    public LocalLBVirtualServerVirtualServerPersistence() {
    }

    public LocalLBVirtualServerVirtualServerPersistence(
           java.lang.String profile_name,
           boolean default_profile) {
           this.profile_name = profile_name;
           this.default_profile = default_profile;
    }


    /**
     * Gets the profile_name value for this LocalLBVirtualServerVirtualServerPersistence.
     * 
     * @return profile_name
     */
    public java.lang.String getProfile_name() {
        return profile_name;
    }


    /**
     * Sets the profile_name value for this LocalLBVirtualServerVirtualServerPersistence.
     * 
     * @param profile_name
     */
    public void setProfile_name(java.lang.String profile_name) {
        this.profile_name = profile_name;
    }


    /**
     * Gets the default_profile value for this LocalLBVirtualServerVirtualServerPersistence.
     * 
     * @return default_profile
     */
    public boolean isDefault_profile() {
        return default_profile;
    }


    /**
     * Sets the default_profile value for this LocalLBVirtualServerVirtualServerPersistence.
     * 
     * @param default_profile
     */
    public void setDefault_profile(boolean default_profile) {
        this.default_profile = default_profile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBVirtualServerVirtualServerPersistence)) return false;
        LocalLBVirtualServerVirtualServerPersistence other = (LocalLBVirtualServerVirtualServerPersistence) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profile_name==null && other.getProfile_name()==null) || 
             (this.profile_name!=null &&
              this.profile_name.equals(other.getProfile_name()))) &&
            this.default_profile == other.isDefault_profile();
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
        if (getProfile_name() != null) {
            _hashCode += getProfile_name().hashCode();
        }
        _hashCode += (isDefault_profile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBVirtualServerVirtualServerPersistence.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualServer.VirtualServerPersistence"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profile_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_profile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_profile"));
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
