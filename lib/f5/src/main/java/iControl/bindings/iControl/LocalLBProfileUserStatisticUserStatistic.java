/**
 * LocalLBProfileUserStatisticUserStatistic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileUserStatisticUserStatistic  implements java.io.Serializable {
    private iControl.LocalLBProfileUserStatisticUserStatisticKey statistic_key;

    private iControl.CommonULong64 value;

    private long time_stamp;

    public LocalLBProfileUserStatisticUserStatistic() {
    }

    public LocalLBProfileUserStatisticUserStatistic(
           iControl.LocalLBProfileUserStatisticUserStatisticKey statistic_key,
           iControl.CommonULong64 value,
           long time_stamp) {
           this.statistic_key = statistic_key;
           this.value = value;
           this.time_stamp = time_stamp;
    }


    /**
     * Gets the statistic_key value for this LocalLBProfileUserStatisticUserStatistic.
     * 
     * @return statistic_key
     */
    public iControl.LocalLBProfileUserStatisticUserStatisticKey getStatistic_key() {
        return statistic_key;
    }


    /**
     * Sets the statistic_key value for this LocalLBProfileUserStatisticUserStatistic.
     * 
     * @param statistic_key
     */
    public void setStatistic_key(iControl.LocalLBProfileUserStatisticUserStatisticKey statistic_key) {
        this.statistic_key = statistic_key;
    }


    /**
     * Gets the value value for this LocalLBProfileUserStatisticUserStatistic.
     * 
     * @return value
     */
    public iControl.CommonULong64 getValue() {
        return value;
    }


    /**
     * Sets the value value for this LocalLBProfileUserStatisticUserStatistic.
     * 
     * @param value
     */
    public void setValue(iControl.CommonULong64 value) {
        this.value = value;
    }


    /**
     * Gets the time_stamp value for this LocalLBProfileUserStatisticUserStatistic.
     * 
     * @return time_stamp
     */
    public long getTime_stamp() {
        return time_stamp;
    }


    /**
     * Sets the time_stamp value for this LocalLBProfileUserStatisticUserStatistic.
     * 
     * @param time_stamp
     */
    public void setTime_stamp(long time_stamp) {
        this.time_stamp = time_stamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBProfileUserStatisticUserStatistic)) return false;
        LocalLBProfileUserStatisticUserStatistic other = (LocalLBProfileUserStatisticUserStatistic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statistic_key==null && other.getStatistic_key()==null) || 
             (this.statistic_key!=null &&
              this.statistic_key.equals(other.getStatistic_key()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            this.time_stamp == other.getTime_stamp();
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
        if (getStatistic_key() != null) {
            _hashCode += getStatistic_key().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        _hashCode += new Long(getTime_stamp()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBProfileUserStatisticUserStatistic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileUserStatistic.UserStatistic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistic_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statistic_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileUserStatistic.UserStatisticKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_stamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_stamp"));
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
