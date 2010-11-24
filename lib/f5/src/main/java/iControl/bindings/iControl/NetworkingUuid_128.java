/**
 * NetworkingUuid_128.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingUuid_128  implements java.io.Serializable {
    private iControl.CommonULong64 low_part;

    private iControl.CommonULong64 high_part;

    public NetworkingUuid_128() {
    }

    public NetworkingUuid_128(
           iControl.CommonULong64 low_part,
           iControl.CommonULong64 high_part) {
           this.low_part = low_part;
           this.high_part = high_part;
    }


    /**
     * Gets the low_part value for this NetworkingUuid_128.
     * 
     * @return low_part
     */
    public iControl.CommonULong64 getLow_part() {
        return low_part;
    }


    /**
     * Sets the low_part value for this NetworkingUuid_128.
     * 
     * @param low_part
     */
    public void setLow_part(iControl.CommonULong64 low_part) {
        this.low_part = low_part;
    }


    /**
     * Gets the high_part value for this NetworkingUuid_128.
     * 
     * @return high_part
     */
    public iControl.CommonULong64 getHigh_part() {
        return high_part;
    }


    /**
     * Sets the high_part value for this NetworkingUuid_128.
     * 
     * @param high_part
     */
    public void setHigh_part(iControl.CommonULong64 high_part) {
        this.high_part = high_part;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingUuid_128)) return false;
        NetworkingUuid_128 other = (NetworkingUuid_128) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.low_part==null && other.getLow_part()==null) || 
             (this.low_part!=null &&
              this.low_part.equals(other.getLow_part()))) &&
            ((this.high_part==null && other.getHigh_part()==null) || 
             (this.high_part!=null &&
              this.high_part.equals(other.getHigh_part())));
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
        if (getLow_part() != null) {
            _hashCode += getLow_part().hashCode();
        }
        if (getHigh_part() != null) {
            _hashCode += getHigh_part().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingUuid_128.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.Uuid_128"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low_part");
        elemField.setXmlName(new javax.xml.namespace.QName("", "low_part"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high_part");
        elemField.setXmlName(new javax.xml.namespace.QName("", "high_part"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
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
