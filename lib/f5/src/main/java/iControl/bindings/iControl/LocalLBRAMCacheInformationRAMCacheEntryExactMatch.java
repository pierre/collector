/**
 * LocalLBRAMCacheInformationRAMCacheEntryExactMatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBRAMCacheInformationRAMCacheEntryExactMatch  implements java.io.Serializable {
    private java.lang.String profile_name;

    private java.lang.String host_name;

    private java.lang.String uri;

    private java.lang.String vary_useragent;

    private java.lang.String vary_encoding;

    private long hits;

    private long received;

    private long last_sent;

    private long expiration;

    private long size;

    public LocalLBRAMCacheInformationRAMCacheEntryExactMatch() {
    }

    public LocalLBRAMCacheInformationRAMCacheEntryExactMatch(
           java.lang.String profile_name,
           java.lang.String host_name,
           java.lang.String uri,
           java.lang.String vary_useragent,
           java.lang.String vary_encoding,
           long hits,
           long received,
           long last_sent,
           long expiration,
           long size) {
           this.profile_name = profile_name;
           this.host_name = host_name;
           this.uri = uri;
           this.vary_useragent = vary_useragent;
           this.vary_encoding = vary_encoding;
           this.hits = hits;
           this.received = received;
           this.last_sent = last_sent;
           this.expiration = expiration;
           this.size = size;
    }


    /**
     * Gets the profile_name value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return profile_name
     */
    public java.lang.String getProfile_name() {
        return profile_name;
    }


    /**
     * Sets the profile_name value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param profile_name
     */
    public void setProfile_name(java.lang.String profile_name) {
        this.profile_name = profile_name;
    }


    /**
     * Gets the host_name value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return host_name
     */
    public java.lang.String getHost_name() {
        return host_name;
    }


    /**
     * Sets the host_name value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param host_name
     */
    public void setHost_name(java.lang.String host_name) {
        this.host_name = host_name;
    }


    /**
     * Gets the uri value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the vary_useragent value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return vary_useragent
     */
    public java.lang.String getVary_useragent() {
        return vary_useragent;
    }


    /**
     * Sets the vary_useragent value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param vary_useragent
     */
    public void setVary_useragent(java.lang.String vary_useragent) {
        this.vary_useragent = vary_useragent;
    }


    /**
     * Gets the vary_encoding value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return vary_encoding
     */
    public java.lang.String getVary_encoding() {
        return vary_encoding;
    }


    /**
     * Sets the vary_encoding value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param vary_encoding
     */
    public void setVary_encoding(java.lang.String vary_encoding) {
        this.vary_encoding = vary_encoding;
    }


    /**
     * Gets the hits value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return hits
     */
    public long getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param hits
     */
    public void setHits(long hits) {
        this.hits = hits;
    }


    /**
     * Gets the received value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return received
     */
    public long getReceived() {
        return received;
    }


    /**
     * Sets the received value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param received
     */
    public void setReceived(long received) {
        this.received = received;
    }


    /**
     * Gets the last_sent value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return last_sent
     */
    public long getLast_sent() {
        return last_sent;
    }


    /**
     * Sets the last_sent value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param last_sent
     */
    public void setLast_sent(long last_sent) {
        this.last_sent = last_sent;
    }


    /**
     * Gets the expiration value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return expiration
     */
    public long getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param expiration
     */
    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the size value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this LocalLBRAMCacheInformationRAMCacheEntryExactMatch.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBRAMCacheInformationRAMCacheEntryExactMatch)) return false;
        LocalLBRAMCacheInformationRAMCacheEntryExactMatch other = (LocalLBRAMCacheInformationRAMCacheEntryExactMatch) obj;
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
            ((this.vary_useragent==null && other.getVary_useragent()==null) || 
             (this.vary_useragent!=null &&
              this.vary_useragent.equals(other.getVary_useragent()))) &&
            ((this.vary_encoding==null && other.getVary_encoding()==null) || 
             (this.vary_encoding!=null &&
              this.vary_encoding.equals(other.getVary_encoding()))) &&
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
        if (getVary_useragent() != null) {
            _hashCode += getVary_useragent().hashCode();
        }
        if (getVary_encoding() != null) {
            _hashCode += getVary_encoding().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(LocalLBRAMCacheInformationRAMCacheEntryExactMatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RAMCacheInformation.RAMCacheEntryExactMatch"));
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
        elemField.setFieldName("vary_useragent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vary_useragent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vary_encoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vary_encoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
