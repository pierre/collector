/**
 * SystemStatisticsGtmLdnsStatisticEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemStatisticsGtmLdnsStatisticEntry  implements java.io.Serializable {
    private java.lang.String ldns_ip;

    private long last_accessed;

    private java.lang.String continent;

    private java.lang.String country;

    private java.lang.String state;

    private java.lang.String city;

    private iControl.CommonStatistic[] statistics;

    public SystemStatisticsGtmLdnsStatisticEntry() {
    }

    public SystemStatisticsGtmLdnsStatisticEntry(
           java.lang.String ldns_ip,
           long last_accessed,
           java.lang.String continent,
           java.lang.String country,
           java.lang.String state,
           java.lang.String city,
           iControl.CommonStatistic[] statistics) {
           this.ldns_ip = ldns_ip;
           this.last_accessed = last_accessed;
           this.continent = continent;
           this.country = country;
           this.state = state;
           this.city = city;
           this.statistics = statistics;
    }


    /**
     * Gets the ldns_ip value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @return ldns_ip
     */
    public java.lang.String getLdns_ip() {
        return ldns_ip;
    }


    /**
     * Sets the ldns_ip value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @param ldns_ip
     */
    public void setLdns_ip(java.lang.String ldns_ip) {
        this.ldns_ip = ldns_ip;
    }


    /**
     * Gets the last_accessed value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @return last_accessed
     */
    public long getLast_accessed() {
        return last_accessed;
    }


    /**
     * Sets the last_accessed value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @param last_accessed
     */
    public void setLast_accessed(long last_accessed) {
        this.last_accessed = last_accessed;
    }


    /**
     * Gets the continent value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @return continent
     */
    public java.lang.String getContinent() {
        return continent;
    }


    /**
     * Sets the continent value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @param continent
     */
    public void setContinent(java.lang.String continent) {
        this.continent = continent;
    }


    /**
     * Gets the country value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the state value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the city value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the statistics value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @return statistics
     */
    public iControl.CommonStatistic[] getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this SystemStatisticsGtmLdnsStatisticEntry.
     * 
     * @param statistics
     */
    public void setStatistics(iControl.CommonStatistic[] statistics) {
        this.statistics = statistics;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemStatisticsGtmLdnsStatisticEntry)) return false;
        SystemStatisticsGtmLdnsStatisticEntry other = (SystemStatisticsGtmLdnsStatisticEntry) obj;
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
            this.last_accessed == other.getLast_accessed() &&
            ((this.continent==null && other.getContinent()==null) || 
             (this.continent!=null &&
              this.continent.equals(other.getContinent()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
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
        _hashCode += new Long(getLast_accessed()).hashCode();
        if (getContinent() != null) {
            _hashCode += getContinent().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
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
        new org.apache.axis.description.TypeDesc(SystemStatisticsGtmLdnsStatisticEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Statistics.GtmLdnsStatisticEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldns_ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldns_ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_accessed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_accessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "continent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
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
