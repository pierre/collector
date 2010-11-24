/**
 * LocalLBVirtualServerVirtualServerResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBVirtualServerVirtualServerResource  implements java.io.Serializable {
    private iControl.LocalLBVirtualServerVirtualServerType type;

    private java.lang.String default_pool_name;

    public LocalLBVirtualServerVirtualServerResource() {
    }

    public LocalLBVirtualServerVirtualServerResource(
           iControl.LocalLBVirtualServerVirtualServerType type,
           java.lang.String default_pool_name) {
           this.type = type;
           this.default_pool_name = default_pool_name;
    }


    /**
     * Gets the type value for this LocalLBVirtualServerVirtualServerResource.
     * 
     * @return type
     */
    public iControl.LocalLBVirtualServerVirtualServerType getType() {
        return type;
    }


    /**
     * Sets the type value for this LocalLBVirtualServerVirtualServerResource.
     * 
     * @param type
     */
    public void setType(iControl.LocalLBVirtualServerVirtualServerType type) {
        this.type = type;
    }


    /**
     * Gets the default_pool_name value for this LocalLBVirtualServerVirtualServerResource.
     * 
     * @return default_pool_name
     */
    public java.lang.String getDefault_pool_name() {
        return default_pool_name;
    }


    /**
     * Sets the default_pool_name value for this LocalLBVirtualServerVirtualServerResource.
     * 
     * @param default_pool_name
     */
    public void setDefault_pool_name(java.lang.String default_pool_name) {
        this.default_pool_name = default_pool_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBVirtualServerVirtualServerResource)) return false;
        LocalLBVirtualServerVirtualServerResource other = (LocalLBVirtualServerVirtualServerResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.default_pool_name==null && other.getDefault_pool_name()==null) || 
             (this.default_pool_name!=null &&
              this.default_pool_name.equals(other.getDefault_pool_name())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDefault_pool_name() != null) {
            _hashCode += getDefault_pool_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBVirtualServerVirtualServerResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualServer.VirtualServerResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualServer.VirtualServerType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_pool_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_pool_name"));
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
