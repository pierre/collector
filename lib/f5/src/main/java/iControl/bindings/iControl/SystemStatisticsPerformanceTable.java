/**
 * SystemStatisticsPerformanceTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemStatisticsPerformanceTable  implements java.io.Serializable {
    private java.lang.String table_name;

    private java.lang.String table_description;

    public SystemStatisticsPerformanceTable() {
    }

    public SystemStatisticsPerformanceTable(
           java.lang.String table_name,
           java.lang.String table_description) {
           this.table_name = table_name;
           this.table_description = table_description;
    }


    /**
     * Gets the table_name value for this SystemStatisticsPerformanceTable.
     * 
     * @return table_name
     */
    public java.lang.String getTable_name() {
        return table_name;
    }


    /**
     * Sets the table_name value for this SystemStatisticsPerformanceTable.
     * 
     * @param table_name
     */
    public void setTable_name(java.lang.String table_name) {
        this.table_name = table_name;
    }


    /**
     * Gets the table_description value for this SystemStatisticsPerformanceTable.
     * 
     * @return table_description
     */
    public java.lang.String getTable_description() {
        return table_description;
    }


    /**
     * Sets the table_description value for this SystemStatisticsPerformanceTable.
     * 
     * @param table_description
     */
    public void setTable_description(java.lang.String table_description) {
        this.table_description = table_description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemStatisticsPerformanceTable)) return false;
        SystemStatisticsPerformanceTable other = (SystemStatisticsPerformanceTable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.table_name==null && other.getTable_name()==null) || 
             (this.table_name!=null &&
              this.table_name.equals(other.getTable_name()))) &&
            ((this.table_description==null && other.getTable_description()==null) || 
             (this.table_description!=null &&
              this.table_description.equals(other.getTable_description())));
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
        if (getTable_name() != null) {
            _hashCode += getTable_name().hashCode();
        }
        if (getTable_description() != null) {
            _hashCode += getTable_description().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemStatisticsPerformanceTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Statistics.PerformanceTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("table_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "table_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("table_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "table_description"));
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
