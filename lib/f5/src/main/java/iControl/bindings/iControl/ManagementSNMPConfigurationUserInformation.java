/**
 * ManagementSNMPConfigurationUserInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementSNMPConfigurationUserInformation  implements java.io.Serializable {
    private java.lang.String user_name;

    private iControl.ManagementSNMPConfigurationAuthType auth_type;

    private java.lang.String auth_pass_phrase;

    private iControl.ManagementSNMPConfigurationPrivacyProtocolType priv_protocol;

    private java.lang.String priv_pass_phrase;

    public ManagementSNMPConfigurationUserInformation() {
    }

    public ManagementSNMPConfigurationUserInformation(
           java.lang.String user_name,
           iControl.ManagementSNMPConfigurationAuthType auth_type,
           java.lang.String auth_pass_phrase,
           iControl.ManagementSNMPConfigurationPrivacyProtocolType priv_protocol,
           java.lang.String priv_pass_phrase) {
           this.user_name = user_name;
           this.auth_type = auth_type;
           this.auth_pass_phrase = auth_pass_phrase;
           this.priv_protocol = priv_protocol;
           this.priv_pass_phrase = priv_pass_phrase;
    }


    /**
     * Gets the user_name value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @return user_name
     */
    public java.lang.String getUser_name() {
        return user_name;
    }


    /**
     * Sets the user_name value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @param user_name
     */
    public void setUser_name(java.lang.String user_name) {
        this.user_name = user_name;
    }


    /**
     * Gets the auth_type value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @return auth_type
     */
    public iControl.ManagementSNMPConfigurationAuthType getAuth_type() {
        return auth_type;
    }


    /**
     * Sets the auth_type value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @param auth_type
     */
    public void setAuth_type(iControl.ManagementSNMPConfigurationAuthType auth_type) {
        this.auth_type = auth_type;
    }


    /**
     * Gets the auth_pass_phrase value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @return auth_pass_phrase
     */
    public java.lang.String getAuth_pass_phrase() {
        return auth_pass_phrase;
    }


    /**
     * Sets the auth_pass_phrase value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @param auth_pass_phrase
     */
    public void setAuth_pass_phrase(java.lang.String auth_pass_phrase) {
        this.auth_pass_phrase = auth_pass_phrase;
    }


    /**
     * Gets the priv_protocol value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @return priv_protocol
     */
    public iControl.ManagementSNMPConfigurationPrivacyProtocolType getPriv_protocol() {
        return priv_protocol;
    }


    /**
     * Sets the priv_protocol value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @param priv_protocol
     */
    public void setPriv_protocol(iControl.ManagementSNMPConfigurationPrivacyProtocolType priv_protocol) {
        this.priv_protocol = priv_protocol;
    }


    /**
     * Gets the priv_pass_phrase value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @return priv_pass_phrase
     */
    public java.lang.String getPriv_pass_phrase() {
        return priv_pass_phrase;
    }


    /**
     * Sets the priv_pass_phrase value for this ManagementSNMPConfigurationUserInformation.
     * 
     * @param priv_pass_phrase
     */
    public void setPriv_pass_phrase(java.lang.String priv_pass_phrase) {
        this.priv_pass_phrase = priv_pass_phrase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementSNMPConfigurationUserInformation)) return false;
        ManagementSNMPConfigurationUserInformation other = (ManagementSNMPConfigurationUserInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user_name==null && other.getUser_name()==null) || 
             (this.user_name!=null &&
              this.user_name.equals(other.getUser_name()))) &&
            ((this.auth_type==null && other.getAuth_type()==null) || 
             (this.auth_type!=null &&
              this.auth_type.equals(other.getAuth_type()))) &&
            ((this.auth_pass_phrase==null && other.getAuth_pass_phrase()==null) || 
             (this.auth_pass_phrase!=null &&
              this.auth_pass_phrase.equals(other.getAuth_pass_phrase()))) &&
            ((this.priv_protocol==null && other.getPriv_protocol()==null) || 
             (this.priv_protocol!=null &&
              this.priv_protocol.equals(other.getPriv_protocol()))) &&
            ((this.priv_pass_phrase==null && other.getPriv_pass_phrase()==null) || 
             (this.priv_pass_phrase!=null &&
              this.priv_pass_phrase.equals(other.getPriv_pass_phrase())));
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
        if (getUser_name() != null) {
            _hashCode += getUser_name().hashCode();
        }
        if (getAuth_type() != null) {
            _hashCode += getAuth_type().hashCode();
        }
        if (getAuth_pass_phrase() != null) {
            _hashCode += getAuth_pass_phrase().hashCode();
        }
        if (getPriv_protocol() != null) {
            _hashCode += getPriv_protocol().hashCode();
        }
        if (getPriv_pass_phrase() != null) {
            _hashCode += getPriv_pass_phrase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementSNMPConfigurationUserInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.UserInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auth_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.AuthType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auth_pass_phrase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auth_pass_phrase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priv_protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priv_protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.SNMPConfiguration.PrivacyProtocolType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priv_pass_phrase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priv_pass_phrase"));
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
