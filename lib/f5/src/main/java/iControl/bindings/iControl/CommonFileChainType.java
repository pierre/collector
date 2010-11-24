/**
 * CommonFileChainType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class CommonFileChainType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CommonFileChainType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FILE_UNDEFINED = "FILE_UNDEFINED";
    public static final java.lang.String _FILE_FIRST = "FILE_FIRST";
    public static final java.lang.String _FILE_MIDDLE = "FILE_MIDDLE";
    public static final java.lang.String _FILE_UNUSED = "FILE_UNUSED";
    public static final java.lang.String _FILE_LAST = "FILE_LAST";
    public static final java.lang.String _FILE_FIRST_AND_LAST = "FILE_FIRST_AND_LAST";
    public static final CommonFileChainType FILE_UNDEFINED = new CommonFileChainType(_FILE_UNDEFINED);
    public static final CommonFileChainType FILE_FIRST = new CommonFileChainType(_FILE_FIRST);
    public static final CommonFileChainType FILE_MIDDLE = new CommonFileChainType(_FILE_MIDDLE);
    public static final CommonFileChainType FILE_UNUSED = new CommonFileChainType(_FILE_UNUSED);
    public static final CommonFileChainType FILE_LAST = new CommonFileChainType(_FILE_LAST);
    public static final CommonFileChainType FILE_FIRST_AND_LAST = new CommonFileChainType(_FILE_FIRST_AND_LAST);
    public java.lang.String getValue() { return _value_;}
    public static CommonFileChainType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CommonFileChainType enumeration = (CommonFileChainType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CommonFileChainType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CommonFileChainType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Common.FileChainType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
