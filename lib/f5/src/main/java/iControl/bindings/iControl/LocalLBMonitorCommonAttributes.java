/**
 * LocalLBMonitorCommonAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBMonitorCommonAttributes  implements java.io.Serializable {
    private java.lang.String parent_template;

    private long interval;

    private long timeout;

    private iControl.LocalLBMonitorIPPort dest_ipport;

    private boolean is_read_only;

    private boolean is_directly_usable;

    public LocalLBMonitorCommonAttributes() {
    }

    public LocalLBMonitorCommonAttributes(
           java.lang.String parent_template,
           long interval,
           long timeout,
           iControl.LocalLBMonitorIPPort dest_ipport,
           boolean is_read_only,
           boolean is_directly_usable) {
           this.parent_template = parent_template;
           this.interval = interval;
           this.timeout = timeout;
           this.dest_ipport = dest_ipport;
           this.is_read_only = is_read_only;
           this.is_directly_usable = is_directly_usable;
    }


    /**
     * Gets the parent_template value for this LocalLBMonitorCommonAttributes.
     * 
     * @return parent_template
     */
    public java.lang.String getParent_template() {
        return parent_template;
    }


    /**
     * Sets the parent_template value for this LocalLBMonitorCommonAttributes.
     * 
     * @param parent_template
     */
    public void setParent_template(java.lang.String parent_template) {
        this.parent_template = parent_template;
    }


    /**
     * Gets the interval value for this LocalLBMonitorCommonAttributes.
     * 
     * @return interval
     */
    public long getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this LocalLBMonitorCommonAttributes.
     * 
     * @param interval
     */
    public void setInterval(long interval) {
        this.interval = interval;
    }


    /**
     * Gets the timeout value for this LocalLBMonitorCommonAttributes.
     * 
     * @return timeout
     */
    public long getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this LocalLBMonitorCommonAttributes.
     * 
     * @param timeout
     */
    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the dest_ipport value for this LocalLBMonitorCommonAttributes.
     * 
     * @return dest_ipport
     */
    public iControl.LocalLBMonitorIPPort getDest_ipport() {
        return dest_ipport;
    }


    /**
     * Sets the dest_ipport value for this LocalLBMonitorCommonAttributes.
     * 
     * @param dest_ipport
     */
    public void setDest_ipport(iControl.LocalLBMonitorIPPort dest_ipport) {
        this.dest_ipport = dest_ipport;
    }


    /**
     * Gets the is_read_only value for this LocalLBMonitorCommonAttributes.
     * 
     * @return is_read_only
     */
    public boolean isIs_read_only() {
        return is_read_only;
    }


    /**
     * Sets the is_read_only value for this LocalLBMonitorCommonAttributes.
     * 
     * @param is_read_only
     */
    public void setIs_read_only(boolean is_read_only) {
        this.is_read_only = is_read_only;
    }


    /**
     * Gets the is_directly_usable value for this LocalLBMonitorCommonAttributes.
     * 
     * @return is_directly_usable
     */
    public boolean isIs_directly_usable() {
        return is_directly_usable;
    }


    /**
     * Sets the is_directly_usable value for this LocalLBMonitorCommonAttributes.
     * 
     * @param is_directly_usable
     */
    public void setIs_directly_usable(boolean is_directly_usable) {
        this.is_directly_usable = is_directly_usable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBMonitorCommonAttributes)) return false;
        LocalLBMonitorCommonAttributes other = (LocalLBMonitorCommonAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parent_template==null && other.getParent_template()==null) || 
             (this.parent_template!=null &&
              this.parent_template.equals(other.getParent_template()))) &&
            this.interval == other.getInterval() &&
            this.timeout == other.getTimeout() &&
            ((this.dest_ipport==null && other.getDest_ipport()==null) || 
             (this.dest_ipport!=null &&
              this.dest_ipport.equals(other.getDest_ipport()))) &&
            this.is_read_only == other.isIs_read_only() &&
            this.is_directly_usable == other.isIs_directly_usable();
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
        if (getParent_template() != null) {
            _hashCode += getParent_template().hashCode();
        }
        _hashCode += new Long(getInterval()).hashCode();
        _hashCode += new Long(getTimeout()).hashCode();
        if (getDest_ipport() != null) {
            _hashCode += getDest_ipport().hashCode();
        }
        _hashCode += (isIs_read_only() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIs_directly_usable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBMonitorCommonAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Monitor.CommonAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_template");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent_template"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dest_ipport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dest_ipport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorIPPort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_read_only");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_read_only"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_directly_usable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_directly_usable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
