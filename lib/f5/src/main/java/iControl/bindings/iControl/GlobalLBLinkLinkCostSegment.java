/**
 * GlobalLBLinkLinkCostSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBLinkLinkCostSegment  implements java.io.Serializable {
    private iControl.CommonULong64 upper_limit;

    private long price_per_mbps;

    public GlobalLBLinkLinkCostSegment() {
    }

    public GlobalLBLinkLinkCostSegment(
           iControl.CommonULong64 upper_limit,
           long price_per_mbps) {
           this.upper_limit = upper_limit;
           this.price_per_mbps = price_per_mbps;
    }


    /**
     * Gets the upper_limit value for this GlobalLBLinkLinkCostSegment.
     * 
     * @return upper_limit
     */
    public iControl.CommonULong64 getUpper_limit() {
        return upper_limit;
    }


    /**
     * Sets the upper_limit value for this GlobalLBLinkLinkCostSegment.
     * 
     * @param upper_limit
     */
    public void setUpper_limit(iControl.CommonULong64 upper_limit) {
        this.upper_limit = upper_limit;
    }


    /**
     * Gets the price_per_mbps value for this GlobalLBLinkLinkCostSegment.
     * 
     * @return price_per_mbps
     */
    public long getPrice_per_mbps() {
        return price_per_mbps;
    }


    /**
     * Sets the price_per_mbps value for this GlobalLBLinkLinkCostSegment.
     * 
     * @param price_per_mbps
     */
    public void setPrice_per_mbps(long price_per_mbps) {
        this.price_per_mbps = price_per_mbps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBLinkLinkCostSegment)) return false;
        GlobalLBLinkLinkCostSegment other = (GlobalLBLinkLinkCostSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.upper_limit==null && other.getUpper_limit()==null) || 
             (this.upper_limit!=null &&
              this.upper_limit.equals(other.getUpper_limit()))) &&
            this.price_per_mbps == other.getPrice_per_mbps();
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
        if (getUpper_limit() != null) {
            _hashCode += getUpper_limit().hashCode();
        }
        _hashCode += new Long(getPrice_per_mbps()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBLinkLinkCostSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Link.LinkCostSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upper_limit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upper_limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_per_mbps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_per_mbps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
