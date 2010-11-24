/**
 * LocalLBPoolMemberMemberMonitorState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBPoolMemberMemberMonitorState  implements java.io.Serializable {
    private iControl.CommonIPPortDefinition member;

    private iControl.CommonEnabledState monitor_state;

    public LocalLBPoolMemberMemberMonitorState() {
    }

    public LocalLBPoolMemberMemberMonitorState(
           iControl.CommonIPPortDefinition member,
           iControl.CommonEnabledState monitor_state) {
           this.member = member;
           this.monitor_state = monitor_state;
    }


    /**
     * Gets the member value for this LocalLBPoolMemberMemberMonitorState.
     * 
     * @return member
     */
    public iControl.CommonIPPortDefinition getMember() {
        return member;
    }


    /**
     * Sets the member value for this LocalLBPoolMemberMemberMonitorState.
     * 
     * @param member
     */
    public void setMember(iControl.CommonIPPortDefinition member) {
        this.member = member;
    }


    /**
     * Gets the monitor_state value for this LocalLBPoolMemberMemberMonitorState.
     * 
     * @return monitor_state
     */
    public iControl.CommonEnabledState getMonitor_state() {
        return monitor_state;
    }


    /**
     * Sets the monitor_state value for this LocalLBPoolMemberMemberMonitorState.
     * 
     * @param monitor_state
     */
    public void setMonitor_state(iControl.CommonEnabledState monitor_state) {
        this.monitor_state = monitor_state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBPoolMemberMemberMonitorState)) return false;
        LocalLBPoolMemberMemberMonitorState other = (LocalLBPoolMemberMemberMonitorState) obj;
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
            ((this.monitor_state==null && other.getMonitor_state()==null) || 
             (this.monitor_state!=null &&
              this.monitor_state.equals(other.getMonitor_state())));
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
        if (getMonitor_state() != null) {
            _hashCode += getMonitor_state().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalLBPoolMemberMemberMonitorState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitor_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitor_state"));
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
