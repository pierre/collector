/**
 * ManagementSNMPConfigurationAccessInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationAccessInformation  implements java.io.Serializable {
    private java.lang.String access_name;

    private java.lang.String access_context;

    private iControl.ManagementSNMPConfigurationModelType model;

    private iControl.ManagementSNMPConfigurationLevelType level;

    private iControl.ManagementSNMPConfigurationPrefixType prefix;

    private java.lang.String read_access;

    private java.lang.String write_access;

    private java.lang.String notify_access;

    public ManagementSNMPConfigurationAccessInformation() {
    }

    public ManagementSNMPConfigurationAccessInformation(
           java.lang.String access_name,
           java.lang.String access_context,
           iControl.ManagementSNMPConfigurationModelType model,
           iControl.ManagementSNMPConfigurationLevelType level,
           iControl.ManagementSNMPConfigurationPrefixType prefix,
           java.lang.String read_access,
           java.lang.String write_access,
           java.lang.String notify_access) {
           this.access_name = access_name;
           this.access_context = access_context;
           this.model = model;
           this.level = level;
           this.prefix = prefix;
           this.read_access = read_access;
           this.write_access = write_access;
           this.notify_access = notify_access;
    }


    /**
     * Gets the access_name value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @return access_name
     */
    public java.lang.String getAccess_name() {
        return access_name;
    }


    /**
     * Sets the access_name value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @param access_name
     */
    public void setAccess_name(java.lang.String access_name) {
        this.access_name = access_name;
    }


    /**
     * Gets the access_context value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @return access_context
     */
    public java.lang.String getAccess_context() {
        return access_context;
    }


    /**
     * Sets the access_context value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @param access_context
     */
    public void setAccess_context(java.lang.String access_context) {
        this.access_context = access_context;
    }


    /**
     * Gets the model value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @return model
     */
    public iControl.ManagementSNMPConfigurationModelType getModel() {
        return model;
    }


    /**
     * Sets the model value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @param model
     */
    public void setModel(iControl.ManagementSNMPConfigurationModelType model) {
        this.model = model;
    }


    /**
     * Gets the level value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @return level
     */
    public iControl.ManagementSNMPConfigurationLevelType getLevel() {
        return level;
    }


    /**
     * Sets the level value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @param level
     */
    public void setLevel(iControl.ManagementSNMPConfigurationLevelType level) {
        this.level = level;
    }


    /**
     * Gets the prefix value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @return prefix
     */
    public iControl.ManagementSNMPConfigurationPrefixType getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @param prefix
     */
    public void setPrefix(iControl.ManagementSNMPConfigurationPrefixType prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the read_access value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @return read_access
     */
    public java.lang.String getRead_access() {
        return read_access;
    }


    /**
     * Sets the read_access value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @param read_access
     */
    public void setRead_access(java.lang.String read_access) {
        this.read_access = read_access;
    }


    /**
     * Gets the write_access value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @return write_access
     */
    public java.lang.String getWrite_access() {
        return write_access;
    }


    /**
     * Sets the write_access value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @param write_access
     */
    public void setWrite_access(java.lang.String write_access) {
        this.write_access = write_access;
    }


    /**
     * Gets the notify_access value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @return notify_access
     */
    public java.lang.String getNotify_access() {
        return notify_access;
    }


    /**
     * Sets the notify_access value for this ManagementSNMPConfigurationAccessInformation.
     * 
     * @param notify_access
     */
    public void setNotify_access(java.lang.String notify_access) {
        this.notify_access = notify_access;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationAccessInformation)) return false;
        ManagementSNMPConfigurationAccessInformation other = (ManagementSNMPConfigurationAccessInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.access_name==null && other.getAccess_name()==null) || 
             (this.access_name!=null &&
              this.access_name.equals(other.getAccess_name()))) &&
            ((this.access_context==null && other.getAccess_context()==null) || 
             (this.access_context!=null &&
              this.access_context.equals(other.getAccess_context()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.read_access==null && other.getRead_access()==null) || 
             (this.read_access!=null &&
              this.read_access.equals(other.getRead_access()))) &&
            ((this.write_access==null && other.getWrite_access()==null) || 
             (this.write_access!=null &&
              this.write_access.equals(other.getWrite_access()))) &&
            ((this.notify_access==null && other.getNotify_access()==null) || 
             (this.notify_access!=null &&
              this.notify_access.equals(other.getNotify_access())));
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
        if (getAccess_name() != null) {
            _hashCode += getAccess_name().hashCode();
        }
        if (getAccess_context() != null) {
            _hashCode += getAccess_context().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getRead_access() != null) {
            _hashCode += getRead_access().hashCode();
        }
        if (getWrite_access() != null) {
            _hashCode += getWrite_access().hashCode();
        }
        if (getNotify_access() != null) {
            _hashCode += getNotify_access().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationAccessInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AccessInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "access_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access_context");
        elemField.setXmlName(new javax.xml.namespace.QName("", "access_context"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.ModelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.LevelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PrefixType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("read_access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "read_access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("write_access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "write_access"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_access");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_access"));
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
