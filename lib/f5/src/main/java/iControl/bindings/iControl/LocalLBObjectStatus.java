/**
 * LocalLBObjectStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBObjectStatus  implements java.io.Serializable {
    private iControl.LocalLBAvailabilityStatus availability_status;

    private iControl.LocalLBEnabledStatus enabled_status;

    private java.lang.String status_description;

    public LocalLBObjectStatus() {
    }

    public LocalLBObjectStatus(
           iControl.LocalLBAvailabilityStatus availability_status,
           iControl.LocalLBEnabledStatus enabled_status,
           java.lang.String status_description) {
           this.availability_status = availability_status;
           this.enabled_status = enabled_status;
           this.status_description = status_description;
    }


    /**
     * Gets the availability_status value for this LocalLBObjectStatus.
     * 
     * @return availability_status
     */
    public iControl.LocalLBAvailabilityStatus getAvailability_status() {
        return availability_status;
    }


    /**
     * Sets the availability_status value for this LocalLBObjectStatus.
     * 
     * @param availability_status
     */
    public void setAvailability_status(iControl.LocalLBAvailabilityStatus availability_status) {
        this.availability_status = availability_status;
    }


    /**
     * Gets the enabled_status value for this LocalLBObjectStatus.
     * 
     * @return enabled_status
     */
    public iControl.LocalLBEnabledStatus getEnabled_status() {
        return enabled_status;
    }


    /**
     * Sets the enabled_status value for this LocalLBObjectStatus.
     * 
     * @param enabled_status
     */
    public void setEnabled_status(iControl.LocalLBEnabledStatus enabled_status) {
        this.enabled_status = enabled_status;
    }


    /**
     * Gets the status_description value for this LocalLBObjectStatus.
     * 
     * @return status_description
     */
    public java.lang.String getStatus_description() {
        return status_description;
    }


    /**
     * Sets the status_description value for this LocalLBObjectStatus.
     * 
     * @param status_description
     */
    public void setStatus_description(java.lang.String status_description) {
        this.status_description = status_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBObjectStatus)) return false;
        LocalLBObjectStatus other = (LocalLBObjectStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availability_status==null && other.getAvailability_status()==null) || 
             (this.availability_status!=null &&
              this.availability_status.equals(other.getAvailability_status()))) &&
            ((this.enabled_status==null && other.getEnabled_status()==null) || 
             (this.enabled_status!=null &&
              this.enabled_status.equals(other.getEnabled_status()))) &&
            ((this.status_description==null && other.getStatus_description()==null) || 
             (this.status_description!=null &&
              this.status_description.equals(other.getStatus_description())));
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
        if (getAvailability_status() != null) {
            _hashCode += getAvailability_status().hashCode();
        }
        if (getEnabled_status() != null) {
            _hashCode += getEnabled_status().hashCode();
        }
        if (getStatus_description() != null) {
            _hashCode += getStatus_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBObjectStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ObjectStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availability_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.AvailabilityStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.EnabledStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status_description"));
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
