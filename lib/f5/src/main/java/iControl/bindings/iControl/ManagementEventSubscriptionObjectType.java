/**
 * ManagementEventSubscriptionObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventSubscriptionObjectType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ManagementEventSubscriptionObjectType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OBJECTTYPE_UNKNOWN = "OBJECTTYPE_UNKNOWN";
    public static final java.lang.String _OBJECTTYPE_ADMIN_IP = "OBJECTTYPE_ADMIN_IP";
    public static final java.lang.String _OBJECTTYPE_ARP_STATIC_ENTRY = "OBJECTTYPE_ARP_STATIC_ENTRY";
    public static final java.lang.String _OBJECTTYPE_AUTH_GENERIC_CONFIG = "OBJECTTYPE_AUTH_GENERIC_CONFIG";
    public static final java.lang.String _OBJECTTYPE_AUTH_LDAP_CONFIG = "OBJECTTYPE_AUTH_LDAP_CONFIG";
    public static final java.lang.String _OBJECTTYPE_AUTH_RADIUS_CONFIG = "OBJECTTYPE_AUTH_RADIUS_CONFIG";
    public static final java.lang.String _OBJECTTYPE_AUTH_RADIUS_CONFIG_RADIUS_SERVER = "OBJECTTYPE_AUTH_RADIUS_CONFIG_RADIUS_SERVER";
    public static final java.lang.String _OBJECTTYPE_AUTH_SSL_CC_LDAP_CONFIG = "OBJECTTYPE_AUTH_SSL_CC_LDAP_CONFIG";
    public static final java.lang.String _OBJECTTYPE_AUTH_SSL_OCSP_CONFIG = "OBJECTTYPE_AUTH_SSL_OCSP_CONFIG";
    public static final java.lang.String _OBJECTTYPE_AUTH_TACACS_CONFIG = "OBJECTTYPE_AUTH_TACACS_CONFIG";
    public static final java.lang.String _OBJECTTYPE_DAEMON_HA = "OBJECTTYPE_DAEMON_HA";
    public static final java.lang.String _OBJECTTYPE_DAEMON_STATUS = "OBJECTTYPE_DAEMON_STATUS";
    public static final java.lang.String _OBJECTTYPE_DB_VARIABLE = "OBJECTTYPE_DB_VARIABLE";
    public static final java.lang.String _OBJECTTYPE_DEFAULT_MONITOR_RULE = "OBJECTTYPE_DEFAULT_MONITOR_RULE";
    public static final java.lang.String _OBJECTTYPE_GTM_BOX = "OBJECTTYPE_GTM_BOX";
    public static final java.lang.String _OBJECTTYPE_GTM_DC = "OBJECTTYPE_GTM_DC";
    public static final java.lang.String _OBJECTTYPE_GTM_ECV = "OBJECTTYPE_GTM_ECV";
    public static final java.lang.String _OBJECTTYPE_GTM_GLOBALS = "OBJECTTYPE_GTM_GLOBALS";
    public static final java.lang.String _OBJECTTYPE_GTM_IP = "OBJECTTYPE_GTM_IP";
    public static final java.lang.String _OBJECTTYPE_GTM_LINK = "OBJECTTYPE_GTM_LINK";
    public static final java.lang.String _OBJECTTYPE_GTM_POOL = "OBJECTTYPE_GTM_POOL";
    public static final java.lang.String _OBJECTTYPE_GTM_POOL_MEMBER = "OBJECTTYPE_GTM_POOL_MEMBER";
    public static final java.lang.String _OBJECTTYPE_GTM_QOS_COEFF = "OBJECTTYPE_GTM_QOS_COEFF";
    public static final java.lang.String _OBJECTTYPE_GTM_REG_ITEM = "OBJECTTYPE_GTM_REG_ITEM";
    public static final java.lang.String _OBJECTTYPE_GTM_REGION_ENTRY = "OBJECTTYPE_GTM_REGION_ENTRY";
    public static final java.lang.String _OBJECTTYPE_GTM_SERVER = "OBJECTTYPE_GTM_SERVER";
    public static final java.lang.String _OBJECTTYPE_GTM_TOP_ITEM = "OBJECTTYPE_GTM_TOP_ITEM";
    public static final java.lang.String _OBJECTTYPE_GTM_VS = "OBJECTTYPE_GTM_VS";
    public static final java.lang.String _OBJECTTYPE_GTM_WIDEIP = "OBJECTTYPE_GTM_WIDEIP";
    public static final java.lang.String _OBJECTTYPE_GTM_WIDEIP_ALIAS = "OBJECTTYPE_GTM_WIDEIP_ALIAS";
    public static final java.lang.String _OBJECTTYPE_GTM_WIDEIP_POOL = "OBJECTTYPE_GTM_WIDEIP_POOL";
    public static final java.lang.String _OBJECTTYPE_INTERFACE = "OBJECTTYPE_INTERFACE";
    public static final java.lang.String _OBJECTTYPE_JOIN_AUTH_SSL_OCSP_CONFIG_OCSP_RESPONDER = "OBJECTTYPE_JOIN_AUTH_SSL_OCSP_CONFIG_OCSP_RESPONDER";
    public static final java.lang.String _OBJECTTYPE_L2_FORWARD = "OBJECTTYPE_L2_FORWARD";
    public static final java.lang.String _OBJECTTYPE_LICENSE_BLOB = "OBJECTTYPE_LICENSE_BLOB";
    public static final java.lang.String _OBJECTTYPE_MIRROR_PORT = "OBJECTTYPE_MIRROR_PORT";
    public static final java.lang.String _OBJECTTYPE_MIRROR_PORT_MBR = "OBJECTTYPE_MIRROR_PORT_MBR";
    public static final java.lang.String _OBJECTTYPE_MIRROR_VLAN = "OBJECTTYPE_MIRROR_VLAN";
    public static final java.lang.String _OBJECTTYPE_MONITOR = "OBJECTTYPE_MONITOR";
    public static final java.lang.String _OBJECTTYPE_MONITOR_INSTANCE = "OBJECTTYPE_MONITOR_INSTANCE";
    public static final java.lang.String _OBJECTTYPE_MONITOR_PARAM = "OBJECTTYPE_MONITOR_PARAM";
    public static final java.lang.String _OBJECTTYPE_MONITOR_RULE = "OBJECTTYPE_MONITOR_RULE";
    public static final java.lang.String _OBJECTTYPE_MONITOR_RULE_INSTANCE = "OBJECTTYPE_MONITOR_RULE_INSTANCE";
    public static final java.lang.String _OBJECTTYPE_NAT = "OBJECTTYPE_NAT";
    public static final java.lang.String _OBJECTTYPE_NAT_VLAN = "OBJECTTYPE_NAT_VLAN";
    public static final java.lang.String _OBJECTTYPE_NODE_ADDRESS = "OBJECTTYPE_NODE_ADDRESS";
    public static final java.lang.String _OBJECTTYPE_NOKIA_ALARM = "OBJECTTYPE_NOKIA_ALARM";
    public static final java.lang.String _OBJECTTYPE_NOKIA_LOG = "OBJECTTYPE_NOKIA_LOG";
    public static final java.lang.String _OBJECTTYPE_OCSP_RESPONDER = "OBJECTTYPE_OCSP_RESPONDER";
    public static final java.lang.String _OBJECTTYPE_PACKET_FILTER_ALLOW_TRUSTED = "OBJECTTYPE_PACKET_FILTER_ALLOW_TRUSTED";
    public static final java.lang.String _OBJECTTYPE_PACKET_FILTER_RULE = "OBJECTTYPE_PACKET_FILTER_RULE";
    public static final java.lang.String _OBJECTTYPE_PAM_LINE = "OBJECTTYPE_PAM_LINE";
    public static final java.lang.String _OBJECTTYPE_PCI_DEVICE = "OBJECTTYPE_PCI_DEVICE";
    public static final java.lang.String _OBJECTTYPE_PLATFORM = "OBJECTTYPE_PLATFORM";
    public static final java.lang.String _OBJECTTYPE_POOL = "OBJECTTYPE_POOL";
    public static final java.lang.String _OBJECTTYPE_POOL_MEMBER = "OBJECTTYPE_POOL_MEMBER";
    public static final java.lang.String _OBJECTTYPE_PROFILE_AUTH = "OBJECTTYPE_PROFILE_AUTH";
    public static final java.lang.String _OBJECTTYPE_PROFILE_BIGPROTO = "OBJECTTYPE_PROFILE_BIGPROTO";
    public static final java.lang.String _OBJECTTYPE_PROFILE_CLIENTSSL = "OBJECTTYPE_PROFILE_CLIENTSSL";
    public static final java.lang.String _OBJECTTYPE_PROFILE_CONNPOOL = "OBJECTTYPE_PROFILE_CONNPOOL";
    public static final java.lang.String _OBJECTTYPE_PROFILE_FTP = "OBJECTTYPE_PROFILE_FTP";
    public static final java.lang.String _OBJECTTYPE_PROFILE_HTTP = "OBJECTTYPE_PROFILE_HTTP";
    public static final java.lang.String _OBJECTTYPE_PROFILE_PERSIST = "OBJECTTYPE_PROFILE_PERSIST";
    public static final java.lang.String _OBJECTTYPE_PROFILE_SERVERSSL = "OBJECTTYPE_PROFILE_SERVERSSL";
    public static final java.lang.String _OBJECTTYPE_PROFILE_STREAM = "OBJECTTYPE_PROFILE_STREAM";
    public static final java.lang.String _OBJECTTYPE_PROFILE_TCP = "OBJECTTYPE_PROFILE_TCP";
    public static final java.lang.String _OBJECTTYPE_PROFILE_UDP = "OBJECTTYPE_PROFILE_UDP";
    public static final java.lang.String _OBJECTTYPE_PROXY_EXCLUSION = "OBJECTTYPE_PROXY_EXCLUSION";
    public static final java.lang.String _OBJECTTYPE_RADIUS_SERVER = "OBJECTTYPE_RADIUS_SERVER";
    public static final java.lang.String _OBJECTTYPE_RATE_FILTER_CLASS = "OBJECTTYPE_RATE_FILTER_CLASS";
    public static final java.lang.String _OBJECTTYPE_ROUTE_STATIC_ENTRY = "OBJECTTYPE_ROUTE_STATIC_ENTRY";
    public static final java.lang.String _OBJECTTYPE_ROUTE_MGMT_ENTRY = "OBJECTTYPE_ROUTE_MGMT_ENTRY";
    public static final java.lang.String _OBJECTTYPE_RULE = "OBJECTTYPE_RULE";
    public static final java.lang.String _OBJECTTYPE_RULE_EVENT = "OBJECTTYPE_RULE_EVENT";
    public static final java.lang.String _OBJECTTYPE_SELF_IP = "OBJECTTYPE_SELF_IP";
    public static final java.lang.String _OBJECTTYPE_SNAT = "OBJECTTYPE_SNAT";
    public static final java.lang.String _OBJECTTYPE_SNAT_ORIG_ADDR = "OBJECTTYPE_SNAT_ORIG_ADDR";
    public static final java.lang.String _OBJECTTYPE_SNAT_VLAN = "OBJECTTYPE_SNAT_VLAN";
    public static final java.lang.String _OBJECTTYPE_SNATPOOL = "OBJECTTYPE_SNATPOOL";
    public static final java.lang.String _OBJECTTYPE_SNATPOOL_TRANS_ADDR = "OBJECTTYPE_SNATPOOL_TRANS_ADDR";
    public static final java.lang.String _OBJECTTYPE_STP = "OBJECTTYPE_STP";
    public static final java.lang.String _OBJECTTYPE_STP_GLOBALS = "OBJECTTYPE_STP_GLOBALS";
    public static final java.lang.String _OBJECTTYPE_STP_INTERFACE_MBR = "OBJECTTYPE_STP_INTERFACE_MBR";
    public static final java.lang.String _OBJECTTYPE_STP_VLAN_MBR = "OBJECTTYPE_STP_VLAN_MBR";
    public static final java.lang.String _OBJECTTYPE_SWITCH_DOMAIN = "OBJECTTYPE_SWITCH_DOMAIN";
    public static final java.lang.String _OBJECTTYPE_SWITCH_EDGE = "OBJECTTYPE_SWITCH_EDGE";
    public static final java.lang.String _OBJECTTYPE_SYSTEM_INFORMATION = "OBJECTTYPE_SYSTEM_INFORMATION";
    public static final java.lang.String _OBJECTTYPE_TRANS_ADDR = "OBJECTTYPE_TRANS_ADDR";
    public static final java.lang.String _OBJECTTYPE_TRUNK = "OBJECTTYPE_TRUNK";
    public static final java.lang.String _OBJECTTYPE_TRUNK_CFG_MBR = "OBJECTTYPE_TRUNK_CFG_MBR";
    public static final java.lang.String _OBJECTTYPE_TRUNK_WRKNG_MBR = "OBJECTTYPE_TRUNK_WRKNG_MBR";
    public static final java.lang.String _OBJECTTYPE_USERDB_ENTRY = "OBJECTTYPE_USERDB_ENTRY";
    public static final java.lang.String _OBJECTTYPE_VALUE_LIST = "OBJECTTYPE_VALUE_LIST";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_ADDRESS = "OBJECTTYPE_VIRTUAL_ADDRESS";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_SERVER = "OBJECTTYPE_VIRTUAL_SERVER";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_SERVER_AUTH = "OBJECTTYPE_VIRTUAL_SERVER_AUTH";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_SERVER_CLONE_POOL = "OBJECTTYPE_VIRTUAL_SERVER_CLONE_POOL";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_SERVER_PERSIST = "OBJECTTYPE_VIRTUAL_SERVER_PERSIST";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_SERVER_POOL = "OBJECTTYPE_VIRTUAL_SERVER_POOL";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_SERVER_PROFILE = "OBJECTTYPE_VIRTUAL_SERVER_PROFILE";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_SERVER_RULE = "OBJECTTYPE_VIRTUAL_SERVER_RULE";
    public static final java.lang.String _OBJECTTYPE_VIRTUAL_SERVER_VLAN = "OBJECTTYPE_VIRTUAL_SERVER_VLAN";
    public static final java.lang.String _OBJECTTYPE_VLAN = "OBJECTTYPE_VLAN";
    public static final java.lang.String _OBJECTTYPE_VLAN_ID_CONTAINER = "OBJECTTYPE_VLAN_ID_CONTAINER";
    public static final java.lang.String _OBJECTTYPE_VLAN_MEMBER = "OBJECTTYPE_VLAN_MEMBER";
    public static final java.lang.String _OBJECTTYPE_VLANGROUP = "OBJECTTYPE_VLANGROUP";
    public static final java.lang.String _OBJECTTYPE_VLANGROUP_MBR = "OBJECTTYPE_VLANGROUP_MBR";
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_UNKNOWN = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_UNKNOWN);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_ADMIN_IP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_ADMIN_IP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_ARP_STATIC_ENTRY = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_ARP_STATIC_ENTRY);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_AUTH_GENERIC_CONFIG = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_AUTH_GENERIC_CONFIG);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_AUTH_LDAP_CONFIG = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_AUTH_LDAP_CONFIG);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_AUTH_RADIUS_CONFIG = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_AUTH_RADIUS_CONFIG);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_AUTH_RADIUS_CONFIG_RADIUS_SERVER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_AUTH_RADIUS_CONFIG_RADIUS_SERVER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_AUTH_SSL_CC_LDAP_CONFIG = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_AUTH_SSL_CC_LDAP_CONFIG);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_AUTH_SSL_OCSP_CONFIG = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_AUTH_SSL_OCSP_CONFIG);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_AUTH_TACACS_CONFIG = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_AUTH_TACACS_CONFIG);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_DAEMON_HA = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_DAEMON_HA);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_DAEMON_STATUS = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_DAEMON_STATUS);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_DB_VARIABLE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_DB_VARIABLE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_DEFAULT_MONITOR_RULE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_DEFAULT_MONITOR_RULE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_BOX = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_BOX);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_DC = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_DC);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_ECV = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_ECV);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_GLOBALS = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_GLOBALS);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_IP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_IP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_LINK = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_LINK);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_POOL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_POOL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_POOL_MEMBER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_POOL_MEMBER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_QOS_COEFF = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_QOS_COEFF);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_REG_ITEM = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_REG_ITEM);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_REGION_ENTRY = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_REGION_ENTRY);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_SERVER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_SERVER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_TOP_ITEM = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_TOP_ITEM);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_VS = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_VS);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_WIDEIP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_WIDEIP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_WIDEIP_ALIAS = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_WIDEIP_ALIAS);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_GTM_WIDEIP_POOL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_GTM_WIDEIP_POOL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_INTERFACE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_INTERFACE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_JOIN_AUTH_SSL_OCSP_CONFIG_OCSP_RESPONDER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_JOIN_AUTH_SSL_OCSP_CONFIG_OCSP_RESPONDER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_L2_FORWARD = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_L2_FORWARD);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_LICENSE_BLOB = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_LICENSE_BLOB);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_MIRROR_PORT = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_MIRROR_PORT);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_MIRROR_PORT_MBR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_MIRROR_PORT_MBR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_MIRROR_VLAN = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_MIRROR_VLAN);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_MONITOR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_MONITOR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_MONITOR_INSTANCE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_MONITOR_INSTANCE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_MONITOR_PARAM = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_MONITOR_PARAM);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_MONITOR_RULE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_MONITOR_RULE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_MONITOR_RULE_INSTANCE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_MONITOR_RULE_INSTANCE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_NAT = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_NAT);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_NAT_VLAN = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_NAT_VLAN);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_NODE_ADDRESS = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_NODE_ADDRESS);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_NOKIA_ALARM = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_NOKIA_ALARM);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_NOKIA_LOG = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_NOKIA_LOG);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_OCSP_RESPONDER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_OCSP_RESPONDER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PACKET_FILTER_ALLOW_TRUSTED = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PACKET_FILTER_ALLOW_TRUSTED);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PACKET_FILTER_RULE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PACKET_FILTER_RULE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PAM_LINE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PAM_LINE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PCI_DEVICE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PCI_DEVICE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PLATFORM = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PLATFORM);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_POOL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_POOL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_POOL_MEMBER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_POOL_MEMBER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_AUTH = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_AUTH);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_BIGPROTO = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_BIGPROTO);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_CLIENTSSL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_CLIENTSSL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_CONNPOOL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_CONNPOOL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_FTP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_FTP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_HTTP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_HTTP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_PERSIST = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_PERSIST);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_SERVERSSL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_SERVERSSL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_STREAM = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_STREAM);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_TCP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_TCP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROFILE_UDP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROFILE_UDP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_PROXY_EXCLUSION = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_PROXY_EXCLUSION);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_RADIUS_SERVER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_RADIUS_SERVER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_RATE_FILTER_CLASS = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_RATE_FILTER_CLASS);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_ROUTE_STATIC_ENTRY = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_ROUTE_STATIC_ENTRY);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_ROUTE_MGMT_ENTRY = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_ROUTE_MGMT_ENTRY);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_RULE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_RULE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_RULE_EVENT = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_RULE_EVENT);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SELF_IP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SELF_IP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SNAT = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SNAT);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SNAT_ORIG_ADDR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SNAT_ORIG_ADDR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SNAT_VLAN = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SNAT_VLAN);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SNATPOOL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SNATPOOL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SNATPOOL_TRANS_ADDR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SNATPOOL_TRANS_ADDR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_STP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_STP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_STP_GLOBALS = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_STP_GLOBALS);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_STP_INTERFACE_MBR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_STP_INTERFACE_MBR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_STP_VLAN_MBR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_STP_VLAN_MBR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SWITCH_DOMAIN = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SWITCH_DOMAIN);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SWITCH_EDGE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SWITCH_EDGE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_SYSTEM_INFORMATION = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_SYSTEM_INFORMATION);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_TRANS_ADDR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_TRANS_ADDR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_TRUNK = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_TRUNK);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_TRUNK_CFG_MBR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_TRUNK_CFG_MBR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_TRUNK_WRKNG_MBR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_TRUNK_WRKNG_MBR);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_USERDB_ENTRY = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_USERDB_ENTRY);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VALUE_LIST = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VALUE_LIST);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_ADDRESS = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_ADDRESS);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_SERVER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_SERVER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_SERVER_AUTH = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_SERVER_AUTH);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_SERVER_CLONE_POOL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_SERVER_CLONE_POOL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_SERVER_PERSIST = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_SERVER_PERSIST);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_SERVER_POOL = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_SERVER_POOL);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_SERVER_PROFILE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_SERVER_PROFILE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_SERVER_RULE = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_SERVER_RULE);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VIRTUAL_SERVER_VLAN = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VIRTUAL_SERVER_VLAN);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VLAN = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VLAN);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VLAN_ID_CONTAINER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VLAN_ID_CONTAINER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VLAN_MEMBER = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VLAN_MEMBER);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VLANGROUP = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VLANGROUP);
    public static final ManagementEventSubscriptionObjectType OBJECTTYPE_VLANGROUP_MBR = new ManagementEventSubscriptionObjectType(_OBJECTTYPE_VLANGROUP_MBR);
    public java.lang.String getValue() { return _value_;}
    public static ManagementEventSubscriptionObjectType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ManagementEventSubscriptionObjectType enumeration = (ManagementEventSubscriptionObjectType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ManagementEventSubscriptionObjectType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ManagementEventSubscriptionObjectType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Management.EventSubscription.ObjectType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
