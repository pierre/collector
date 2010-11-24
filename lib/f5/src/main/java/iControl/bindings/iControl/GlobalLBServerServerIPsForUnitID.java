/**
 * GlobalLBServerServerIPsForUnitID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBServerServerIPsForUnitID  implements java.io.Serializable {
    private long unit_id;

    private java.lang.String[] addresses_on_unit;

    public GlobalLBServerServerIPsForUnitID() {
    }

    public GlobalLBServerServerIPsForUnitID(
           long unit_id,
           java.lang.String[] addresses_on_unit) {
           this.unit_id = unit_id;
           this.addresses_on_unit = addresses_on_unit;
    }


    /**
     * Gets the unit_id value for this GlobalLBServerServerIPsForUnitID.
     * 
     * @return unit_id
     */
    public long getUnit_id() {
        return unit_id;
    }


    /**
     * Sets the unit_id value for this GlobalLBServerServerIPsForUnitID.
     * 
     * @param unit_id
     */
    public void setUnit_id(long unit_id) {
        this.unit_id = unit_id;
    }


    /**
     * Gets the addresses_on_unit value for this GlobalLBServerServerIPsForUnitID.
     * 
     * @return addresses_on_unit
     */
    public java.lang.String[] getAddresses_on_unit() {
        return addresses_on_unit;
    }


    /**
     * Sets the addresses_on_unit value for this GlobalLBServerServerIPsForUnitID.
     * 
     * @param addresses_on_unit
     */
    public void setAddresses_on_unit(java.lang.String[] addresses_on_unit) {
        this.addresses_on_unit = addresses_on_unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBServerServerIPsForUnitID)) return false;
        GlobalLBServerServerIPsForUnitID other = (GlobalLBServerServerIPsForUnitID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.unit_id == other.getUnit_id() &&
            ((this.addresses_on_unit==null && other.getAddresses_on_unit()==null) || 
             (this.addresses_on_unit!=null &&
              java.util.Arrays.equals(this.addresses_on_unit, other.getAddresses_on_unit())));
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
        _hashCode += new Long(getUnit_id()).hashCode();
        if (getAddresses_on_unit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses_on_unit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses_on_unit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBServerServerIPsForUnitID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Server.ServerIPsForUnitID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses_on_unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addresses_on_unit"));
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
