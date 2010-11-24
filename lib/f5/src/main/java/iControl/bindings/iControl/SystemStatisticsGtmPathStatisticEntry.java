/**
 * SystemStatisticsGtmPathStatisticEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemStatisticsGtmPathStatisticEntry  implements java.io.Serializable {
    private java.lang.String ldns_ip;

    private iControl.SystemStatisticsGtmPathStatisticObjectID object_name;

    private long last_probe_time;

    private iControl.CommonStatistic[] statistics;

    public SystemStatisticsGtmPathStatisticEntry() {
    }

    public SystemStatisticsGtmPathStatisticEntry(
           java.lang.String ldns_ip,
           iControl.SystemStatisticsGtmPathStatisticObjectID object_name,
           long last_probe_time,
           iControl.CommonStatistic[] statistics) {
           this.ldns_ip = ldns_ip;
           this.object_name = object_name;
           this.last_probe_time = last_probe_time;
           this.statistics = statistics;
    }


    /**
     * Gets the ldns_ip value for this SystemStatisticsGtmPathStatisticEntry.
     * 
     * @return ldns_ip
     */
    public java.lang.String getLdns_ip() {
        return ldns_ip;
    }


    /**
     * Sets the ldns_ip value for this SystemStatisticsGtmPathStatisticEntry.
     * 
     * @param ldns_ip
     */
    public void setLdns_ip(java.lang.String ldns_ip) {
        this.ldns_ip = ldns_ip;
    }


    /**
     * Gets the object_name value for this SystemStatisticsGtmPathStatisticEntry.
     * 
     * @return object_name
     */
    public iControl.SystemStatisticsGtmPathStatisticObjectID getObject_name() {
        return object_name;
    }


    /**
     * Sets the object_name value for this SystemStatisticsGtmPathStatisticEntry.
     * 
     * @param object_name
     */
    public void setObject_name(iControl.SystemStatisticsGtmPathStatisticObjectID object_name) {
        this.object_name = object_name;
    }


    /**
     * Gets the last_probe_time value for this SystemStatisticsGtmPathStatisticEntry.
     * 
     * @return last_probe_time
     */
    public long getLast_probe_time() {
        return last_probe_time;
    }


    /**
     * Sets the last_probe_time value for this SystemStatisticsGtmPathStatisticEntry.
     * 
     * @param last_probe_time
     */
    public void setLast_probe_time(long last_probe_time) {
        this.last_probe_time = last_probe_time;
    }


    /**
     * Gets the statistics value for this SystemStatisticsGtmPathStatisticEntry.
     * 
     * @return statistics
     */
    public iControl.CommonStatistic[] getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this SystemStatisticsGtmPathStatisticEntry.
     * 
     * @param statistics
     */
    public void setStatistics(iControl.CommonStatistic[] statistics) {
        this.statistics = statistics;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemStatisticsGtmPathStatisticEntry)) return false;
        SystemStatisticsGtmPathStatisticEntry other = (SystemStatisticsGtmPathStatisticEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ldns_ip==null && other.getLdns_ip()==null) || 
             (this.ldns_ip!=null &&
              this.ldns_ip.equals(other.getLdns_ip()))) &&
            ((this.object_name==null && other.getObject_name()==null) || 
             (this.object_name!=null &&
              this.object_name.equals(other.getObject_name()))) &&
            this.last_probe_time == other.getLast_probe_time() &&
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
        if (getLdns_ip() != null) {
            _hashCode += getLdns_ip().hashCode();
        }
        if (getObject_name() != null) {
            _hashCode += getObject_name().hashCode();
        }
        _hashCode += new Long(getLast_probe_time()).hashCode();
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
        new org.apache.axis.description.TypeDesc(SystemStatisticsGtmPathStatisticEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Statistics.GtmPathStatisticEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldns_ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldns_ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "object_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Statistics.GtmPathStatisticObjectID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_probe_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_probe_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
