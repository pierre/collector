/**
 * NetworkingSTPInstanceInterfacePathCost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingSTPInstanceInterfacePathCost  implements java.io.Serializable {
    private java.lang.String name;

    private iControl.NetworkingSTPInstancePathCost path_cost;

    public NetworkingSTPInstanceInterfacePathCost() {
    }

    public NetworkingSTPInstanceInterfacePathCost(
           java.lang.String name,
           iControl.NetworkingSTPInstancePathCost path_cost) {
           this.name = name;
           this.path_cost = path_cost;
    }


    /**
     * Gets the name value for this NetworkingSTPInstanceInterfacePathCost.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this NetworkingSTPInstanceInterfacePathCost.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the path_cost value for this NetworkingSTPInstanceInterfacePathCost.
     * 
     * @return path_cost
     */
    public iControl.NetworkingSTPInstancePathCost getPath_cost() {
        return path_cost;
    }


    /**
     * Sets the path_cost value for this NetworkingSTPInstanceInterfacePathCost.
     * 
     * @param path_cost
     */
    public void setPath_cost(iControl.NetworkingSTPInstancePathCost path_cost) {
        this.path_cost = path_cost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingSTPInstanceInterfacePathCost)) return false;
        NetworkingSTPInstanceInterfacePathCost other = (NetworkingSTPInstanceInterfacePathCost) obj;
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
            ((this.path_cost==null && other.getPath_cost()==null) || 
             (this.path_cost!=null &&
              this.path_cost.equals(other.getPath_cost())));
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
        if (getPath_cost() != null) {
            _hashCode += getPath_cost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingSTPInstanceInterfacePathCost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.STPInstance.InterfacePathCost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path_cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "path_cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.STPInstance.PathCost"));
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
