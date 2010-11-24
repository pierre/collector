/**
 * LocalLBPoolMemberMemberSessionState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBPoolMemberMemberSessionState  implements java.io.Serializable {
    private iControl.CommonIPPortDefinition member;

    private iControl.CommonEnabledState session_state;

    public LocalLBPoolMemberMemberSessionState() {
    }

    public LocalLBPoolMemberMemberSessionState(
           iControl.CommonIPPortDefinition member,
           iControl.CommonEnabledState session_state) {
           this.member = member;
           this.session_state = session_state;
    }


    /**
     * Gets the member value for this LocalLBPoolMemberMemberSessionState.
     * 
     * @return member
     */
    public iControl.CommonIPPortDefinition getMember() {
        return member;
    }


    /**
     * Sets the member value for this LocalLBPoolMemberMemberSessionState.
     * 
     * @param member
     */
    public void setMember(iControl.CommonIPPortDefinition member) {
        this.member = member;
    }


    /**
     * Gets the session_state value for this LocalLBPoolMemberMemberSessionState.
     * 
     * @return session_state
     */
    public iControl.CommonEnabledState getSession_state() {
        return session_state;
    }


    /**
     * Sets the session_state value for this LocalLBPoolMemberMemberSessionState.
     * 
     * @param session_state
     */
    public void setSession_state(iControl.CommonEnabledState session_state) {
        this.session_state = session_state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBPoolMemberMemberSessionState)) return false;
        LocalLBPoolMemberMemberSessionState other = (LocalLBPoolMemberMemberSessionState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.member==null && other.getMember()==null) || 
             (this.member!=null &&
              this.member.equals(other.getMember()))) &&
            ((this.session_state==null && other.getSession_state()==null) || 
             (this.session_state!=null &&
              this.session_state.equals(other.getSession_state())));
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
        if (getMember() != null) {
            _hashCode += getMember().hashCode();
        }
        if (getSession_state() != null) {
            _hashCode += getSession_state().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBPoolMemberMemberSessionState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberSessionState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "session_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.EnabledState"));
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
