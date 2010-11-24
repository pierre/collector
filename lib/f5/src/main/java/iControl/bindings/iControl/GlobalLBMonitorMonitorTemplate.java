/**
 * GlobalLBMonitorMonitorTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBMonitorMonitorTemplate  implements java.io.Serializable {
    private java.lang.String template_name;

    private iControl.GlobalLBMonitorTemplateType template_type;

    public GlobalLBMonitorMonitorTemplate() {
    }

    public GlobalLBMonitorMonitorTemplate(
           java.lang.String template_name,
           iControl.GlobalLBMonitorTemplateType template_type) {
           this.template_name = template_name;
           this.template_type = template_type;
    }


    /**
     * Gets the template_name value for this GlobalLBMonitorMonitorTemplate.
     * 
     * @return template_name
     */
    public java.lang.String getTemplate_name() {
        return template_name;
    }


    /**
     * Sets the template_name value for this GlobalLBMonitorMonitorTemplate.
     * 
     * @param template_name
     */
    public void setTemplate_name(java.lang.String template_name) {
        this.template_name = template_name;
    }


    /**
     * Gets the template_type value for this GlobalLBMonitorMonitorTemplate.
     * 
     * @return template_type
     */
    public iControl.GlobalLBMonitorTemplateType getTemplate_type() {
        return template_type;
    }


    /**
     * Sets the template_type value for this GlobalLBMonitorMonitorTemplate.
     * 
     * @param template_type
     */
    public void setTemplate_type(iControl.GlobalLBMonitorTemplateType template_type) {
        this.template_type = template_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBMonitorMonitorTemplate)) return false;
        GlobalLBMonitorMonitorTemplate other = (GlobalLBMonitorMonitorTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.template_name==null && other.getTemplate_name()==null) || 
             (this.template_name!=null &&
              this.template_name.equals(other.getTemplate_name()))) &&
            ((this.template_type==null && other.getTemplate_type()==null) || 
             (this.template_type!=null &&
              this.template_type.equals(other.getTemplate_type())));
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
        if (getTemplate_name() != null) {
            _hashCode += getTemplate_name().hashCode();
        }
        if (getTemplate_type() != null) {
            _hashCode += getTemplate_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBMonitorMonitorTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Monitor.MonitorTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "template_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "template_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Monitor.TemplateType"));
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
