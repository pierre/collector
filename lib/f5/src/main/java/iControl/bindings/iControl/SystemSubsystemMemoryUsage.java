/**
 * SystemSubsystemMemoryUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemSubsystemMemoryUsage  implements java.io.Serializable {
    private java.lang.String subsystem_name;

    private iControl.CommonULong64 current_allocated;

    private iControl.CommonULong64 maximum_allocated;

    private iControl.CommonULong64 size;

    public SystemSubsystemMemoryUsage() {
    }

    public SystemSubsystemMemoryUsage(
           java.lang.String subsystem_name,
           iControl.CommonULong64 current_allocated,
           iControl.CommonULong64 maximum_allocated,
           iControl.CommonULong64 size) {
           this.subsystem_name = subsystem_name;
           this.current_allocated = current_allocated;
           this.maximum_allocated = maximum_allocated;
           this.size = size;
    }


    /**
     * Gets the subsystem_name value for this SystemSubsystemMemoryUsage.
     * 
     * @return subsystem_name
     */
    public java.lang.String getSubsystem_name() {
        return subsystem_name;
    }


    /**
     * Sets the subsystem_name value for this SystemSubsystemMemoryUsage.
     * 
     * @param subsystem_name
     */
    public void setSubsystem_name(java.lang.String subsystem_name) {
        this.subsystem_name = subsystem_name;
    }


    /**
     * Gets the current_allocated value for this SystemSubsystemMemoryUsage.
     * 
     * @return current_allocated
     */
    public iControl.CommonULong64 getCurrent_allocated() {
        return current_allocated;
    }


    /**
     * Sets the current_allocated value for this SystemSubsystemMemoryUsage.
     * 
     * @param current_allocated
     */
    public void setCurrent_allocated(iControl.CommonULong64 current_allocated) {
        this.current_allocated = current_allocated;
    }


    /**
     * Gets the maximum_allocated value for this SystemSubsystemMemoryUsage.
     * 
     * @return maximum_allocated
     */
    public iControl.CommonULong64 getMaximum_allocated() {
        return maximum_allocated;
    }


    /**
     * Sets the maximum_allocated value for this SystemSubsystemMemoryUsage.
     * 
     * @param maximum_allocated
     */
    public void setMaximum_allocated(iControl.CommonULong64 maximum_allocated) {
        this.maximum_allocated = maximum_allocated;
    }


    /**
     * Gets the size value for this SystemSubsystemMemoryUsage.
     * 
     * @return size
     */
    public iControl.CommonULong64 getSize() {
        return size;
    }


    /**
     * Sets the size value for this SystemSubsystemMemoryUsage.
     * 
     * @param size
     */
    public void setSize(iControl.CommonULong64 size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemSubsystemMemoryUsage)) return false;
        SystemSubsystemMemoryUsage other = (SystemSubsystemMemoryUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subsystem_name==null && other.getSubsystem_name()==null) || 
             (this.subsystem_name!=null &&
              this.subsystem_name.equals(other.getSubsystem_name()))) &&
            ((this.current_allocated==null && other.getCurrent_allocated()==null) || 
             (this.current_allocated!=null &&
              this.current_allocated.equals(other.getCurrent_allocated()))) &&
            ((this.maximum_allocated==null && other.getMaximum_allocated()==null) || 
             (this.maximum_allocated!=null &&
              this.maximum_allocated.equals(other.getMaximum_allocated()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize())));
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
        if (getSubsystem_name() != null) {
            _hashCode += getSubsystem_name().hashCode();
        }
        if (getCurrent_allocated() != null) {
            _hashCode += getCurrent_allocated().hashCode();
        }
        if (getMaximum_allocated() != null) {
            _hashCode += getMaximum_allocated().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemSubsystemMemoryUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.SubsystemMemoryUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsystem_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsystem_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_allocated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_allocated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_allocated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximum_allocated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
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
