/**
 * LocalLBMonitorIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBMonitorIP  implements java.io.Serializable {
    private iControl.LocalLBAddressType address_type;

    private java.lang.String ipaddress;

    public LocalLBMonitorIP() {
    }

    public LocalLBMonitorIP(
           iControl.LocalLBAddressType address_type,
           java.lang.String ipaddress) {
           this.address_type = address_type;
           this.ipaddress = ipaddress;
    }


    /**
     * Gets the address_type value for this LocalLBMonitorIP.
     * 
     * @return address_type
     */
    public iControl.LocalLBAddressType getAddress_type() {
        return address_type;
    }


    /**
     * Sets the address_type value for this LocalLBMonitorIP.
     * 
     * @param address_type
     */
    public void setAddress_type(iControl.LocalLBAddressType address_type) {
        this.address_type = address_type;
    }


    /**
     * Gets the ipaddress value for this LocalLBMonitorIP.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this LocalLBMonitorIP.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBMonitorIP)) return false;
        LocalLBMonitorIP other = (LocalLBMonitorIP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address_type==null && other.getAddress_type()==null) || 
             (this.address_type!=null &&
              this.address_type.equals(other.getAddress_type()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress())));
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
        if (getAddress_type() != null) {
            _hashCode += getAddress_type().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBMonitorIP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorIP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.AddressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
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
