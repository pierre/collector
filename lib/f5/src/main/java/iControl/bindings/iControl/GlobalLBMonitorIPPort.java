/**
 * GlobalLBMonitorIPPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBMonitorIPPort  implements java.io.Serializable {
    private iControl.GlobalLBAddressType address_type;

    private iControl.CommonIPPortDefinition ipport;

    public GlobalLBMonitorIPPort() {
    }

    public GlobalLBMonitorIPPort(
           iControl.GlobalLBAddressType address_type,
           iControl.CommonIPPortDefinition ipport) {
           this.address_type = address_type;
           this.ipport = ipport;
    }


    /**
     * Gets the address_type value for this GlobalLBMonitorIPPort.
     * 
     * @return address_type
     */
    public iControl.GlobalLBAddressType getAddress_type() {
        return address_type;
    }


    /**
     * Sets the address_type value for this GlobalLBMonitorIPPort.
     * 
     * @param address_type
     */
    public void setAddress_type(iControl.GlobalLBAddressType address_type) {
        this.address_type = address_type;
    }


    /**
     * Gets the ipport value for this GlobalLBMonitorIPPort.
     * 
     * @return ipport
     */
    public iControl.CommonIPPortDefinition getIpport() {
        return ipport;
    }


    /**
     * Sets the ipport value for this GlobalLBMonitorIPPort.
     * 
     * @param ipport
     */
    public void setIpport(iControl.CommonIPPortDefinition ipport) {
        this.ipport = ipport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBMonitorIPPort)) return false;
        GlobalLBMonitorIPPort other = (GlobalLBMonitorIPPort) obj;
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
            ((this.ipport==null && other.getIpport()==null) || 
             (this.ipport!=null &&
              this.ipport.equals(other.getIpport())));
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
        if (getIpport() != null) {
            _hashCode += getIpport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBMonitorIPPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.MonitorIPPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.AddressType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
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
