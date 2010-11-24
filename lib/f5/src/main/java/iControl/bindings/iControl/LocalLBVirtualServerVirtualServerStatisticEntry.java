/**
 * LocalLBVirtualServerVirtualServerStatisticEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBVirtualServerVirtualServerStatisticEntry  implements java.io.Serializable {
    private iControl.CommonVirtualServerDefinition virtual_server;

    private iControl.CommonStatistic[] statistics;

    public LocalLBVirtualServerVirtualServerStatisticEntry() {
    }

    public LocalLBVirtualServerVirtualServerStatisticEntry(
           iControl.CommonVirtualServerDefinition virtual_server,
           iControl.CommonStatistic[] statistics) {
           this.virtual_server = virtual_server;
           this.statistics = statistics;
    }


    /**
     * Gets the virtual_server value for this LocalLBVirtualServerVirtualServerStatisticEntry.
     * 
     * @return virtual_server
     */
    public iControl.CommonVirtualServerDefinition getVirtual_server() {
        return virtual_server;
    }


    /**
     * Sets the virtual_server value for this LocalLBVirtualServerVirtualServerStatisticEntry.
     * 
     * @param virtual_server
     */
    public void setVirtual_server(iControl.CommonVirtualServerDefinition virtual_server) {
        this.virtual_server = virtual_server;
    }


    /**
     * Gets the statistics value for this LocalLBVirtualServerVirtualServerStatisticEntry.
     * 
     * @return statistics
     */
    public iControl.CommonStatistic[] getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this LocalLBVirtualServerVirtualServerStatisticEntry.
     * 
     * @param statistics
     */
    public void setStatistics(iControl.CommonStatistic[] statistics) {
        this.statistics = statistics;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBVirtualServerVirtualServerStatisticEntry)) return false;
        LocalLBVirtualServerVirtualServerStatisticEntry other = (LocalLBVirtualServerVirtualServerStatisticEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtual_server==null && other.getVirtual_server()==null) || 
             (this.virtual_server!=null &&
              this.virtual_server.equals(other.getVirtual_server()))) &&
            ((this.statistics==null && other.getStatistics()==null) || 
             (this.statistics!=null &&
              java.util.Arrays.equals(this.statistics, other.getStatistics())));
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
        if (getVirtual_server() != null) {
            _hashCode += getVirtual_server().hashCode();
        }
        if (getStatistics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatistics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatistics(), i);
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
        new org.apache.axis.description.TypeDesc(LocalLBVirtualServerVirtualServerStatisticEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualServer.VirtualServerStatisticEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtual_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtual_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.VirtualServerDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.Statistic"));
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
