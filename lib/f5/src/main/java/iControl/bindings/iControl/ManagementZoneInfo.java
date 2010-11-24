/**
 * ManagementZoneInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementZoneInfo  implements java.io.Serializable {
    private java.lang.String view_name;

    private java.lang.String zone_name;

    private iControl.ManagementZoneType zone_type;

    private java.lang.String zone_file;

    private java.lang.String[] option_seq;

    public ManagementZoneInfo() {
    }

    public ManagementZoneInfo(
           java.lang.String view_name,
           java.lang.String zone_name,
           iControl.ManagementZoneType zone_type,
           java.lang.String zone_file,
           java.lang.String[] option_seq) {
           this.view_name = view_name;
           this.zone_name = zone_name;
           this.zone_type = zone_type;
           this.zone_file = zone_file;
           this.option_seq = option_seq;
    }


    /**
     * Gets the view_name value for this ManagementZoneInfo.
     * 
     * @return view_name
     */
    public java.lang.String getView_name() {
        return view_name;
    }


    /**
     * Sets the view_name value for this ManagementZoneInfo.
     * 
     * @param view_name
     */
    public void setView_name(java.lang.String view_name) {
        this.view_name = view_name;
    }


    /**
     * Gets the zone_name value for this ManagementZoneInfo.
     * 
     * @return zone_name
     */
    public java.lang.String getZone_name() {
        return zone_name;
    }


    /**
     * Sets the zone_name value for this ManagementZoneInfo.
     * 
     * @param zone_name
     */
    public void setZone_name(java.lang.String zone_name) {
        this.zone_name = zone_name;
    }


    /**
     * Gets the zone_type value for this ManagementZoneInfo.
     * 
     * @return zone_type
     */
    public iControl.ManagementZoneType getZone_type() {
        return zone_type;
    }


    /**
     * Sets the zone_type value for this ManagementZoneInfo.
     * 
     * @param zone_type
     */
    public void setZone_type(iControl.ManagementZoneType zone_type) {
        this.zone_type = zone_type;
    }


    /**
     * Gets the zone_file value for this ManagementZoneInfo.
     * 
     * @return zone_file
     */
    public java.lang.String getZone_file() {
        return zone_file;
    }


    /**
     * Sets the zone_file value for this ManagementZoneInfo.
     * 
     * @param zone_file
     */
    public void setZone_file(java.lang.String zone_file) {
        this.zone_file = zone_file;
    }


    /**
     * Gets the option_seq value for this ManagementZoneInfo.
     * 
     * @return option_seq
     */
    public java.lang.String[] getOption_seq() {
        return option_seq;
    }


    /**
     * Sets the option_seq value for this ManagementZoneInfo.
     * 
     * @param option_seq
     */
    public void setOption_seq(java.lang.String[] option_seq) {
        this.option_seq = option_seq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementZoneInfo)) return false;
        ManagementZoneInfo other = (ManagementZoneInfo) obj;
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
              this.zone_name.equals(other.getZone_name()))) &&
            ((this.zone_type==null && other.getZone_type()==null) || 
             (this.zone_type!=null &&
              this.zone_type.equals(other.getZone_type()))) &&
            ((this.zone_file==null && other.getZone_file()==null) || 
             (this.zone_file!=null &&
              this.zone_file.equals(other.getZone_file()))) &&
            ((this.option_seq==null && other.getOption_seq()==null) || 
             (this.option_seq!=null &&
              java.util.Arrays.equals(this.option_seq, other.getOption_seq())));
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
        if (getZone_type() != null) {
            _hashCode += getZone_type().hashCode();
        }
        if (getZone_file() != null) {
            _hashCode += getZone_file().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementZoneInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.ZoneInfo"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zone_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.ZoneType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zone_file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option_seq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "option_seq"));
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
