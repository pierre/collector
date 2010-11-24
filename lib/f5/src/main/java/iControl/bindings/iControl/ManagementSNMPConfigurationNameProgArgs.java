/**
 * ManagementSNMPConfigurationNameProgArgs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationNameProgArgs  implements java.io.Serializable {
    private java.lang.String process_name;

    private java.lang.String program_name;

    private java.lang.String program_args;

    public ManagementSNMPConfigurationNameProgArgs() {
    }

    public ManagementSNMPConfigurationNameProgArgs(
           java.lang.String process_name,
           java.lang.String program_name,
           java.lang.String program_args) {
           this.process_name = process_name;
           this.program_name = program_name;
           this.program_args = program_args;
    }


    /**
     * Gets the process_name value for this ManagementSNMPConfigurationNameProgArgs.
     * 
     * @return process_name
     */
    public java.lang.String getProcess_name() {
        return process_name;
    }


    /**
     * Sets the process_name value for this ManagementSNMPConfigurationNameProgArgs.
     * 
     * @param process_name
     */
    public void setProcess_name(java.lang.String process_name) {
        this.process_name = process_name;
    }


    /**
     * Gets the program_name value for this ManagementSNMPConfigurationNameProgArgs.
     * 
     * @return program_name
     */
    public java.lang.String getProgram_name() {
        return program_name;
    }


    /**
     * Sets the program_name value for this ManagementSNMPConfigurationNameProgArgs.
     * 
     * @param program_name
     */
    public void setProgram_name(java.lang.String program_name) {
        this.program_name = program_name;
    }


    /**
     * Gets the program_args value for this ManagementSNMPConfigurationNameProgArgs.
     * 
     * @return program_args
     */
    public java.lang.String getProgram_args() {
        return program_args;
    }


    /**
     * Sets the program_args value for this ManagementSNMPConfigurationNameProgArgs.
     * 
     * @param program_args
     */
    public void setProgram_args(java.lang.String program_args) {
        this.program_args = program_args;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationNameProgArgs)) return false;
        ManagementSNMPConfigurationNameProgArgs other = (ManagementSNMPConfigurationNameProgArgs) obj;
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
            ((this.program_name==null && other.getProgram_name()==null) || 
             (this.program_name!=null &&
              this.program_name.equals(other.getProgram_name()))) &&
            ((this.program_args==null && other.getProgram_args()==null) || 
             (this.program_args!=null &&
              this.program_args.equals(other.getProgram_args())));
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
        if (getProgram_name() != null) {
            _hashCode += getProgram_name().hashCode();
        }
        if (getProgram_args() != null) {
            _hashCode += getProgram_args().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationNameProgArgs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.NameProgArgs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("process_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "process_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("program_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "program_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("program_args");
        elemField.setXmlName(new javax.xml.namespace.QName("", "program_args"));
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
