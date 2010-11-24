/**
 * ManagementUserManagementUserInfo3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementUserManagementUserInfo3  implements java.io.Serializable {
    private iControl.ManagementUserManagementUserID user;

    private iControl.ManagementUserManagementPasswordInfo password;

    private iControl.ManagementUserManagementUserPermission[] permissions;

    private java.lang.String login_shell;

    public ManagementUserManagementUserInfo3() {
    }

    public ManagementUserManagementUserInfo3(
           iControl.ManagementUserManagementUserID user,
           iControl.ManagementUserManagementPasswordInfo password,
           iControl.ManagementUserManagementUserPermission[] permissions,
           java.lang.String login_shell) {
           this.user = user;
           this.password = password;
           this.permissions = permissions;
           this.login_shell = login_shell;
    }


    /**
     * Gets the user value for this ManagementUserManagementUserInfo3.
     * 
     * @return user
     */
    public iControl.ManagementUserManagementUserID getUser() {
        return user;
    }


    /**
     * Sets the user value for this ManagementUserManagementUserInfo3.
     * 
     * @param user
     */
    public void setUser(iControl.ManagementUserManagementUserID user) {
        this.user = user;
    }


    /**
     * Gets the password value for this ManagementUserManagementUserInfo3.
     * 
     * @return password
     */
    public iControl.ManagementUserManagementPasswordInfo getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ManagementUserManagementUserInfo3.
     * 
     * @param password
     */
    public void setPassword(iControl.ManagementUserManagementPasswordInfo password) {
        this.password = password;
    }


    /**
     * Gets the permissions value for this ManagementUserManagementUserInfo3.
     * 
     * @return permissions
     */
    public iControl.ManagementUserManagementUserPermission[] getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this ManagementUserManagementUserInfo3.
     * 
     * @param permissions
     */
    public void setPermissions(iControl.ManagementUserManagementUserPermission[] permissions) {
        this.permissions = permissions;
    }


    /**
     * Gets the login_shell value for this ManagementUserManagementUserInfo3.
     * 
     * @return login_shell
     */
    public java.lang.String getLogin_shell() {
        return login_shell;
    }


    /**
     * Sets the login_shell value for this ManagementUserManagementUserInfo3.
     * 
     * @param login_shell
     */
    public void setLogin_shell(java.lang.String login_shell) {
        this.login_shell = login_shell;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementUserManagementUserInfo3)) return false;
        ManagementUserManagementUserInfo3 other = (ManagementUserManagementUserInfo3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              java.util.Arrays.equals(this.permissions, other.getPermissions()))) &&
            ((this.login_shell==null && other.getLogin_shell()==null) || 
             (this.login_shell!=null &&
              this.login_shell.equals(other.getLogin_shell())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogin_shell() != null) {
            _hashCode += getLogin_shell().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementUserManagementUserInfo3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserInfo3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.PasswordInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserPermission"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_shell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login_shell"));
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
