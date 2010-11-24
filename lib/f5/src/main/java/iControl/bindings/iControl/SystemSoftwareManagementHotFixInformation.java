/**
 * SystemSoftwareManagementHotFixInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemSoftwareManagementHotFixInformation  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String product;

    private java.lang.String id;

    private java.lang.String version_resolved;

    private java.lang.String[] packages;

    public SystemSoftwareManagementHotFixInformation() {
    }

    public SystemSoftwareManagementHotFixInformation(
           java.lang.String description,
           java.lang.String product,
           java.lang.String id,
           java.lang.String version_resolved,
           java.lang.String[] packages) {
           this.description = description;
           this.product = product;
           this.id = id;
           this.version_resolved = version_resolved;
           this.packages = packages;
    }


    /**
     * Gets the description value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the product value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the id value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the version_resolved value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @return version_resolved
     */
    public java.lang.String getVersion_resolved() {
        return version_resolved;
    }


    /**
     * Sets the version_resolved value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @param version_resolved
     */
    public void setVersion_resolved(java.lang.String version_resolved) {
        this.version_resolved = version_resolved;
    }


    /**
     * Gets the packages value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @return packages
     */
    public java.lang.String[] getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this SystemSoftwareManagementHotFixInformation.
     * 
     * @param packages
     */
    public void setPackages(java.lang.String[] packages) {
        this.packages = packages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemSoftwareManagementHotFixInformation)) return false;
        SystemSoftwareManagementHotFixInformation other = (SystemSoftwareManagementHotFixInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.version_resolved==null && other.getVersion_resolved()==null) || 
             (this.version_resolved!=null &&
              this.version_resolved.equals(other.getVersion_resolved()))) &&
            ((this.packages==null && other.getPackages()==null) || 
             (this.packages!=null &&
              java.util.Arrays.equals(this.packages, other.getPackages())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getVersion_resolved() != null) {
            _hashCode += getVersion_resolved().hashCode();
        }
        if (getPackages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemSoftwareManagementHotFixInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.SoftwareManagement.HotFixInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version_resolved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version_resolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packages"));
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
