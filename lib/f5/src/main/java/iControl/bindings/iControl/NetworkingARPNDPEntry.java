/**
 * NetworkingARPNDPEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingARPNDPEntry  implements java.io.Serializable {
    private java.lang.String ndp_address;

    private java.lang.String mac_address;

    private java.lang.String vlan;

    private long expiration;

    private boolean is_router;

    private iControl.NetworkingARPNDPState state;

    public NetworkingARPNDPEntry() {
    }

    public NetworkingARPNDPEntry(
           java.lang.String ndp_address,
           java.lang.String mac_address,
           java.lang.String vlan,
           long expiration,
           boolean is_router,
           iControl.NetworkingARPNDPState state) {
           this.ndp_address = ndp_address;
           this.mac_address = mac_address;
           this.vlan = vlan;
           this.expiration = expiration;
           this.is_router = is_router;
           this.state = state;
    }


    /**
     * Gets the ndp_address value for this NetworkingARPNDPEntry.
     * 
     * @return ndp_address
     */
    public java.lang.String getNdp_address() {
        return ndp_address;
    }


    /**
     * Sets the ndp_address value for this NetworkingARPNDPEntry.
     * 
     * @param ndp_address
     */
    public void setNdp_address(java.lang.String ndp_address) {
        this.ndp_address = ndp_address;
    }


    /**
     * Gets the mac_address value for this NetworkingARPNDPEntry.
     * 
     * @return mac_address
     */
    public java.lang.String getMac_address() {
        return mac_address;
    }


    /**
     * Sets the mac_address value for this NetworkingARPNDPEntry.
     * 
     * @param mac_address
     */
    public void setMac_address(java.lang.String mac_address) {
        this.mac_address = mac_address;
    }


    /**
     * Gets the vlan value for this NetworkingARPNDPEntry.
     * 
     * @return vlan
     */
    public java.lang.String getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this NetworkingARPNDPEntry.
     * 
     * @param vlan
     */
    public void setVlan(java.lang.String vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the expiration value for this NetworkingARPNDPEntry.
     * 
     * @return expiration
     */
    public long getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this NetworkingARPNDPEntry.
     * 
     * @param expiration
     */
    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the is_router value for this NetworkingARPNDPEntry.
     * 
     * @return is_router
     */
    public boolean isIs_router() {
        return is_router;
    }


    /**
     * Sets the is_router value for this NetworkingARPNDPEntry.
     * 
     * @param is_router
     */
    public void setIs_router(boolean is_router) {
        this.is_router = is_router;
    }


    /**
     * Gets the state value for this NetworkingARPNDPEntry.
     * 
     * @return state
     */
    public iControl.NetworkingARPNDPState getState() {
        return state;
    }


    /**
     * Sets the state value for this NetworkingARPNDPEntry.
     * 
     * @param state
     */
    public void setState(iControl.NetworkingARPNDPState state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingARPNDPEntry)) return false;
        NetworkingARPNDPEntry other = (NetworkingARPNDPEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ndp_address==null && other.getNdp_address()==null) || 
             (this.ndp_address!=null &&
              this.ndp_address.equals(other.getNdp_address()))) &&
            ((this.mac_address==null && other.getMac_address()==null) || 
             (this.mac_address!=null &&
              this.mac_address.equals(other.getMac_address()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            this.expiration == other.getExpiration() &&
            this.is_router == other.isIs_router() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getNdp_address() != null) {
            _hashCode += getNdp_address().hashCode();
        }
        if (getMac_address() != null) {
            _hashCode += getMac_address().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        _hashCode += new Long(getExpiration()).hashCode();
        _hashCode += (isIs_router() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingARPNDPEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.ARP.NDPEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ndp_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ndp_address"));
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
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_router");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_router"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.ARP.NDPState"));
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
