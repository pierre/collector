/**
 * NetworkingRouteTableRouteAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingRouteTableRouteAttribute  implements java.io.Serializable {
    private java.lang.String gateway;

    private java.lang.String vlan_name;

    private java.lang.String pool_name;

    public NetworkingRouteTableRouteAttribute() {
    }

    public NetworkingRouteTableRouteAttribute(
           java.lang.String gateway,
           java.lang.String vlan_name,
           java.lang.String pool_name) {
           this.gateway = gateway;
           this.vlan_name = vlan_name;
           this.pool_name = pool_name;
    }


    /**
     * Gets the gateway value for this NetworkingRouteTableRouteAttribute.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this NetworkingRouteTableRouteAttribute.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the vlan_name value for this NetworkingRouteTableRouteAttribute.
     * 
     * @return vlan_name
     */
    public java.lang.String getVlan_name() {
        return vlan_name;
    }


    /**
     * Sets the vlan_name value for this NetworkingRouteTableRouteAttribute.
     * 
     * @param vlan_name
     */
    public void setVlan_name(java.lang.String vlan_name) {
        this.vlan_name = vlan_name;
    }


    /**
     * Gets the pool_name value for this NetworkingRouteTableRouteAttribute.
     * 
     * @return pool_name
     */
    public java.lang.String getPool_name() {
        return pool_name;
    }


    /**
     * Sets the pool_name value for this NetworkingRouteTableRouteAttribute.
     * 
     * @param pool_name
     */
    public void setPool_name(java.lang.String pool_name) {
        this.pool_name = pool_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingRouteTableRouteAttribute)) return false;
        NetworkingRouteTableRouteAttribute other = (NetworkingRouteTableRouteAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
            ((this.vlan_name==null && other.getVlan_name()==null) || 
             (this.vlan_name!=null &&
              this.vlan_name.equals(other.getVlan_name()))) &&
            ((this.pool_name==null && other.getPool_name()==null) || 
             (this.pool_name!=null &&
              this.pool_name.equals(other.getPool_name())));
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
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getVlan_name() != null) {
            _hashCode += getVlan_name().hashCode();
        }
        if (getPool_name() != null) {
            _hashCode += getPool_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingRouteTableRouteAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.RouteTable.RouteAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pool_name"));
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
