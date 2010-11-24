/**
 * LocalLBPoolMemberMemberMonitorInstanceState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBPoolMemberMemberMonitorInstanceState  implements java.io.Serializable {
    private iControl.CommonIPPortDefinition member;

    private iControl.LocalLBMonitorInstanceState[] monitor_instances;

    public LocalLBPoolMemberMemberMonitorInstanceState() {
    }

    public LocalLBPoolMemberMemberMonitorInstanceState(
           iControl.CommonIPPortDefinition member,
           iControl.LocalLBMonitorInstanceState[] monitor_instances) {
           this.member = member;
           this.monitor_instances = monitor_instances;
    }


    /**
     * Gets the member value for this LocalLBPoolMemberMemberMonitorInstanceState.
     * 
     * @return member
     */
    public iControl.CommonIPPortDefinition getMember() {
        return member;
    }


    /**
     * Sets the member value for this LocalLBPoolMemberMemberMonitorInstanceState.
     * 
     * @param member
     */
    public void setMember(iControl.CommonIPPortDefinition member) {
        this.member = member;
    }


    /**
     * Gets the monitor_instances value for this LocalLBPoolMemberMemberMonitorInstanceState.
     * 
     * @return monitor_instances
     */
    public iControl.LocalLBMonitorInstanceState[] getMonitor_instances() {
        return monitor_instances;
    }


    /**
     * Sets the monitor_instances value for this LocalLBPoolMemberMemberMonitorInstanceState.
     * 
     * @param monitor_instances
     */
    public void setMonitor_instances(iControl.LocalLBMonitorInstanceState[] monitor_instances) {
        this.monitor_instances = monitor_instances;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalLBPoolMemberMemberMonitorInstanceState)) return false;
        LocalLBPoolMemberMemberMonitorInstanceState other = (LocalLBPoolMemberMemberMonitorInstanceState) obj;
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
            ((this.monitor_instances==null && other.getMonitor_instances()==null) || 
             (this.monitor_instances!=null &&
              java.util.Arrays.equals(this.monitor_instances, other.getMonitor_instances())));
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
        if (getMonitor_instances() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitor_instances());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitor_instances(), i);
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
        new org.apache.axis.description.TypeDesc(LocalLBPoolMemberMemberMonitorInstanceState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember.MemberMonitorInstanceState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.IPPortDefinition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitor_instances");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitor_instances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "LocalLB.MonitorInstanceState"));
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
