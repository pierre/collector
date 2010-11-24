/**
 * SystemConfigSyncConfigFileEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemConfigSyncConfigFileEntry  implements java.io.Serializable {
    private java.lang.String file_name;

    private java.lang.String file_datetime;

    public SystemConfigSyncConfigFileEntry() {
    }

    public SystemConfigSyncConfigFileEntry(
           java.lang.String file_name,
           java.lang.String file_datetime) {
           this.file_name = file_name;
           this.file_datetime = file_datetime;
    }


    /**
     * Gets the file_name value for this SystemConfigSyncConfigFileEntry.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this SystemConfigSyncConfigFileEntry.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the file_datetime value for this SystemConfigSyncConfigFileEntry.
     * 
     * @return file_datetime
     */
    public java.lang.String getFile_datetime() {
        return file_datetime;
    }


    /**
     * Sets the file_datetime value for this SystemConfigSyncConfigFileEntry.
     * 
     * @param file_datetime
     */
    public void setFile_datetime(java.lang.String file_datetime) {
        this.file_datetime = file_datetime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemConfigSyncConfigFileEntry)) return false;
        SystemConfigSyncConfigFileEntry other = (SystemConfigSyncConfigFileEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            ((this.file_datetime==null && other.getFile_datetime()==null) || 
             (this.file_datetime!=null &&
              this.file_datetime.equals(other.getFile_datetime())));
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
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        if (getFile_datetime() != null) {
            _hashCode += getFile_datetime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemConfigSyncConfigFileEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.ConfigSync.ConfigFileEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_datetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_datetime"));
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
