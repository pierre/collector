/**
 * LocalLBVirtualServerVirtualServerModuleScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBVirtualServerVirtualServerModuleScore  implements java.io.Serializable {
    private iControl.CommonTMOSModule tmos_module;

    private long score;

    public LocalLBVirtualServerVirtualServerModuleScore() {
    }

    public LocalLBVirtualServerVirtualServerModuleScore(
           iControl.CommonTMOSModule tmos_module,
           long score) {
           this.tmos_module = tmos_module;
           this.score = score;
    }


    /**
     * Gets the tmos_module value for this LocalLBVirtualServerVirtualServerModuleScore.
     * 
     * @return tmos_module
     */
    public iControl.CommonTMOSModule getTmos_module() {
        return tmos_module;
    }


    /**
     * Sets the tmos_module value for this LocalLBVirtualServerVirtualServerModuleScore.
     * 
     * @param tmos_module
     */
    public void setTmos_module(iControl.CommonTMOSModule tmos_module) {
        this.tmos_module = tmos_module;
    }


    /**
     * Gets the score value for this LocalLBVirtualServerVirtualServerModuleScore.
     * 
     * @return score
     */
    public long getScore() {
        return score;
    }


    /**
     * Sets the score value for this LocalLBVirtualServerVirtualServerModuleScore.
     * 
     * @param score
     */
    public void setScore(long score) {
        this.score = score;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBVirtualServerVirtualServerModuleScore)) return false;
        LocalLBVirtualServerVirtualServerModuleScore other = (LocalLBVirtualServerVirtualServerModuleScore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tmos_module==null && other.getTmos_module()==null) || 
             (this.tmos_module!=null &&
              this.tmos_module.equals(other.getTmos_module()))) &&
            this.score == other.getScore();
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
        if (getTmos_module() != null) {
            _hashCode += getTmos_module().hashCode();
        }
        _hashCode += new Long(getScore()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBVirtualServerVirtualServerModuleScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualServer.VirtualServerModuleScore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmos_module");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmos_module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TMOSModule"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score"));
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
