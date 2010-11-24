/**
 * GlobalLBApplicationApplicationContextObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBApplicationApplicationContextObject  implements java.io.Serializable {
    private java.lang.String application_name;

    private java.lang.String object_name;

    private iControl.GlobalLBApplicationApplicationObjectType object_type;

    public GlobalLBApplicationApplicationContextObject() {
    }

    public GlobalLBApplicationApplicationContextObject(
           java.lang.String application_name,
           java.lang.String object_name,
           iControl.GlobalLBApplicationApplicationObjectType object_type) {
           this.application_name = application_name;
           this.object_name = object_name;
           this.object_type = object_type;
    }


    /**
     * Gets the application_name value for this GlobalLBApplicationApplicationContextObject.
     * 
     * @return application_name
     */
    public java.lang.String getApplication_name() {
        return application_name;
    }


    /**
     * Sets the application_name value for this GlobalLBApplicationApplicationContextObject.
     * 
     * @param application_name
     */
    public void setApplication_name(java.lang.String application_name) {
        this.application_name = application_name;
    }


    /**
     * Gets the object_name value for this GlobalLBApplicationApplicationContextObject.
     * 
     * @return object_name
     */
    public java.lang.String getObject_name() {
        return object_name;
    }


    /**
     * Sets the object_name value for this GlobalLBApplicationApplicationContextObject.
     * 
     * @param object_name
     */
    public void setObject_name(java.lang.String object_name) {
        this.object_name = object_name;
    }


    /**
     * Gets the object_type value for this GlobalLBApplicationApplicationContextObject.
     * 
     * @return object_type
     */
    public iControl.GlobalLBApplicationApplicationObjectType getObject_type() {
        return object_type;
    }


    /**
     * Sets the object_type value for this GlobalLBApplicationApplicationContextObject.
     * 
     * @param object_type
     */
    public void setObject_type(iControl.GlobalLBApplicationApplicationObjectType object_type) {
        this.object_type = object_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBApplicationApplicationContextObject)) return false;
        GlobalLBApplicationApplicationContextObject other = (GlobalLBApplicationApplicationContextObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.application_name==null && other.getApplication_name()==null) || 
             (this.application_name!=null &&
              this.application_name.equals(other.getApplication_name()))) &&
            ((this.object_name==null && other.getObject_name()==null) || 
             (this.object_name!=null &&
              this.object_name.equals(other.getObject_name()))) &&
            ((this.object_type==null && other.getObject_type()==null) || 
             (this.object_type!=null &&
              this.object_type.equals(other.getObject_type())));
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
        if (getApplication_name() != null) {
            _hashCode += getApplication_name().hashCode();
        }
        if (getObject_name() != null) {
            _hashCode += getObject_name().hashCode();
        }
        if (getObject_type() != null) {
            _hashCode += getObject_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBApplicationApplicationContextObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Application.ApplicationContextObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "application_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "object_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "object_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Application.ApplicationObjectType"));
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
