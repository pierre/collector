/**
 * NetworkingFilterAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingFilterAction implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingFilterAction(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FILTER_ACTION_NONE = "FILTER_ACTION_NONE";
    public static final java.lang.String _FILTER_ACTION_ACCEPT = "FILTER_ACTION_ACCEPT";
    public static final java.lang.String _FILTER_ACTION_DISCARD = "FILTER_ACTION_DISCARD";
    public static final java.lang.String _FILTER_ACTION_REJECT = "FILTER_ACTION_REJECT";
    public static final java.lang.String _FILTER_ACTION_CONTINUE = "FILTER_ACTION_CONTINUE";
    public static final NetworkingFilterAction FILTER_ACTION_NONE = new NetworkingFilterAction(_FILTER_ACTION_NONE);
    public static final NetworkingFilterAction FILTER_ACTION_ACCEPT = new NetworkingFilterAction(_FILTER_ACTION_ACCEPT);
    public static final NetworkingFilterAction FILTER_ACTION_DISCARD = new NetworkingFilterAction(_FILTER_ACTION_DISCARD);
    public static final NetworkingFilterAction FILTER_ACTION_REJECT = new NetworkingFilterAction(_FILTER_ACTION_REJECT);
    public static final NetworkingFilterAction FILTER_ACTION_CONTINUE = new NetworkingFilterAction(_FILTER_ACTION_CONTINUE);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingFilterAction fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingFilterAction enumeration = (NetworkingFilterAction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingFilterAction fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingFilterAction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.FilterAction"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
