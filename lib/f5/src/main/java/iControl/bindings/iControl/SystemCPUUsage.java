/**
 * SystemCPUUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemCPUUsage  implements java.io.Serializable {
    private long cpu_id;

    private iControl.CommonULong64 user;

    private iControl.CommonULong64 niced;

    private iControl.CommonULong64 system;

    private iControl.CommonULong64 idle;

    private iControl.CommonULong64 irq;

    private iControl.CommonULong64 softirq;

    private iControl.CommonULong64 iowait;

    public SystemCPUUsage() {
    }

    public SystemCPUUsage(
           long cpu_id,
           iControl.CommonULong64 user,
           iControl.CommonULong64 niced,
           iControl.CommonULong64 system,
           iControl.CommonULong64 idle,
           iControl.CommonULong64 irq,
           iControl.CommonULong64 softirq,
           iControl.CommonULong64 iowait) {
           this.cpu_id = cpu_id;
           this.user = user;
           this.niced = niced;
           this.system = system;
           this.idle = idle;
           this.irq = irq;
           this.softirq = softirq;
           this.iowait = iowait;
    }


    /**
     * Gets the cpu_id value for this SystemCPUUsage.
     * 
     * @return cpu_id
     */
    public long getCpu_id() {
        return cpu_id;
    }


    /**
     * Sets the cpu_id value for this SystemCPUUsage.
     * 
     * @param cpu_id
     */
    public void setCpu_id(long cpu_id) {
        this.cpu_id = cpu_id;
    }


    /**
     * Gets the user value for this SystemCPUUsage.
     * 
     * @return user
     */
    public iControl.CommonULong64 getUser() {
        return user;
    }


    /**
     * Sets the user value for this SystemCPUUsage.
     * 
     * @param user
     */
    public void setUser(iControl.CommonULong64 user) {
        this.user = user;
    }


    /**
     * Gets the niced value for this SystemCPUUsage.
     * 
     * @return niced
     */
    public iControl.CommonULong64 getNiced() {
        return niced;
    }


    /**
     * Sets the niced value for this SystemCPUUsage.
     * 
     * @param niced
     */
    public void setNiced(iControl.CommonULong64 niced) {
        this.niced = niced;
    }


    /**
     * Gets the system value for this SystemCPUUsage.
     * 
     * @return system
     */
    public iControl.CommonULong64 getSystem() {
        return system;
    }


    /**
     * Sets the system value for this SystemCPUUsage.
     * 
     * @param system
     */
    public void setSystem(iControl.CommonULong64 system) {
        this.system = system;
    }


    /**
     * Gets the idle value for this SystemCPUUsage.
     * 
     * @return idle
     */
    public iControl.CommonULong64 getIdle() {
        return idle;
    }


    /**
     * Sets the idle value for this SystemCPUUsage.
     * 
     * @param idle
     */
    public void setIdle(iControl.CommonULong64 idle) {
        this.idle = idle;
    }


    /**
     * Gets the irq value for this SystemCPUUsage.
     * 
     * @return irq
     */
    public iControl.CommonULong64 getIrq() {
        return irq;
    }


    /**
     * Sets the irq value for this SystemCPUUsage.
     * 
     * @param irq
     */
    public void setIrq(iControl.CommonULong64 irq) {
        this.irq = irq;
    }


    /**
     * Gets the softirq value for this SystemCPUUsage.
     * 
     * @return softirq
     */
    public iControl.CommonULong64 getSoftirq() {
        return softirq;
    }


    /**
     * Sets the softirq value for this SystemCPUUsage.
     * 
     * @param softirq
     */
    public void setSoftirq(iControl.CommonULong64 softirq) {
        this.softirq = softirq;
    }


    /**
     * Gets the iowait value for this SystemCPUUsage.
     * 
     * @return iowait
     */
    public iControl.CommonULong64 getIowait() {
        return iowait;
    }


    /**
     * Sets the iowait value for this SystemCPUUsage.
     * 
     * @param iowait
     */
    public void setIowait(iControl.CommonULong64 iowait) {
        this.iowait = iowait;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemCPUUsage)) return false;
        SystemCPUUsage other = (SystemCPUUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cpu_id == other.getCpu_id() &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.niced==null && other.getNiced()==null) || 
             (this.niced!=null &&
              this.niced.equals(other.getNiced()))) &&
            ((this.system==null && other.getSystem()==null) || 
             (this.system!=null &&
              this.system.equals(other.getSystem()))) &&
            ((this.idle==null && other.getIdle()==null) || 
             (this.idle!=null &&
              this.idle.equals(other.getIdle()))) &&
            ((this.irq==null && other.getIrq()==null) || 
             (this.irq!=null &&
              this.irq.equals(other.getIrq()))) &&
            ((this.softirq==null && other.getSoftirq()==null) || 
             (this.softirq!=null &&
              this.softirq.equals(other.getSoftirq()))) &&
            ((this.iowait==null && other.getIowait()==null) || 
             (this.iowait!=null &&
              this.iowait.equals(other.getIowait())));
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
        _hashCode += new Long(getCpu_id()).hashCode();
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getNiced() != null) {
            _hashCode += getNiced().hashCode();
        }
        if (getSystem() != null) {
            _hashCode += getSystem().hashCode();
        }
        if (getIdle() != null) {
            _hashCode += getIdle().hashCode();
        }
        if (getIrq() != null) {
            _hashCode += getIrq().hashCode();
        }
        if (getSoftirq() != null) {
            _hashCode += getSoftirq().hashCode();
        }
        if (getIowait() != null) {
            _hashCode += getIowait().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemCPUUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.CPUUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpu_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpu_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "niced"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system");
        elemField.setXmlName(new javax.xml.namespace.QName("", "system"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "irq"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softirq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "softirq"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iowait");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iowait"));
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
