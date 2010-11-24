/**
 * LocalLBProfileXMLNamespaceMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileXMLNamespaceMapping  implements java.io.Serializable {
    private java.lang.String mapping_prefix;

    private java.lang.String mapping_namespace;

    public LocalLBProfileXMLNamespaceMapping() {
    }

    public LocalLBProfileXMLNamespaceMapping(
           java.lang.String mapping_prefix,
           java.lang.String mapping_namespace) {
           this.mapping_prefix = mapping_prefix;
           this.mapping_namespace = mapping_namespace;
    }


    /**
     * Gets the mapping_prefix value for this LocalLBProfileXMLNamespaceMapping.
     * 
     * @return mapping_prefix
     */
    public java.lang.String getMapping_prefix() {
        return mapping_prefix;
    }


    /**
     * Sets the mapping_prefix value for this LocalLBProfileXMLNamespaceMapping.
     * 
     * @param mapping_prefix
     */
    public void setMapping_prefix(java.lang.String mapping_prefix) {
        this.mapping_prefix = mapping_prefix;
    }


    /**
     * Gets the mapping_namespace value for this LocalLBProfileXMLNamespaceMapping.
     * 
     * @return mapping_namespace
     */
    public java.lang.String getMapping_namespace() {
        return mapping_namespace;
    }


    /**
     * Sets the mapping_namespace value for this LocalLBProfileXMLNamespaceMapping.
     * 
     * @param mapping_namespace
     */
    public void setMapping_namespace(java.lang.String mapping_namespace) {
        this.mapping_namespace = mapping_namespace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBProfileXMLNamespaceMapping)) return false;
        LocalLBProfileXMLNamespaceMapping other = (LocalLBProfileXMLNamespaceMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mapping_prefix==null && other.getMapping_prefix()==null) || 
             (this.mapping_prefix!=null &&
              this.mapping_prefix.equals(other.getMapping_prefix()))) &&
            ((this.mapping_namespace==null && other.getMapping_namespace()==null) || 
             (this.mapping_namespace!=null &&
              this.mapping_namespace.equals(other.getMapping_namespace())));
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
        if (getMapping_prefix() != null) {
            _hashCode += getMapping_prefix().hashCode();
        }
        if (getMapping_namespace() != null) {
            _hashCode += getMapping_namespace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBProfileXMLNamespaceMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileXML.NamespaceMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mapping_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping_namespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mapping_namespace"));
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
