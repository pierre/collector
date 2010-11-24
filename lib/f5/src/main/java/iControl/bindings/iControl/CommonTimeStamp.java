/**
 * CommonTimeStamp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class CommonTimeStamp  implements java.io.Serializable {
    private long year;

    private long month;

    private long day;

    private long hour;

    private long minute;

    private long second;

    public CommonTimeStamp() {
    }

    public CommonTimeStamp(
           long year,
           long month,
           long day,
           long hour,
           long minute,
           long second) {
           this.year = year;
           this.month = month;
           this.day = day;
           this.hour = hour;
           this.minute = minute;
           this.second = second;
    }


    /**
     * Gets the year value for this CommonTimeStamp.
     * 
     * @return year
     */
    public long getYear() {
        return year;
    }


    /**
     * Sets the year value for this CommonTimeStamp.
     * 
     * @param year
     */
    public void setYear(long year) {
        this.year = year;
    }


    /**
     * Gets the month value for this CommonTimeStamp.
     * 
     * @return month
     */
    public long getMonth() {
        return month;
    }


    /**
     * Sets the month value for this CommonTimeStamp.
     * 
     * @param month
     */
    public void setMonth(long month) {
        this.month = month;
    }


    /**
     * Gets the day value for this CommonTimeStamp.
     * 
     * @return day
     */
    public long getDay() {
        return day;
    }


    /**
     * Sets the day value for this CommonTimeStamp.
     * 
     * @param day
     */
    public void setDay(long day) {
        this.day = day;
    }


    /**
     * Gets the hour value for this CommonTimeStamp.
     * 
     * @return hour
     */
    public long getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this CommonTimeStamp.
     * 
     * @param hour
     */
    public void setHour(long hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this CommonTimeStamp.
     * 
     * @return minute
     */
    public long getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this CommonTimeStamp.
     * 
     * @param minute
     */
    public void setMinute(long minute) {
        this.minute = minute;
    }


    /**
     * Gets the second value for this CommonTimeStamp.
     * 
     * @return second
     */
    public long getSecond() {
        return second;
    }


    /**
     * Sets the second value for this CommonTimeStamp.
     * 
     * @param second
     */
    public void setSecond(long second) {
        this.second = second;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonTimeStamp)) return false;
        CommonTimeStamp other = (CommonTimeStamp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.year == other.getYear() &&
            this.month == other.getMonth() &&
            this.day == other.getDay() &&
            this.hour == other.getHour() &&
            this.minute == other.getMinute() &&
            this.second == other.getSecond();
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
        _hashCode += new Long(getYear()).hashCode();
        _hashCode += new Long(getMonth()).hashCode();
        _hashCode += new Long(getDay()).hashCode();
        _hashCode += new Long(getHour()).hashCode();
        _hashCode += new Long(getMinute()).hashCode();
        _hashCode += new Long(getSecond()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommonTimeStamp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TimeStamp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("", "second"));
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
