/**
 * LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry  implements java.io.Serializable {
    private java.lang.String translation_address;

    private iControl.CommonStatistic[] statistics;

    public LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry() {
    }

    public LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry(
           java.lang.String translation_address,
           iControl.CommonStatistic[] statistics) {
           this.translation_address = translation_address;
           this.statistics = statistics;
    }


    /**
     * Gets the translation_address value for this LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry.
     * 
     * @return translation_address
     */
    public java.lang.String getTranslation_address() {
        return translation_address;
    }


    /**
     * Sets the translation_address value for this LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry.
     * 
     * @param translation_address
     */
    public void setTranslation_address(java.lang.String translation_address) {
        this.translation_address = translation_address;
    }


    /**
     * Gets the statistics value for this LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry.
     * 
     * @return statistics
     */
    public iControl.CommonStatistic[] getStatistics() {
        return statistics;
    }


    /**
     * Sets the statistics value for this LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry.
     * 
     * @param statistics
     */
    public void setStatistics(iControl.CommonStatistic[] statistics) {
        this.statistics = statistics;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry)) return false;
        LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry other = (LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.translation_address==null && other.getTranslation_address()==null) || 
             (this.translation_address!=null &&
              this.translation_address.equals(other.getTranslation_address()))) &&
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
        if (getTranslation_address() != null) {
            _hashCode += getTranslation_address().hashCode();
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
        new org.apache.axis.description.TypeDesc(LocalLBSNATTranslationAddressSNATTranslationAddressStatisticEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.SNATTranslationAddress.SNATTranslationAddressStatisticEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translation_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translation_address"));
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
