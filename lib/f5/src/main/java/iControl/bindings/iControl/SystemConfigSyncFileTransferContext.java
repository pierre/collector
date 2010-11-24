/**
 * SystemConfigSyncFileTransferContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemConfigSyncFileTransferContext  implements java.io.Serializable {
    private byte[] file_data;

    private iControl.CommonFileChainType chain_type;

    public SystemConfigSyncFileTransferContext() {
    }

    public SystemConfigSyncFileTransferContext(
           byte[] file_data,
           iControl.CommonFileChainType chain_type) {
           this.file_data = file_data;
           this.chain_type = chain_type;
    }


    /**
     * Gets the file_data value for this SystemConfigSyncFileTransferContext.
     * 
     * @return file_data
     */
    public byte[] getFile_data() {
        return file_data;
    }


    /**
     * Sets the file_data value for this SystemConfigSyncFileTransferContext.
     * 
     * @param file_data
     */
    public void setFile_data(byte[] file_data) {
        this.file_data = file_data;
    }


    /**
     * Gets the chain_type value for this SystemConfigSyncFileTransferContext.
     * 
     * @return chain_type
     */
    public iControl.CommonFileChainType getChain_type() {
        return chain_type;
    }


    /**
     * Sets the chain_type value for this SystemConfigSyncFileTransferContext.
     * 
     * @param chain_type
     */
    public void setChain_type(iControl.CommonFileChainType chain_type) {
        this.chain_type = chain_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemConfigSyncFileTransferContext)) return false;
        SystemConfigSyncFileTransferContext other = (SystemConfigSyncFileTransferContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.file_data==null && other.getFile_data()==null) || 
             (this.file_data!=null &&
              java.util.Arrays.equals(this.file_data, other.getFile_data()))) &&
            ((this.chain_type==null && other.getChain_type()==null) || 
             (this.chain_type!=null &&
              this.chain_type.equals(other.getChain_type())));
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
        if (getFile_data() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile_data());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFile_data(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChain_type() != null) {
            _hashCode += getChain_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemConfigSyncFileTransferContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.ConfigSync.FileTransferContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chain_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chain_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.FileChainType"));
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
