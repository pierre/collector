/**
 * LocalLBProfileMatchPatternStringArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileMatchPatternStringArray  implements java.io.Serializable {
    private iControl.LocalLBMatchPatternString[] values;

    private boolean default_flag;

    public LocalLBProfileMatchPatternStringArray() {
    }

    public LocalLBProfileMatchPatternStringArray(
           iControl.LocalLBMatchPatternString[] values,
           boolean default_flag) {
           this.values = values;
           this.default_flag = default_flag;
    }


    /**
     * Gets the values value for this LocalLBProfileMatchPatternStringArray.
     * 
     * @return values
     */
    public iControl.LocalLBMatchPatternString[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this LocalLBProfileMatchPatternStringArray.
     * 
     * @param values
     */
    public void setValues(iControl.LocalLBMatchPatternString[] values) {
        this.values = values;
    }


    /**
     * Gets the default_flag value for this LocalLBProfileMatchPatternStringArray.
     * 
     * @return default_flag
     */
    public boolean isDefault_flag() {
        return default_flag;
    }


    /**
     * Sets the default_flag value for this LocalLBProfileMatchPatternStringArray.
     * 
     * @param default_flag
     */
    public void setDefault_flag(boolean default_flag) {
        this.default_flag = default_flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBProfileMatchPatternStringArray)) return false;
        LocalLBProfileMatchPatternStringArray other = (LocalLBProfileMatchPatternStringArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues()))) &&
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
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isDefault_flag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBProfileMatchPatternStringArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileMatchPatternStringArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MatchPatternString"));
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
