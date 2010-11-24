/**
 * GlobalLBDataCenterDataCenterLinkDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBDataCenterDataCenterLinkDefinition  implements java.io.Serializable {
    private java.lang.String data_center;

    private java.lang.String[] links;

    public GlobalLBDataCenterDataCenterLinkDefinition() {
    }

    public GlobalLBDataCenterDataCenterLinkDefinition(
           java.lang.String data_center,
           java.lang.String[] links) {
           this.data_center = data_center;
           this.links = links;
    }


    /**
     * Gets the data_center value for this GlobalLBDataCenterDataCenterLinkDefinition.
     * 
     * @return data_center
     */
    public java.lang.String getData_center() {
        return data_center;
    }


    /**
     * Sets the data_center value for this GlobalLBDataCenterDataCenterLinkDefinition.
     * 
     * @param data_center
     */
    public void setData_center(java.lang.String data_center) {
        this.data_center = data_center;
    }


    /**
     * Gets the links value for this GlobalLBDataCenterDataCenterLinkDefinition.
     * 
     * @return links
     */
    public java.lang.String[] getLinks() {
        return links;
    }


    /**
     * Sets the links value for this GlobalLBDataCenterDataCenterLinkDefinition.
     * 
     * @param links
     */
    public void setLinks(java.lang.String[] links) {
        this.links = links;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBDataCenterDataCenterLinkDefinition)) return false;
        GlobalLBDataCenterDataCenterLinkDefinition other = (GlobalLBDataCenterDataCenterLinkDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data_center==null && other.getData_center()==null) || 
             (this.data_center!=null &&
              this.data_center.equals(other.getData_center()))) &&
            ((this.links==null && other.getLinks()==null) || 
             (this.links!=null &&
              java.util.Arrays.equals(this.links, other.getLinks())));
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
        if (getData_center() != null) {
            _hashCode += getData_center().hashCode();
        }
        if (getLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinks(), i);
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
        new org.apache.axis.description.TypeDesc(GlobalLBDataCenterDataCenterLinkDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.DataCenter.DataCenterLinkDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_center");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_center"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("links");
        elemField.setXmlName(new javax.xml.namespace.QName("", "links"));
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
