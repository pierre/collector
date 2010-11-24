/**
 * ManagementSNMPConfigurationGenericSinkInformation2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationGenericSinkInformation2  implements java.io.Serializable {
    private java.lang.String snmpcmd_args;

    private java.lang.String sink_host;

    private long sink_port;

    public ManagementSNMPConfigurationGenericSinkInformation2() {
    }

    public ManagementSNMPConfigurationGenericSinkInformation2(
           java.lang.String snmpcmd_args,
           java.lang.String sink_host,
           long sink_port) {
           this.snmpcmd_args = snmpcmd_args;
           this.sink_host = sink_host;
           this.sink_port = sink_port;
    }


    /**
     * Gets the snmpcmd_args value for this ManagementSNMPConfigurationGenericSinkInformation2.
     * 
     * @return snmpcmd_args
     */
    public java.lang.String getSnmpcmd_args() {
        return snmpcmd_args;
    }


    /**
     * Sets the snmpcmd_args value for this ManagementSNMPConfigurationGenericSinkInformation2.
     * 
     * @param snmpcmd_args
     */
    public void setSnmpcmd_args(java.lang.String snmpcmd_args) {
        this.snmpcmd_args = snmpcmd_args;
    }


    /**
     * Gets the sink_host value for this ManagementSNMPConfigurationGenericSinkInformation2.
     * 
     * @return sink_host
     */
    public java.lang.String getSink_host() {
        return sink_host;
    }


    /**
     * Sets the sink_host value for this ManagementSNMPConfigurationGenericSinkInformation2.
     * 
     * @param sink_host
     */
    public void setSink_host(java.lang.String sink_host) {
        this.sink_host = sink_host;
    }


    /**
     * Gets the sink_port value for this ManagementSNMPConfigurationGenericSinkInformation2.
     * 
     * @return sink_port
     */
    public long getSink_port() {
        return sink_port;
    }


    /**
     * Sets the sink_port value for this ManagementSNMPConfigurationGenericSinkInformation2.
     * 
     * @param sink_port
     */
    public void setSink_port(long sink_port) {
        this.sink_port = sink_port;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationGenericSinkInformation2)) return false;
        ManagementSNMPConfigurationGenericSinkInformation2 other = (ManagementSNMPConfigurationGenericSinkInformation2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.snmpcmd_args==null && other.getSnmpcmd_args()==null) || 
             (this.snmpcmd_args!=null &&
              this.snmpcmd_args.equals(other.getSnmpcmd_args()))) &&
            ((this.sink_host==null && other.getSink_host()==null) || 
             (this.sink_host!=null &&
              this.sink_host.equals(other.getSink_host()))) &&
            this.sink_port == other.getSink_port();
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
        if (getSnmpcmd_args() != null) {
            _hashCode += getSnmpcmd_args().hashCode();
        }
        if (getSink_host() != null) {
            _hashCode += getSink_host().hashCode();
        }
        _hashCode += new Long(getSink_port()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationGenericSinkInformation2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpcmd_args");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmpcmd_args"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sink_host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sink_host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sink_port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sink_port"));
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
