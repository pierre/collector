/**
 * ManagementViewInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementViewInfo  implements java.io.Serializable {
    private java.lang.String view_name;

    private long view_order;

    private java.lang.String[] option_seq;

    private java.lang.String[] zone_names;

    public ManagementViewInfo() {
    }

    public ManagementViewInfo(
           java.lang.String view_name,
           long view_order,
           java.lang.String[] option_seq,
           java.lang.String[] zone_names) {
           this.view_name = view_name;
           this.view_order = view_order;
           this.option_seq = option_seq;
           this.zone_names = zone_names;
    }


    /**
     * Gets the view_name value for this ManagementViewInfo.
     * 
     * @return view_name
     */
    public java.lang.String getView_name() {
        return view_name;
    }


    /**
     * Sets the view_name value for this ManagementViewInfo.
     * 
     * @param view_name
     */
    public void setView_name(java.lang.String view_name) {
        this.view_name = view_name;
    }


    /**
     * Gets the view_order value for this ManagementViewInfo.
     * 
     * @return view_order
     */
    public long getView_order() {
        return view_order;
    }


    /**
     * Sets the view_order value for this ManagementViewInfo.
     * 
     * @param view_order
     */
    public void setView_order(long view_order) {
        this.view_order = view_order;
    }


    /**
     * Gets the option_seq value for this ManagementViewInfo.
     * 
     * @return option_seq
     */
    public java.lang.String[] getOption_seq() {
        return option_seq;
    }


    /**
     * Sets the option_seq value for this ManagementViewInfo.
     * 
     * @param option_seq
     */
    public void setOption_seq(java.lang.String[] option_seq) {
        this.option_seq = option_seq;
    }


    /**
     * Gets the zone_names value for this ManagementViewInfo.
     * 
     * @return zone_names
     */
    public java.lang.String[] getZone_names() {
        return zone_names;
    }


    /**
     * Sets the zone_names value for this ManagementViewInfo.
     * 
     * @param zone_names
     */
    public void setZone_names(java.lang.String[] zone_names) {
        this.zone_names = zone_names;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementViewInfo)) return false;
        ManagementViewInfo other = (ManagementViewInfo) obj;
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
            this.view_order == other.getView_order() &&
            ((this.option_seq==null && other.getOption_seq()==null) || 
             (this.option_seq!=null &&
              java.util.Arrays.equals(this.option_seq, other.getOption_seq()))) &&
            ((this.zone_names==null && other.getZone_names()==null) || 
             (this.zone_names!=null &&
              java.util.Arrays.equals(this.zone_names, other.getZone_names())));
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
        _hashCode += new Long(getView_order()).hashCode();
        if (getOption_seq() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption_seq());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption_seq(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZone_names() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZone_names());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZone_names(), i);
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
        new org.apache.axis.description.TypeDesc(ManagementViewInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.ViewInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("view_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "view_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("view_order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "view_order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option_seq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "option_seq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone_names");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zone_names"));
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
