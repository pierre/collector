/**
 * ManagementSNMPConfigurationPassThroughInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationPassThroughInformation  implements java.io.Serializable {
    private java.lang.String mib_oid;

    private java.lang.String exec_name;

    public ManagementSNMPConfigurationPassThroughInformation() {
    }

    public ManagementSNMPConfigurationPassThroughInformation(
           java.lang.String mib_oid,
           java.lang.String exec_name) {
           this.mib_oid = mib_oid;
           this.exec_name = exec_name;
    }


    /**
     * Gets the mib_oid value for this ManagementSNMPConfigurationPassThroughInformation.
     * 
     * @return mib_oid
     */
    public java.lang.String getMib_oid() {
        return mib_oid;
    }


    /**
     * Sets the mib_oid value for this ManagementSNMPConfigurationPassThroughInformation.
     * 
     * @param mib_oid
     */
    public void setMib_oid(java.lang.String mib_oid) {
        this.mib_oid = mib_oid;
    }


    /**
     * Gets the exec_name value for this ManagementSNMPConfigurationPassThroughInformation.
     * 
     * @return exec_name
     */
    public java.lang.String getExec_name() {
        return exec_name;
    }


    /**
     * Sets the exec_name value for this ManagementSNMPConfigurationPassThroughInformation.
     * 
     * @param exec_name
     */
    public void setExec_name(java.lang.String exec_name) {
        this.exec_name = exec_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationPassThroughInformation)) return false;
        ManagementSNMPConfigurationPassThroughInformation other = (ManagementSNMPConfigurationPassThroughInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mib_oid==null && other.getMib_oid()==null) || 
             (this.mib_oid!=null &&
              this.mib_oid.equals(other.getMib_oid()))) &&
            ((this.exec_name==null && other.getExec_name()==null) || 
             (this.exec_name!=null &&
              this.exec_name.equals(other.getExec_name())));
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
        if (getMib_oid() != null) {
            _hashCode += getMib_oid().hashCode();
        }
        if (getExec_name() != null) {
            _hashCode += getExec_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationPassThroughInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PassThroughInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mib_oid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mib_oid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exec_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exec_name"));
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
