/**
 * ASMViolation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ASMViolation  implements java.io.Serializable {
    private iControl.ASMViolationName violation_name;

    private iControl.ASMFlagState learn_flag;

    private iControl.ASMFlagState alarm_flag;

    private iControl.ASMFlagState block_flag;

    public ASMViolation() {
    }

    public ASMViolation(
           iControl.ASMViolationName violation_name,
           iControl.ASMFlagState learn_flag,
           iControl.ASMFlagState alarm_flag,
           iControl.ASMFlagState block_flag) {
           this.violation_name = violation_name;
           this.learn_flag = learn_flag;
           this.alarm_flag = alarm_flag;
           this.block_flag = block_flag;
    }


    /**
     * Gets the violation_name value for this ASMViolation.
     * 
     * @return violation_name
     */
    public iControl.ASMViolationName getViolation_name() {
        return violation_name;
    }


    /**
     * Sets the violation_name value for this ASMViolation.
     * 
     * @param violation_name
     */
    public void setViolation_name(iControl.ASMViolationName violation_name) {
        this.violation_name = violation_name;
    }


    /**
     * Gets the learn_flag value for this ASMViolation.
     * 
     * @return learn_flag
     */
    public iControl.ASMFlagState getLearn_flag() {
        return learn_flag;
    }


    /**
     * Sets the learn_flag value for this ASMViolation.
     * 
     * @param learn_flag
     */
    public void setLearn_flag(iControl.ASMFlagState learn_flag) {
        this.learn_flag = learn_flag;
    }


    /**
     * Gets the alarm_flag value for this ASMViolation.
     * 
     * @return alarm_flag
     */
    public iControl.ASMFlagState getAlarm_flag() {
        return alarm_flag;
    }


    /**
     * Sets the alarm_flag value for this ASMViolation.
     * 
     * @param alarm_flag
     */
    public void setAlarm_flag(iControl.ASMFlagState alarm_flag) {
        this.alarm_flag = alarm_flag;
    }


    /**
     * Gets the block_flag value for this ASMViolation.
     * 
     * @return block_flag
     */
    public iControl.ASMFlagState getBlock_flag() {
        return block_flag;
    }


    /**
     * Sets the block_flag value for this ASMViolation.
     * 
     * @param block_flag
     */
    public void setBlock_flag(iControl.ASMFlagState block_flag) {
        this.block_flag = block_flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ASMViolation)) return false;
        ASMViolation other = (ASMViolation) obj;
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
            ((this.learn_flag==null && other.getLearn_flag()==null) || 
             (this.learn_flag!=null &&
              this.learn_flag.equals(other.getLearn_flag()))) &&
            ((this.alarm_flag==null && other.getAlarm_flag()==null) || 
             (this.alarm_flag!=null &&
              this.alarm_flag.equals(other.getAlarm_flag()))) &&
            ((this.block_flag==null && other.getBlock_flag()==null) || 
             (this.block_flag!=null &&
              this.block_flag.equals(other.getBlock_flag())));
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
        if (getLearn_flag() != null) {
            _hashCode += getLearn_flag().hashCode();
        }
        if (getAlarm_flag() != null) {
            _hashCode += getAlarm_flag().hashCode();
        }
        if (getBlock_flag() != null) {
            _hashCode += getBlock_flag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ASMViolation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.Violation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violation_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "violation_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.ViolationName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("learn_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "learn_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.FlagState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alarm_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.FlagState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("block_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "block_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.FlagState"));
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
