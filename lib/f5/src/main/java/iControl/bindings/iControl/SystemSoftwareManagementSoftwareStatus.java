/**
 * SystemSoftwareManagementSoftwareStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemSoftwareManagementSoftwareStatus  implements java.io.Serializable {
    private iControl.SystemSoftwareManagementInstallationID installation_id;

    private java.lang.String product;

    private java.lang.String version;

    private java.lang.String build;

    private java.lang.String base_build;

    private boolean active;

    private java.lang.String edition;

    private java.lang.String status;

    public SystemSoftwareManagementSoftwareStatus() {
    }

    public SystemSoftwareManagementSoftwareStatus(
           iControl.SystemSoftwareManagementInstallationID installation_id,
           java.lang.String product,
           java.lang.String version,
           java.lang.String build,
           java.lang.String base_build,
           boolean active,
           java.lang.String edition,
           java.lang.String status) {
           this.installation_id = installation_id;
           this.product = product;
           this.version = version;
           this.build = build;
           this.base_build = base_build;
           this.active = active;
           this.edition = edition;
           this.status = status;
    }


    /**
     * Gets the installation_id value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @return installation_id
     */
    public iControl.SystemSoftwareManagementInstallationID getInstallation_id() {
        return installation_id;
    }


    /**
     * Sets the installation_id value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @param installation_id
     */
    public void setInstallation_id(iControl.SystemSoftwareManagementInstallationID installation_id) {
        this.installation_id = installation_id;
    }


    /**
     * Gets the product value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the version value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the build value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the base_build value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @return base_build
     */
    public java.lang.String getBase_build() {
        return base_build;
    }


    /**
     * Sets the base_build value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @param base_build
     */
    public void setBase_build(java.lang.String base_build) {
        this.base_build = base_build;
    }


    /**
     * Gets the active value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the edition value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @return edition
     */
    public java.lang.String getEdition() {
        return edition;
    }


    /**
     * Sets the edition value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @param edition
     */
    public void setEdition(java.lang.String edition) {
        this.edition = edition;
    }


    /**
     * Gets the status value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SystemSoftwareManagementSoftwareStatus.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemSoftwareManagementSoftwareStatus)) return false;
        SystemSoftwareManagementSoftwareStatus other = (SystemSoftwareManagementSoftwareStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.installation_id==null && other.getInstallation_id()==null) || 
             (this.installation_id!=null &&
              this.installation_id.equals(other.getInstallation_id()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild()))) &&
            ((this.base_build==null && other.getBase_build()==null) || 
             (this.base_build!=null &&
              this.base_build.equals(other.getBase_build()))) &&
            this.active == other.isActive() &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getInstallation_id() != null) {
            _hashCode += getInstallation_id().hashCode();
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
        if (getBase_build() != null) {
            _hashCode += getBase_build().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemSoftwareManagementSoftwareStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.SoftwareManagement.SoftwareStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installation_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "installation_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.SoftwareManagement.InstallationID"));
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
        elemField.setFieldName("base_build");
        elemField.setXmlName(new javax.xml.namespace.QName("", "base_build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
