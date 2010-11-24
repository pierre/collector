/**
 * ManagementSNMPConfigurationViewInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationViewInformation  implements java.io.Serializable {
    private java.lang.String view_name;

    private iControl.ManagementSNMPConfigurationViewType type;

    private java.lang.String subtree;

    private java.lang.String masks;

    public ManagementSNMPConfigurationViewInformation() {
    }

    public ManagementSNMPConfigurationViewInformation(
           java.lang.String view_name,
           iControl.ManagementSNMPConfigurationViewType type,
           java.lang.String subtree,
           java.lang.String masks) {
           this.view_name = view_name;
           this.type = type;
           this.subtree = subtree;
           this.masks = masks;
    }


    /**
     * Gets the view_name value for this ManagementSNMPConfigurationViewInformation.
     * 
     * @return view_name
     */
    public java.lang.String getView_name() {
        return view_name;
    }


    /**
     * Sets the view_name value for this ManagementSNMPConfigurationViewInformation.
     * 
     * @param view_name
     */
    public void setView_name(java.lang.String view_name) {
        this.view_name = view_name;
    }


    /**
     * Gets the type value for this ManagementSNMPConfigurationViewInformation.
     * 
     * @return type
     */
    public iControl.ManagementSNMPConfigurationViewType getType() {
        return type;
    }


    /**
     * Sets the type value for this ManagementSNMPConfigurationViewInformation.
     * 
     * @param type
     */
    public void setType(iControl.ManagementSNMPConfigurationViewType type) {
        this.type = type;
    }


    /**
     * Gets the subtree value for this ManagementSNMPConfigurationViewInformation.
     * 
     * @return subtree
     */
    public java.lang.String getSubtree() {
        return subtree;
    }


    /**
     * Sets the subtree value for this ManagementSNMPConfigurationViewInformation.
     * 
     * @param subtree
     */
    public void setSubtree(java.lang.String subtree) {
        this.subtree = subtree;
    }


    /**
     * Gets the masks value for this ManagementSNMPConfigurationViewInformation.
     * 
     * @return masks
     */
    public java.lang.String getMasks() {
        return masks;
    }


    /**
     * Sets the masks value for this ManagementSNMPConfigurationViewInformation.
     * 
     * @param masks
     */
    public void setMasks(java.lang.String masks) {
        this.masks = masks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationViewInformation)) return false;
        ManagementSNMPConfigurationViewInformation other = (ManagementSNMPConfigurationViewInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.view_name==null && other.getView_name()==null) || 
             (this.view_name!=null &&
              this.view_name.equals(other.getView_name()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.subtree==null && other.getSubtree()==null) || 
             (this.subtree!=null &&
              this.subtree.equals(other.getSubtree()))) &&
            ((this.masks==null && other.getMasks()==null) || 
             (this.masks!=null &&
              this.masks.equals(other.getMasks())));
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
        if (getView_name() != null) {
            _hashCode += getView_name().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSubtree() != null) {
            _hashCode += getSubtree().hashCode();
        }
        if (getMasks() != null) {
            _hashCode += getMasks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationViewInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("view_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "view_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ViewType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subtree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masks"));
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
