/**
 * LTConfigClassInstanceKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LTConfigClassInstanceKey  implements java.io.Serializable {
    private java.lang.String container;

    private java.lang.String container_class;

    private java.lang.String class_name;

    private java.lang.String name;

    public LTConfigClassInstanceKey() {
    }

    public LTConfigClassInstanceKey(
           java.lang.String container,
           java.lang.String container_class,
           java.lang.String class_name,
           java.lang.String name) {
           this.container = container;
           this.container_class = container_class;
           this.class_name = class_name;
           this.name = name;
    }


    /**
     * Gets the container value for this LTConfigClassInstanceKey.
     * 
     * @return container
     */
    public java.lang.String getContainer() {
        return container;
    }


    /**
     * Sets the container value for this LTConfigClassInstanceKey.
     * 
     * @param container
     */
    public void setContainer(java.lang.String container) {
        this.container = container;
    }


    /**
     * Gets the container_class value for this LTConfigClassInstanceKey.
     * 
     * @return container_class
     */
    public java.lang.String getContainer_class() {
        return container_class;
    }


    /**
     * Sets the container_class value for this LTConfigClassInstanceKey.
     * 
     * @param container_class
     */
    public void setContainer_class(java.lang.String container_class) {
        this.container_class = container_class;
    }


    /**
     * Gets the class_name value for this LTConfigClassInstanceKey.
     * 
     * @return class_name
     */
    public java.lang.String getClass_name() {
        return class_name;
    }


    /**
     * Sets the class_name value for this LTConfigClassInstanceKey.
     * 
     * @param class_name
     */
    public void setClass_name(java.lang.String class_name) {
        this.class_name = class_name;
    }


    /**
     * Gets the name value for this LTConfigClassInstanceKey.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LTConfigClassInstanceKey.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LTConfigClassInstanceKey)) return false;
        LTConfigClassInstanceKey other = (LTConfigClassInstanceKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.container==null && other.getContainer()==null) || 
             (this.container!=null &&
              this.container.equals(other.getContainer()))) &&
            ((this.container_class==null && other.getContainer_class()==null) || 
             (this.container_class!=null &&
              this.container_class.equals(other.getContainer_class()))) &&
            ((this.class_name==null && other.getClass_name()==null) || 
             (this.class_name!=null &&
              this.class_name.equals(other.getClass_name()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getContainer() != null) {
            _hashCode += getContainer().hashCode();
        }
        if (getContainer_class() != null) {
            _hashCode += getContainer_class().hashCode();
        }
        if (getClass_name() != null) {
            _hashCode += getClass_name().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LTConfigClassInstanceKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassInstanceKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("container");
        elemField.setXmlName(new javax.xml.namespace.QName("", "container"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("container_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "container_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "class_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
