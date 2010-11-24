/**
 * SystemStatisticsPerformanceGraphDataCSV.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemStatisticsPerformanceGraphDataCSV  implements java.io.Serializable {
    private java.lang.String object_name;

    private long start_time;

    private long end_time;

    private long interval;

    private byte[] statistic_data;

    public SystemStatisticsPerformanceGraphDataCSV() {
    }

    public SystemStatisticsPerformanceGraphDataCSV(
           java.lang.String object_name,
           long start_time,
           long end_time,
           long interval,
           byte[] statistic_data) {
           this.object_name = object_name;
           this.start_time = start_time;
           this.end_time = end_time;
           this.interval = interval;
           this.statistic_data = statistic_data;
    }


    /**
     * Gets the object_name value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @return object_name
     */
    public java.lang.String getObject_name() {
        return object_name;
    }


    /**
     * Sets the object_name value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @param object_name
     */
    public void setObject_name(java.lang.String object_name) {
        this.object_name = object_name;
    }


    /**
     * Gets the start_time value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @return start_time
     */
    public long getStart_time() {
        return start_time;
    }


    /**
     * Sets the start_time value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @param start_time
     */
    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }


    /**
     * Gets the end_time value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @return end_time
     */
    public long getEnd_time() {
        return end_time;
    }


    /**
     * Sets the end_time value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @param end_time
     */
    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }


    /**
     * Gets the interval value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @return interval
     */
    public long getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @param interval
     */
    public void setInterval(long interval) {
        this.interval = interval;
    }


    /**
     * Gets the statistic_data value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @return statistic_data
     */
    public byte[] getStatistic_data() {
        return statistic_data;
    }


    /**
     * Sets the statistic_data value for this SystemStatisticsPerformanceGraphDataCSV.
     * 
     * @param statistic_data
     */
    public void setStatistic_data(byte[] statistic_data) {
        this.statistic_data = statistic_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemStatisticsPerformanceGraphDataCSV)) return false;
        SystemStatisticsPerformanceGraphDataCSV other = (SystemStatisticsPerformanceGraphDataCSV) obj;
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
            ((this.statistic_data==null && other.getStatistic_data()==null) || 
             (this.statistic_data!=null &&
              java.util.Arrays.equals(this.statistic_data, other.getStatistic_data())));
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
        if (getStatistic_data() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatistic_data());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatistic_data(), i);
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
        new org.apache.axis.description.TypeDesc(SystemStatisticsPerformanceGraphDataCSV.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Statistics.PerformanceGraphDataCSV"));
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
        elemField.setFieldName("statistic_data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statistic_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
