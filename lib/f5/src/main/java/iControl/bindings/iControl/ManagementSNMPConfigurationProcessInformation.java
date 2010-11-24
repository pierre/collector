/**
 * ManagementSNMPConfigurationProcessInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationProcessInformation  implements java.io.Serializable {
    private java.lang.String process_name;

    private long max;

    private long min;

    public ManagementSNMPConfigurationProcessInformation() {
    }

    public ManagementSNMPConfigurationProcessInformation(
           java.lang.String process_name,
           long max,
           long min) {
           this.process_name = process_name;
           this.max = max;
           this.min = min;
    }


    /**
     * Gets the process_name value for this ManagementSNMPConfigurationProcessInformation.
     * 
     * @return process_name
     */
    public java.lang.String getProcess_name() {
        return process_name;
    }


    /**
     * Sets the process_name value for this ManagementSNMPConfigurationProcessInformation.
     * 
     * @param process_name
     */
    public void setProcess_name(java.lang.String process_name) {
        this.process_name = process_name;
    }


    /**
     * Gets the max value for this ManagementSNMPConfigurationProcessInformation.
     * 
     * @return max
     */
    public long getMax() {
        return max;
    }


    /**
     * Sets the max value for this ManagementSNMPConfigurationProcessInformation.
     * 
     * @param max
     */
    public void setMax(long max) {
        this.max = max;
    }


    /**
     * Gets the min value for this ManagementSNMPConfigurationProcessInformation.
     * 
     * @return min
     */
    public long getMin() {
        return min;
    }


    /**
     * Sets the min value for this ManagementSNMPConfigurationProcessInformation.
     * 
     * @param min
     */
    public void setMin(long min) {
        this.min = min;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationProcessInformation)) return false;
        ManagementSNMPConfigurationProcessInformation other = (ManagementSNMPConfigurationProcessInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.process_name==null && other.getProcess_name()==null) || 
             (this.process_name!=null &&
              this.process_name.equals(other.getProcess_name()))) &&
            this.max == other.getMax() &&
            this.min == other.getMin();
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
        if (getProcess_name() != null) {
            _hashCode += getProcess_name().hashCode();
        }
        _hashCode += new Long(getMax()).hashCode();
        _hashCode += new Long(getMin()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationProcessInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ProcessInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("process_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "process_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min"));
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
