/**
 * LocalLBProfileUserStatisticUserStatisticName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileUserStatisticUserStatisticName  implements java.io.Serializable {
    private iControl.LocalLBProfileUserStatisticUserStatisticKey statistic_key;

    private iControl.LocalLBProfileString statistic_name;

    public LocalLBProfileUserStatisticUserStatisticName() {
    }

    public LocalLBProfileUserStatisticUserStatisticName(
           iControl.LocalLBProfileUserStatisticUserStatisticKey statistic_key,
           iControl.LocalLBProfileString statistic_name) {
           this.statistic_key = statistic_key;
           this.statistic_name = statistic_name;
    }


    /**
     * Gets the statistic_key value for this LocalLBProfileUserStatisticUserStatisticName.
     * 
     * @return statistic_key
     */
    public iControl.LocalLBProfileUserStatisticUserStatisticKey getStatistic_key() {
        return statistic_key;
    }


    /**
     * Sets the statistic_key value for this LocalLBProfileUserStatisticUserStatisticName.
     * 
     * @param statistic_key
     */
    public void setStatistic_key(iControl.LocalLBProfileUserStatisticUserStatisticKey statistic_key) {
        this.statistic_key = statistic_key;
    }


    /**
     * Gets the statistic_name value for this LocalLBProfileUserStatisticUserStatisticName.
     * 
     * @return statistic_name
     */
    public iControl.LocalLBProfileString getStatistic_name() {
        return statistic_name;
    }


    /**
     * Sets the statistic_name value for this LocalLBProfileUserStatisticUserStatisticName.
     * 
     * @param statistic_name
     */
    public void setStatistic_name(iControl.LocalLBProfileString statistic_name) {
        this.statistic_name = statistic_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBProfileUserStatisticUserStatisticName)) return false;
        LocalLBProfileUserStatisticUserStatisticName other = (LocalLBProfileUserStatisticUserStatisticName) obj;
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
            ((this.statistic_name==null && other.getStatistic_name()==null) || 
             (this.statistic_name!=null &&
              this.statistic_name.equals(other.getStatistic_name())));
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
        if (getStatistic_name() != null) {
            _hashCode += getStatistic_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBProfileUserStatisticUserStatisticName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileUserStatistic.UserStatisticName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistic_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statistic_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileUserStatistic.UserStatisticKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistic_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statistic_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileString"));
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
