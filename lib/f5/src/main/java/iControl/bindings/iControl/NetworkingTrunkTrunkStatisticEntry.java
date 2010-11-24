/**
 * NetworkingTrunkTrunkStatisticEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingTrunkTrunkStatisticEntry  implements java.io.Serializable {
    private java.lang.String trunk_name;

    private iControl.CommonStatistic[] statistics;

    public NetworkingTrunkTrunkStatisticEntry() {
    }

    public NetworkingTrunkTrunkStatisticEntry(
           java.lang.String trunk_name,
           iControl.CommonStatistic[] statistics) {
           this.trunk_name = trunk_name;
           this.statistics = statistics;
    }


    /**
     * Gets the trunk_name value for this NetworkingTrunkTrunkStatisticEntry.
     * 
     * @return trunk_name
     */
    public java.lang.String getTrunk_name() {
        return trunk_name;
    }


    /**
     * Sets the trunk_name value for this NetworkingTrunkTrunkStatisticEntry.
     * 
     * @param trunk_name
     */
    public void setTrunk_name(java.lang.String trunk_name) {
        this.trunk_name = trunk_name;
    }


    /**
     * Gets the statistics value for this NetworkingTrunkTrunkStatisticEntry.
     * 
     * @return statistics
     */
    public iControl.CommonStatistic[] getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this NetworkingTrunkTrunkStatisticEntry.
     * 
     * @param statistics
     */
    public void setStatistics(iControl.CommonStatistic[] statistics) {
        this.statistics = statistics;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingTrunkTrunkStatisticEntry)) return false;
        NetworkingTrunkTrunkStatisticEntry other = (NetworkingTrunkTrunkStatisticEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trunk_name==null && other.getTrunk_name()==null) || 
             (this.trunk_name!=null &&
              this.trunk_name.equals(other.getTrunk_name()))) &&
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
        if (getTrunk_name() != null) {
            _hashCode += getTrunk_name().hashCode();
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
        new org.apache.axis.description.TypeDesc(NetworkingTrunkTrunkStatisticEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.Trunk.TrunkStatisticEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunk_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunk_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
