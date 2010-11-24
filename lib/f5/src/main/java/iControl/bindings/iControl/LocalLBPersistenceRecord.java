/**
 * LocalLBPersistenceRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBPersistenceRecord  implements java.io.Serializable {
    private java.lang.String pool_name;

    private iControl.CommonIPPortDefinition node_server;

    private iControl.LocalLBPersistenceMode mode;

    private java.lang.String persistence_value;

    private iControl.CommonVirtualServerDefinition virtual_server;

    private long create_time;

    private long age;

    public LocalLBPersistenceRecord() {
    }

    public LocalLBPersistenceRecord(
           java.lang.String pool_name,
           iControl.CommonIPPortDefinition node_server,
           iControl.LocalLBPersistenceMode mode,
           java.lang.String persistence_value,
           iControl.CommonVirtualServerDefinition virtual_server,
           long create_time,
           long age) {
           this.pool_name = pool_name;
           this.node_server = node_server;
           this.mode = mode;
           this.persistence_value = persistence_value;
           this.virtual_server = virtual_server;
           this.create_time = create_time;
           this.age = age;
    }


    /**
     * Gets the pool_name value for this LocalLBPersistenceRecord.
     * 
     * @return pool_name
     */
    public java.lang.String getPool_name() {
        return pool_name;
    }


    /**
     * Sets the pool_name value for this LocalLBPersistenceRecord.
     * 
     * @param pool_name
     */
    public void setPool_name(java.lang.String pool_name) {
        this.pool_name = pool_name;
    }


    /**
     * Gets the node_server value for this LocalLBPersistenceRecord.
     * 
     * @return node_server
     */
    public iControl.CommonIPPortDefinition getNode_server() {
        return node_server;
    }


    /**
     * Sets the node_server value for this LocalLBPersistenceRecord.
     * 
     * @param node_server
     */
    public void setNode_server(iControl.CommonIPPortDefinition node_server) {
        this.node_server = node_server;
    }


    /**
     * Gets the mode value for this LocalLBPersistenceRecord.
     * 
     * @return mode
     */
    public iControl.LocalLBPersistenceMode getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this LocalLBPersistenceRecord.
     * 
     * @param mode
     */
    public void setMode(iControl.LocalLBPersistenceMode mode) {
        this.mode = mode;
    }


    /**
     * Gets the persistence_value value for this LocalLBPersistenceRecord.
     * 
     * @return persistence_value
     */
    public java.lang.String getPersistence_value() {
        return persistence_value;
    }


    /**
     * Sets the persistence_value value for this LocalLBPersistenceRecord.
     * 
     * @param persistence_value
     */
    public void setPersistence_value(java.lang.String persistence_value) {
        this.persistence_value = persistence_value;
    }


    /**
     * Gets the virtual_server value for this LocalLBPersistenceRecord.
     * 
     * @return virtual_server
     */
    public iControl.CommonVirtualServerDefinition getVirtual_server() {
        return virtual_server;
    }


    /**
     * Sets the virtual_server value for this LocalLBPersistenceRecord.
     * 
     * @param virtual_server
     */
    public void setVirtual_server(iControl.CommonVirtualServerDefinition virtual_server) {
        this.virtual_server = virtual_server;
    }


    /**
     * Gets the create_time value for this LocalLBPersistenceRecord.
     * 
     * @return create_time
     */
    public long getCreate_time() {
        return create_time;
    }


    /**
     * Sets the create_time value for this LocalLBPersistenceRecord.
     * 
     * @param create_time
     */
    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }


    /**
     * Gets the age value for this LocalLBPersistenceRecord.
     * 
     * @return age
     */
    public long getAge() {
        return age;
    }


    /**
     * Sets the age value for this LocalLBPersistenceRecord.
     * 
     * @param age
     */
    public void setAge(long age) {
        this.age = age;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBPersistenceRecord)) return false;
        LocalLBPersistenceRecord other = (LocalLBPersistenceRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pool_name==null && other.getPool_name()==null) || 
             (this.pool_name!=null &&
              this.pool_name.equals(other.getPool_name()))) &&
            ((this.node_server==null && other.getNode_server()==null) || 
             (this.node_server!=null &&
              this.node_server.equals(other.getNode_server()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.persistence_value==null && other.getPersistence_value()==null) || 
             (this.persistence_value!=null &&
              this.persistence_value.equals(other.getPersistence_value()))) &&
            ((this.virtual_server==null && other.getVirtual_server()==null) || 
             (this.virtual_server!=null &&
              this.virtual_server.equals(other.getVirtual_server()))) &&
            this.create_time == other.getCreate_time() &&
            this.age == other.getAge();
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
        if (getPool_name() != null) {
            _hashCode += getPool_name().hashCode();
        }
        if (getNode_server() != null) {
            _hashCode += getNode_server().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getPersistence_value() != null) {
            _hashCode += getPersistence_value().hashCode();
        }
        if (getVirtual_server() != null) {
            _hashCode += getVirtual_server().hashCode();
        }
        _hashCode += new Long(getCreate_time()).hashCode();
        _hashCode += new Long(getAge()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBPersistenceRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PersistenceRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pool_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PersistenceMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistence_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistence_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtual_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtual_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.VirtualServerDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "create_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
