/**
 * SystemDiskRAIDStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemDiskRAIDStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemDiskRAIDStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RAID_STATUS_UNDEFINED = "RAID_STATUS_UNDEFINED";
    public static final java.lang.String _RAID_STATUS_SYNCHRONIZED = "RAID_STATUS_SYNCHRONIZED";
    public static final java.lang.String _RAID_STATUS_REPLICATING = "RAID_STATUS_REPLICATING";
    public static final java.lang.String _RAID_STATUS_MISSING = "RAID_STATUS_MISSING";
    public static final java.lang.String _RAID_STATUS_FAILED = "RAID_STATUS_FAILED";
    public static final SystemDiskRAIDStatus RAID_STATUS_UNDEFINED = new SystemDiskRAIDStatus(_RAID_STATUS_UNDEFINED);
    public static final SystemDiskRAIDStatus RAID_STATUS_SYNCHRONIZED = new SystemDiskRAIDStatus(_RAID_STATUS_SYNCHRONIZED);
    public static final SystemDiskRAIDStatus RAID_STATUS_REPLICATING = new SystemDiskRAIDStatus(_RAID_STATUS_REPLICATING);
    public static final SystemDiskRAIDStatus RAID_STATUS_MISSING = new SystemDiskRAIDStatus(_RAID_STATUS_MISSING);
    public static final SystemDiskRAIDStatus RAID_STATUS_FAILED = new SystemDiskRAIDStatus(_RAID_STATUS_FAILED);
    public java.lang.String getValue() { return _value_;}
    public static SystemDiskRAIDStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemDiskRAIDStatus enumeration = (SystemDiskRAIDStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemDiskRAIDStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemDiskRAIDStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "System.Disk.RAIDStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
