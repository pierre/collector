/**
 * LocalLBClassMetaInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBClassMetaInformation  implements java.io.Serializable {
    private java.lang.String class_name;

    private iControl.LocalLBClassClassType class_type;

    private java.lang.String file_name;

    private iControl.LocalLBClassFileModeType file_mode;

    private iControl.LocalLBClassFileFormatType file_format;

    public LocalLBClassMetaInformation() {
    }

    public LocalLBClassMetaInformation(
           java.lang.String class_name,
           iControl.LocalLBClassClassType class_type,
           java.lang.String file_name,
           iControl.LocalLBClassFileModeType file_mode,
           iControl.LocalLBClassFileFormatType file_format) {
           this.class_name = class_name;
           this.class_type = class_type;
           this.file_name = file_name;
           this.file_mode = file_mode;
           this.file_format = file_format;
    }


    /**
     * Gets the class_name value for this LocalLBClassMetaInformation.
     * 
     * @return class_name
     */
    public java.lang.String getClass_name() {
        return class_name;
    }


    /**
     * Sets the class_name value for this LocalLBClassMetaInformation.
     * 
     * @param class_name
     */
    public void setClass_name(java.lang.String class_name) {
        this.class_name = class_name;
    }


    /**
     * Gets the class_type value for this LocalLBClassMetaInformation.
     * 
     * @return class_type
     */
    public iControl.LocalLBClassClassType getClass_type() {
        return class_type;
    }


    /**
     * Sets the class_type value for this LocalLBClassMetaInformation.
     * 
     * @param class_type
     */
    public void setClass_type(iControl.LocalLBClassClassType class_type) {
        this.class_type = class_type;
    }


    /**
     * Gets the file_name value for this LocalLBClassMetaInformation.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this LocalLBClassMetaInformation.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the file_mode value for this LocalLBClassMetaInformation.
     * 
     * @return file_mode
     */
    public iControl.LocalLBClassFileModeType getFile_mode() {
        return file_mode;
    }


    /**
     * Sets the file_mode value for this LocalLBClassMetaInformation.
     * 
     * @param file_mode
     */
    public void setFile_mode(iControl.LocalLBClassFileModeType file_mode) {
        this.file_mode = file_mode;
    }


    /**
     * Gets the file_format value for this LocalLBClassMetaInformation.
     * 
     * @return file_format
     */
    public iControl.LocalLBClassFileFormatType getFile_format() {
        return file_format;
    }


    /**
     * Sets the file_format value for this LocalLBClassMetaInformation.
     * 
     * @param file_format
     */
    public void setFile_format(iControl.LocalLBClassFileFormatType file_format) {
        this.file_format = file_format;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBClassMetaInformation)) return false;
        LocalLBClassMetaInformation other = (LocalLBClassMetaInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.class_name==null && other.getClass_name()==null) || 
             (this.class_name!=null &&
              this.class_name.equals(other.getClass_name()))) &&
            ((this.class_type==null && other.getClass_type()==null) || 
             (this.class_type!=null &&
              this.class_type.equals(other.getClass_type()))) &&
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            ((this.file_mode==null && other.getFile_mode()==null) || 
             (this.file_mode!=null &&
              this.file_mode.equals(other.getFile_mode()))) &&
            ((this.file_format==null && other.getFile_format()==null) || 
             (this.file_format!=null &&
              this.file_format.equals(other.getFile_format())));
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
        if (getClass_name() != null) {
            _hashCode += getClass_name().hashCode();
        }
        if (getClass_type() != null) {
            _hashCode += getClass_type().hashCode();
        }
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        if (getFile_mode() != null) {
            _hashCode += getFile_mode().hashCode();
        }
        if (getFile_format() != null) {
            _hashCode += getFile_format().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBClassMetaInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.MetaInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "class_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "class_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.ClassType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileModeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.FileFormatType"));
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
