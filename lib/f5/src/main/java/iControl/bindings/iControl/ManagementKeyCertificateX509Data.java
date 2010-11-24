/**
 * ManagementKeyCertificateX509Data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKeyCertificateX509Data  implements java.io.Serializable {
    private java.lang.String common_name;

    private java.lang.String country_name;

    private java.lang.String state_name;

    private java.lang.String locality_name;

    private java.lang.String organization_name;

    private java.lang.String division_name;

    public ManagementKeyCertificateX509Data() {
    }

    public ManagementKeyCertificateX509Data(
           java.lang.String common_name,
           java.lang.String country_name,
           java.lang.String state_name,
           java.lang.String locality_name,
           java.lang.String organization_name,
           java.lang.String division_name) {
           this.common_name = common_name;
           this.country_name = country_name;
           this.state_name = state_name;
           this.locality_name = locality_name;
           this.organization_name = organization_name;
           this.division_name = division_name;
    }


    /**
     * Gets the common_name value for this ManagementKeyCertificateX509Data.
     * 
     * @return common_name
     */
    public java.lang.String getCommon_name() {
        return common_name;
    }


    /**
     * Sets the common_name value for this ManagementKeyCertificateX509Data.
     * 
     * @param common_name
     */
    public void setCommon_name(java.lang.String common_name) {
        this.common_name = common_name;
    }


    /**
     * Gets the country_name value for this ManagementKeyCertificateX509Data.
     * 
     * @return country_name
     */
    public java.lang.String getCountry_name() {
        return country_name;
    }


    /**
     * Sets the country_name value for this ManagementKeyCertificateX509Data.
     * 
     * @param country_name
     */
    public void setCountry_name(java.lang.String country_name) {
        this.country_name = country_name;
    }


    /**
     * Gets the state_name value for this ManagementKeyCertificateX509Data.
     * 
     * @return state_name
     */
    public java.lang.String getState_name() {
        return state_name;
    }


    /**
     * Sets the state_name value for this ManagementKeyCertificateX509Data.
     * 
     * @param state_name
     */
    public void setState_name(java.lang.String state_name) {
        this.state_name = state_name;
    }


    /**
     * Gets the locality_name value for this ManagementKeyCertificateX509Data.
     * 
     * @return locality_name
     */
    public java.lang.String getLocality_name() {
        return locality_name;
    }


    /**
     * Sets the locality_name value for this ManagementKeyCertificateX509Data.
     * 
     * @param locality_name
     */
    public void setLocality_name(java.lang.String locality_name) {
        this.locality_name = locality_name;
    }


    /**
     * Gets the organization_name value for this ManagementKeyCertificateX509Data.
     * 
     * @return organization_name
     */
    public java.lang.String getOrganization_name() {
        return organization_name;
    }


    /**
     * Sets the organization_name value for this ManagementKeyCertificateX509Data.
     * 
     * @param organization_name
     */
    public void setOrganization_name(java.lang.String organization_name) {
        this.organization_name = organization_name;
    }


    /**
     * Gets the division_name value for this ManagementKeyCertificateX509Data.
     * 
     * @return division_name
     */
    public java.lang.String getDivision_name() {
        return division_name;
    }


    /**
     * Sets the division_name value for this ManagementKeyCertificateX509Data.
     * 
     * @param division_name
     */
    public void setDivision_name(java.lang.String division_name) {
        this.division_name = division_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementKeyCertificateX509Data)) return false;
        ManagementKeyCertificateX509Data other = (ManagementKeyCertificateX509Data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.common_name==null && other.getCommon_name()==null) || 
             (this.common_name!=null &&
              this.common_name.equals(other.getCommon_name()))) &&
            ((this.country_name==null && other.getCountry_name()==null) || 
             (this.country_name!=null &&
              this.country_name.equals(other.getCountry_name()))) &&
            ((this.state_name==null && other.getState_name()==null) || 
             (this.state_name!=null &&
              this.state_name.equals(other.getState_name()))) &&
            ((this.locality_name==null && other.getLocality_name()==null) || 
             (this.locality_name!=null &&
              this.locality_name.equals(other.getLocality_name()))) &&
            ((this.organization_name==null && other.getOrganization_name()==null) || 
             (this.organization_name!=null &&
              this.organization_name.equals(other.getOrganization_name()))) &&
            ((this.division_name==null && other.getDivision_name()==null) || 
             (this.division_name!=null &&
              this.division_name.equals(other.getDivision_name())));
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
        if (getCommon_name() != null) {
            _hashCode += getCommon_name().hashCode();
        }
        if (getCountry_name() != null) {
            _hashCode += getCountry_name().hashCode();
        }
        if (getState_name() != null) {
            _hashCode += getState_name().hashCode();
        }
        if (getLocality_name() != null) {
            _hashCode += getLocality_name().hashCode();
        }
        if (getOrganization_name() != null) {
            _hashCode += getOrganization_name().hashCode();
        }
        if (getDivision_name() != null) {
            _hashCode += getDivision_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementKeyCertificateX509Data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate.X509Data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("common_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "common_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locality_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organization_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "division_name"));
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
