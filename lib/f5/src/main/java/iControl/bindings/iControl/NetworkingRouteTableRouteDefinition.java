/**
 * NetworkingRouteTableRouteDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingRouteTableRouteDefinition  implements java.io.Serializable {
    private java.lang.String destination;

    private java.lang.String netmask;

    public NetworkingRouteTableRouteDefinition() {
    }

    public NetworkingRouteTableRouteDefinition(
           java.lang.String destination,
           java.lang.String netmask) {
           this.destination = destination;
           this.netmask = netmask;
    }


    /**
     * Gets the destination value for this NetworkingRouteTableRouteDefinition.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this NetworkingRouteTableRouteDefinition.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the netmask value for this NetworkingRouteTableRouteDefinition.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this NetworkingRouteTableRouteDefinition.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingRouteTableRouteDefinition)) return false;
        NetworkingRouteTableRouteDefinition other = (NetworkingRouteTableRouteDefinition) obj;
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
              this.netmask.equals(other.getNetmask())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingRouteTableRouteDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.RouteTable.RouteDefinition"));
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
