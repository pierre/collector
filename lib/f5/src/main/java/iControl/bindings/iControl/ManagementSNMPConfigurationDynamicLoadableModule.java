/**
 * ManagementSNMPConfigurationDynamicLoadableModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationDynamicLoadableModule  implements java.io.Serializable {
    private java.lang.String module_name;

    private java.lang.String module_path;

    public ManagementSNMPConfigurationDynamicLoadableModule() {
    }

    public ManagementSNMPConfigurationDynamicLoadableModule(
           java.lang.String module_name,
           java.lang.String module_path) {
           this.module_name = module_name;
           this.module_path = module_path;
    }


    /**
     * Gets the module_name value for this ManagementSNMPConfigurationDynamicLoadableModule.
     * 
     * @return module_name
     */
    public java.lang.String getModule_name() {
        return module_name;
    }


    /**
     * Sets the module_name value for this ManagementSNMPConfigurationDynamicLoadableModule.
     * 
     * @param module_name
     */
    public void setModule_name(java.lang.String module_name) {
        this.module_name = module_name;
    }


    /**
     * Gets the module_path value for this ManagementSNMPConfigurationDynamicLoadableModule.
     * 
     * @return module_path
     */
    public java.lang.String getModule_path() {
        return module_path;
    }


    /**
     * Sets the module_path value for this ManagementSNMPConfigurationDynamicLoadableModule.
     * 
     * @param module_path
     */
    public void setModule_path(java.lang.String module_path) {
        this.module_path = module_path;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationDynamicLoadableModule)) return false;
        ManagementSNMPConfigurationDynamicLoadableModule other = (ManagementSNMPConfigurationDynamicLoadableModule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.module_name==null && other.getModule_name()==null) || 
             (this.module_name!=null &&
              this.module_name.equals(other.getModule_name()))) &&
            ((this.module_path==null && other.getModule_path()==null) || 
             (this.module_path!=null &&
              this.module_path.equals(other.getModule_path())));
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
        if (getModule_name() != null) {
            _hashCode += getModule_name().hashCode();
        }
        if (getModule_path() != null) {
            _hashCode += getModule_path().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationDynamicLoadableModule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.DynamicLoadableModule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module_path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "module_path"));
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
