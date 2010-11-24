/**
 * SystemHardwareInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemHardwareInformation  implements java.io.Serializable {
    private java.lang.String name;

    private iControl.SystemHardwareType type;

    private long slot;

    private java.lang.String model;

    private iControl.SystemVersionInformation[] versions;

    public SystemHardwareInformation() {
    }

    public SystemHardwareInformation(
           java.lang.String name,
           iControl.SystemHardwareType type,
           long slot,
           java.lang.String model,
           iControl.SystemVersionInformation[] versions) {
           this.name = name;
           this.type = type;
           this.slot = slot;
           this.model = model;
           this.versions = versions;
    }


    /**
     * Gets the name value for this SystemHardwareInformation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SystemHardwareInformation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this SystemHardwareInformation.
     * 
     * @return type
     */
    public iControl.SystemHardwareType getType() {
        return type;
    }


    /**
     * Sets the type value for this SystemHardwareInformation.
     * 
     * @param type
     */
    public void setType(iControl.SystemHardwareType type) {
        this.type = type;
    }


    /**
     * Gets the slot value for this SystemHardwareInformation.
     * 
     * @return slot
     */
    public long getSlot() {
        return slot;
    }


    /**
     * Sets the slot value for this SystemHardwareInformation.
     * 
     * @param slot
     */
    public void setSlot(long slot) {
        this.slot = slot;
    }


    /**
     * Gets the model value for this SystemHardwareInformation.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this SystemHardwareInformation.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the versions value for this SystemHardwareInformation.
     * 
     * @return versions
     */
    public iControl.SystemVersionInformation[] getVersions() {
        return versions;
    }


    /**
     * Sets the versions value for this SystemHardwareInformation.
     * 
     * @param versions
     */
    public void setVersions(iControl.SystemVersionInformation[] versions) {
        this.versions = versions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemHardwareInformation)) return false;
        SystemHardwareInformation other = (SystemHardwareInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.slot == other.getSlot() &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.versions==null && other.getVersions()==null) || 
             (this.versions!=null &&
              java.util.Arrays.equals(this.versions, other.getVersions())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += new Long(getSlot()).hashCode();
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersions(), i);
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
        new org.apache.axis.description.TypeDesc(SystemHardwareInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.HardwareInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.HardwareType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.VersionInformation"));
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
