/**
 * LocalLBProfileRtspProxyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileRtspProxyType  implements java.io.Serializable {
    private iControl.LocalLBRtspProxyType value;

    private boolean default_flag;

    public LocalLBProfileRtspProxyType() {
    }

    public LocalLBProfileRtspProxyType(
           iControl.LocalLBRtspProxyType value,
           boolean default_flag) {
           this.value = value;
           this.default_flag = default_flag;
    }


    /**
     * Gets the value value for this LocalLBProfileRtspProxyType.
     * 
     * @return value
     */
    public iControl.LocalLBRtspProxyType getValue() {
        return value;
    }


    /**
     * Sets the value value for this LocalLBProfileRtspProxyType.
     * 
     * @param value
     */
    public void setValue(iControl.LocalLBRtspProxyType value) {
        this.value = value;
    }


    /**
     * Gets the default_flag value for this LocalLBProfileRtspProxyType.
     * 
     * @return default_flag
     */
    public boolean isDefault_flag() {
        return default_flag;
    }


    /**
     * Sets the default_flag value for this LocalLBProfileRtspProxyType.
     * 
     * @param default_flag
     */
    public void setDefault_flag(boolean default_flag) {
        this.default_flag = default_flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBProfileRtspProxyType)) return false;
        LocalLBProfileRtspProxyType other = (LocalLBProfileRtspProxyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            this.default_flag == other.isDefault_flag();
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        _hashCode += (isDefault_flag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBProfileRtspProxyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileRtspProxyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RtspProxyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_flag"));
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
