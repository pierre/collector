/**
 * NetworkingRouteTableRouteTableMetricEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingRouteTableRouteTableMetricEntry  implements java.io.Serializable {
    private java.lang.String destination;

    private java.lang.String mac_address;

    private long rtt;

    private long rtt_variance;

    private long mtu;

    private long expiration;

    public NetworkingRouteTableRouteTableMetricEntry() {
    }

    public NetworkingRouteTableRouteTableMetricEntry(
           java.lang.String destination,
           java.lang.String mac_address,
           long rtt,
           long rtt_variance,
           long mtu,
           long expiration) {
           this.destination = destination;
           this.mac_address = mac_address;
           this.rtt = rtt;
           this.rtt_variance = rtt_variance;
           this.mtu = mtu;
           this.expiration = expiration;
    }


    /**
     * Gets the destination value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the mac_address value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @return mac_address
     */
    public java.lang.String getMac_address() {
        return mac_address;
    }


    /**
     * Sets the mac_address value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @param mac_address
     */
    public void setMac_address(java.lang.String mac_address) {
        this.mac_address = mac_address;
    }


    /**
     * Gets the rtt value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @return rtt
     */
    public long getRtt() {
        return rtt;
    }


    /**
     * Sets the rtt value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @param rtt
     */
    public void setRtt(long rtt) {
        this.rtt = rtt;
    }


    /**
     * Gets the rtt_variance value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @return rtt_variance
     */
    public long getRtt_variance() {
        return rtt_variance;
    }


    /**
     * Sets the rtt_variance value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @param rtt_variance
     */
    public void setRtt_variance(long rtt_variance) {
        this.rtt_variance = rtt_variance;
    }


    /**
     * Gets the mtu value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @return mtu
     */
    public long getMtu() {
        return mtu;
    }


    /**
     * Sets the mtu value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @param mtu
     */
    public void setMtu(long mtu) {
        this.mtu = mtu;
    }


    /**
     * Gets the expiration value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @return expiration
     */
    public long getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this NetworkingRouteTableRouteTableMetricEntry.
     * 
     * @param expiration
     */
    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingRouteTableRouteTableMetricEntry)) return false;
        NetworkingRouteTableRouteTableMetricEntry other = (NetworkingRouteTableRouteTableMetricEntry) obj;
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
            ((this.mac_address==null && other.getMac_address()==null) || 
             (this.mac_address!=null &&
              this.mac_address.equals(other.getMac_address()))) &&
            this.rtt == other.getRtt() &&
            this.rtt_variance == other.getRtt_variance() &&
            this.mtu == other.getMtu() &&
            this.expiration == other.getExpiration();
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
        if (getMac_address() != null) {
            _hashCode += getMac_address().hashCode();
        }
        _hashCode += new Long(getRtt()).hashCode();
        _hashCode += new Long(getRtt_variance()).hashCode();
        _hashCode += new Long(getMtu()).hashCode();
        _hashCode += new Long(getExpiration()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingRouteTableRouteTableMetricEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.RouteTable.RouteTableMetricEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtt_variance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtt_variance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiration"));
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
