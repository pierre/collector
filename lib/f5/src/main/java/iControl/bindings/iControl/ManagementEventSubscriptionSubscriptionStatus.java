/**
 * ManagementEventSubscriptionSubscriptionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventSubscriptionSubscriptionStatus  implements java.io.Serializable {
    private iControl.ManagementEventSubscriptionSubscriptionStatusCode code;

    private java.lang.String data;

    public ManagementEventSubscriptionSubscriptionStatus() {
    }

    public ManagementEventSubscriptionSubscriptionStatus(
           iControl.ManagementEventSubscriptionSubscriptionStatusCode code,
           java.lang.String data) {
           this.code = code;
           this.data = data;
    }


    /**
     * Gets the code value for this ManagementEventSubscriptionSubscriptionStatus.
     * 
     * @return code
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatusCode getCode() {
        return code;
    }


    /**
     * Sets the code value for this ManagementEventSubscriptionSubscriptionStatus.
     * 
     * @param code
     */
    public void setCode(iControl.ManagementEventSubscriptionSubscriptionStatusCode code) {
        this.code = code;
    }


    /**
     * Gets the data value for this ManagementEventSubscriptionSubscriptionStatus.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this ManagementEventSubscriptionSubscriptionStatus.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementEventSubscriptionSubscriptionStatus)) return false;
        ManagementEventSubscriptionSubscriptionStatus other = (ManagementEventSubscriptionSubscriptionStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementEventSubscriptionSubscriptionStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.SubscriptionStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
