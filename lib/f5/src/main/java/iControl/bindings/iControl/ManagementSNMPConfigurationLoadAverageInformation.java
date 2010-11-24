/**
 * ManagementSNMPConfigurationLoadAverageInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationLoadAverageInformation  implements java.io.Serializable {
    private long max_1_minute_load;

    private long max_5_minute_load;

    private long max_15_minute_load;

    public ManagementSNMPConfigurationLoadAverageInformation() {
    }

    public ManagementSNMPConfigurationLoadAverageInformation(
           long max_1_minute_load,
           long max_5_minute_load,
           long max_15_minute_load) {
           this.max_1_minute_load = max_1_minute_load;
           this.max_5_minute_load = max_5_minute_load;
           this.max_15_minute_load = max_15_minute_load;
    }


    /**
     * Gets the max_1_minute_load value for this ManagementSNMPConfigurationLoadAverageInformation.
     * 
     * @return max_1_minute_load
     */
    public long getMax_1_minute_load() {
        return max_1_minute_load;
    }


    /**
     * Sets the max_1_minute_load value for this ManagementSNMPConfigurationLoadAverageInformation.
     * 
     * @param max_1_minute_load
     */
    public void setMax_1_minute_load(long max_1_minute_load) {
        this.max_1_minute_load = max_1_minute_load;
    }


    /**
     * Gets the max_5_minute_load value for this ManagementSNMPConfigurationLoadAverageInformation.
     * 
     * @return max_5_minute_load
     */
    public long getMax_5_minute_load() {
        return max_5_minute_load;
    }


    /**
     * Sets the max_5_minute_load value for this ManagementSNMPConfigurationLoadAverageInformation.
     * 
     * @param max_5_minute_load
     */
    public void setMax_5_minute_load(long max_5_minute_load) {
        this.max_5_minute_load = max_5_minute_load;
    }


    /**
     * Gets the max_15_minute_load value for this ManagementSNMPConfigurationLoadAverageInformation.
     * 
     * @return max_15_minute_load
     */
    public long getMax_15_minute_load() {
        return max_15_minute_load;
    }


    /**
     * Sets the max_15_minute_load value for this ManagementSNMPConfigurationLoadAverageInformation.
     * 
     * @param max_15_minute_load
     */
    public void setMax_15_minute_load(long max_15_minute_load) {
        this.max_15_minute_load = max_15_minute_load;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationLoadAverageInformation)) return false;
        ManagementSNMPConfigurationLoadAverageInformation other = (ManagementSNMPConfigurationLoadAverageInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.max_1_minute_load == other.getMax_1_minute_load() &&
            this.max_5_minute_load == other.getMax_5_minute_load() &&
            this.max_15_minute_load == other.getMax_15_minute_load();
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
        _hashCode += new Long(getMax_1_minute_load()).hashCode();
        _hashCode += new Long(getMax_5_minute_load()).hashCode();
        _hashCode += new Long(getMax_15_minute_load()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationLoadAverageInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.LoadAverageInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_1_minute_load");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_1_minute_load"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_5_minute_load");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_5_minute_load"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_15_minute_load");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_15_minute_load"));
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
