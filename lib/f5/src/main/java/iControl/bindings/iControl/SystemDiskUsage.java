/**
 * SystemDiskUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemDiskUsage  implements java.io.Serializable {
    private java.lang.String partition_name;

    private iControl.CommonULong64 block_size;

    private iControl.CommonULong64 total_blocks;

    private iControl.CommonULong64 free_blocks;

    private iControl.CommonULong64 total_nodes;

    private iControl.CommonULong64 free_nodes;

    public SystemDiskUsage() {
    }

    public SystemDiskUsage(
           java.lang.String partition_name,
           iControl.CommonULong64 block_size,
           iControl.CommonULong64 total_blocks,
           iControl.CommonULong64 free_blocks,
           iControl.CommonULong64 total_nodes,
           iControl.CommonULong64 free_nodes) {
           this.partition_name = partition_name;
           this.block_size = block_size;
           this.total_blocks = total_blocks;
           this.free_blocks = free_blocks;
           this.total_nodes = total_nodes;
           this.free_nodes = free_nodes;
    }


    /**
     * Gets the partition_name value for this SystemDiskUsage.
     * 
     * @return partition_name
     */
    public java.lang.String getPartition_name() {
        return partition_name;
    }


    /**
     * Sets the partition_name value for this SystemDiskUsage.
     * 
     * @param partition_name
     */
    public void setPartition_name(java.lang.String partition_name) {
        this.partition_name = partition_name;
    }


    /**
     * Gets the block_size value for this SystemDiskUsage.
     * 
     * @return block_size
     */
    public iControl.CommonULong64 getBlock_size() {
        return block_size;
    }


    /**
     * Sets the block_size value for this SystemDiskUsage.
     * 
     * @param block_size
     */
    public void setBlock_size(iControl.CommonULong64 block_size) {
        this.block_size = block_size;
    }


    /**
     * Gets the total_blocks value for this SystemDiskUsage.
     * 
     * @return total_blocks
     */
    public iControl.CommonULong64 getTotal_blocks() {
        return total_blocks;
    }


    /**
     * Sets the total_blocks value for this SystemDiskUsage.
     * 
     * @param total_blocks
     */
    public void setTotal_blocks(iControl.CommonULong64 total_blocks) {
        this.total_blocks = total_blocks;
    }


    /**
     * Gets the free_blocks value for this SystemDiskUsage.
     * 
     * @return free_blocks
     */
    public iControl.CommonULong64 getFree_blocks() {
        return free_blocks;
    }


    /**
     * Sets the free_blocks value for this SystemDiskUsage.
     * 
     * @param free_blocks
     */
    public void setFree_blocks(iControl.CommonULong64 free_blocks) {
        this.free_blocks = free_blocks;
    }


    /**
     * Gets the total_nodes value for this SystemDiskUsage.
     * 
     * @return total_nodes
     */
    public iControl.CommonULong64 getTotal_nodes() {
        return total_nodes;
    }


    /**
     * Sets the total_nodes value for this SystemDiskUsage.
     * 
     * @param total_nodes
     */
    public void setTotal_nodes(iControl.CommonULong64 total_nodes) {
        this.total_nodes = total_nodes;
    }


    /**
     * Gets the free_nodes value for this SystemDiskUsage.
     * 
     * @return free_nodes
     */
    public iControl.CommonULong64 getFree_nodes() {
        return free_nodes;
    }


    /**
     * Sets the free_nodes value for this SystemDiskUsage.
     * 
     * @param free_nodes
     */
    public void setFree_nodes(iControl.CommonULong64 free_nodes) {
        this.free_nodes = free_nodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemDiskUsage)) return false;
        SystemDiskUsage other = (SystemDiskUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partition_name==null && other.getPartition_name()==null) || 
             (this.partition_name!=null &&
              this.partition_name.equals(other.getPartition_name()))) &&
            ((this.block_size==null && other.getBlock_size()==null) || 
             (this.block_size!=null &&
              this.block_size.equals(other.getBlock_size()))) &&
            ((this.total_blocks==null && other.getTotal_blocks()==null) || 
             (this.total_blocks!=null &&
              this.total_blocks.equals(other.getTotal_blocks()))) &&
            ((this.free_blocks==null && other.getFree_blocks()==null) || 
             (this.free_blocks!=null &&
              this.free_blocks.equals(other.getFree_blocks()))) &&
            ((this.total_nodes==null && other.getTotal_nodes()==null) || 
             (this.total_nodes!=null &&
              this.total_nodes.equals(other.getTotal_nodes()))) &&
            ((this.free_nodes==null && other.getFree_nodes()==null) || 
             (this.free_nodes!=null &&
              this.free_nodes.equals(other.getFree_nodes())));
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
        if (getPartition_name() != null) {
            _hashCode += getPartition_name().hashCode();
        }
        if (getBlock_size() != null) {
            _hashCode += getBlock_size().hashCode();
        }
        if (getTotal_blocks() != null) {
            _hashCode += getTotal_blocks().hashCode();
        }
        if (getFree_blocks() != null) {
            _hashCode += getFree_blocks().hashCode();
        }
        if (getTotal_nodes() != null) {
            _hashCode += getTotal_nodes().hashCode();
        }
        if (getFree_nodes() != null) {
            _hashCode += getFree_nodes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemDiskUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.DiskUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partition_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("block_size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "block_size"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_blocks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_blocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("free_blocks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "free_blocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.ULong64"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("free_nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "free_nodes"));
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
