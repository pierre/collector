/**
 * SystemSoftwareManagementSoftwareRepositoryImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemSoftwareManagementSoftwareRepositoryImage  implements java.io.Serializable {
    private long chassis_slot_id;

    private java.lang.String filename;

    private java.lang.String product;

    private java.lang.String version;

    private java.lang.String build;

    private java.lang.String chksum;

    private boolean verified;

    private java.lang.String build_date;

    private java.lang.String last_modified;

    private java.lang.String file_size;

    public SystemSoftwareManagementSoftwareRepositoryImage() {
    }

    public SystemSoftwareManagementSoftwareRepositoryImage(
           long chassis_slot_id,
           java.lang.String filename,
           java.lang.String product,
           java.lang.String version,
           java.lang.String build,
           java.lang.String chksum,
           boolean verified,
           java.lang.String build_date,
           java.lang.String last_modified,
           java.lang.String file_size) {
           this.chassis_slot_id = chassis_slot_id;
           this.filename = filename;
           this.product = product;
           this.version = version;
           this.build = build;
           this.chksum = chksum;
           this.verified = verified;
           this.build_date = build_date;
           this.last_modified = last_modified;
           this.file_size = file_size;
    }


    /**
     * Gets the chassis_slot_id value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return chassis_slot_id
     */
    public long getChassis_slot_id() {
        return chassis_slot_id;
    }


    /**
     * Sets the chassis_slot_id value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param chassis_slot_id
     */
    public void setChassis_slot_id(long chassis_slot_id) {
        this.chassis_slot_id = chassis_slot_id;
    }


    /**
     * Gets the filename value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the product value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the version value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the build value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the chksum value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return chksum
     */
    public java.lang.String getChksum() {
        return chksum;
    }


    /**
     * Sets the chksum value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param chksum
     */
    public void setChksum(java.lang.String chksum) {
        this.chksum = chksum;
    }


    /**
     * Gets the verified value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return verified
     */
    public boolean isVerified() {
        return verified;
    }


    /**
     * Sets the verified value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param verified
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }


    /**
     * Gets the build_date value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return build_date
     */
    public java.lang.String getBuild_date() {
        return build_date;
    }


    /**
     * Sets the build_date value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param build_date
     */
    public void setBuild_date(java.lang.String build_date) {
        this.build_date = build_date;
    }


    /**
     * Gets the last_modified value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return last_modified
     */
    public java.lang.String getLast_modified() {
        return last_modified;
    }


    /**
     * Sets the last_modified value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param last_modified
     */
    public void setLast_modified(java.lang.String last_modified) {
        this.last_modified = last_modified;
    }


    /**
     * Gets the file_size value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @return file_size
     */
    public java.lang.String getFile_size() {
        return file_size;
    }


    /**
     * Sets the file_size value for this SystemSoftwareManagementSoftwareRepositoryImage.
     * 
     * @param file_size
     */
    public void setFile_size(java.lang.String file_size) {
        this.file_size = file_size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemSoftwareManagementSoftwareRepositoryImage)) return false;
        SystemSoftwareManagementSoftwareRepositoryImage other = (SystemSoftwareManagementSoftwareRepositoryImage) obj;
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
            ((this.build_date==null && other.getBuild_date()==null) || 
             (this.build_date!=null &&
              this.build_date.equals(other.getBuild_date()))) &&
            ((this.last_modified==null && other.getLast_modified()==null) || 
             (this.last_modified!=null &&
              this.last_modified.equals(other.getLast_modified()))) &&
            ((this.file_size==null && other.getFile_size()==null) || 
             (this.file_size!=null &&
              this.file_size.equals(other.getFile_size())));
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
        if (getBuild_date() != null) {
            _hashCode += getBuild_date().hashCode();
        }
        if (getLast_modified() != null) {
            _hashCode += getLast_modified().hashCode();
        }
        if (getFile_size() != null) {
            _hashCode += getFile_size().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemSoftwareManagementSoftwareRepositoryImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.SoftwareManagement.softwareRepositoryImage"));
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
        elemField.setFieldName("build_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "build_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_size"));
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
