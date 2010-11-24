/**
 * ManagementViewZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementViewZone  implements java.io.Serializable {
    private java.lang.String view_name;

    private java.lang.String zone_name;

    public ManagementViewZone() {
    }

    public ManagementViewZone(
           java.lang.String view_name,
           java.lang.String zone_name) {
           this.view_name = view_name;
           this.zone_name = zone_name;
    }


    /**
     * Gets the view_name value for this ManagementViewZone.
     * 
     * @return view_name
     */
    public java.lang.String getView_name() {
        return view_name;
    }


    /**
     * Sets the view_name value for this ManagementViewZone.
     * 
     * @param view_name
     */
    public void setView_name(java.lang.String view_name) {
        this.view_name = view_name;
    }


    /**
     * Gets the zone_name value for this ManagementViewZone.
     * 
     * @return zone_name
     */
    public java.lang.String getZone_name() {
        return zone_name;
    }


    /**
     * Sets the zone_name value for this ManagementViewZone.
     * 
     * @param zone_name
     */
    public void setZone_name(java.lang.String zone_name) {
        this.zone_name = zone_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementViewZone)) return false;
        ManagementViewZone other = (ManagementViewZone) obj;
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
            ((this.zone_name==null && other.getZone_name()==null) || 
             (this.zone_name!=null &&
              this.zone_name.equals(other.getZone_name())));
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
        if (getZone_name() != null) {
            _hashCode += getZone_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementViewZone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.ViewZone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("view_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "view_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zone_name"));
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
