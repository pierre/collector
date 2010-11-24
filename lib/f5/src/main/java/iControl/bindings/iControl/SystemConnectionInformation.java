/**
 * SystemConnectionInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemConnectionInformation  implements java.io.Serializable {
    private iControl.CommonIPPortDefinition local;

    private iControl.CommonIPPortDefinition remote;

    public SystemConnectionInformation() {
    }

    public SystemConnectionInformation(
           iControl.CommonIPPortDefinition local,
           iControl.CommonIPPortDefinition remote) {
           this.local = local;
           this.remote = remote;
    }


    /**
     * Gets the local value for this SystemConnectionInformation.
     * 
     * @return local
     */
    public iControl.CommonIPPortDefinition getLocal() {
        return local;
    }


    /**
     * Sets the local value for this SystemConnectionInformation.
     * 
     * @param local
     */
    public void setLocal(iControl.CommonIPPortDefinition local) {
        this.local = local;
    }


    /**
     * Gets the remote value for this SystemConnectionInformation.
     * 
     * @return remote
     */
    public iControl.CommonIPPortDefinition getRemote() {
        return remote;
    }


    /**
     * Sets the remote value for this SystemConnectionInformation.
     * 
     * @param remote
     */
    public void setRemote(iControl.CommonIPPortDefinition remote) {
        this.remote = remote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemConnectionInformation)) return false;
        SystemConnectionInformation other = (SystemConnectionInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.remote==null && other.getRemote()==null) || 
             (this.remote!=null &&
              this.remote.equals(other.getRemote())));
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
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getRemote() != null) {
            _hashCode += getRemote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemConnectionInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.ConnectionInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remote"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
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
