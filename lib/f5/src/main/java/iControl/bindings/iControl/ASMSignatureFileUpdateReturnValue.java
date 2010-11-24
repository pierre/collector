/**
 * ASMSignatureFileUpdateReturnValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ASMSignatureFileUpdateReturnValue  implements java.io.Serializable {
    private long completed_successfully;

    private long sig_count;

    private long sigs_updated_count;

    private java.lang.String error_msg;

    public ASMSignatureFileUpdateReturnValue() {
    }

    public ASMSignatureFileUpdateReturnValue(
           long completed_successfully,
           long sig_count,
           long sigs_updated_count,
           java.lang.String error_msg) {
           this.completed_successfully = completed_successfully;
           this.sig_count = sig_count;
           this.sigs_updated_count = sigs_updated_count;
           this.error_msg = error_msg;
    }


    /**
     * Gets the completed_successfully value for this ASMSignatureFileUpdateReturnValue.
     * 
     * @return completed_successfully
     */
    public long getCompleted_successfully() {
        return completed_successfully;
    }


    /**
     * Sets the completed_successfully value for this ASMSignatureFileUpdateReturnValue.
     * 
     * @param completed_successfully
     */
    public void setCompleted_successfully(long completed_successfully) {
        this.completed_successfully = completed_successfully;
    }


    /**
     * Gets the sig_count value for this ASMSignatureFileUpdateReturnValue.
     * 
     * @return sig_count
     */
    public long getSig_count() {
        return sig_count;
    }


    /**
     * Sets the sig_count value for this ASMSignatureFileUpdateReturnValue.
     * 
     * @param sig_count
     */
    public void setSig_count(long sig_count) {
        this.sig_count = sig_count;
    }


    /**
     * Gets the sigs_updated_count value for this ASMSignatureFileUpdateReturnValue.
     * 
     * @return sigs_updated_count
     */
    public long getSigs_updated_count() {
        return sigs_updated_count;
    }


    /**
     * Sets the sigs_updated_count value for this ASMSignatureFileUpdateReturnValue.
     * 
     * @param sigs_updated_count
     */
    public void setSigs_updated_count(long sigs_updated_count) {
        this.sigs_updated_count = sigs_updated_count;
    }


    /**
     * Gets the error_msg value for this ASMSignatureFileUpdateReturnValue.
     * 
     * @return error_msg
     */
    public java.lang.String getError_msg() {
        return error_msg;
    }


    /**
     * Sets the error_msg value for this ASMSignatureFileUpdateReturnValue.
     * 
     * @param error_msg
     */
    public void setError_msg(java.lang.String error_msg) {
        this.error_msg = error_msg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ASMSignatureFileUpdateReturnValue)) return false;
        ASMSignatureFileUpdateReturnValue other = (ASMSignatureFileUpdateReturnValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.completed_successfully == other.getCompleted_successfully() &&
            this.sig_count == other.getSig_count() &&
            this.sigs_updated_count == other.getSigs_updated_count() &&
            ((this.error_msg==null && other.getError_msg()==null) || 
             (this.error_msg!=null &&
              this.error_msg.equals(other.getError_msg())));
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
        _hashCode += new Long(getCompleted_successfully()).hashCode();
        _hashCode += new Long(getSig_count()).hashCode();
        _hashCode += new Long(getSigs_updated_count()).hashCode();
        if (getError_msg() != null) {
            _hashCode += getError_msg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ASMSignatureFileUpdateReturnValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "ASM.SignatureFileUpdateReturnValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completed_successfully");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completed_successfully"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sig_count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sig_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigs_updated_count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigs_updated_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_msg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error_msg"));
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
