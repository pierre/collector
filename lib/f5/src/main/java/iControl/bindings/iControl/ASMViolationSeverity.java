/**
 * ASMViolationSeverity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ASMViolationSeverity  implements java.io.Serializable {
    private iControl.ASMViolationName violation_name;

    private iControl.ASMSeverityName severity_name;

    public ASMViolationSeverity() {
    }

    public ASMViolationSeverity(
           iControl.ASMViolationName violation_name,
           iControl.ASMSeverityName severity_name) {
           this.violation_name = violation_name;
           this.severity_name = severity_name;
    }


    /**
     * Gets the violation_name value for this ASMViolationSeverity.
     * 
     * @return violation_name
     */
    public iControl.ASMViolationName getViolation_name() {
        return violation_name;
    }


    /**
     * Sets the violation_name value for this ASMViolationSeverity.
     * 
     * @param violation_name
     */
    public void setViolation_name(iControl.ASMViolationName violation_name) {
        this.violation_name = violation_name;
    }


    /**
     * Gets the severity_name value for this ASMViolationSeverity.
     * 
     * @return severity_name
     */
    public iControl.ASMSeverityName getSeverity_name() {
        return severity_name;
    }


    /**
     * Sets the severity_name value for this ASMViolationSeverity.
     * 
     * @param severity_name
     */
    public void setSeverity_name(iControl.ASMSeverityName severity_name) {
        this.severity_name = severity_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ASMViolationSeverity)) return false;
        ASMViolationSeverity other = (ASMViolationSeverity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.violation_name==null && other.getViolation_name()==null) || 
             (this.violation_name!=null &&
              this.violation_name.equals(other.getViolation_name()))) &&
            ((this.severity_name==null && other.getSeverity_name()==null) || 
             (this.severity_name!=null &&
              this.severity_name.equals(other.getSeverity_name())));
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
        if (getViolation_name() != null) {
            _hashCode += getViolation_name().hashCode();
        }
        if (getSeverity_name() != null) {
            _hashCode += getSeverity_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ASMViolationSeverity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.ViolationSeverity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violation_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "violation_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.ViolationName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.SeverityName"));
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
