/**
 * CommonVLANFilterList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class CommonVLANFilterList  implements java.io.Serializable {
    private iControl.CommonEnabledState state;

    private java.lang.String[] vlans;

    public CommonVLANFilterList() {
    }

    public CommonVLANFilterList(
           iControl.CommonEnabledState state,
           java.lang.String[] vlans) {
           this.state = state;
           this.vlans = vlans;
    }


    /**
     * Gets the state value for this CommonVLANFilterList.
     * 
     * @return state
     */
    public iControl.CommonEnabledState getState() {
        return state;
    }


    /**
     * Sets the state value for this CommonVLANFilterList.
     * 
     * @param state
     */
    public void setState(iControl.CommonEnabledState state) {
        this.state = state;
    }


    /**
     * Gets the vlans value for this CommonVLANFilterList.
     * 
     * @return vlans
     */
    public java.lang.String[] getVlans() {
        return vlans;
    }


    /**
     * Sets the vlans value for this CommonVLANFilterList.
     * 
     * @param vlans
     */
    public void setVlans(java.lang.String[] vlans) {
        this.vlans = vlans;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommonVLANFilterList)) return false;
        CommonVLANFilterList other = (CommonVLANFilterList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.vlans==null && other.getVlans()==null) || 
             (this.vlans!=null &&
              java.util.Arrays.equals(this.vlans, other.getVlans())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getVlans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlans(), i);
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
        new org.apache.axis.description.TypeDesc(CommonVLANFilterList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.VLANFilterList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlans"));
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
