/**
 * LocalLBMatchPatternString.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBMatchPatternString  implements java.io.Serializable {
    private java.lang.String pattern;

    private boolean is_glob;

    public LocalLBMatchPatternString() {
    }

    public LocalLBMatchPatternString(
           java.lang.String pattern,
           boolean is_glob) {
           this.pattern = pattern;
           this.is_glob = is_glob;
    }


    /**
     * Gets the pattern value for this LocalLBMatchPatternString.
     * 
     * @return pattern
     */
    public java.lang.String getPattern() {
        return pattern;
    }


    /**
     * Sets the pattern value for this LocalLBMatchPatternString.
     * 
     * @param pattern
     */
    public void setPattern(java.lang.String pattern) {
        this.pattern = pattern;
    }


    /**
     * Gets the is_glob value for this LocalLBMatchPatternString.
     * 
     * @return is_glob
     */
    public boolean isIs_glob() {
        return is_glob;
    }


    /**
     * Sets the is_glob value for this LocalLBMatchPatternString.
     * 
     * @param is_glob
     */
    public void setIs_glob(boolean is_glob) {
        this.is_glob = is_glob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBMatchPatternString)) return false;
        LocalLBMatchPatternString other = (LocalLBMatchPatternString) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pattern==null && other.getPattern()==null) || 
             (this.pattern!=null &&
              this.pattern.equals(other.getPattern()))) &&
            this.is_glob == other.isIs_glob();
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
        if (getPattern() != null) {
            _hashCode += getPattern().hashCode();
        }
        _hashCode += (isIs_glob() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBMatchPatternString.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MatchPatternString"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_glob");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_glob"));
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
