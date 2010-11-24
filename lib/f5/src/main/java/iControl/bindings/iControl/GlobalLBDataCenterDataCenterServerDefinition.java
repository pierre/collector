/**
 * GlobalLBDataCenterDataCenterServerDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBDataCenterDataCenterServerDefinition  implements java.io.Serializable {
    private java.lang.String data_center;

    private java.lang.String[] servers;

    public GlobalLBDataCenterDataCenterServerDefinition() {
    }

    public GlobalLBDataCenterDataCenterServerDefinition(
           java.lang.String data_center,
           java.lang.String[] servers) {
           this.data_center = data_center;
           this.servers = servers;
    }


    /**
     * Gets the data_center value for this GlobalLBDataCenterDataCenterServerDefinition.
     * 
     * @return data_center
     */
    public java.lang.String getData_center() {
        return data_center;
    }


    /**
     * Sets the data_center value for this GlobalLBDataCenterDataCenterServerDefinition.
     * 
     * @param data_center
     */
    public void setData_center(java.lang.String data_center) {
        this.data_center = data_center;
    }


    /**
     * Gets the servers value for this GlobalLBDataCenterDataCenterServerDefinition.
     * 
     * @return servers
     */
    public java.lang.String[] getServers() {
        return servers;
    }


    /**
     * Sets the servers value for this GlobalLBDataCenterDataCenterServerDefinition.
     * 
     * @param servers
     */
    public void setServers(java.lang.String[] servers) {
        this.servers = servers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBDataCenterDataCenterServerDefinition)) return false;
        GlobalLBDataCenterDataCenterServerDefinition other = (GlobalLBDataCenterDataCenterServerDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data_center==null && other.getData_center()==null) || 
             (this.data_center!=null &&
              this.data_center.equals(other.getData_center()))) &&
            ((this.servers==null && other.getServers()==null) || 
             (this.servers!=null &&
              java.util.Arrays.equals(this.servers, other.getServers())));
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
        if (getData_center() != null) {
            _hashCode += getData_center().hashCode();
        }
        if (getServers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServers(), i);
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
        new org.apache.axis.description.TypeDesc(GlobalLBDataCenterDataCenterServerDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.DataCenter.DataCenterServerDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_center");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_center"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servers"));
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
