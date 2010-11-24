/**
 * GlobalLBWideIPWideIPPool.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBWideIPWideIPPool  implements java.io.Serializable {
    private java.lang.String pool_name;

    private long order;

    private long ratio;

    public GlobalLBWideIPWideIPPool() {
    }

    public GlobalLBWideIPWideIPPool(
           java.lang.String pool_name,
           long order,
           long ratio) {
           this.pool_name = pool_name;
           this.order = order;
           this.ratio = ratio;
    }


    /**
     * Gets the pool_name value for this GlobalLBWideIPWideIPPool.
     * 
     * @return pool_name
     */
    public java.lang.String getPool_name() {
        return pool_name;
    }


    /**
     * Sets the pool_name value for this GlobalLBWideIPWideIPPool.
     * 
     * @param pool_name
     */
    public void setPool_name(java.lang.String pool_name) {
        this.pool_name = pool_name;
    }


    /**
     * Gets the order value for this GlobalLBWideIPWideIPPool.
     * 
     * @return order
     */
    public long getOrder() {
        return order;
    }


    /**
     * Sets the order value for this GlobalLBWideIPWideIPPool.
     * 
     * @param order
     */
    public void setOrder(long order) {
        this.order = order;
    }


    /**
     * Gets the ratio value for this GlobalLBWideIPWideIPPool.
     * 
     * @return ratio
     */
    public long getRatio() {
        return ratio;
    }


    /**
     * Sets the ratio value for this GlobalLBWideIPWideIPPool.
     * 
     * @param ratio
     */
    public void setRatio(long ratio) {
        this.ratio = ratio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBWideIPWideIPPool)) return false;
        GlobalLBWideIPWideIPPool other = (GlobalLBWideIPWideIPPool) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pool_name==null && other.getPool_name()==null) || 
             (this.pool_name!=null &&
              this.pool_name.equals(other.getPool_name()))) &&
            this.order == other.getOrder() &&
            this.ratio == other.getRatio();
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
        if (getPool_name() != null) {
            _hashCode += getPool_name().hashCode();
        }
        _hashCode += new Long(getOrder()).hashCode();
        _hashCode += new Long(getRatio()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBWideIPWideIPPool.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.WideIP.WideIPPool"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pool_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratio"));
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
