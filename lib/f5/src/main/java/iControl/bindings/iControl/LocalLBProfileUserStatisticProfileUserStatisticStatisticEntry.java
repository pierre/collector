/**
 * LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry  implements java.io.Serializable {
    private java.lang.String profile_name;

    private iControl.LocalLBProfileUserStatisticUserStatistic[] statistics;

    public LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry() {
    }

    public LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry(
           java.lang.String profile_name,
           iControl.LocalLBProfileUserStatisticUserStatistic[] statistics) {
           this.profile_name = profile_name;
           this.statistics = statistics;
    }


    /**
     * Gets the profile_name value for this LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry.
     * 
     * @return profile_name
     */
    public java.lang.String getProfile_name() {
        return profile_name;
    }


    /**
     * Sets the profile_name value for this LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry.
     * 
     * @param profile_name
     */
    public void setProfile_name(java.lang.String profile_name) {
        this.profile_name = profile_name;
    }


    /**
     * Gets the statistics value for this LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry.
     * 
     * @return statistics
     */
    public iControl.LocalLBProfileUserStatisticUserStatistic[] getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry.
     * 
     * @param statistics
     */
    public void setStatistics(iControl.LocalLBProfileUserStatisticUserStatistic[] statistics) {
        this.statistics = statistics;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry)) return false;
        LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry other = (LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profile_name==null && other.getProfile_name()==null) || 
             (this.profile_name!=null &&
              this.profile_name.equals(other.getProfile_name()))) &&
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
        if (getProfile_name() != null) {
            _hashCode += getProfile_name().hashCode();
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
        new org.apache.axis.description.TypeDesc(LocalLBProfileUserStatisticProfileUserStatisticStatisticEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileUserStatistic.ProfileUserStatisticStatisticEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profile_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statistics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileUserStatistic.UserStatistic"));
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
