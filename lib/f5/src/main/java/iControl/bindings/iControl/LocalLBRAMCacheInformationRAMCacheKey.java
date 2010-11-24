/**
 * LocalLBRAMCacheInformationRAMCacheKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBRAMCacheInformationRAMCacheKey  implements java.io.Serializable {
    private java.lang.String profile_name;

    private java.lang.String host_name;

    private java.lang.String uri;

    private long maximum_responses;

    public LocalLBRAMCacheInformationRAMCacheKey() {
    }

    public LocalLBRAMCacheInformationRAMCacheKey(
           java.lang.String profile_name,
           java.lang.String host_name,
           java.lang.String uri,
           long maximum_responses) {
           this.profile_name = profile_name;
           this.host_name = host_name;
           this.uri = uri;
           this.maximum_responses = maximum_responses;
    }


    /**
     * Gets the profile_name value for this LocalLBRAMCacheInformationRAMCacheKey.
     * 
     * @return profile_name
     */
    public java.lang.String getProfile_name() {
        return profile_name;
    }


    /**
     * Sets the profile_name value for this LocalLBRAMCacheInformationRAMCacheKey.
     * 
     * @param profile_name
     */
    public void setProfile_name(java.lang.String profile_name) {
        this.profile_name = profile_name;
    }


    /**
     * Gets the host_name value for this LocalLBRAMCacheInformationRAMCacheKey.
     * 
     * @return host_name
     */
    public java.lang.String getHost_name() {
        return host_name;
    }


    /**
     * Sets the host_name value for this LocalLBRAMCacheInformationRAMCacheKey.
     * 
     * @param host_name
     */
    public void setHost_name(java.lang.String host_name) {
        this.host_name = host_name;
    }


    /**
     * Gets the uri value for this LocalLBRAMCacheInformationRAMCacheKey.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this LocalLBRAMCacheInformationRAMCacheKey.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the maximum_responses value for this LocalLBRAMCacheInformationRAMCacheKey.
     * 
     * @return maximum_responses
     */
    public long getMaximum_responses() {
        return maximum_responses;
    }


    /**
     * Sets the maximum_responses value for this LocalLBRAMCacheInformationRAMCacheKey.
     * 
     * @param maximum_responses
     */
    public void setMaximum_responses(long maximum_responses) {
        this.maximum_responses = maximum_responses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBRAMCacheInformationRAMCacheKey)) return false;
        LocalLBRAMCacheInformationRAMCacheKey other = (LocalLBRAMCacheInformationRAMCacheKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profile_name==null && other.getProfile_name()==null) || 
             (this.profile_name!=null &&
              this.profile_name.equals(other.getProfile_name()))) &&
            ((this.host_name==null && other.getHost_name()==null) || 
             (this.host_name!=null &&
              this.host_name.equals(other.getHost_name()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            this.maximum_responses == other.getMaximum_responses();
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
        if (getProfile_name() != null) {
            _hashCode += getProfile_name().hashCode();
        }
        if (getHost_name() != null) {
            _hashCode += getHost_name().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        _hashCode += new Long(getMaximum_responses()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBRAMCacheInformationRAMCacheKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RAMCacheInformation.RAMCacheKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profile_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "host_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum_responses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximum_responses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
