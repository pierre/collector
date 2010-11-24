/**
 * NetworkingInterfacesInterfaceMediaOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingInterfacesInterfaceMediaOption  implements java.io.Serializable {
    private java.lang.String interface_name;

    private iControl.NetworkingInterfacesMediaType[] media_options;

    public NetworkingInterfacesInterfaceMediaOption() {
    }

    public NetworkingInterfacesInterfaceMediaOption(
           java.lang.String interface_name,
           iControl.NetworkingInterfacesMediaType[] media_options) {
           this.interface_name = interface_name;
           this.media_options = media_options;
    }


    /**
     * Gets the interface_name value for this NetworkingInterfacesInterfaceMediaOption.
     * 
     * @return interface_name
     */
    public java.lang.String getInterface_name() {
        return interface_name;
    }


    /**
     * Sets the interface_name value for this NetworkingInterfacesInterfaceMediaOption.
     * 
     * @param interface_name
     */
    public void setInterface_name(java.lang.String interface_name) {
        this.interface_name = interface_name;
    }


    /**
     * Gets the media_options value for this NetworkingInterfacesInterfaceMediaOption.
     * 
     * @return media_options
     */
    public iControl.NetworkingInterfacesMediaType[] getMedia_options() {
        return media_options;
    }


    /**
     * Sets the media_options value for this NetworkingInterfacesInterfaceMediaOption.
     * 
     * @param media_options
     */
    public void setMedia_options(iControl.NetworkingInterfacesMediaType[] media_options) {
        this.media_options = media_options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingInterfacesInterfaceMediaOption)) return false;
        NetworkingInterfacesInterfaceMediaOption other = (NetworkingInterfacesInterfaceMediaOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interface_name==null && other.getInterface_name()==null) || 
             (this.interface_name!=null &&
              this.interface_name.equals(other.getInterface_name()))) &&
            ((this.media_options==null && other.getMedia_options()==null) || 
             (this.media_options!=null &&
              java.util.Arrays.equals(this.media_options, other.getMedia_options())));
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
        if (getInterface_name() != null) {
            _hashCode += getInterface_name().hashCode();
        }
        if (getMedia_options() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMedia_options());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMedia_options(), i);
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
        new org.apache.axis.description.TypeDesc(NetworkingInterfacesInterfaceMediaOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.Interfaces.InterfaceMediaOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interface_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interface_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media_options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "media_options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.Interfaces.MediaType"));
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
