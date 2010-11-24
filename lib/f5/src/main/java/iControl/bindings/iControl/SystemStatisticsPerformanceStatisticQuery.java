/**
 * SystemStatisticsPerformanceStatisticQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemStatisticsPerformanceStatisticQuery  implements java.io.Serializable {
    private java.lang.String object_name;

    private long start_time;

    private long end_time;

    private long interval;

    private long maximum_rows;

    public SystemStatisticsPerformanceStatisticQuery() {
    }

    public SystemStatisticsPerformanceStatisticQuery(
           java.lang.String object_name,
           long start_time,
           long end_time,
           long interval,
           long maximum_rows) {
           this.object_name = object_name;
           this.start_time = start_time;
           this.end_time = end_time;
           this.interval = interval;
           this.maximum_rows = maximum_rows;
    }


    /**
     * Gets the object_name value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @return object_name
     */
    public java.lang.String getObject_name() {
        return object_name;
    }


    /**
     * Sets the object_name value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @param object_name
     */
    public void setObject_name(java.lang.String object_name) {
        this.object_name = object_name;
    }


    /**
     * Gets the start_time value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @return start_time
     */
    public long getStart_time() {
        return start_time;
    }


    /**
     * Sets the start_time value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @param start_time
     */
    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }


    /**
     * Gets the end_time value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @return end_time
     */
    public long getEnd_time() {
        return end_time;
    }


    /**
     * Sets the end_time value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @param end_time
     */
    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }


    /**
     * Gets the interval value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @return interval
     */
    public long getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @param interval
     */
    public void setInterval(long interval) {
        this.interval = interval;
    }


    /**
     * Gets the maximum_rows value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @return maximum_rows
     */
    public long getMaximum_rows() {
        return maximum_rows;
    }


    /**
     * Sets the maximum_rows value for this SystemStatisticsPerformanceStatisticQuery.
     * 
     * @param maximum_rows
     */
    public void setMaximum_rows(long maximum_rows) {
        this.maximum_rows = maximum_rows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemStatisticsPerformanceStatisticQuery)) return false;
        SystemStatisticsPerformanceStatisticQuery other = (SystemStatisticsPerformanceStatisticQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.object_name==null && other.getObject_name()==null) || 
             (this.object_name!=null &&
              this.object_name.equals(other.getObject_name()))) &&
            this.start_time == other.getStart_time() &&
            this.end_time == other.getEnd_time() &&
            this.interval == other.getInterval() &&
            this.maximum_rows == other.getMaximum_rows();
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
        if (getObject_name() != null) {
            _hashCode += getObject_name().hashCode();
        }
        _hashCode += new Long(getStart_time()).hashCode();
        _hashCode += new Long(getEnd_time()).hashCode();
        _hashCode += new Long(getInterval()).hashCode();
        _hashCode += new Long(getMaximum_rows()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemStatisticsPerformanceStatisticQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Statistics.PerformanceStatisticQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "object_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_rows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximum_rows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
