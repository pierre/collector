/**
 * LocalLBVirtualServerVirtualServerAuthentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBVirtualServerVirtualServerAuthentication  implements java.io.Serializable {
    private java.lang.String profile_name;

    private long priority;

    public LocalLBVirtualServerVirtualServerAuthentication() {
    }

    public LocalLBVirtualServerVirtualServerAuthentication(
           java.lang.String profile_name,
           long priority) {
           this.profile_name = profile_name;
           this.priority = priority;
    }


    /**
     * Gets the profile_name value for this LocalLBVirtualServerVirtualServerAuthentication.
     * 
     * @return profile_name
     */
    public java.lang.String getProfile_name() {
        return profile_name;
    }


    /**
     * Sets the profile_name value for this LocalLBVirtualServerVirtualServerAuthentication.
     * 
     * @param profile_name
     */
    public void setProfile_name(java.lang.String profile_name) {
        this.profile_name = profile_name;
    }


    /**
     * Gets the priority value for this LocalLBVirtualServerVirtualServerAuthentication.
     * 
     * @return priority
     */
    public long getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this LocalLBVirtualServerVirtualServerAuthentication.
     * 
     * @param priority
     */
    public void setPriority(long priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBVirtualServerVirtualServerAuthentication)) return false;
        LocalLBVirtualServerVirtualServerAuthentication other = (LocalLBVirtualServerVirtualServerAuthentication) obj;
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
            this.priority == other.getPriority();
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
        _hashCode += new Long(getPriority()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBVirtualServerVirtualServerAuthentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualServer.VirtualServerAuthentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profile_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
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
