/**
 * LocalLBClassAddressClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBClassAddressClass  implements java.io.Serializable {
    private java.lang.String name;

    private iControl.LocalLBClassAddressEntry[] members;

    public LocalLBClassAddressClass() {
    }

    public LocalLBClassAddressClass(
           java.lang.String name,
           iControl.LocalLBClassAddressEntry[] members) {
           this.name = name;
           this.members = members;
    }


    /**
     * Gets the name value for this LocalLBClassAddressClass.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LocalLBClassAddressClass.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the members value for this LocalLBClassAddressClass.
     * 
     * @return members
     */
    public iControl.LocalLBClassAddressEntry[] getMembers() {
        return members;
    }


    /**
     * Sets the members value for this LocalLBClassAddressClass.
     * 
     * @param members
     */
    public void setMembers(iControl.LocalLBClassAddressEntry[] members) {
        this.members = members;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBClassAddressClass)) return false;
        LocalLBClassAddressClass other = (LocalLBClassAddressClass) obj;
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
            ((this.members==null && other.getMembers()==null) || 
             (this.members!=null &&
              java.util.Arrays.equals(this.members, other.getMembers())));
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
        if (getMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembers(), i);
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
        new org.apache.axis.description.TypeDesc(LocalLBClassAddressClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("members");
        elemField.setXmlName(new javax.xml.namespace.QName("", "members"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class.AddressEntry"));
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
