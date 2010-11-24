/**
 * NetworkingVLANMemberEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingVLANMemberEntry  implements java.io.Serializable {
    private java.lang.String member_name;

    private iControl.NetworkingMemberType member_type;

    private iControl.NetworkingMemberTagType tag_state;

    public NetworkingVLANMemberEntry() {
    }

    public NetworkingVLANMemberEntry(
           java.lang.String member_name,
           iControl.NetworkingMemberType member_type,
           iControl.NetworkingMemberTagType tag_state) {
           this.member_name = member_name;
           this.member_type = member_type;
           this.tag_state = tag_state;
    }


    /**
     * Gets the member_name value for this NetworkingVLANMemberEntry.
     * 
     * @return member_name
     */
    public java.lang.String getMember_name() {
        return member_name;
    }


    /**
     * Sets the member_name value for this NetworkingVLANMemberEntry.
     * 
     * @param member_name
     */
    public void setMember_name(java.lang.String member_name) {
        this.member_name = member_name;
    }


    /**
     * Gets the member_type value for this NetworkingVLANMemberEntry.
     * 
     * @return member_type
     */
    public iControl.NetworkingMemberType getMember_type() {
        return member_type;
    }


    /**
     * Sets the member_type value for this NetworkingVLANMemberEntry.
     * 
     * @param member_type
     */
    public void setMember_type(iControl.NetworkingMemberType member_type) {
        this.member_type = member_type;
    }


    /**
     * Gets the tag_state value for this NetworkingVLANMemberEntry.
     * 
     * @return tag_state
     */
    public iControl.NetworkingMemberTagType getTag_state() {
        return tag_state;
    }


    /**
     * Sets the tag_state value for this NetworkingVLANMemberEntry.
     * 
     * @param tag_state
     */
    public void setTag_state(iControl.NetworkingMemberTagType tag_state) {
        this.tag_state = tag_state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkingVLANMemberEntry)) return false;
        NetworkingVLANMemberEntry other = (NetworkingVLANMemberEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.member_name==null && other.getMember_name()==null) || 
             (this.member_name!=null &&
              this.member_name.equals(other.getMember_name()))) &&
            ((this.member_type==null && other.getMember_type()==null) || 
             (this.member_type!=null &&
              this.member_type.equals(other.getMember_type()))) &&
            ((this.tag_state==null && other.getTag_state()==null) || 
             (this.tag_state!=null &&
              this.tag_state.equals(other.getTag_state())));
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
        if (getMember_name() != null) {
            _hashCode += getMember_name().hashCode();
        }
        if (getMember_type() != null) {
            _hashCode += getMember_type().hashCode();
        }
        if (getTag_state() != null) {
            _hashCode += getTag_state().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkingVLANMemberEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.VLAN.MemberEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.MemberType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.MemberTagType"));
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
