/**
 * ManagementCCLDAPConfigurationLDAPSearchOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementCCLDAPConfigurationLDAPSearchOption  implements java.io.Serializable {
    private iControl.ManagementLDAPSearchMethod search_method;

    private java.lang.String search_base;

    private java.lang.String search_key;

    public ManagementCCLDAPConfigurationLDAPSearchOption() {
    }

    public ManagementCCLDAPConfigurationLDAPSearchOption(
           iControl.ManagementLDAPSearchMethod search_method,
           java.lang.String search_base,
           java.lang.String search_key) {
           this.search_method = search_method;
           this.search_base = search_base;
           this.search_key = search_key;
    }


    /**
     * Gets the search_method value for this ManagementCCLDAPConfigurationLDAPSearchOption.
     * 
     * @return search_method
     */
    public iControl.ManagementLDAPSearchMethod getSearch_method() {
        return search_method;
    }


    /**
     * Sets the search_method value for this ManagementCCLDAPConfigurationLDAPSearchOption.
     * 
     * @param search_method
     */
    public void setSearch_method(iControl.ManagementLDAPSearchMethod search_method) {
        this.search_method = search_method;
    }


    /**
     * Gets the search_base value for this ManagementCCLDAPConfigurationLDAPSearchOption.
     * 
     * @return search_base
     */
    public java.lang.String getSearch_base() {
        return search_base;
    }


    /**
     * Sets the search_base value for this ManagementCCLDAPConfigurationLDAPSearchOption.
     * 
     * @param search_base
     */
    public void setSearch_base(java.lang.String search_base) {
        this.search_base = search_base;
    }


    /**
     * Gets the search_key value for this ManagementCCLDAPConfigurationLDAPSearchOption.
     * 
     * @return search_key
     */
    public java.lang.String getSearch_key() {
        return search_key;
    }


    /**
     * Sets the search_key value for this ManagementCCLDAPConfigurationLDAPSearchOption.
     * 
     * @param search_key
     */
    public void setSearch_key(java.lang.String search_key) {
        this.search_key = search_key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementCCLDAPConfigurationLDAPSearchOption)) return false;
        ManagementCCLDAPConfigurationLDAPSearchOption other = (ManagementCCLDAPConfigurationLDAPSearchOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.search_method==null && other.getSearch_method()==null) || 
             (this.search_method!=null &&
              this.search_method.equals(other.getSearch_method()))) &&
            ((this.search_base==null && other.getSearch_base()==null) || 
             (this.search_base!=null &&
              this.search_base.equals(other.getSearch_base()))) &&
            ((this.search_key==null && other.getSearch_key()==null) || 
             (this.search_key!=null &&
              this.search_key.equals(other.getSearch_key())));
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
        if (getSearch_method() != null) {
            _hashCode += getSearch_method().hashCode();
        }
        if (getSearch_base() != null) {
            _hashCode += getSearch_base().hashCode();
        }
        if (getSearch_key() != null) {
            _hashCode += getSearch_key().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementCCLDAPConfigurationLDAPSearchOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.CCLDAPConfiguration.LDAPSearchOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search_method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.LDAPSearchMethod"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search_base");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search_base"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search_key"));
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
