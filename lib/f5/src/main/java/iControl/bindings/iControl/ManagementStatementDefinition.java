/**
 * ManagementStatementDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementStatementDefinition  implements java.io.Serializable {
    private java.lang.String statement_id;

    private java.lang.String[] sub_strings;

    public ManagementStatementDefinition() {
    }

    public ManagementStatementDefinition(
           java.lang.String statement_id,
           java.lang.String[] sub_strings) {
           this.statement_id = statement_id;
           this.sub_strings = sub_strings;
    }


    /**
     * Gets the statement_id value for this ManagementStatementDefinition.
     * 
     * @return statement_id
     */
    public java.lang.String getStatement_id() {
        return statement_id;
    }


    /**
     * Sets the statement_id value for this ManagementStatementDefinition.
     * 
     * @param statement_id
     */
    public void setStatement_id(java.lang.String statement_id) {
        this.statement_id = statement_id;
    }


    /**
     * Gets the sub_strings value for this ManagementStatementDefinition.
     * 
     * @return sub_strings
     */
    public java.lang.String[] getSub_strings() {
        return sub_strings;
    }


    /**
     * Sets the sub_strings value for this ManagementStatementDefinition.
     * 
     * @param sub_strings
     */
    public void setSub_strings(java.lang.String[] sub_strings) {
        this.sub_strings = sub_strings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementStatementDefinition)) return false;
        ManagementStatementDefinition other = (ManagementStatementDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statement_id==null && other.getStatement_id()==null) || 
             (this.statement_id!=null &&
              this.statement_id.equals(other.getStatement_id()))) &&
            ((this.sub_strings==null && other.getSub_strings()==null) || 
             (this.sub_strings!=null &&
              java.util.Arrays.equals(this.sub_strings, other.getSub_strings())));
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
        if (getStatement_id() != null) {
            _hashCode += getStatement_id().hashCode();
        }
        if (getSub_strings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSub_strings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSub_strings(), i);
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
        new org.apache.axis.description.TypeDesc(ManagementStatementDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.StatementDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statement_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub_strings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sub_strings"));
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
