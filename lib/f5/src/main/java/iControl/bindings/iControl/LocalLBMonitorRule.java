/**
 * LocalLBMonitorRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBMonitorRule  implements java.io.Serializable {
    private iControl.LocalLBMonitorRuleType type;

    private long quorum;

    private java.lang.String[] monitor_templates;

    public LocalLBMonitorRule() {
    }

    public LocalLBMonitorRule(
           iControl.LocalLBMonitorRuleType type,
           long quorum,
           java.lang.String[] monitor_templates) {
           this.type = type;
           this.quorum = quorum;
           this.monitor_templates = monitor_templates;
    }


    /**
     * Gets the type value for this LocalLBMonitorRule.
     * 
     * @return type
     */
    public iControl.LocalLBMonitorRuleType getType() {
        return type;
    }


    /**
     * Sets the type value for this LocalLBMonitorRule.
     * 
     * @param type
     */
    public void setType(iControl.LocalLBMonitorRuleType type) {
        this.type = type;
    }


    /**
     * Gets the quorum value for this LocalLBMonitorRule.
     * 
     * @return quorum
     */
    public long getQuorum() {
        return quorum;
    }


    /**
     * Sets the quorum value for this LocalLBMonitorRule.
     * 
     * @param quorum
     */
    public void setQuorum(long quorum) {
        this.quorum = quorum;
    }


    /**
     * Gets the monitor_templates value for this LocalLBMonitorRule.
     * 
     * @return monitor_templates
     */
    public java.lang.String[] getMonitor_templates() {
        return monitor_templates;
    }


    /**
     * Sets the monitor_templates value for this LocalLBMonitorRule.
     * 
     * @param monitor_templates
     */
    public void setMonitor_templates(java.lang.String[] monitor_templates) {
        this.monitor_templates = monitor_templates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBMonitorRule)) return false;
        LocalLBMonitorRule other = (LocalLBMonitorRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.quorum == other.getQuorum() &&
            ((this.monitor_templates==null && other.getMonitor_templates()==null) || 
             (this.monitor_templates!=null &&
              java.util.Arrays.equals(this.monitor_templates, other.getMonitor_templates())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getQuorum()).hashCode();
        if (getMonitor_templates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitor_templates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitor_templates(), i);
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
        new org.apache.axis.description.TypeDesc(LocalLBMonitorRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorRuleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quorum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quorum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitor_templates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitor_templates"));
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
