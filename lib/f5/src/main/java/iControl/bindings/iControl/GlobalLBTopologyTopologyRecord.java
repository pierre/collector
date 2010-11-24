/**
 * GlobalLBTopologyTopologyRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBTopologyTopologyRecord  implements java.io.Serializable {
    private iControl.GlobalLBTopologyTopologyEndpoint server;

    private iControl.GlobalLBTopologyTopologyEndpoint ldns;

    public GlobalLBTopologyTopologyRecord() {
    }

    public GlobalLBTopologyTopologyRecord(
           iControl.GlobalLBTopologyTopologyEndpoint server,
           iControl.GlobalLBTopologyTopologyEndpoint ldns) {
           this.server = server;
           this.ldns = ldns;
    }


    /**
     * Gets the server value for this GlobalLBTopologyTopologyRecord.
     * 
     * @return server
     */
    public iControl.GlobalLBTopologyTopologyEndpoint getServer() {
        return server;
    }


    /**
     * Sets the server value for this GlobalLBTopologyTopologyRecord.
     * 
     * @param server
     */
    public void setServer(iControl.GlobalLBTopologyTopologyEndpoint server) {
        this.server = server;
    }


    /**
     * Gets the ldns value for this GlobalLBTopologyTopologyRecord.
     * 
     * @return ldns
     */
    public iControl.GlobalLBTopologyTopologyEndpoint getLdns() {
        return ldns;
    }


    /**
     * Sets the ldns value for this GlobalLBTopologyTopologyRecord.
     * 
     * @param ldns
     */
    public void setLdns(iControl.GlobalLBTopologyTopologyEndpoint ldns) {
        this.ldns = ldns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBTopologyTopologyRecord)) return false;
        GlobalLBTopologyTopologyRecord other = (GlobalLBTopologyTopologyRecord) obj;
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
            ((this.ldns==null && other.getLdns()==null) || 
             (this.ldns!=null &&
              this.ldns.equals(other.getLdns())));
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
        if (getLdns() != null) {
            _hashCode += getLdns().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBTopologyTopologyRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Topology.TopologyRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Topology.TopologyEndpoint"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Topology.TopologyEndpoint"));
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
