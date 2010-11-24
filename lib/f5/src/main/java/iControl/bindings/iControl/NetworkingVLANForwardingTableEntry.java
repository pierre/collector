/**
 * NetworkingVLANForwardingTableEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingVLANForwardingTableEntry  implements java.io.Serializable {
    private java.lang.String mac_address;

    private java.lang.String interface_name;

    private iControl.NetworkingMemberType interface_type;

    public NetworkingVLANForwardingTableEntry() {
    }

    public NetworkingVLANForwardingTableEntry(
           java.lang.String mac_address,
           java.lang.String interface_name,
           iControl.NetworkingMemberType interface_type) {
           this.mac_address = mac_address;
           this.interface_name = interface_name;
           this.interface_type = interface_type;
    }


    /**
     * Gets the mac_address value for this NetworkingVLANForwardingTableEntry.
     * 
     * @return mac_address
     */
    public java.lang.String getMac_address() {
        return mac_address;
    }


    /**
     * Sets the mac_address value for this NetworkingVLANForwardingTableEntry.
     * 
     * @param mac_address
     */
    public void setMac_address(java.lang.String mac_address) {
        this.mac_address = mac_address;
    }


    /**
     * Gets the interface_name value for this NetworkingVLANForwardingTableEntry.
     * 
     * @return interface_name
     */
    public java.lang.String getInterface_name() {
        return interface_name;
    }


    /**
     * Sets the interface_name value for this NetworkingVLANForwardingTableEntry.
     * 
     * @param interface_name
     */
    public void setInterface_name(java.lang.String interface_name) {
        this.interface_name = interface_name;
    }


    /**
     * Gets the interface_type value for this NetworkingVLANForwardingTableEntry.
     * 
     * @return interface_type
     */
    public iControl.NetworkingMemberType getInterface_type() {
        return interface_type;
    }


    /**
     * Sets the interface_type value for this NetworkingVLANForwardingTableEntry.
     * 
     * @param interface_type
     */
    public void setInterface_type(iControl.NetworkingMemberType interface_type) {
        this.interface_type = interface_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingVLANForwardingTableEntry)) return false;
        NetworkingVLANForwardingTableEntry other = (NetworkingVLANForwardingTableEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mac_address==null && other.getMac_address()==null) || 
             (this.mac_address!=null &&
              this.mac_address.equals(other.getMac_address()))) &&
            ((this.interface_name==null && other.getInterface_name()==null) || 
             (this.interface_name!=null &&
              this.interface_name.equals(other.getInterface_name()))) &&
            ((this.interface_type==null && other.getInterface_type()==null) || 
             (this.interface_type!=null &&
              this.interface_type.equals(other.getInterface_type())));
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
        if (getMac_address() != null) {
            _hashCode += getMac_address().hashCode();
        }
        if (getInterface_name() != null) {
            _hashCode += getInterface_name().hashCode();
        }
        if (getInterface_type() != null) {
            _hashCode += getInterface_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingVLANForwardingTableEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.VLAN.ForwardingTableEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interface_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interface_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interface_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interface_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.MemberType"));
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
