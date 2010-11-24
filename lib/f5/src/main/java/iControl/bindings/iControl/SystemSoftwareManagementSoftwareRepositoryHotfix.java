/**
 * SystemSoftwareManagementSoftwareRepositoryHotfix.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemSoftwareManagementSoftwareRepositoryHotfix  implements java.io.Serializable {
    private long chassis_slot_id;

    private java.lang.String filename;

    private java.lang.String product;

    private java.lang.String version;

    private java.lang.String build;

    private java.lang.String chksum;

    private boolean verified;

    private java.lang.String hotfix_id;

    private java.lang.String hotfix_title;

    public SystemSoftwareManagementSoftwareRepositoryHotfix() {
    }

    public SystemSoftwareManagementSoftwareRepositoryHotfix(
           long chassis_slot_id,
           java.lang.String filename,
           java.lang.String product,
           java.lang.String version,
           java.lang.String build,
           java.lang.String chksum,
           boolean verified,
           java.lang.String hotfix_id,
           java.lang.String hotfix_title) {
           this.chassis_slot_id = chassis_slot_id;
           this.filename = filename;
           this.product = product;
           this.version = version;
           this.build = build;
           this.chksum = chksum;
           this.verified = verified;
           this.hotfix_id = hotfix_id;
           this.hotfix_title = hotfix_title;
    }


    /**
     * Gets the chassis_slot_id value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return chassis_slot_id
     */
    public long getChassis_slot_id() {
        return chassis_slot_id;
    }


    /**
     * Sets the chassis_slot_id value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param chassis_slot_id
     */
    public void setChassis_slot_id(long chassis_slot_id) {
        this.chassis_slot_id = chassis_slot_id;
    }


    /**
     * Gets the filename value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the product value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the version value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the build value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the chksum value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return chksum
     */
    public java.lang.String getChksum() {
        return chksum;
    }


    /**
     * Sets the chksum value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param chksum
     */
    public void setChksum(java.lang.String chksum) {
        this.chksum = chksum;
    }


    /**
     * Gets the verified value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return verified
     */
    public boolean isVerified() {
        return verified;
    }


    /**
     * Sets the verified value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param verified
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }


    /**
     * Gets the hotfix_id value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return hotfix_id
     */
    public java.lang.String getHotfix_id() {
        return hotfix_id;
    }


    /**
     * Sets the hotfix_id value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param hotfix_id
     */
    public void setHotfix_id(java.lang.String hotfix_id) {
        this.hotfix_id = hotfix_id;
    }


    /**
     * Gets the hotfix_title value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @return hotfix_title
     */
    public java.lang.String getHotfix_title() {
        return hotfix_title;
    }


    /**
     * Sets the hotfix_title value for this SystemSoftwareManagementSoftwareRepositoryHotfix.
     * 
     * @param hotfix_title
     */
    public void setHotfix_title(java.lang.String hotfix_title) {
        this.hotfix_title = hotfix_title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemSoftwareManagementSoftwareRepositoryHotfix)) return false;
        SystemSoftwareManagementSoftwareRepositoryHotfix other = (SystemSoftwareManagementSoftwareRepositoryHotfix) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.chassis_slot_id == other.getChassis_slot_id() &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild()))) &&
            ((this.chksum==null && other.getChksum()==null) || 
             (this.chksum!=null &&
              this.chksum.equals(other.getChksum()))) &&
            this.verified == other.isVerified() &&
            ((this.hotfix_id==null && other.getHotfix_id()==null) || 
             (this.hotfix_id!=null &&
              this.hotfix_id.equals(other.getHotfix_id()))) &&
            ((this.hotfix_title==null && other.getHotfix_title()==null) || 
             (this.hotfix_title!=null &&
              this.hotfix_title.equals(other.getHotfix_title())));
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
        _hashCode += new Long(getChassis_slot_id()).hashCode();
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        if (getChksum() != null) {
            _hashCode += getChksum().hashCode();
        }
        _hashCode += (isVerified() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHotfix_id() != null) {
            _hashCode += getHotfix_id().hashCode();
        }
        if (getHotfix_title() != null) {
            _hashCode += getHotfix_title().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemSoftwareManagementSoftwareRepositoryHotfix.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.SoftwareManagement.softwareRepositoryHotfix"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chassis_slot_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chassis_slot_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("", "build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chksum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chksum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotfix_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotfix_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotfix_title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotfix_title"));
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
