/**
 * ManagementSNMPConfigurationGenericSinkInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationGenericSinkInformation  implements java.io.Serializable {
    private java.lang.String snmpcmd_args;

    private java.lang.String sink_host;

    private java.lang.String sink_community;

    public ManagementSNMPConfigurationGenericSinkInformation() {
    }

    public ManagementSNMPConfigurationGenericSinkInformation(
           java.lang.String snmpcmd_args,
           java.lang.String sink_host,
           java.lang.String sink_community) {
           this.snmpcmd_args = snmpcmd_args;
           this.sink_host = sink_host;
           this.sink_community = sink_community;
    }


    /**
     * Gets the snmpcmd_args value for this ManagementSNMPConfigurationGenericSinkInformation.
     * 
     * @return snmpcmd_args
     */
    public java.lang.String getSnmpcmd_args() {
        return snmpcmd_args;
    }


    /**
     * Sets the snmpcmd_args value for this ManagementSNMPConfigurationGenericSinkInformation.
     * 
     * @param snmpcmd_args
     */
    public void setSnmpcmd_args(java.lang.String snmpcmd_args) {
        this.snmpcmd_args = snmpcmd_args;
    }


    /**
     * Gets the sink_host value for this ManagementSNMPConfigurationGenericSinkInformation.
     * 
     * @return sink_host
     */
    public java.lang.String getSink_host() {
        return sink_host;
    }


    /**
     * Sets the sink_host value for this ManagementSNMPConfigurationGenericSinkInformation.
     * 
     * @param sink_host
     */
    public void setSink_host(java.lang.String sink_host) {
        this.sink_host = sink_host;
    }


    /**
     * Gets the sink_community value for this ManagementSNMPConfigurationGenericSinkInformation.
     * 
     * @return sink_community
     */
    public java.lang.String getSink_community() {
        return sink_community;
    }


    /**
     * Sets the sink_community value for this ManagementSNMPConfigurationGenericSinkInformation.
     * 
     * @param sink_community
     */
    public void setSink_community(java.lang.String sink_community) {
        this.sink_community = sink_community;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationGenericSinkInformation)) return false;
        ManagementSNMPConfigurationGenericSinkInformation other = (ManagementSNMPConfigurationGenericSinkInformation) obj;
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
            ((this.sink_community==null && other.getSink_community()==null) || 
             (this.sink_community!=null &&
              this.sink_community.equals(other.getSink_community())));
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
        if (getSink_community() != null) {
            _hashCode += getSink_community().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationGenericSinkInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.GenericSinkInformation"));
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
        elemField.setFieldName("sink_community");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sink_community"));
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
