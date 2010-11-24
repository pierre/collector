/**
 * ManagementUserManagementUserInfo2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementUserManagementUserInfo2  implements java.io.Serializable {
    private iControl.ManagementUserManagementUserID user;

    private iControl.ManagementUserManagementUserRole role;

    private iControl.ManagementUserManagementPasswordInfo password;

    private java.lang.String home_directory;

    private java.lang.String login_shell;

    private long user_id;

    private long group_id;

    public ManagementUserManagementUserInfo2() {
    }

    public ManagementUserManagementUserInfo2(
           iControl.ManagementUserManagementUserID user,
           iControl.ManagementUserManagementUserRole role,
           iControl.ManagementUserManagementPasswordInfo password,
           java.lang.String home_directory,
           java.lang.String login_shell,
           long user_id,
           long group_id) {
           this.user = user;
           this.role = role;
           this.password = password;
           this.home_directory = home_directory;
           this.login_shell = login_shell;
           this.user_id = user_id;
           this.group_id = group_id;
    }


    /**
     * Gets the user value for this ManagementUserManagementUserInfo2.
     * 
     * @return user
     */
    public iControl.ManagementUserManagementUserID getUser() {
        return user;
    }


    /**
     * Sets the user value for this ManagementUserManagementUserInfo2.
     * 
     * @param user
     */
    public void setUser(iControl.ManagementUserManagementUserID user) {
        this.user = user;
    }


    /**
     * Gets the role value for this ManagementUserManagementUserInfo2.
     * 
     * @return role
     */
    public iControl.ManagementUserManagementUserRole getRole() {
        return role;
    }


    /**
     * Sets the role value for this ManagementUserManagementUserInfo2.
     * 
     * @param role
     */
    public void setRole(iControl.ManagementUserManagementUserRole role) {
        this.role = role;
    }


    /**
     * Gets the password value for this ManagementUserManagementUserInfo2.
     * 
     * @return password
     */
    public iControl.ManagementUserManagementPasswordInfo getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ManagementUserManagementUserInfo2.
     * 
     * @param password
     */
    public void setPassword(iControl.ManagementUserManagementPasswordInfo password) {
        this.password = password;
    }


    /**
     * Gets the home_directory value for this ManagementUserManagementUserInfo2.
     * 
     * @return home_directory
     */
    public java.lang.String getHome_directory() {
        return home_directory;
    }


    /**
     * Sets the home_directory value for this ManagementUserManagementUserInfo2.
     * 
     * @param home_directory
     */
    public void setHome_directory(java.lang.String home_directory) {
        this.home_directory = home_directory;
    }


    /**
     * Gets the login_shell value for this ManagementUserManagementUserInfo2.
     * 
     * @return login_shell
     */
    public java.lang.String getLogin_shell() {
        return login_shell;
    }


    /**
     * Sets the login_shell value for this ManagementUserManagementUserInfo2.
     * 
     * @param login_shell
     */
    public void setLogin_shell(java.lang.String login_shell) {
        this.login_shell = login_shell;
    }


    /**
     * Gets the user_id value for this ManagementUserManagementUserInfo2.
     * 
     * @return user_id
     */
    public long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this ManagementUserManagementUserInfo2.
     * 
     * @param user_id
     */
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the group_id value for this ManagementUserManagementUserInfo2.
     * 
     * @return group_id
     */
    public long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this ManagementUserManagementUserInfo2.
     * 
     * @param group_id
     */
    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagementUserManagementUserInfo2)) return false;
        ManagementUserManagementUserInfo2 other = (ManagementUserManagementUserInfo2) obj;
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
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.home_directory==null && other.getHome_directory()==null) || 
             (this.home_directory!=null &&
              this.home_directory.equals(other.getHome_directory()))) &&
            ((this.login_shell==null && other.getLogin_shell()==null) || 
             (this.login_shell!=null &&
              this.login_shell.equals(other.getLogin_shell()))) &&
            this.user_id == other.getUser_id() &&
            this.group_id == other.getGroup_id();
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
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getHome_directory() != null) {
            _hashCode += getHome_directory().hashCode();
        }
        if (getLogin_shell() != null) {
            _hashCode += getLogin_shell().hashCode();
        }
        _hashCode += new Long(getUser_id()).hashCode();
        _hashCode += new Long(getGroup_id()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagementUserManagementUserInfo2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserInfo2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.UserRole"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement.PasswordInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home_directory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "home_directory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_shell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login_shell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_id"));
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
