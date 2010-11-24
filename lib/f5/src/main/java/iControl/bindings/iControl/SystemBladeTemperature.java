/**
 * SystemBladeTemperature.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemBladeTemperature  implements java.io.Serializable {
    private long slot;

    private long sensor;

    private java.lang.String location;

    private long temperature;

    public SystemBladeTemperature() {
    }

    public SystemBladeTemperature(
           long slot,
           long sensor,
           java.lang.String location,
           long temperature) {
           this.slot = slot;
           this.sensor = sensor;
           this.location = location;
           this.temperature = temperature;
    }


    /**
     * Gets the slot value for this SystemBladeTemperature.
     * 
     * @return slot
     */
    public long getSlot() {
        return slot;
    }


    /**
     * Sets the slot value for this SystemBladeTemperature.
     * 
     * @param slot
     */
    public void setSlot(long slot) {
        this.slot = slot;
    }


    /**
     * Gets the sensor value for this SystemBladeTemperature.
     * 
     * @return sensor
     */
    public long getSensor() {
        return sensor;
    }


    /**
     * Sets the sensor value for this SystemBladeTemperature.
     * 
     * @param sensor
     */
    public void setSensor(long sensor) {
        this.sensor = sensor;
    }


    /**
     * Gets the location value for this SystemBladeTemperature.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this SystemBladeTemperature.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the temperature value for this SystemBladeTemperature.
     * 
     * @return temperature
     */
    public long getTemperature() {
        return temperature;
    }


    /**
     * Sets the temperature value for this SystemBladeTemperature.
     * 
     * @param temperature
     */
    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemBladeTemperature)) return false;
        SystemBladeTemperature other = (SystemBladeTemperature) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.slot == other.getSlot() &&
            this.sensor == other.getSensor() &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            this.temperature == other.getTemperature();
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
        _hashCode += new Long(getSlot()).hashCode();
        _hashCode += new Long(getSensor()).hashCode();
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        _hashCode += new Long(getTemperature()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemBladeTemperature.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.BladeTemperature"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sensor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sensor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temperature"));
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
