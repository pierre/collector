/**
 * ManagementEventSubscriptionEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventSubscriptionEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementEventSubscriptionEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EVENTTYPE_NONE = "EVENTTYPE_NONE";
    public static final java.lang.String _EVENTTYPE_TEST = "EVENTTYPE_TEST";
    public static final java.lang.String _EVENTTYPE_ALL = "EVENTTYPE_ALL";
    public static final java.lang.String _EVENTTYPE_SYSTEM_STARTUP = "EVENTTYPE_SYSTEM_STARTUP";
    public static final java.lang.String _EVENTTYPE_SYSTEM_SHUTDOWN = "EVENTTYPE_SYSTEM_SHUTDOWN";
    public static final java.lang.String _EVENTTYPE_SYSTEM_CONFIG_LOAD = "EVENTTYPE_SYSTEM_CONFIG_LOAD";
    public static final java.lang.String _EVENTTYPE_CREATE = "EVENTTYPE_CREATE";
    public static final java.lang.String _EVENTTYPE_MODIFY = "EVENTTYPE_MODIFY";
    public static final java.lang.String _EVENTTYPE_DELETE = "EVENTTYPE_DELETE";
    public static final java.lang.String _EVENTTYPE_ADMIN_IP = "EVENTTYPE_ADMIN_IP";
    public static final java.lang.String _EVENTTYPE_ARP_ENTRY = "EVENTTYPE_ARP_ENTRY";
    public static final java.lang.String _EVENTTYPE_DAEMON_HA = "EVENTTYPE_DAEMON_HA";
    public static final java.lang.String _EVENTTYPE_DB_VARIABLE = "EVENTTYPE_DB_VARIABLE";
    public static final java.lang.String _EVENTTYPE_FEATURE_FLAGS = "EVENTTYPE_FEATURE_FLAGS";
    public static final java.lang.String _EVENTTYPE_FILTER_PROFILE = "EVENTTYPE_FILTER_PROFILE";
    public static final java.lang.String _EVENTTYPE_GTMD = "EVENTTYPE_GTMD";
    public static final java.lang.String _EVENTTYPE_INTERFACE = "EVENTTYPE_INTERFACE";
    public static final java.lang.String _EVENTTYPE_LCDWARN = "EVENTTYPE_LCDWARN";
    public static final java.lang.String _EVENTTYPE_L2_FORWARD = "EVENTTYPE_L2_FORWARD";
    public static final java.lang.String _EVENTTYPE_MIRROR_PORT_MEMBER = "EVENTTYPE_MIRROR_PORT_MEMBER";
    public static final java.lang.String _EVENTTYPE_MIRROR_PORT = "EVENTTYPE_MIRROR_PORT";
    public static final java.lang.String _EVENTTYPE_MIRROR_VLAN = "EVENTTYPE_MIRROR_VLAN";
    public static final java.lang.String _EVENTTYPE_MONITOR = "EVENTTYPE_MONITOR";
    public static final java.lang.String _EVENTTYPE_NAT = "EVENTTYPE_NAT";
    public static final java.lang.String _EVENTTYPE_NODE_ADDRESS = "EVENTTYPE_NODE_ADDRESS";
    public static final java.lang.String _EVENTTYPE_PACKET_FILTER = "EVENTTYPE_PACKET_FILTER";
    public static final java.lang.String _EVENTTYPE_PCI_DEVICE = "EVENTTYPE_PCI_DEVICE";
    public static final java.lang.String _EVENTTYPE_POOL = "EVENTTYPE_POOL";
    public static final java.lang.String _EVENTTYPE_POOL_MEMBER = "EVENTTYPE_POOL_MEMBER";
    public static final java.lang.String _EVENTTYPE_RATE_FILTER = "EVENTTYPE_RATE_FILTER";
    public static final java.lang.String _EVENTTYPE_ROUTE_MGMT = "EVENTTYPE_ROUTE_MGMT";
    public static final java.lang.String _EVENTTYPE_ROUTE_UPDATE = "EVENTTYPE_ROUTE_UPDATE";
    public static final java.lang.String _EVENTTYPE_RULE = "EVENTTYPE_RULE";
    public static final java.lang.String _EVENTTYPE_SELF_IP = "EVENTTYPE_SELF_IP";
    public static final java.lang.String _EVENTTYPE_SENSOR = "EVENTTYPE_SENSOR";
    public static final java.lang.String _EVENTTYPE_SNAT_ADDRESS = "EVENTTYPE_SNAT_ADDRESS";
    public static final java.lang.String _EVENTTYPE_SNAT_POOL = "EVENTTYPE_SNAT_POOL";
    public static final java.lang.String _EVENTTYPE_SNAT_POOL_MEMBER = "EVENTTYPE_SNAT_POOL_MEMBER";
    public static final java.lang.String _EVENTTYPE_STP = "EVENTTYPE_STP";
    public static final java.lang.String _EVENTTYPE_SWITCH_DOMAIN = "EVENTTYPE_SWITCH_DOMAIN";
    public static final java.lang.String _EVENTTYPE_SWITCH_EDGE = "EVENTTYPE_SWITCH_EDGE";
    public static final java.lang.String _EVENTTYPE_TAMD_AUTH = "EVENTTYPE_TAMD_AUTH";
    public static final java.lang.String _EVENTTYPE_TRUNK = "EVENTTYPE_TRUNK";
    public static final java.lang.String _EVENTTYPE_TRUNK_CONFIG_MEMBER = "EVENTTYPE_TRUNK_CONFIG_MEMBER";
    public static final java.lang.String _EVENTTYPE_TRUNK_WORKING_MEMBER = "EVENTTYPE_TRUNK_WORKING_MEMBER";
    public static final java.lang.String _EVENTTYPE_VALUE_LIST = "EVENTTYPE_VALUE_LIST";
    public static final java.lang.String _EVENTTYPE_VIRTUAL_ADDRESS = "EVENTTYPE_VIRTUAL_ADDRESS";
    public static final java.lang.String _EVENTTYPE_VIRTUAL_SERVER = "EVENTTYPE_VIRTUAL_SERVER";
    public static final java.lang.String _EVENTTYPE_VIRTUAL_SERVER_PROFILE = "EVENTTYPE_VIRTUAL_SERVER_PROFILE";
    public static final java.lang.String _EVENTTYPE_VLAN = "EVENTTYPE_VLAN";
    public static final java.lang.String _EVENTTYPE_VLAN_MEMBER = "EVENTTYPE_VLAN_MEMBER";
    public static final java.lang.String _EVENTTYPE_VLANGROUP = "EVENTTYPE_VLANGROUP";
    public static final ManagementEventSubscriptionEventType EVENTTYPE_NONE = new ManagementEventSubscriptionEventType(_EVENTTYPE_NONE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_TEST = new ManagementEventSubscriptionEventType(_EVENTTYPE_TEST);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_ALL = new ManagementEventSubscriptionEventType(_EVENTTYPE_ALL);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SYSTEM_STARTUP = new ManagementEventSubscriptionEventType(_EVENTTYPE_SYSTEM_STARTUP);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SYSTEM_SHUTDOWN = new ManagementEventSubscriptionEventType(_EVENTTYPE_SYSTEM_SHUTDOWN);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SYSTEM_CONFIG_LOAD = new ManagementEventSubscriptionEventType(_EVENTTYPE_SYSTEM_CONFIG_LOAD);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_CREATE = new ManagementEventSubscriptionEventType(_EVENTTYPE_CREATE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_MODIFY = new ManagementEventSubscriptionEventType(_EVENTTYPE_MODIFY);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_DELETE = new ManagementEventSubscriptionEventType(_EVENTTYPE_DELETE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_ADMIN_IP = new ManagementEventSubscriptionEventType(_EVENTTYPE_ADMIN_IP);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_ARP_ENTRY = new ManagementEventSubscriptionEventType(_EVENTTYPE_ARP_ENTRY);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_DAEMON_HA = new ManagementEventSubscriptionEventType(_EVENTTYPE_DAEMON_HA);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_DB_VARIABLE = new ManagementEventSubscriptionEventType(_EVENTTYPE_DB_VARIABLE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_FEATURE_FLAGS = new ManagementEventSubscriptionEventType(_EVENTTYPE_FEATURE_FLAGS);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_FILTER_PROFILE = new ManagementEventSubscriptionEventType(_EVENTTYPE_FILTER_PROFILE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_GTMD = new ManagementEventSubscriptionEventType(_EVENTTYPE_GTMD);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_INTERFACE = new ManagementEventSubscriptionEventType(_EVENTTYPE_INTERFACE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_LCDWARN = new ManagementEventSubscriptionEventType(_EVENTTYPE_LCDWARN);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_L2_FORWARD = new ManagementEventSubscriptionEventType(_EVENTTYPE_L2_FORWARD);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_MIRROR_PORT_MEMBER = new ManagementEventSubscriptionEventType(_EVENTTYPE_MIRROR_PORT_MEMBER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_MIRROR_PORT = new ManagementEventSubscriptionEventType(_EVENTTYPE_MIRROR_PORT);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_MIRROR_VLAN = new ManagementEventSubscriptionEventType(_EVENTTYPE_MIRROR_VLAN);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_MONITOR = new ManagementEventSubscriptionEventType(_EVENTTYPE_MONITOR);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_NAT = new ManagementEventSubscriptionEventType(_EVENTTYPE_NAT);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_NODE_ADDRESS = new ManagementEventSubscriptionEventType(_EVENTTYPE_NODE_ADDRESS);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_PACKET_FILTER = new ManagementEventSubscriptionEventType(_EVENTTYPE_PACKET_FILTER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_PCI_DEVICE = new ManagementEventSubscriptionEventType(_EVENTTYPE_PCI_DEVICE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_POOL = new ManagementEventSubscriptionEventType(_EVENTTYPE_POOL);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_POOL_MEMBER = new ManagementEventSubscriptionEventType(_EVENTTYPE_POOL_MEMBER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_RATE_FILTER = new ManagementEventSubscriptionEventType(_EVENTTYPE_RATE_FILTER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_ROUTE_MGMT = new ManagementEventSubscriptionEventType(_EVENTTYPE_ROUTE_MGMT);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_ROUTE_UPDATE = new ManagementEventSubscriptionEventType(_EVENTTYPE_ROUTE_UPDATE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_RULE = new ManagementEventSubscriptionEventType(_EVENTTYPE_RULE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SELF_IP = new ManagementEventSubscriptionEventType(_EVENTTYPE_SELF_IP);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SENSOR = new ManagementEventSubscriptionEventType(_EVENTTYPE_SENSOR);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SNAT_ADDRESS = new ManagementEventSubscriptionEventType(_EVENTTYPE_SNAT_ADDRESS);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SNAT_POOL = new ManagementEventSubscriptionEventType(_EVENTTYPE_SNAT_POOL);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SNAT_POOL_MEMBER = new ManagementEventSubscriptionEventType(_EVENTTYPE_SNAT_POOL_MEMBER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_STP = new ManagementEventSubscriptionEventType(_EVENTTYPE_STP);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SWITCH_DOMAIN = new ManagementEventSubscriptionEventType(_EVENTTYPE_SWITCH_DOMAIN);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_SWITCH_EDGE = new ManagementEventSubscriptionEventType(_EVENTTYPE_SWITCH_EDGE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_TAMD_AUTH = new ManagementEventSubscriptionEventType(_EVENTTYPE_TAMD_AUTH);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_TRUNK = new ManagementEventSubscriptionEventType(_EVENTTYPE_TRUNK);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_TRUNK_CONFIG_MEMBER = new ManagementEventSubscriptionEventType(_EVENTTYPE_TRUNK_CONFIG_MEMBER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_TRUNK_WORKING_MEMBER = new ManagementEventSubscriptionEventType(_EVENTTYPE_TRUNK_WORKING_MEMBER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_VALUE_LIST = new ManagementEventSubscriptionEventType(_EVENTTYPE_VALUE_LIST);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_VIRTUAL_ADDRESS = new ManagementEventSubscriptionEventType(_EVENTTYPE_VIRTUAL_ADDRESS);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_VIRTUAL_SERVER = new ManagementEventSubscriptionEventType(_EVENTTYPE_VIRTUAL_SERVER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_VIRTUAL_SERVER_PROFILE = new ManagementEventSubscriptionEventType(_EVENTTYPE_VIRTUAL_SERVER_PROFILE);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_VLAN = new ManagementEventSubscriptionEventType(_EVENTTYPE_VLAN);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_VLAN_MEMBER = new ManagementEventSubscriptionEventType(_EVENTTYPE_VLAN_MEMBER);
    public static final ManagementEventSubscriptionEventType EVENTTYPE_VLANGROUP = new ManagementEventSubscriptionEventType(_EVENTTYPE_VLANGROUP);
    public java.lang.String getValue() { return _value_;}
    public static ManagementEventSubscriptionEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementEventSubscriptionEventType enumeration = (ManagementEventSubscriptionEventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementEventSubscriptionEventType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementEventSubscriptionEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.EventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
