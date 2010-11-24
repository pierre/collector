/**
 * ManagementUserManagementUserRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementUserManagementUserRole implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementUserManagementUserRole(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _USER_ROLE_ADMINISTRATOR = "USER_ROLE_ADMINISTRATOR";
    public static final java.lang.String _USER_ROLE_TRAFFIC_MANAGER = "USER_ROLE_TRAFFIC_MANAGER";
    public static final java.lang.String _USER_ROLE_GUEST = "USER_ROLE_GUEST";
    public static final java.lang.String _USER_ROLE_ASM_POLICY_EDITOR = "USER_ROLE_ASM_POLICY_EDITOR";
    public static final java.lang.String _USER_ROLE_INVALID = "USER_ROLE_INVALID";
    public static final java.lang.String _USER_ROLE_MANAGER = "USER_ROLE_MANAGER";
    public static final java.lang.String _USER_ROLE_EDITOR = "USER_ROLE_EDITOR";
    public static final java.lang.String _USER_ROLE_APPLICATION_EDITOR = "USER_ROLE_APPLICATION_EDITOR";
    public static final java.lang.String _USER_ROLE_CERTIFICATE_MANAGER = "USER_ROLE_CERTIFICATE_MANAGER";
    public static final java.lang.String _USER_ROLE_USER_MANAGER = "USER_ROLE_USER_MANAGER";
    public static final java.lang.String _USER_ROLE_RESOURCE_ADMINISTRATOR = "USER_ROLE_RESOURCE_ADMINISTRATOR";
    public static final java.lang.String _USER_ROLE_ASM_EDITOR = "USER_ROLE_ASM_EDITOR";
    public static final ManagementUserManagementUserRole USER_ROLE_ADMINISTRATOR = new ManagementUserManagementUserRole(_USER_ROLE_ADMINISTRATOR);
    public static final ManagementUserManagementUserRole USER_ROLE_TRAFFIC_MANAGER = new ManagementUserManagementUserRole(_USER_ROLE_TRAFFIC_MANAGER);
    public static final ManagementUserManagementUserRole USER_ROLE_GUEST = new ManagementUserManagementUserRole(_USER_ROLE_GUEST);
    public static final ManagementUserManagementUserRole USER_ROLE_ASM_POLICY_EDITOR = new ManagementUserManagementUserRole(_USER_ROLE_ASM_POLICY_EDITOR);
    public static final ManagementUserManagementUserRole USER_ROLE_INVALID = new ManagementUserManagementUserRole(_USER_ROLE_INVALID);
    public static final ManagementUserManagementUserRole USER_ROLE_MANAGER = new ManagementUserManagementUserRole(_USER_ROLE_MANAGER);
    public static final ManagementUserManagementUserRole USER_ROLE_EDITOR = new ManagementUserManagementUserRole(_USER_ROLE_EDITOR);
    public static final ManagementUserManagementUserRole USER_ROLE_APPLICATION_EDITOR = new ManagementUserManagementUserRole(_USER_ROLE_APPLICATION_EDITOR);
    public static final ManagementUserManagementUserRole USER_ROLE_CERTIFICATE_MANAGER = new ManagementUserManagementUserRole(_USER_ROLE_CERTIFICATE_MANAGER);
    public static final ManagementUserManagementUserRole USER_ROLE_USER_MANAGER = new ManagementUserManagementUserRole(_USER_ROLE_USER_MANAGER);
    public static final ManagementUserManagementUserRole USER_ROLE_RESOURCE_ADMINISTRATOR = new ManagementUserManagementUserRole(_USER_ROLE_RESOURCE_ADMINISTRATOR);
    public static final ManagementUserManagementUserRole USER_ROLE_ASM_EDITOR = new ManagementUserManagementUserRole(_USER_ROLE_ASM_EDITOR);
    public java.lang.String getValue() { return _value_;}
    public static ManagementUserManagementUserRole fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementUserManagementUserRole enumeration = (ManagementUserManagementUserRole)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementUserManagementUserRole fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementUserManagementUserRole.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserRole"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
