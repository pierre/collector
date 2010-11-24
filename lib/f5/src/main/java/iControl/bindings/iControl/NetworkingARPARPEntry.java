/**
 * NetworkingARPARPEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingARPARPEntry  implements java.io.Serializable {
    private java.lang.String arp_address;

    private java.lang.String mac_address;

    private java.lang.String vlan;

    private long expiration;

    private boolean is_down;

    private boolean is_dynamic;

    private boolean is_resolved;

    private boolean is_keepalive;

    public NetworkingARPARPEntry() {
    }

    public NetworkingARPARPEntry(
           java.lang.String arp_address,
           java.lang.String mac_address,
           java.lang.String vlan,
           long expiration,
           boolean is_down,
           boolean is_dynamic,
           boolean is_resolved,
           boolean is_keepalive) {
           this.arp_address = arp_address;
           this.mac_address = mac_address;
           this.vlan = vlan;
           this.expiration = expiration;
           this.is_down = is_down;
           this.is_dynamic = is_dynamic;
           this.is_resolved = is_resolved;
           this.is_keepalive = is_keepalive;
    }


    /**
     * Gets the arp_address value for this NetworkingARPARPEntry.
     * 
     * @return arp_address
     */
    public java.lang.String getArp_address() {
        return arp_address;
    }


    /**
     * Sets the arp_address value for this NetworkingARPARPEntry.
     * 
     * @param arp_address
     */
    public void setArp_address(java.lang.String arp_address) {
        this.arp_address = arp_address;
    }


    /**
     * Gets the mac_address value for this NetworkingARPARPEntry.
     * 
     * @return mac_address
     */
    public java.lang.String getMac_address() {
        return mac_address;
    }


    /**
     * Sets the mac_address value for this NetworkingARPARPEntry.
     * 
     * @param mac_address
     */
    public void setMac_address(java.lang.String mac_address) {
        this.mac_address = mac_address;
    }


    /**
     * Gets the vlan value for this NetworkingARPARPEntry.
     * 
     * @return vlan
     */
    public java.lang.String getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this NetworkingARPARPEntry.
     * 
     * @param vlan
     */
    public void setVlan(java.lang.String vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the expiration value for this NetworkingARPARPEntry.
     * 
     * @return expiration
     */
    public long getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this NetworkingARPARPEntry.
     * 
     * @param expiration
     */
    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the is_down value for this NetworkingARPARPEntry.
     * 
     * @return is_down
     */
    public boolean isIs_down() {
        return is_down;
    }


    /**
     * Sets the is_down value for this NetworkingARPARPEntry.
     * 
     * @param is_down
     */
    public void setIs_down(boolean is_down) {
        this.is_down = is_down;
    }


    /**
     * Gets the is_dynamic value for this NetworkingARPARPEntry.
     * 
     * @return is_dynamic
     */
    public boolean isIs_dynamic() {
        return is_dynamic;
    }


    /**
     * Sets the is_dynamic value for this NetworkingARPARPEntry.
     * 
     * @param is_dynamic
     */
    public void setIs_dynamic(boolean is_dynamic) {
        this.is_dynamic = is_dynamic;
    }


    /**
     * Gets the is_resolved value for this NetworkingARPARPEntry.
     * 
     * @return is_resolved
     */
    public boolean isIs_resolved() {
        return is_resolved;
    }


    /**
     * Sets the is_resolved value for this NetworkingARPARPEntry.
     * 
     * @param is_resolved
     */
    public void setIs_resolved(boolean is_resolved) {
        this.is_resolved = is_resolved;
    }


    /**
     * Gets the is_keepalive value for this NetworkingARPARPEntry.
     * 
     * @return is_keepalive
     */
    public boolean isIs_keepalive() {
        return is_keepalive;
    }


    /**
     * Sets the is_keepalive value for this NetworkingARPARPEntry.
     * 
     * @param is_keepalive
     */
    public void setIs_keepalive(boolean is_keepalive) {
        this.is_keepalive = is_keepalive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingARPARPEntry)) return false;
        NetworkingARPARPEntry other = (NetworkingARPARPEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arp_address==null && other.getArp_address()==null) || 
             (this.arp_address!=null &&
              this.arp_address.equals(other.getArp_address()))) &&
            ((this.mac_address==null && other.getMac_address()==null) || 
             (this.mac_address!=null &&
              this.mac_address.equals(other.getMac_address()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            this.expiration == other.getExpiration() &&
            this.is_down == other.isIs_down() &&
            this.is_dynamic == other.isIs_dynamic() &&
            this.is_resolved == other.isIs_resolved() &&
            this.is_keepalive == other.isIs_keepalive();
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
        if (getArp_address() != null) {
            _hashCode += getArp_address().hashCode();
        }
        if (getMac_address() != null) {
            _hashCode += getMac_address().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        _hashCode += new Long(getExpiration()).hashCode();
        _hashCode += (isIs_down() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIs_dynamic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIs_resolved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIs_keepalive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingARPARPEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.ARP.ARPEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arp_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arp_address"));
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
        elemField.setFieldName("is_down");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_down"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_dynamic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_dynamic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_resolved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_resolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_keepalive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_keepalive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
