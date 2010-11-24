/**
 * LocalLBRAMCacheInformationRAMCacheEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBRAMCacheInformationRAMCacheEntry  implements java.io.Serializable {
    private java.lang.String profile_name;

    private java.lang.String host_name;

    private java.lang.String uri;

    private iControl.LocalLBRAMCacheInformationRAMCacheVaryType vary_type;

    private long vary_count;

    private long hits;

    private long received;

    private long last_sent;

    private long expiration;

    private long size;

    public LocalLBRAMCacheInformationRAMCacheEntry() {
    }

    public LocalLBRAMCacheInformationRAMCacheEntry(
           java.lang.String profile_name,
           java.lang.String host_name,
           java.lang.String uri,
           iControl.LocalLBRAMCacheInformationRAMCacheVaryType vary_type,
           long vary_count,
           long hits,
           long received,
           long last_sent,
           long expiration,
           long size) {
           this.profile_name = profile_name;
           this.host_name = host_name;
           this.uri = uri;
           this.vary_type = vary_type;
           this.vary_count = vary_count;
           this.hits = hits;
           this.received = received;
           this.last_sent = last_sent;
           this.expiration = expiration;
           this.size = size;
    }


    /**
     * Gets the profile_name value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return profile_name
     */
    public java.lang.String getProfile_name() {
        return profile_name;
    }


    /**
     * Sets the profile_name value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param profile_name
     */
    public void setProfile_name(java.lang.String profile_name) {
        this.profile_name = profile_name;
    }


    /**
     * Gets the host_name value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return host_name
     */
    public java.lang.String getHost_name() {
        return host_name;
    }


    /**
     * Sets the host_name value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param host_name
     */
    public void setHost_name(java.lang.String host_name) {
        this.host_name = host_name;
    }


    /**
     * Gets the uri value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the vary_type value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return vary_type
     */
    public iControl.LocalLBRAMCacheInformationRAMCacheVaryType getVary_type() {
        return vary_type;
    }


    /**
     * Sets the vary_type value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param vary_type
     */
    public void setVary_type(iControl.LocalLBRAMCacheInformationRAMCacheVaryType vary_type) {
        this.vary_type = vary_type;
    }


    /**
     * Gets the vary_count value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return vary_count
     */
    public long getVary_count() {
        return vary_count;
    }


    /**
     * Sets the vary_count value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param vary_count
     */
    public void setVary_count(long vary_count) {
        this.vary_count = vary_count;
    }


    /**
     * Gets the hits value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return hits
     */
    public long getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param hits
     */
    public void setHits(long hits) {
        this.hits = hits;
    }


    /**
     * Gets the received value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return received
     */
    public long getReceived() {
        return received;
    }


    /**
     * Sets the received value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param received
     */
    public void setReceived(long received) {
        this.received = received;
    }


    /**
     * Gets the last_sent value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return last_sent
     */
    public long getLast_sent() {
        return last_sent;
    }


    /**
     * Sets the last_sent value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param last_sent
     */
    public void setLast_sent(long last_sent) {
        this.last_sent = last_sent;
    }


    /**
     * Gets the expiration value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return expiration
     */
    public long getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param expiration
     */
    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the size value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this LocalLBRAMCacheInformationRAMCacheEntry.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBRAMCacheInformationRAMCacheEntry)) return false;
        LocalLBRAMCacheInformationRAMCacheEntry other = (LocalLBRAMCacheInformationRAMCacheEntry) obj;
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
            ((this.vary_type==null && other.getVary_type()==null) || 
             (this.vary_type!=null &&
              this.vary_type.equals(other.getVary_type()))) &&
            this.vary_count == other.getVary_count() &&
            this.hits == other.getHits() &&
            this.received == other.getReceived() &&
            this.last_sent == other.getLast_sent() &&
            this.expiration == other.getExpiration() &&
            this.size == other.getSize();
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
        if (getVary_type() != null) {
            _hashCode += getVary_type().hashCode();
        }
        _hashCode += new Long(getVary_count()).hashCode();
        _hashCode += new Long(getHits()).hashCode();
        _hashCode += new Long(getReceived()).hashCode();
        _hashCode += new Long(getLast_sent()).hashCode();
        _hashCode += new Long(getExpiration()).hashCode();
        _hashCode += new Long(getSize()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBRAMCacheInformationRAMCacheEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RAMCacheInformation.RAMCacheEntry"));
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
        elemField.setFieldName("vary_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vary_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RAMCacheInformation.RAMCacheVaryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vary_count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vary_count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("received");
        elemField.setXmlName(new javax.xml.namespace.QName("", "received"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_sent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_sent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
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
