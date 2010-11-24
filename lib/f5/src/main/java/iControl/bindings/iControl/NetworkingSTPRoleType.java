/**
 * NetworkingSTPRoleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingSTPRoleType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingSTPRoleType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _STP_ROLE_TYPE_DISABLE = "STP_ROLE_TYPE_DISABLE";
    public static final java.lang.String _STP_ROLE_TYPE_ROOT = "STP_ROLE_TYPE_ROOT";
    public static final java.lang.String _STP_ROLE_TYPE_DESIGNATE = "STP_ROLE_TYPE_DESIGNATE";
    public static final java.lang.String _STP_ROLE_TYPE_ALTERNATE = "STP_ROLE_TYPE_ALTERNATE";
    public static final java.lang.String _STP_ROLE_TYPE_BACKUP = "STP_ROLE_TYPE_BACKUP";
    public static final java.lang.String _STP_ROLE_TYPE_MASTER = "STP_ROLE_TYPE_MASTER";
    public static final NetworkingSTPRoleType STP_ROLE_TYPE_DISABLE = new NetworkingSTPRoleType(_STP_ROLE_TYPE_DISABLE);
    public static final NetworkingSTPRoleType STP_ROLE_TYPE_ROOT = new NetworkingSTPRoleType(_STP_ROLE_TYPE_ROOT);
    public static final NetworkingSTPRoleType STP_ROLE_TYPE_DESIGNATE = new NetworkingSTPRoleType(_STP_ROLE_TYPE_DESIGNATE);
    public static final NetworkingSTPRoleType STP_ROLE_TYPE_ALTERNATE = new NetworkingSTPRoleType(_STP_ROLE_TYPE_ALTERNATE);
    public static final NetworkingSTPRoleType STP_ROLE_TYPE_BACKUP = new NetworkingSTPRoleType(_STP_ROLE_TYPE_BACKUP);
    public static final NetworkingSTPRoleType STP_ROLE_TYPE_MASTER = new NetworkingSTPRoleType(_STP_ROLE_TYPE_MASTER);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingSTPRoleType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingSTPRoleType enumeration = (NetworkingSTPRoleType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingSTPRoleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingSTPRoleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.STPRoleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
