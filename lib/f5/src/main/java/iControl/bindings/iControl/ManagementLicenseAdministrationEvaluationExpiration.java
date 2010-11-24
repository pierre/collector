/**
 * ManagementLicenseAdministrationEvaluationExpiration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementLicenseAdministrationEvaluationExpiration  implements java.io.Serializable {
    private long current_system_time;

    private long evaluation_start;

    private long evaluation_expire;

    public ManagementLicenseAdministrationEvaluationExpiration() {
    }

    public ManagementLicenseAdministrationEvaluationExpiration(
           long current_system_time,
           long evaluation_start,
           long evaluation_expire) {
           this.current_system_time = current_system_time;
           this.evaluation_start = evaluation_start;
           this.evaluation_expire = evaluation_expire;
    }


    /**
     * Gets the current_system_time value for this ManagementLicenseAdministrationEvaluationExpiration.
     * 
     * @return current_system_time
     */
    public long getCurrent_system_time() {
        return current_system_time;
    }


    /**
     * Sets the current_system_time value for this ManagementLicenseAdministrationEvaluationExpiration.
     * 
     * @param current_system_time
     */
    public void setCurrent_system_time(long current_system_time) {
        this.current_system_time = current_system_time;
    }


    /**
     * Gets the evaluation_start value for this ManagementLicenseAdministrationEvaluationExpiration.
     * 
     * @return evaluation_start
     */
    public long getEvaluation_start() {
        return evaluation_start;
    }


    /**
     * Sets the evaluation_start value for this ManagementLicenseAdministrationEvaluationExpiration.
     * 
     * @param evaluation_start
     */
    public void setEvaluation_start(long evaluation_start) {
        this.evaluation_start = evaluation_start;
    }


    /**
     * Gets the evaluation_expire value for this ManagementLicenseAdministrationEvaluationExpiration.
     * 
     * @return evaluation_expire
     */
    public long getEvaluation_expire() {
        return evaluation_expire;
    }


    /**
     * Sets the evaluation_expire value for this ManagementLicenseAdministrationEvaluationExpiration.
     * 
     * @param evaluation_expire
     */
    public void setEvaluation_expire(long evaluation_expire) {
        this.evaluation_expire = evaluation_expire;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementLicenseAdministrationEvaluationExpiration)) return false;
        ManagementLicenseAdministrationEvaluationExpiration other = (ManagementLicenseAdministrationEvaluationExpiration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.current_system_time == other.getCurrent_system_time() &&
            this.evaluation_start == other.getEvaluation_start() &&
            this.evaluation_expire == other.getEvaluation_expire();
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
        _hashCode += new Long(getCurrent_system_time()).hashCode();
        _hashCode += new Long(getEvaluation_start()).hashCode();
        _hashCode += new Long(getEvaluation_expire()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementLicenseAdministrationEvaluationExpiration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.LicenseAdministration.EvaluationExpiration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_system_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_system_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluation_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evaluation_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluation_expire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evaluation_expire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
