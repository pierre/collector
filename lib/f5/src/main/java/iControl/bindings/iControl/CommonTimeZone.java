/**
 * CommonTimeZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class CommonTimeZone  implements java.io.Serializable {
    private long gmt_offset;

    private java.lang.String time_zone;

    private boolean is_daylight_saving_time;

    public CommonTimeZone() {
    }

    public CommonTimeZone(
           long gmt_offset,
           java.lang.String time_zone,
           boolean is_daylight_saving_time) {
           this.gmt_offset = gmt_offset;
           this.time_zone = time_zone;
           this.is_daylight_saving_time = is_daylight_saving_time;
    }


    /**
     * Gets the gmt_offset value for this CommonTimeZone.
     * 
     * @return gmt_offset
     */
    public long getGmt_offset() {
        return gmt_offset;
    }


    /**
     * Sets the gmt_offset value for this CommonTimeZone.
     * 
     * @param gmt_offset
     */
    public void setGmt_offset(long gmt_offset) {
        this.gmt_offset = gmt_offset;
    }


    /**
     * Gets the time_zone value for this CommonTimeZone.
     * 
     * @return time_zone
     */
    public java.lang.String getTime_zone() {
        return time_zone;
    }


    /**
     * Sets the time_zone value for this CommonTimeZone.
     * 
     * @param time_zone
     */
    public void setTime_zone(java.lang.String time_zone) {
        this.time_zone = time_zone;
    }


    /**
     * Gets the is_daylight_saving_time value for this CommonTimeZone.
     * 
     * @return is_daylight_saving_time
     */
    public boolean isIs_daylight_saving_time() {
        return is_daylight_saving_time;
    }


    /**
     * Sets the is_daylight_saving_time value for this CommonTimeZone.
     * 
     * @param is_daylight_saving_time
     */
    public void setIs_daylight_saving_time(boolean is_daylight_saving_time) {
        this.is_daylight_saving_time = is_daylight_saving_time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonTimeZone)) return false;
        CommonTimeZone other = (CommonTimeZone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.gmt_offset == other.getGmt_offset() &&
            ((this.time_zone==null && other.getTime_zone()==null) || 
             (this.time_zone!=null &&
              this.time_zone.equals(other.getTime_zone()))) &&
            this.is_daylight_saving_time == other.isIs_daylight_saving_time();
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
        _hashCode += new Long(getGmt_offset()).hashCode();
        if (getTime_zone() != null) {
            _hashCode += getTime_zone().hashCode();
        }
        _hashCode += (isIs_daylight_saving_time() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommonTimeZone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TimeZone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gmt_offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gmt_offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_zone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_daylight_saving_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_daylight_saving_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
