/**
 * NetworkingISessionAdvertisedRouteSubnetOptKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingISessionAdvertisedRouteSubnetOptKey  implements java.io.Serializable {
    private java.lang.String ip;

    private java.lang.String mask;

    public NetworkingISessionAdvertisedRouteSubnetOptKey() {
    }

    public NetworkingISessionAdvertisedRouteSubnetOptKey(
           java.lang.String ip,
           java.lang.String mask) {
           this.ip = ip;
           this.mask = mask;
    }


    /**
     * Gets the ip value for this NetworkingISessionAdvertisedRouteSubnetOptKey.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this NetworkingISessionAdvertisedRouteSubnetOptKey.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the mask value for this NetworkingISessionAdvertisedRouteSubnetOptKey.
     * 
     * @return mask
     */
    public java.lang.String getMask() {
        return mask;
    }


    /**
     * Sets the mask value for this NetworkingISessionAdvertisedRouteSubnetOptKey.
     * 
     * @param mask
     */
    public void setMask(java.lang.String mask) {
        this.mask = mask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingISessionAdvertisedRouteSubnetOptKey)) return false;
        NetworkingISessionAdvertisedRouteSubnetOptKey other = (NetworkingISessionAdvertisedRouteSubnetOptKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.mask==null && other.getMask()==null) || 
             (this.mask!=null &&
              this.mask.equals(other.getMask())));
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
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getMask() != null) {
            _hashCode += getMask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingISessionAdvertisedRouteSubnetOptKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionAdvertisedRoute.SubnetOptKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mask"));
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
