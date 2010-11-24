/**
 * ManagementRADIUSServerRADIUSServerDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementRADIUSServerRADIUSServerDefinition  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ip_or_hostname;

    private long service;

    private java.lang.String secret;

    public ManagementRADIUSServerRADIUSServerDefinition() {
    }

    public ManagementRADIUSServerRADIUSServerDefinition(
           java.lang.String name,
           java.lang.String ip_or_hostname,
           long service,
           java.lang.String secret) {
           this.name = name;
           this.ip_or_hostname = ip_or_hostname;
           this.service = service;
           this.secret = secret;
    }


    /**
     * Gets the name value for this ManagementRADIUSServerRADIUSServerDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ManagementRADIUSServerRADIUSServerDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ip_or_hostname value for this ManagementRADIUSServerRADIUSServerDefinition.
     * 
     * @return ip_or_hostname
     */
    public java.lang.String getIp_or_hostname() {
        return ip_or_hostname;
    }


    /**
     * Sets the ip_or_hostname value for this ManagementRADIUSServerRADIUSServerDefinition.
     * 
     * @param ip_or_hostname
     */
    public void setIp_or_hostname(java.lang.String ip_or_hostname) {
        this.ip_or_hostname = ip_or_hostname;
    }


    /**
     * Gets the service value for this ManagementRADIUSServerRADIUSServerDefinition.
     * 
     * @return service
     */
    public long getService() {
        return service;
    }


    /**
     * Sets the service value for this ManagementRADIUSServerRADIUSServerDefinition.
     * 
     * @param service
     */
    public void setService(long service) {
        this.service = service;
    }


    /**
     * Gets the secret value for this ManagementRADIUSServerRADIUSServerDefinition.
     * 
     * @return secret
     */
    public java.lang.String getSecret() {
        return secret;
    }


    /**
     * Sets the secret value for this ManagementRADIUSServerRADIUSServerDefinition.
     * 
     * @param secret
     */
    public void setSecret(java.lang.String secret) {
        this.secret = secret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementRADIUSServerRADIUSServerDefinition)) return false;
        ManagementRADIUSServerRADIUSServerDefinition other = (ManagementRADIUSServerRADIUSServerDefinition) obj;
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
            ((this.ip_or_hostname==null && other.getIp_or_hostname()==null) || 
             (this.ip_or_hostname!=null &&
              this.ip_or_hostname.equals(other.getIp_or_hostname()))) &&
            this.service == other.getService() &&
            ((this.secret==null && other.getSecret()==null) || 
             (this.secret!=null &&
              this.secret.equals(other.getSecret())));
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
        if (getIp_or_hostname() != null) {
            _hashCode += getIp_or_hostname().hashCode();
        }
        _hashCode += new Long(getService()).hashCode();
        if (getSecret() != null) {
            _hashCode += getSecret().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementRADIUSServerRADIUSServerDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.RADIUSServer.RADIUSServerDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_or_hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip_or_hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secret"));
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
