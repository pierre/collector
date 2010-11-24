/**
 * SystemLockStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemLockStatus  implements java.io.Serializable {
    private java.lang.String lock_name;

    private long time_left;

    private java.lang.String comment;

    public SystemLockStatus() {
    }

    public SystemLockStatus(
           java.lang.String lock_name,
           long time_left,
           java.lang.String comment) {
           this.lock_name = lock_name;
           this.time_left = time_left;
           this.comment = comment;
    }


    /**
     * Gets the lock_name value for this SystemLockStatus.
     * 
     * @return lock_name
     */
    public java.lang.String getLock_name() {
        return lock_name;
    }


    /**
     * Sets the lock_name value for this SystemLockStatus.
     * 
     * @param lock_name
     */
    public void setLock_name(java.lang.String lock_name) {
        this.lock_name = lock_name;
    }


    /**
     * Gets the time_left value for this SystemLockStatus.
     * 
     * @return time_left
     */
    public long getTime_left() {
        return time_left;
    }


    /**
     * Sets the time_left value for this SystemLockStatus.
     * 
     * @param time_left
     */
    public void setTime_left(long time_left) {
        this.time_left = time_left;
    }


    /**
     * Gets the comment value for this SystemLockStatus.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this SystemLockStatus.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLockStatus)) return false;
        SystemLockStatus other = (SystemLockStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lock_name==null && other.getLock_name()==null) || 
             (this.lock_name!=null &&
              this.lock_name.equals(other.getLock_name()))) &&
            this.time_left == other.getTime_left() &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getLock_name() != null) {
            _hashCode += getLock_name().hashCode();
        }
        _hashCode += new Long(getTime_left()).hashCode();
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLockStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.LockStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lock_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lock_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_left");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
