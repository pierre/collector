/**
 * NetworkingRouteTableDynamicRoute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingRouteTableDynamicRoute  implements java.io.Serializable {
    private java.lang.String destination;

    private java.lang.String netmask;

    private java.lang.String gateway;

    private java.lang.String vlan_name;

    private java.lang.String pool_name;

    private long mtu;

    public NetworkingRouteTableDynamicRoute() {
    }

    public NetworkingRouteTableDynamicRoute(
           java.lang.String destination,
           java.lang.String netmask,
           java.lang.String gateway,
           java.lang.String vlan_name,
           java.lang.String pool_name,
           long mtu) {
           this.destination = destination;
           this.netmask = netmask;
           this.gateway = gateway;
           this.vlan_name = vlan_name;
           this.pool_name = pool_name;
           this.mtu = mtu;
    }


    /**
     * Gets the destination value for this NetworkingRouteTableDynamicRoute.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this NetworkingRouteTableDynamicRoute.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the netmask value for this NetworkingRouteTableDynamicRoute.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this NetworkingRouteTableDynamicRoute.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the gateway value for this NetworkingRouteTableDynamicRoute.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this NetworkingRouteTableDynamicRoute.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the vlan_name value for this NetworkingRouteTableDynamicRoute.
     * 
     * @return vlan_name
     */
    public java.lang.String getVlan_name() {
        return vlan_name;
    }


    /**
     * Sets the vlan_name value for this NetworkingRouteTableDynamicRoute.
     * 
     * @param vlan_name
     */
    public void setVlan_name(java.lang.String vlan_name) {
        this.vlan_name = vlan_name;
    }


    /**
     * Gets the pool_name value for this NetworkingRouteTableDynamicRoute.
     * 
     * @return pool_name
     */
    public java.lang.String getPool_name() {
        return pool_name;
    }


    /**
     * Sets the pool_name value for this NetworkingRouteTableDynamicRoute.
     * 
     * @param pool_name
     */
    public void setPool_name(java.lang.String pool_name) {
        this.pool_name = pool_name;
    }


    /**
     * Gets the mtu value for this NetworkingRouteTableDynamicRoute.
     * 
     * @return mtu
     */
    public long getMtu() {
        return mtu;
    }


    /**
     * Sets the mtu value for this NetworkingRouteTableDynamicRoute.
     * 
     * @param mtu
     */
    public void setMtu(long mtu) {
        this.mtu = mtu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingRouteTableDynamicRoute)) return false;
        NetworkingRouteTableDynamicRoute other = (NetworkingRouteTableDynamicRoute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
            ((this.vlan_name==null && other.getVlan_name()==null) || 
             (this.vlan_name!=null &&
              this.vlan_name.equals(other.getVlan_name()))) &&
            ((this.pool_name==null && other.getPool_name()==null) || 
             (this.pool_name!=null &&
              this.pool_name.equals(other.getPool_name()))) &&
            this.mtu == other.getMtu();
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
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getVlan_name() != null) {
            _hashCode += getVlan_name().hashCode();
        }
        if (getPool_name() != null) {
            _hashCode += getPool_name().hashCode();
        }
        _hashCode += new Long(getMtu()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingRouteTableDynamicRoute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.RouteTable.DynamicRoute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtu"));
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
