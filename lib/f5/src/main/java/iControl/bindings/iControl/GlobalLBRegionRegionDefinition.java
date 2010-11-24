/**
 * GlobalLBRegionRegionDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBRegionRegionDefinition  implements java.io.Serializable {
    private java.lang.String name;

    private iControl.GlobalLBRegionDBType db_type;

    public GlobalLBRegionRegionDefinition() {
    }

    public GlobalLBRegionRegionDefinition(
           java.lang.String name,
           iControl.GlobalLBRegionDBType db_type) {
           this.name = name;
           this.db_type = db_type;
    }


    /**
     * Gets the name value for this GlobalLBRegionRegionDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GlobalLBRegionRegionDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the db_type value for this GlobalLBRegionRegionDefinition.
     * 
     * @return db_type
     */
    public iControl.GlobalLBRegionDBType getDb_type() {
        return db_type;
    }


    /**
     * Sets the db_type value for this GlobalLBRegionRegionDefinition.
     * 
     * @param db_type
     */
    public void setDb_type(iControl.GlobalLBRegionDBType db_type) {
        this.db_type = db_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalLBRegionRegionDefinition)) return false;
        GlobalLBRegionRegionDefinition other = (GlobalLBRegionRegionDefinition) obj;
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
            ((this.db_type==null && other.getDb_type()==null) || 
             (this.db_type!=null &&
              this.db_type.equals(other.getDb_type())));
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
        if (getDb_type() != null) {
            _hashCode += getDb_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBRegionRegionDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Region.RegionDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("db_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "db_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.RegionDBType"));
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
