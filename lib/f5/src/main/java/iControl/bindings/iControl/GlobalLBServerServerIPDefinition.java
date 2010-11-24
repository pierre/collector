/**
 * GlobalLBServerServerIPDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBServerServerIPDefinition  implements java.io.Serializable {
    private java.lang.String server;

    private iControl.GlobalLBServerServerIPsForUnitID[] addresses;

    public GlobalLBServerServerIPDefinition() {
    }

    public GlobalLBServerServerIPDefinition(
           java.lang.String server,
           iControl.GlobalLBServerServerIPsForUnitID[] addresses) {
           this.server = server;
           this.addresses = addresses;
    }


    /**
     * Gets the server value for this GlobalLBServerServerIPDefinition.
     * 
     * @return server
     */
    public java.lang.String getServer() {
        return server;
    }


    /**
     * Sets the server value for this GlobalLBServerServerIPDefinition.
     * 
     * @param server
     */
    public void setServer(java.lang.String server) {
        this.server = server;
    }


    /**
     * Gets the addresses value for this GlobalLBServerServerIPDefinition.
     * 
     * @return addresses
     */
    public iControl.GlobalLBServerServerIPsForUnitID[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this GlobalLBServerServerIPDefinition.
     * 
     * @param addresses
     */
    public void setAddresses(iControl.GlobalLBServerServerIPsForUnitID[] addresses) {
        this.addresses = addresses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBServerServerIPDefinition)) return false;
        GlobalLBServerServerIPDefinition other = (GlobalLBServerServerIPDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              this.server.equals(other.getServer()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses())));
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
        if (getServer() != null) {
            _hashCode += getServer().hashCode();
        }
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBServerServerIPDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Server.ServerIPDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Server.ServerIPsForUnitID"));
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
