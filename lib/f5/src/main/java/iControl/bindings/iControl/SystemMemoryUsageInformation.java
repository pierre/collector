/**
 * SystemMemoryUsageInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemMemoryUsageInformation  implements java.io.Serializable {
    private iControl.CommonULong64 total_memory;

    private iControl.CommonULong64 used_memory;

    private iControl.SystemSubsystemMemoryUsage[] usages;

    private iControl.CommonTimeStamp time_stamp;

    public SystemMemoryUsageInformation() {
    }

    public SystemMemoryUsageInformation(
           iControl.CommonULong64 total_memory,
           iControl.CommonULong64 used_memory,
           iControl.SystemSubsystemMemoryUsage[] usages,
           iControl.CommonTimeStamp time_stamp) {
           this.total_memory = total_memory;
           this.used_memory = used_memory;
           this.usages = usages;
           this.time_stamp = time_stamp;
    }


    /**
     * Gets the total_memory value for this SystemMemoryUsageInformation.
     * 
     * @return total_memory
     */
    public iControl.CommonULong64 getTotal_memory() {
        return total_memory;
    }


    /**
     * Sets the total_memory value for this SystemMemoryUsageInformation.
     * 
     * @param total_memory
     */
    public void setTotal_memory(iControl.CommonULong64 total_memory) {
        this.total_memory = total_memory;
    }


    /**
     * Gets the used_memory value for this SystemMemoryUsageInformation.
     * 
     * @return used_memory
     */
    public iControl.CommonULong64 getUsed_memory() {
        return used_memory;
    }


    /**
     * Sets the used_memory value for this SystemMemoryUsageInformation.
     * 
     * @param used_memory
     */
    public void setUsed_memory(iControl.CommonULong64 used_memory) {
        this.used_memory = used_memory;
    }


    /**
     * Gets the usages value for this SystemMemoryUsageInformation.
     * 
     * @return usages
     */
    public iControl.SystemSubsystemMemoryUsage[] getUsages() {
        return usages;
    }


    /**
     * Sets the usages value for this SystemMemoryUsageInformation.
     * 
     * @param usages
     */
    public void setUsages(iControl.SystemSubsystemMemoryUsage[] usages) {
        this.usages = usages;
    }


    /**
     * Gets the time_stamp value for this SystemMemoryUsageInformation.
     * 
     * @return time_stamp
     */
    public iControl.CommonTimeStamp getTime_stamp() {
        return time_stamp;
    }


    /**
     * Sets the time_stamp value for this SystemMemoryUsageInformation.
     * 
     * @param time_stamp
     */
    public void setTime_stamp(iControl.CommonTimeStamp time_stamp) {
        this.time_stamp = time_stamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemMemoryUsageInformation)) return false;
        SystemMemoryUsageInformation other = (SystemMemoryUsageInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.total_memory==null && other.getTotal_memory()==null) || 
             (this.total_memory!=null &&
              this.total_memory.equals(other.getTotal_memory()))) &&
            ((this.used_memory==null && other.getUsed_memory()==null) || 
             (this.used_memory!=null &&
              this.used_memory.equals(other.getUsed_memory()))) &&
            ((this.usages==null && other.getUsages()==null) || 
             (this.usages!=null &&
              java.util.Arrays.equals(this.usages, other.getUsages()))) &&
            ((this.time_stamp==null && other.getTime_stamp()==null) || 
             (this.time_stamp!=null &&
              this.time_stamp.equals(other.getTime_stamp())));
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
        if (getTotal_memory() != null) {
            _hashCode += getTotal_memory().hashCode();
        }
        if (getUsed_memory() != null) {
            _hashCode += getUsed_memory().hashCode();
        }
        if (getUsages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTime_stamp() != null) {
            _hashCode += getTime_stamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemMemoryUsageInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.MemoryUsageInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_memory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_memory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("used_memory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "used_memory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.SubsystemMemoryUsage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_stamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_stamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.TimeStamp"));
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
