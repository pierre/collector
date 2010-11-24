/**
 * SystemPlatformPowerSupplies.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemPlatformPowerSupplies  implements java.io.Serializable {
    private iControl.SystemPSMetric[][] power_supplies;

    private iControl.CommonTimeStamp time_stamp;

    public SystemPlatformPowerSupplies() {
    }

    public SystemPlatformPowerSupplies(
           iControl.SystemPSMetric[][] power_supplies,
           iControl.CommonTimeStamp time_stamp) {
           this.power_supplies = power_supplies;
           this.time_stamp = time_stamp;
    }


    /**
     * Gets the power_supplies value for this SystemPlatformPowerSupplies.
     * 
     * @return power_supplies
     */
    public iControl.SystemPSMetric[][] getPower_supplies() {
        return power_supplies;
    }


    /**
     * Sets the power_supplies value for this SystemPlatformPowerSupplies.
     * 
     * @param power_supplies
     */
    public void setPower_supplies(iControl.SystemPSMetric[][] power_supplies) {
        this.power_supplies = power_supplies;
    }


    /**
     * Gets the time_stamp value for this SystemPlatformPowerSupplies.
     * 
     * @return time_stamp
     */
    public iControl.CommonTimeStamp getTime_stamp() {
        return time_stamp;
    }


    /**
     * Sets the time_stamp value for this SystemPlatformPowerSupplies.
     * 
     * @param time_stamp
     */
    public void setTime_stamp(iControl.CommonTimeStamp time_stamp) {
        this.time_stamp = time_stamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemPlatformPowerSupplies)) return false;
        SystemPlatformPowerSupplies other = (SystemPlatformPowerSupplies) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.power_supplies==null && other.getPower_supplies()==null) || 
             (this.power_supplies!=null &&
              java.util.Arrays.equals(this.power_supplies, other.getPower_supplies()))) &&
            ((this.time_stamp==null && other.getTime_stamp()==null) || 
             (this.time_stamp!=null &&
              this.time_stamp.equals(other.getTime_stamp())));
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
        if (getPower_supplies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPower_supplies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPower_supplies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTime_stamp() != null) {
            _hashCode += getTime_stamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemPlatformPowerSupplies.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.PlatformPowerSupplies"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power_supplies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "power_supplies"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.PSMetricSequence"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_stamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_stamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TimeStamp"));
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
