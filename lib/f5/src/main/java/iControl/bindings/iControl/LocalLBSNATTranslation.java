/**
 * LocalLBSNATTranslation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBSNATTranslation  implements java.io.Serializable {
    private iControl.LocalLBSnatType type;

    private java.lang.String translation_object;

    public LocalLBSNATTranslation() {
    }

    public LocalLBSNATTranslation(
           iControl.LocalLBSnatType type,
           java.lang.String translation_object) {
           this.type = type;
           this.translation_object = translation_object;
    }


    /**
     * Gets the type value for this LocalLBSNATTranslation.
     * 
     * @return type
     */
    public iControl.LocalLBSnatType getType() {
        return type;
    }


    /**
     * Sets the type value for this LocalLBSNATTranslation.
     * 
     * @param type
     */
    public void setType(iControl.LocalLBSnatType type) {
        this.type = type;
    }


    /**
     * Gets the translation_object value for this LocalLBSNATTranslation.
     * 
     * @return translation_object
     */
    public java.lang.String getTranslation_object() {
        return translation_object;
    }


    /**
     * Sets the translation_object value for this LocalLBSNATTranslation.
     * 
     * @param translation_object
     */
    public void setTranslation_object(java.lang.String translation_object) {
        this.translation_object = translation_object;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBSNATTranslation)) return false;
        LocalLBSNATTranslation other = (LocalLBSNATTranslation) obj;
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
            ((this.translation_object==null && other.getTranslation_object()==null) || 
             (this.translation_object!=null &&
              this.translation_object.equals(other.getTranslation_object())));
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
        if (getTranslation_object() != null) {
            _hashCode += getTranslation_object().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBSNATTranslation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.SNAT.Translation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.SnatType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translation_object");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translation_object"));
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
