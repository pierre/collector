//===========================================================================
//
// File         : Interfaces.java
//                   
//---------------------------------------------------------------------------
//
// The contents of this file are subject to the "END USER LICENSE AGREEMENT FOR F5
// Software Development Kit for iControl"; you may not use this file except in
// compliance with the License. The License is included in the iControl
// Software Development Kit.
//
// Software distributed under the License is distributed on an "AS IS"
// basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
// the License for the specific language governing rights and limitations
// under the License.
//
// The Original Code is iControl Code and related documentation
// distributed by F5.
//
// The Initial Developer of the Original Code is F5 Networks, Inc.
// Seattle, WA, USA.
// Portions created by F5 are Copyright (C) 2006 F5 Networks, Inc.
// All Rights Reserved.
// iControl (TM) is a registered trademark of F5 Networks, Inc.
//
// Alternatively, the contents of this file may be used under the terms
// of the GNU General Public License (the "GPL"), in which case the
// provisions of GPL are applicable instead of those above.  If you wish
// to allow use of your version of this file only under the terms of the
// GPL and not to allow others to use your version of this file under the
// License, indicate your decision by deleting the provisions above and
// replace them with the notice and other provisions required by the GPL.
// If you do not delete the provisions above, a recipient may use your
// version of this file under either the License or the GPL.
//
//===========================================================================
package iControl;

import iControl.*;
import java.util.*;
import java.text.*;
import java.lang.*;

public class Interfaces extends Object
{
	//-------------------------------------------------------------------
	// Member Variables
	//-------------------------------------------------------------------
	private ASMPolicyBindingStub m_ASMPolicy = null;
	private ASMSystemConfigurationBindingStub m_ASMSystemConfiguration = null;
	private ASMWebApplicationBindingStub m_ASMWebApplication = null;
	private ASMWebApplicationGroupBindingStub m_ASMWebApplicationGroup = null;
	private GlobalLBApplicationBindingStub m_GlobalLBApplication = null;
	private GlobalLBDataCenterBindingStub m_GlobalLBDataCenter = null;
	private GlobalLBDNSSECKeyBindingStub m_GlobalLBDNSSECKey = null;
	private GlobalLBDNSSECZoneBindingStub m_GlobalLBDNSSECZone = null;
	private GlobalLBGlobalsBindingStub m_GlobalLBGlobals = null;
	private GlobalLBLinkBindingStub m_GlobalLBLink = null;
	private GlobalLBMonitorBindingStub m_GlobalLBMonitor = null;
	private GlobalLBPoolBindingStub m_GlobalLBPool = null;
	private GlobalLBPoolMemberBindingStub m_GlobalLBPoolMember = null;
	private GlobalLBRegionBindingStub m_GlobalLBRegion = null;
	private GlobalLBRuleBindingStub m_GlobalLBRule = null;
	private GlobalLBServerBindingStub m_GlobalLBServer = null;
	private GlobalLBTopologyBindingStub m_GlobalLBTopology = null;
	private GlobalLBVirtualServerBindingStub m_GlobalLBVirtualServer = null;
	private GlobalLBWideIPBindingStub m_GlobalLBWideIP = null;
	private LocalLBClassBindingStub m_LocalLBClass = null;
	private LocalLBMonitorBindingStub m_LocalLBMonitor = null;
	private LocalLBNATBindingStub m_LocalLBNAT = null;
	private LocalLBNodeAddressBindingStub m_LocalLBNodeAddress = null;
	private LocalLBPoolBindingStub m_LocalLBPool = null;
	private LocalLBPoolMemberBindingStub m_LocalLBPoolMember = null;
	private LocalLBProfileAuthBindingStub m_LocalLBProfileAuth = null;
	private LocalLBProfileClientSSLBindingStub m_LocalLBProfileClientSSL = null;
	private LocalLBProfileDiameterBindingStub m_LocalLBProfileDiameter = null;
	private LocalLBProfileDNSBindingStub m_LocalLBProfileDNS = null;
	private LocalLBProfileFastHttpBindingStub m_LocalLBProfileFastHttp = null;
	private LocalLBProfileFastL4BindingStub m_LocalLBProfileFastL4 = null;
	private LocalLBProfileFTPBindingStub m_LocalLBProfileFTP = null;
	private LocalLBProfileHttpBindingStub m_LocalLBProfileHttp = null;
	private LocalLBProfileHttpClassBindingStub m_LocalLBProfileHttpClass = null;
	private LocalLBProfileIIOPBindingStub m_LocalLBProfileIIOP = null;
	private LocalLBProfileOneConnectBindingStub m_LocalLBProfileOneConnect = null;
	private LocalLBProfilePersistenceBindingStub m_LocalLBProfilePersistence = null;
	private LocalLBProfileRADIUSBindingStub m_LocalLBProfileRADIUS = null;
	private LocalLBProfileRTSPBindingStub m_LocalLBProfileRTSP = null;
	private LocalLBProfileSCTPBindingStub m_LocalLBProfileSCTP = null;
	private LocalLBProfileServerSSLBindingStub m_LocalLBProfileServerSSL = null;
	private LocalLBProfileSIPBindingStub m_LocalLBProfileSIP = null;
	private LocalLBProfileStreamBindingStub m_LocalLBProfileStream = null;
	private LocalLBProfileTCPBindingStub m_LocalLBProfileTCP = null;
	private LocalLBProfileUDPBindingStub m_LocalLBProfileUDP = null;
	private LocalLBProfileUserStatisticBindingStub m_LocalLBProfileUserStatistic = null;
	private LocalLBProfileXMLBindingStub m_LocalLBProfileXML = null;
	private LocalLBRAMCacheInformationBindingStub m_LocalLBRAMCacheInformation = null;
	private LocalLBRateClassBindingStub m_LocalLBRateClass = null;
	private LocalLBRuleBindingStub m_LocalLBRule = null;
	private LocalLBSNATBindingStub m_LocalLBSNAT = null;
	private LocalLBSNATPoolBindingStub m_LocalLBSNATPool = null;
	private LocalLBSNATPoolMemberBindingStub m_LocalLBSNATPoolMember = null;
	private LocalLBSNATTranslationAddressBindingStub m_LocalLBSNATTranslationAddress = null;
	private LocalLBVirtualAddressBindingStub m_LocalLBVirtualAddress = null;
	private LocalLBVirtualServerBindingStub m_LocalLBVirtualServer = null;
	private LTConfigClassBindingStub m_LTConfigClass = null;
	private LTConfigFieldBindingStub m_LTConfigField = null;
	private ManagementCCLDAPConfigurationBindingStub m_ManagementCCLDAPConfiguration = null;
	private ManagementCRLDPConfigurationBindingStub m_ManagementCRLDPConfiguration = null;
	private ManagementCRLDPServerBindingStub m_ManagementCRLDPServer = null;
	private ManagementDBVariableBindingStub m_ManagementDBVariable = null;
	private ManagementEventNotificationBindingStub m_ManagementEventNotification = null;
	private ManagementEventSubscriptionBindingStub m_ManagementEventSubscription = null;
	private ManagementKeyCertificateBindingStub m_ManagementKeyCertificate = null;
	private ManagementLDAPConfigurationBindingStub m_ManagementLDAPConfiguration = null;
	private ManagementLicenseAdministrationBindingStub m_ManagementLicenseAdministration = null;
	private ManagementNamedBindingStub m_ManagementNamed = null;
	private ManagementOCSPConfigurationBindingStub m_ManagementOCSPConfiguration = null;
	private ManagementOCSPResponderBindingStub m_ManagementOCSPResponder = null;
	private ManagementPartitionBindingStub m_ManagementPartition = null;
	private ManagementProvisionBindingStub m_ManagementProvision = null;
	private ManagementRADIUSConfigurationBindingStub m_ManagementRADIUSConfiguration = null;
	private ManagementRADIUSServerBindingStub m_ManagementRADIUSServer = null;
	private ManagementResourceRecordBindingStub m_ManagementResourceRecord = null;
	private ManagementSNMPConfigurationBindingStub m_ManagementSNMPConfiguration = null;
	private ManagementTACACSConfigurationBindingStub m_ManagementTACACSConfiguration = null;
	private ManagementTMOSModuleBindingStub m_ManagementTMOSModule = null;
	private ManagementUserManagementBindingStub m_ManagementUserManagement = null;
	private ManagementViewBindingStub m_ManagementView = null;
	private ManagementZoneBindingStub m_ManagementZone = null;
	private ManagementZoneRunnerBindingStub m_ManagementZoneRunner = null;
	private NetworkingAdminIPBindingStub m_NetworkingAdminIP = null;
	private NetworkingARPBindingStub m_NetworkingARP = null;
	private NetworkingInterfacesBindingStub m_NetworkingInterfaces = null;
	private NetworkingISessionAdvertisedRouteBindingStub m_NetworkingISessionAdvertisedRoute = null;
	private NetworkingISessionLocalInterfaceBindingStub m_NetworkingISessionLocalInterface = null;
	private NetworkingISessionPeerDiscoveryBindingStub m_NetworkingISessionPeerDiscovery = null;
	private NetworkingISessionRemoteInterfaceBindingStub m_NetworkingISessionRemoteInterface = null;
	private NetworkingPacketFilterBindingStub m_NetworkingPacketFilter = null;
	private NetworkingPacketFilterGlobalsBindingStub m_NetworkingPacketFilterGlobals = null;
	private NetworkingPortMirrorBindingStub m_NetworkingPortMirror = null;
	private NetworkingProfileGREBindingStub m_NetworkingProfileGRE = null;
	private NetworkingProfileIPIPBindingStub m_NetworkingProfileIPIP = null;
	private NetworkingProfileWCCPGREBindingStub m_NetworkingProfileWCCPGRE = null;
	private NetworkingRouteDomainBindingStub m_NetworkingRouteDomain = null;
	private NetworkingRouteTableBindingStub m_NetworkingRouteTable = null;
	private NetworkingSelfIPBindingStub m_NetworkingSelfIP = null;
	private NetworkingSelfIPPortLockdownBindingStub m_NetworkingSelfIPPortLockdown = null;
	private NetworkingSTPGlobalsBindingStub m_NetworkingSTPGlobals = null;
	private NetworkingSTPInstanceBindingStub m_NetworkingSTPInstance = null;
	private NetworkingTrunkBindingStub m_NetworkingTrunk = null;
	private NetworkingTunnelBindingStub m_NetworkingTunnel = null;
	private NetworkingVLANBindingStub m_NetworkingVLAN = null;
	private NetworkingVLANGroupBindingStub m_NetworkingVLANGroup = null;
	private SystemClusterBindingStub m_SystemCluster = null;
	private SystemConfigSyncBindingStub m_SystemConfigSync = null;
	private SystemDiskBindingStub m_SystemDisk = null;
	private SystemFailoverBindingStub m_SystemFailover = null;
	private SystemGeoIPBindingStub m_SystemGeoIP = null;
	private SystemInetBindingStub m_SystemInet = null;
	private SystemServicesBindingStub m_SystemServices = null;
	private SystemSoftwareManagementBindingStub m_SystemSoftwareManagement = null;
	private SystemStatisticsBindingStub m_SystemStatistics = null;
	private SystemSystemInfoBindingStub m_SystemSystemInfo = null;
	private WebAcceleratorApplicationsBindingStub m_WebAcceleratorApplications = null;
	private WebAcceleratorPoliciesBindingStub m_WebAcceleratorPolicies = null;
		
	private Boolean m_bInitialized = false;
	private int m_timeout = 60000;
	private String m_hostname = "";
	private long m_port = 443;
	private String m_username = "";
	private String m_password = "";

	private void setupInterface(org.apache.axis.client.Stub stub)
	{
		stub.setTimeout(m_timeout); stub.setUsername(m_username); stub.setPassword(m_password); 
	}
	
	//-------------------------------------------------------------------
	// public member accessors
	//-------------------------------------------------------------------
	public ASMPolicyBindingStub getASMPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMPolicy ) { m_ASMPolicy = (iControl.ASMPolicyBindingStub) new iControl.ASMPolicyLocator().getASMPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_ASMPolicy); return m_ASMPolicy;}
	public ASMSystemConfigurationBindingStub getASMSystemConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMSystemConfiguration ) { m_ASMSystemConfiguration = (iControl.ASMSystemConfigurationBindingStub) new iControl.ASMSystemConfigurationLocator().getASMSystemConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ASMSystemConfiguration); return m_ASMSystemConfiguration;}
	public ASMWebApplicationBindingStub getASMWebApplication() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMWebApplication ) { m_ASMWebApplication = (iControl.ASMWebApplicationBindingStub) new iControl.ASMWebApplicationLocator().getASMWebApplicationPort(new java.net.URL(buildURL())); } setupInterface(m_ASMWebApplication); return m_ASMWebApplication;}
	public ASMWebApplicationGroupBindingStub getASMWebApplicationGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMWebApplicationGroup ) { m_ASMWebApplicationGroup = (iControl.ASMWebApplicationGroupBindingStub) new iControl.ASMWebApplicationGroupLocator().getASMWebApplicationGroupPort(new java.net.URL(buildURL())); } setupInterface(m_ASMWebApplicationGroup); return m_ASMWebApplicationGroup;}
	public GlobalLBApplicationBindingStub getGlobalLBApplication() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBApplication ) { m_GlobalLBApplication = (iControl.GlobalLBApplicationBindingStub) new iControl.GlobalLBApplicationLocator().getGlobalLBApplicationPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBApplication); return m_GlobalLBApplication;}
	public GlobalLBDataCenterBindingStub getGlobalLBDataCenter() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBDataCenter ) { m_GlobalLBDataCenter = (iControl.GlobalLBDataCenterBindingStub) new iControl.GlobalLBDataCenterLocator().getGlobalLBDataCenterPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBDataCenter); return m_GlobalLBDataCenter;}
	public GlobalLBDNSSECKeyBindingStub getGlobalLBDNSSECKey() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBDNSSECKey ) { m_GlobalLBDNSSECKey = (iControl.GlobalLBDNSSECKeyBindingStub) new iControl.GlobalLBDNSSECKeyLocator().getGlobalLBDNSSECKeyPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBDNSSECKey); return m_GlobalLBDNSSECKey;}
	public GlobalLBDNSSECZoneBindingStub getGlobalLBDNSSECZone() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBDNSSECZone ) { m_GlobalLBDNSSECZone = (iControl.GlobalLBDNSSECZoneBindingStub) new iControl.GlobalLBDNSSECZoneLocator().getGlobalLBDNSSECZonePort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBDNSSECZone); return m_GlobalLBDNSSECZone;}
	public GlobalLBGlobalsBindingStub getGlobalLBGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBGlobals ) { m_GlobalLBGlobals = (iControl.GlobalLBGlobalsBindingStub) new iControl.GlobalLBGlobalsLocator().getGlobalLBGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBGlobals); return m_GlobalLBGlobals;}
	public GlobalLBLinkBindingStub getGlobalLBLink() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBLink ) { m_GlobalLBLink = (iControl.GlobalLBLinkBindingStub) new iControl.GlobalLBLinkLocator().getGlobalLBLinkPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBLink); return m_GlobalLBLink;}
	public GlobalLBMonitorBindingStub getGlobalLBMonitor() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBMonitor ) { m_GlobalLBMonitor = (iControl.GlobalLBMonitorBindingStub) new iControl.GlobalLBMonitorLocator().getGlobalLBMonitorPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBMonitor); return m_GlobalLBMonitor;}
	public GlobalLBPoolBindingStub getGlobalLBPool() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBPool ) { m_GlobalLBPool = (iControl.GlobalLBPoolBindingStub) new iControl.GlobalLBPoolLocator().getGlobalLBPoolPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBPool); return m_GlobalLBPool;}
	public GlobalLBPoolMemberBindingStub getGlobalLBPoolMember() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBPoolMember ) { m_GlobalLBPoolMember = (iControl.GlobalLBPoolMemberBindingStub) new iControl.GlobalLBPoolMemberLocator().getGlobalLBPoolMemberPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBPoolMember); return m_GlobalLBPoolMember;}
	public GlobalLBRegionBindingStub getGlobalLBRegion() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBRegion ) { m_GlobalLBRegion = (iControl.GlobalLBRegionBindingStub) new iControl.GlobalLBRegionLocator().getGlobalLBRegionPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBRegion); return m_GlobalLBRegion;}
	public GlobalLBRuleBindingStub getGlobalLBRule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBRule ) { m_GlobalLBRule = (iControl.GlobalLBRuleBindingStub) new iControl.GlobalLBRuleLocator().getGlobalLBRulePort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBRule); return m_GlobalLBRule;}
	public GlobalLBServerBindingStub getGlobalLBServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBServer ) { m_GlobalLBServer = (iControl.GlobalLBServerBindingStub) new iControl.GlobalLBServerLocator().getGlobalLBServerPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBServer); return m_GlobalLBServer;}
	public GlobalLBTopologyBindingStub getGlobalLBTopology() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBTopology ) { m_GlobalLBTopology = (iControl.GlobalLBTopologyBindingStub) new iControl.GlobalLBTopologyLocator().getGlobalLBTopologyPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBTopology); return m_GlobalLBTopology;}
	public GlobalLBVirtualServerBindingStub getGlobalLBVirtualServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBVirtualServer ) { m_GlobalLBVirtualServer = (iControl.GlobalLBVirtualServerBindingStub) new iControl.GlobalLBVirtualServerLocator().getGlobalLBVirtualServerPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBVirtualServer); return m_GlobalLBVirtualServer;}
	public GlobalLBWideIPBindingStub getGlobalLBWideIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBWideIP ) { m_GlobalLBWideIP = (iControl.GlobalLBWideIPBindingStub) new iControl.GlobalLBWideIPLocator().getGlobalLBWideIPPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBWideIP); return m_GlobalLBWideIP;}
	public LocalLBClassBindingStub getLocalLBClass() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBClass ) { m_LocalLBClass = (iControl.LocalLBClassBindingStub) new iControl.LocalLBClassLocator().getLocalLBClassPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBClass); return m_LocalLBClass;}
	public LocalLBMonitorBindingStub getLocalLBMonitor() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBMonitor ) { m_LocalLBMonitor = (iControl.LocalLBMonitorBindingStub) new iControl.LocalLBMonitorLocator().getLocalLBMonitorPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBMonitor); return m_LocalLBMonitor;}
	public LocalLBNATBindingStub getLocalLBNAT() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBNAT ) { m_LocalLBNAT = (iControl.LocalLBNATBindingStub) new iControl.LocalLBNATLocator().getLocalLBNATPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBNAT); return m_LocalLBNAT;}
	public LocalLBNodeAddressBindingStub getLocalLBNodeAddress() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBNodeAddress ) { m_LocalLBNodeAddress = (iControl.LocalLBNodeAddressBindingStub) new iControl.LocalLBNodeAddressLocator().getLocalLBNodeAddressPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBNodeAddress); return m_LocalLBNodeAddress;}
	public LocalLBPoolBindingStub getLocalLBPool() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBPool ) { m_LocalLBPool = (iControl.LocalLBPoolBindingStub) new iControl.LocalLBPoolLocator().getLocalLBPoolPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBPool); return m_LocalLBPool;}
	public LocalLBPoolMemberBindingStub getLocalLBPoolMember() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBPoolMember ) { m_LocalLBPoolMember = (iControl.LocalLBPoolMemberBindingStub) new iControl.LocalLBPoolMemberLocator().getLocalLBPoolMemberPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBPoolMember); return m_LocalLBPoolMember;}
	public LocalLBProfileAuthBindingStub getLocalLBProfileAuth() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileAuth ) { m_LocalLBProfileAuth = (iControl.LocalLBProfileAuthBindingStub) new iControl.LocalLBProfileAuthLocator().getLocalLBProfileAuthPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileAuth); return m_LocalLBProfileAuth;}
	public LocalLBProfileClientSSLBindingStub getLocalLBProfileClientSSL() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileClientSSL ) { m_LocalLBProfileClientSSL = (iControl.LocalLBProfileClientSSLBindingStub) new iControl.LocalLBProfileClientSSLLocator().getLocalLBProfileClientSSLPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileClientSSL); return m_LocalLBProfileClientSSL;}
	public LocalLBProfileDiameterBindingStub getLocalLBProfileDiameter() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileDiameter ) { m_LocalLBProfileDiameter = (iControl.LocalLBProfileDiameterBindingStub) new iControl.LocalLBProfileDiameterLocator().getLocalLBProfileDiameterPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileDiameter); return m_LocalLBProfileDiameter;}
	public LocalLBProfileDNSBindingStub getLocalLBProfileDNS() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileDNS ) { m_LocalLBProfileDNS = (iControl.LocalLBProfileDNSBindingStub) new iControl.LocalLBProfileDNSLocator().getLocalLBProfileDNSPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileDNS); return m_LocalLBProfileDNS;}
	public LocalLBProfileFastHttpBindingStub getLocalLBProfileFastHttp() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileFastHttp ) { m_LocalLBProfileFastHttp = (iControl.LocalLBProfileFastHttpBindingStub) new iControl.LocalLBProfileFastHttpLocator().getLocalLBProfileFastHttpPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileFastHttp); return m_LocalLBProfileFastHttp;}
	public LocalLBProfileFastL4BindingStub getLocalLBProfileFastL4() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileFastL4 ) { m_LocalLBProfileFastL4 = (iControl.LocalLBProfileFastL4BindingStub) new iControl.LocalLBProfileFastL4Locator().getLocalLBProfileFastL4Port(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileFastL4); return m_LocalLBProfileFastL4;}
	public LocalLBProfileFTPBindingStub getLocalLBProfileFTP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileFTP ) { m_LocalLBProfileFTP = (iControl.LocalLBProfileFTPBindingStub) new iControl.LocalLBProfileFTPLocator().getLocalLBProfileFTPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileFTP); return m_LocalLBProfileFTP;}
	public LocalLBProfileHttpBindingStub getLocalLBProfileHttp() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileHttp ) { m_LocalLBProfileHttp = (iControl.LocalLBProfileHttpBindingStub) new iControl.LocalLBProfileHttpLocator().getLocalLBProfileHttpPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileHttp); return m_LocalLBProfileHttp;}
	public LocalLBProfileHttpClassBindingStub getLocalLBProfileHttpClass() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileHttpClass ) { m_LocalLBProfileHttpClass = (iControl.LocalLBProfileHttpClassBindingStub) new iControl.LocalLBProfileHttpClassLocator().getLocalLBProfileHttpClassPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileHttpClass); return m_LocalLBProfileHttpClass;}
	public LocalLBProfileIIOPBindingStub getLocalLBProfileIIOP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileIIOP ) { m_LocalLBProfileIIOP = (iControl.LocalLBProfileIIOPBindingStub) new iControl.LocalLBProfileIIOPLocator().getLocalLBProfileIIOPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileIIOP); return m_LocalLBProfileIIOP;}
	public LocalLBProfileOneConnectBindingStub getLocalLBProfileOneConnect() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileOneConnect ) { m_LocalLBProfileOneConnect = (iControl.LocalLBProfileOneConnectBindingStub) new iControl.LocalLBProfileOneConnectLocator().getLocalLBProfileOneConnectPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileOneConnect); return m_LocalLBProfileOneConnect;}
	public LocalLBProfilePersistenceBindingStub getLocalLBProfilePersistence() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfilePersistence ) { m_LocalLBProfilePersistence = (iControl.LocalLBProfilePersistenceBindingStub) new iControl.LocalLBProfilePersistenceLocator().getLocalLBProfilePersistencePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfilePersistence); return m_LocalLBProfilePersistence;}
	public LocalLBProfileRADIUSBindingStub getLocalLBProfileRADIUS() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileRADIUS ) { m_LocalLBProfileRADIUS = (iControl.LocalLBProfileRADIUSBindingStub) new iControl.LocalLBProfileRADIUSLocator().getLocalLBProfileRADIUSPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileRADIUS); return m_LocalLBProfileRADIUS;}
	public LocalLBProfileRTSPBindingStub getLocalLBProfileRTSP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileRTSP ) { m_LocalLBProfileRTSP = (iControl.LocalLBProfileRTSPBindingStub) new iControl.LocalLBProfileRTSPLocator().getLocalLBProfileRTSPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileRTSP); return m_LocalLBProfileRTSP;}
	public LocalLBProfileSCTPBindingStub getLocalLBProfileSCTP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSCTP ) { m_LocalLBProfileSCTP = (iControl.LocalLBProfileSCTPBindingStub) new iControl.LocalLBProfileSCTPLocator().getLocalLBProfileSCTPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSCTP); return m_LocalLBProfileSCTP;}
	public LocalLBProfileServerSSLBindingStub getLocalLBProfileServerSSL() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileServerSSL ) { m_LocalLBProfileServerSSL = (iControl.LocalLBProfileServerSSLBindingStub) new iControl.LocalLBProfileServerSSLLocator().getLocalLBProfileServerSSLPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileServerSSL); return m_LocalLBProfileServerSSL;}
	public LocalLBProfileSIPBindingStub getLocalLBProfileSIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSIP ) { m_LocalLBProfileSIP = (iControl.LocalLBProfileSIPBindingStub) new iControl.LocalLBProfileSIPLocator().getLocalLBProfileSIPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSIP); return m_LocalLBProfileSIP;}
	public LocalLBProfileStreamBindingStub getLocalLBProfileStream() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileStream ) { m_LocalLBProfileStream = (iControl.LocalLBProfileStreamBindingStub) new iControl.LocalLBProfileStreamLocator().getLocalLBProfileStreamPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileStream); return m_LocalLBProfileStream;}
	public LocalLBProfileTCPBindingStub getLocalLBProfileTCP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileTCP ) { m_LocalLBProfileTCP = (iControl.LocalLBProfileTCPBindingStub) new iControl.LocalLBProfileTCPLocator().getLocalLBProfileTCPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileTCP); return m_LocalLBProfileTCP;}
	public LocalLBProfileUDPBindingStub getLocalLBProfileUDP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileUDP ) { m_LocalLBProfileUDP = (iControl.LocalLBProfileUDPBindingStub) new iControl.LocalLBProfileUDPLocator().getLocalLBProfileUDPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileUDP); return m_LocalLBProfileUDP;}
	public LocalLBProfileUserStatisticBindingStub getLocalLBProfileUserStatistic() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileUserStatistic ) { m_LocalLBProfileUserStatistic = (iControl.LocalLBProfileUserStatisticBindingStub) new iControl.LocalLBProfileUserStatisticLocator().getLocalLBProfileUserStatisticPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileUserStatistic); return m_LocalLBProfileUserStatistic;}
	public LocalLBProfileXMLBindingStub getLocalLBProfileXML() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileXML ) { m_LocalLBProfileXML = (iControl.LocalLBProfileXMLBindingStub) new iControl.LocalLBProfileXMLLocator().getLocalLBProfileXMLPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileXML); return m_LocalLBProfileXML;}
	public LocalLBRAMCacheInformationBindingStub getLocalLBRAMCacheInformation() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBRAMCacheInformation ) { m_LocalLBRAMCacheInformation = (iControl.LocalLBRAMCacheInformationBindingStub) new iControl.LocalLBRAMCacheInformationLocator().getLocalLBRAMCacheInformationPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBRAMCacheInformation); return m_LocalLBRAMCacheInformation;}
	public LocalLBRateClassBindingStub getLocalLBRateClass() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBRateClass ) { m_LocalLBRateClass = (iControl.LocalLBRateClassBindingStub) new iControl.LocalLBRateClassLocator().getLocalLBRateClassPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBRateClass); return m_LocalLBRateClass;}
	public LocalLBRuleBindingStub getLocalLBRule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBRule ) { m_LocalLBRule = (iControl.LocalLBRuleBindingStub) new iControl.LocalLBRuleLocator().getLocalLBRulePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBRule); return m_LocalLBRule;}
	public LocalLBSNATBindingStub getLocalLBSNAT() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNAT ) { m_LocalLBSNAT = (iControl.LocalLBSNATBindingStub) new iControl.LocalLBSNATLocator().getLocalLBSNATPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNAT); return m_LocalLBSNAT;}
	public LocalLBSNATPoolBindingStub getLocalLBSNATPool() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNATPool ) { m_LocalLBSNATPool = (iControl.LocalLBSNATPoolBindingStub) new iControl.LocalLBSNATPoolLocator().getLocalLBSNATPoolPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNATPool); return m_LocalLBSNATPool;}
	public LocalLBSNATPoolMemberBindingStub getLocalLBSNATPoolMember() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNATPoolMember ) { m_LocalLBSNATPoolMember = (iControl.LocalLBSNATPoolMemberBindingStub) new iControl.LocalLBSNATPoolMemberLocator().getLocalLBSNATPoolMemberPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNATPoolMember); return m_LocalLBSNATPoolMember;}
	public LocalLBSNATTranslationAddressBindingStub getLocalLBSNATTranslationAddress() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNATTranslationAddress ) { m_LocalLBSNATTranslationAddress = (iControl.LocalLBSNATTranslationAddressBindingStub) new iControl.LocalLBSNATTranslationAddressLocator().getLocalLBSNATTranslationAddressPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNATTranslationAddress); return m_LocalLBSNATTranslationAddress;}
	public LocalLBVirtualAddressBindingStub getLocalLBVirtualAddress() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBVirtualAddress ) { m_LocalLBVirtualAddress = (iControl.LocalLBVirtualAddressBindingStub) new iControl.LocalLBVirtualAddressLocator().getLocalLBVirtualAddressPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBVirtualAddress); return m_LocalLBVirtualAddress;}
	public LocalLBVirtualServerBindingStub getLocalLBVirtualServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBVirtualServer ) { m_LocalLBVirtualServer = (iControl.LocalLBVirtualServerBindingStub) new iControl.LocalLBVirtualServerLocator().getLocalLBVirtualServerPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBVirtualServer); return m_LocalLBVirtualServer;}
	public LTConfigClassBindingStub getLTConfigClass() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LTConfigClass ) { m_LTConfigClass = (iControl.LTConfigClassBindingStub) new iControl.LTConfigClassLocator().getLTConfigClassPort(new java.net.URL(buildURL())); } setupInterface(m_LTConfigClass); return m_LTConfigClass;}
	public LTConfigFieldBindingStub getLTConfigField() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LTConfigField ) { m_LTConfigField = (iControl.LTConfigFieldBindingStub) new iControl.LTConfigFieldLocator().getLTConfigFieldPort(new java.net.URL(buildURL())); } setupInterface(m_LTConfigField); return m_LTConfigField;}
	public ManagementCCLDAPConfigurationBindingStub getManagementCCLDAPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementCCLDAPConfiguration ) { m_ManagementCCLDAPConfiguration = (iControl.ManagementCCLDAPConfigurationBindingStub) new iControl.ManagementCCLDAPConfigurationLocator().getManagementCCLDAPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementCCLDAPConfiguration); return m_ManagementCCLDAPConfiguration;}
	public ManagementCRLDPConfigurationBindingStub getManagementCRLDPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementCRLDPConfiguration ) { m_ManagementCRLDPConfiguration = (iControl.ManagementCRLDPConfigurationBindingStub) new iControl.ManagementCRLDPConfigurationLocator().getManagementCRLDPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementCRLDPConfiguration); return m_ManagementCRLDPConfiguration;}
	public ManagementCRLDPServerBindingStub getManagementCRLDPServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementCRLDPServer ) { m_ManagementCRLDPServer = (iControl.ManagementCRLDPServerBindingStub) new iControl.ManagementCRLDPServerLocator().getManagementCRLDPServerPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementCRLDPServer); return m_ManagementCRLDPServer;}
	public ManagementDBVariableBindingStub getManagementDBVariable() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementDBVariable ) { m_ManagementDBVariable = (iControl.ManagementDBVariableBindingStub) new iControl.ManagementDBVariableLocator().getManagementDBVariablePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementDBVariable); return m_ManagementDBVariable;}
	public ManagementEventNotificationBindingStub getManagementEventNotification() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementEventNotification ) { m_ManagementEventNotification = (iControl.ManagementEventNotificationBindingStub) new iControl.ManagementEventNotificationLocator().getManagementEventNotificationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementEventNotification); return m_ManagementEventNotification;}
	public ManagementEventSubscriptionBindingStub getManagementEventSubscription() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementEventSubscription ) { m_ManagementEventSubscription = (iControl.ManagementEventSubscriptionBindingStub) new iControl.ManagementEventSubscriptionLocator().getManagementEventSubscriptionPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementEventSubscription); return m_ManagementEventSubscription;}
	public ManagementKeyCertificateBindingStub getManagementKeyCertificate() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementKeyCertificate ) { m_ManagementKeyCertificate = (iControl.ManagementKeyCertificateBindingStub) new iControl.ManagementKeyCertificateLocator().getManagementKeyCertificatePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementKeyCertificate); return m_ManagementKeyCertificate;}
	public ManagementLDAPConfigurationBindingStub getManagementLDAPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementLDAPConfiguration ) { m_ManagementLDAPConfiguration = (iControl.ManagementLDAPConfigurationBindingStub) new iControl.ManagementLDAPConfigurationLocator().getManagementLDAPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementLDAPConfiguration); return m_ManagementLDAPConfiguration;}
	public ManagementLicenseAdministrationBindingStub getManagementLicenseAdministration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementLicenseAdministration ) { m_ManagementLicenseAdministration = (iControl.ManagementLicenseAdministrationBindingStub) new iControl.ManagementLicenseAdministrationLocator().getManagementLicenseAdministrationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementLicenseAdministration); return m_ManagementLicenseAdministration;}
	public ManagementNamedBindingStub getManagementNamed() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementNamed ) { m_ManagementNamed = (iControl.ManagementNamedBindingStub) new iControl.ManagementNamedLocator().getManagementNamedPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementNamed); return m_ManagementNamed;}
	public ManagementOCSPConfigurationBindingStub getManagementOCSPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementOCSPConfiguration ) { m_ManagementOCSPConfiguration = (iControl.ManagementOCSPConfigurationBindingStub) new iControl.ManagementOCSPConfigurationLocator().getManagementOCSPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementOCSPConfiguration); return m_ManagementOCSPConfiguration;}
	public ManagementOCSPResponderBindingStub getManagementOCSPResponder() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementOCSPResponder ) { m_ManagementOCSPResponder = (iControl.ManagementOCSPResponderBindingStub) new iControl.ManagementOCSPResponderLocator().getManagementOCSPResponderPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementOCSPResponder); return m_ManagementOCSPResponder;}
	public ManagementPartitionBindingStub getManagementPartition() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementPartition ) { m_ManagementPartition = (iControl.ManagementPartitionBindingStub) new iControl.ManagementPartitionLocator().getManagementPartitionPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementPartition); return m_ManagementPartition;}
	public ManagementProvisionBindingStub getManagementProvision() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementProvision ) { m_ManagementProvision = (iControl.ManagementProvisionBindingStub) new iControl.ManagementProvisionLocator().getManagementProvisionPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementProvision); return m_ManagementProvision;}
	public ManagementRADIUSConfigurationBindingStub getManagementRADIUSConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementRADIUSConfiguration ) { m_ManagementRADIUSConfiguration = (iControl.ManagementRADIUSConfigurationBindingStub) new iControl.ManagementRADIUSConfigurationLocator().getManagementRADIUSConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementRADIUSConfiguration); return m_ManagementRADIUSConfiguration;}
	public ManagementRADIUSServerBindingStub getManagementRADIUSServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementRADIUSServer ) { m_ManagementRADIUSServer = (iControl.ManagementRADIUSServerBindingStub) new iControl.ManagementRADIUSServerLocator().getManagementRADIUSServerPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementRADIUSServer); return m_ManagementRADIUSServer;}
	public ManagementResourceRecordBindingStub getManagementResourceRecord() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementResourceRecord ) { m_ManagementResourceRecord = (iControl.ManagementResourceRecordBindingStub) new iControl.ManagementResourceRecordLocator().getManagementResourceRecordPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementResourceRecord); return m_ManagementResourceRecord;}
	public ManagementSNMPConfigurationBindingStub getManagementSNMPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementSNMPConfiguration ) { m_ManagementSNMPConfiguration = (iControl.ManagementSNMPConfigurationBindingStub) new iControl.ManagementSNMPConfigurationLocator().getManagementSNMPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementSNMPConfiguration); return m_ManagementSNMPConfiguration;}
	public ManagementTACACSConfigurationBindingStub getManagementTACACSConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementTACACSConfiguration ) { m_ManagementTACACSConfiguration = (iControl.ManagementTACACSConfigurationBindingStub) new iControl.ManagementTACACSConfigurationLocator().getManagementTACACSConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementTACACSConfiguration); return m_ManagementTACACSConfiguration;}
	public ManagementTMOSModuleBindingStub getManagementTMOSModule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementTMOSModule ) { m_ManagementTMOSModule = (iControl.ManagementTMOSModuleBindingStub) new iControl.ManagementTMOSModuleLocator().getManagementTMOSModulePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementTMOSModule); return m_ManagementTMOSModule;}
	public ManagementUserManagementBindingStub getManagementUserManagement() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementUserManagement ) { m_ManagementUserManagement = (iControl.ManagementUserManagementBindingStub) new iControl.ManagementUserManagementLocator().getManagementUserManagementPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementUserManagement); return m_ManagementUserManagement;}
	public ManagementViewBindingStub getManagementView() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementView ) { m_ManagementView = (iControl.ManagementViewBindingStub) new iControl.ManagementViewLocator().getManagementViewPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementView); return m_ManagementView;}
	public ManagementZoneBindingStub getManagementZone() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementZone ) { m_ManagementZone = (iControl.ManagementZoneBindingStub) new iControl.ManagementZoneLocator().getManagementZonePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementZone); return m_ManagementZone;}
	public ManagementZoneRunnerBindingStub getManagementZoneRunner() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementZoneRunner ) { m_ManagementZoneRunner = (iControl.ManagementZoneRunnerBindingStub) new iControl.ManagementZoneRunnerLocator().getManagementZoneRunnerPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementZoneRunner); return m_ManagementZoneRunner;}
	public NetworkingAdminIPBindingStub getNetworkingAdminIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingAdminIP ) { m_NetworkingAdminIP = (iControl.NetworkingAdminIPBindingStub) new iControl.NetworkingAdminIPLocator().getNetworkingAdminIPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingAdminIP); return m_NetworkingAdminIP;}
	public NetworkingARPBindingStub getNetworkingARP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingARP ) { m_NetworkingARP = (iControl.NetworkingARPBindingStub) new iControl.NetworkingARPLocator().getNetworkingARPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingARP); return m_NetworkingARP;}
	public NetworkingInterfacesBindingStub getNetworkingInterfaces() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingInterfaces ) { m_NetworkingInterfaces = (iControl.NetworkingInterfacesBindingStub) new iControl.NetworkingInterfacesLocator().getNetworkingInterfacesPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingInterfaces); return m_NetworkingInterfaces;}
	public NetworkingISessionAdvertisedRouteBindingStub getNetworkingISessionAdvertisedRoute() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingISessionAdvertisedRoute ) { m_NetworkingISessionAdvertisedRoute = (iControl.NetworkingISessionAdvertisedRouteBindingStub) new iControl.NetworkingISessionAdvertisedRouteLocator().getNetworkingISessionAdvertisedRoutePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingISessionAdvertisedRoute); return m_NetworkingISessionAdvertisedRoute;}
	public NetworkingISessionLocalInterfaceBindingStub getNetworkingISessionLocalInterface() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingISessionLocalInterface ) { m_NetworkingISessionLocalInterface = (iControl.NetworkingISessionLocalInterfaceBindingStub) new iControl.NetworkingISessionLocalInterfaceLocator().getNetworkingISessionLocalInterfacePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingISessionLocalInterface); return m_NetworkingISessionLocalInterface;}
	public NetworkingISessionPeerDiscoveryBindingStub getNetworkingISessionPeerDiscovery() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingISessionPeerDiscovery ) { m_NetworkingISessionPeerDiscovery = (iControl.NetworkingISessionPeerDiscoveryBindingStub) new iControl.NetworkingISessionPeerDiscoveryLocator().getNetworkingISessionPeerDiscoveryPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingISessionPeerDiscovery); return m_NetworkingISessionPeerDiscovery;}
	public NetworkingISessionRemoteInterfaceBindingStub getNetworkingISessionRemoteInterface() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingISessionRemoteInterface ) { m_NetworkingISessionRemoteInterface = (iControl.NetworkingISessionRemoteInterfaceBindingStub) new iControl.NetworkingISessionRemoteInterfaceLocator().getNetworkingISessionRemoteInterfacePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingISessionRemoteInterface); return m_NetworkingISessionRemoteInterface;}
	public NetworkingPacketFilterBindingStub getNetworkingPacketFilter() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingPacketFilter ) { m_NetworkingPacketFilter = (iControl.NetworkingPacketFilterBindingStub) new iControl.NetworkingPacketFilterLocator().getNetworkingPacketFilterPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingPacketFilter); return m_NetworkingPacketFilter;}
	public NetworkingPacketFilterGlobalsBindingStub getNetworkingPacketFilterGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingPacketFilterGlobals ) { m_NetworkingPacketFilterGlobals = (iControl.NetworkingPacketFilterGlobalsBindingStub) new iControl.NetworkingPacketFilterGlobalsLocator().getNetworkingPacketFilterGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingPacketFilterGlobals); return m_NetworkingPacketFilterGlobals;}
	public NetworkingPortMirrorBindingStub getNetworkingPortMirror() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingPortMirror ) { m_NetworkingPortMirror = (iControl.NetworkingPortMirrorBindingStub) new iControl.NetworkingPortMirrorLocator().getNetworkingPortMirrorPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingPortMirror); return m_NetworkingPortMirror;}
	public NetworkingProfileGREBindingStub getNetworkingProfileGRE() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileGRE ) { m_NetworkingProfileGRE = (iControl.NetworkingProfileGREBindingStub) new iControl.NetworkingProfileGRELocator().getNetworkingProfileGREPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileGRE); return m_NetworkingProfileGRE;}
	public NetworkingProfileIPIPBindingStub getNetworkingProfileIPIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileIPIP ) { m_NetworkingProfileIPIP = (iControl.NetworkingProfileIPIPBindingStub) new iControl.NetworkingProfileIPIPLocator().getNetworkingProfileIPIPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileIPIP); return m_NetworkingProfileIPIP;}
	public NetworkingProfileWCCPGREBindingStub getNetworkingProfileWCCPGRE() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileWCCPGRE ) { m_NetworkingProfileWCCPGRE = (iControl.NetworkingProfileWCCPGREBindingStub) new iControl.NetworkingProfileWCCPGRELocator().getNetworkingProfileWCCPGREPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileWCCPGRE); return m_NetworkingProfileWCCPGRE;}
	public NetworkingRouteDomainBindingStub getNetworkingRouteDomain() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingRouteDomain ) { m_NetworkingRouteDomain = (iControl.NetworkingRouteDomainBindingStub) new iControl.NetworkingRouteDomainLocator().getNetworkingRouteDomainPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingRouteDomain); return m_NetworkingRouteDomain;}
	public NetworkingRouteTableBindingStub getNetworkingRouteTable() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingRouteTable ) { m_NetworkingRouteTable = (iControl.NetworkingRouteTableBindingStub) new iControl.NetworkingRouteTableLocator().getNetworkingRouteTablePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingRouteTable); return m_NetworkingRouteTable;}
	public NetworkingSelfIPBindingStub getNetworkingSelfIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSelfIP ) { m_NetworkingSelfIP = (iControl.NetworkingSelfIPBindingStub) new iControl.NetworkingSelfIPLocator().getNetworkingSelfIPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSelfIP); return m_NetworkingSelfIP;}
	public NetworkingSelfIPPortLockdownBindingStub getNetworkingSelfIPPortLockdown() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSelfIPPortLockdown ) { m_NetworkingSelfIPPortLockdown = (iControl.NetworkingSelfIPPortLockdownBindingStub) new iControl.NetworkingSelfIPPortLockdownLocator().getNetworkingSelfIPPortLockdownPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSelfIPPortLockdown); return m_NetworkingSelfIPPortLockdown;}
	public NetworkingSTPGlobalsBindingStub getNetworkingSTPGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSTPGlobals ) { m_NetworkingSTPGlobals = (iControl.NetworkingSTPGlobalsBindingStub) new iControl.NetworkingSTPGlobalsLocator().getNetworkingSTPGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSTPGlobals); return m_NetworkingSTPGlobals;}
	public NetworkingSTPInstanceBindingStub getNetworkingSTPInstance() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSTPInstance ) { m_NetworkingSTPInstance = (iControl.NetworkingSTPInstanceBindingStub) new iControl.NetworkingSTPInstanceLocator().getNetworkingSTPInstancePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSTPInstance); return m_NetworkingSTPInstance;}
	public NetworkingTrunkBindingStub getNetworkingTrunk() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingTrunk ) { m_NetworkingTrunk = (iControl.NetworkingTrunkBindingStub) new iControl.NetworkingTrunkLocator().getNetworkingTrunkPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingTrunk); return m_NetworkingTrunk;}
	public NetworkingTunnelBindingStub getNetworkingTunnel() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingTunnel ) { m_NetworkingTunnel = (iControl.NetworkingTunnelBindingStub) new iControl.NetworkingTunnelLocator().getNetworkingTunnelPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingTunnel); return m_NetworkingTunnel;}
	public NetworkingVLANBindingStub getNetworkingVLAN() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingVLAN ) { m_NetworkingVLAN = (iControl.NetworkingVLANBindingStub) new iControl.NetworkingVLANLocator().getNetworkingVLANPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingVLAN); return m_NetworkingVLAN;}
	public NetworkingVLANGroupBindingStub getNetworkingVLANGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingVLANGroup ) { m_NetworkingVLANGroup = (iControl.NetworkingVLANGroupBindingStub) new iControl.NetworkingVLANGroupLocator().getNetworkingVLANGroupPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingVLANGroup); return m_NetworkingVLANGroup;}
	public SystemClusterBindingStub getSystemCluster() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemCluster ) { m_SystemCluster = (iControl.SystemClusterBindingStub) new iControl.SystemClusterLocator().getSystemClusterPort(new java.net.URL(buildURL())); } setupInterface(m_SystemCluster); return m_SystemCluster;}
	public SystemConfigSyncBindingStub getSystemConfigSync() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemConfigSync ) { m_SystemConfigSync = (iControl.SystemConfigSyncBindingStub) new iControl.SystemConfigSyncLocator().getSystemConfigSyncPort(new java.net.URL(buildURL())); } setupInterface(m_SystemConfigSync); return m_SystemConfigSync;}
	public SystemDiskBindingStub getSystemDisk() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemDisk ) { m_SystemDisk = (iControl.SystemDiskBindingStub) new iControl.SystemDiskLocator().getSystemDiskPort(new java.net.URL(buildURL())); } setupInterface(m_SystemDisk); return m_SystemDisk;}
	public SystemFailoverBindingStub getSystemFailover() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemFailover ) { m_SystemFailover = (iControl.SystemFailoverBindingStub) new iControl.SystemFailoverLocator().getSystemFailoverPort(new java.net.URL(buildURL())); } setupInterface(m_SystemFailover); return m_SystemFailover;}
	public SystemGeoIPBindingStub getSystemGeoIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemGeoIP ) { m_SystemGeoIP = (iControl.SystemGeoIPBindingStub) new iControl.SystemGeoIPLocator().getSystemGeoIPPort(new java.net.URL(buildURL())); } setupInterface(m_SystemGeoIP); return m_SystemGeoIP;}
	public SystemInetBindingStub getSystemInet() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemInet ) { m_SystemInet = (iControl.SystemInetBindingStub) new iControl.SystemInetLocator().getSystemInetPort(new java.net.URL(buildURL())); } setupInterface(m_SystemInet); return m_SystemInet;}
	public SystemServicesBindingStub getSystemServices() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemServices ) { m_SystemServices = (iControl.SystemServicesBindingStub) new iControl.SystemServicesLocator().getSystemServicesPort(new java.net.URL(buildURL())); } setupInterface(m_SystemServices); return m_SystemServices;}
	public SystemSoftwareManagementBindingStub getSystemSoftwareManagement() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemSoftwareManagement ) { m_SystemSoftwareManagement = (iControl.SystemSoftwareManagementBindingStub) new iControl.SystemSoftwareManagementLocator().getSystemSoftwareManagementPort(new java.net.URL(buildURL())); } setupInterface(m_SystemSoftwareManagement); return m_SystemSoftwareManagement;}
	public SystemStatisticsBindingStub getSystemStatistics() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemStatistics ) { m_SystemStatistics = (iControl.SystemStatisticsBindingStub) new iControl.SystemStatisticsLocator().getSystemStatisticsPort(new java.net.URL(buildURL())); } setupInterface(m_SystemStatistics); return m_SystemStatistics;}
	public SystemSystemInfoBindingStub getSystemSystemInfo() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemSystemInfo ) { m_SystemSystemInfo = (iControl.SystemSystemInfoBindingStub) new iControl.SystemSystemInfoLocator().getSystemSystemInfoPort(new java.net.URL(buildURL())); } setupInterface(m_SystemSystemInfo); return m_SystemSystemInfo;}
	public WebAcceleratorApplicationsBindingStub getWebAcceleratorApplications() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_WebAcceleratorApplications ) { m_WebAcceleratorApplications = (iControl.WebAcceleratorApplicationsBindingStub) new iControl.WebAcceleratorApplicationsLocator().getWebAcceleratorApplicationsPort(new java.net.URL(buildURL())); } setupInterface(m_WebAcceleratorApplications); return m_WebAcceleratorApplications;}
	public WebAcceleratorPoliciesBindingStub getWebAcceleratorPolicies() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_WebAcceleratorPolicies ) { m_WebAcceleratorPolicies = (iControl.WebAcceleratorPoliciesBindingStub) new iControl.WebAcceleratorPoliciesLocator().getWebAcceleratorPoliciesPort(new java.net.URL(buildURL())); } setupInterface(m_WebAcceleratorPolicies); return m_WebAcceleratorPolicies;}
	
	
	//-------------------------------------------------------------------
	// Constructor
	//-------------------------------------------------------------------
	public Interfaces()
	{
		System.setProperty("javax.net.ssl.trustStore", System.getProperty("user.home") + "/.keystore");
		XTrustProvider.install();
	}
	
	public Interfaces(String hostname, String username, String password)
	{
		System.setProperty("javax.net.ssl.trustStore", System.getProperty("user.home") + "/.keystore");
		XTrustProvider.install();
		initialize(hostname, username, password);
	}
	
	public Interfaces(String hostname, long port, String username, String password)
	{
		System.setProperty("javax.net.ssl.trustStore", System.getProperty("user.home") + "/.keystore");
		XTrustProvider.install();
		initialize(hostname, port, username, password);
	}
	
	//-------------------------------------------------------------------
	// private methods
	//-------------------------------------------------------------------

	private String buildURL()
	{
		String url = "http";
		if ( 443 == m_port )
		{
			url = url + "s";
		}
		//url = url + "://" + m_username + ":" + m_password + "@" + m_hostname + ":" + m_port + "/iControl/iControlPortal.cgi";
		url = url + "://" + m_hostname + ":" + m_port + "/iControl/iControlPortal.cgi";
		
		return url;
	}
	
	
	//-------------------------------------------------------------------
	// public methods
	//-------------------------------------------------------------------

	public Boolean initialize(String hostname, String username, String password)
	{
		return initialize(hostname, 443, username, password);
	}
	
	public Boolean initialize(String hostname, long port, String username, String password)
	{
		m_bInitialized = false;

		m_hostname = hostname;
		m_port = port;
		m_username = username;
		m_password = password;

		m_ASMPolicy = null;
		m_ASMSystemConfiguration = null;
		m_ASMWebApplication = null;
		m_ASMWebApplicationGroup = null;
		m_GlobalLBApplication = null;
		m_GlobalLBDataCenter = null;
		m_GlobalLBDNSSECKey = null;
		m_GlobalLBDNSSECZone = null;
		m_GlobalLBGlobals = null;
		m_GlobalLBLink = null;
		m_GlobalLBMonitor = null;
		m_GlobalLBPool = null;
		m_GlobalLBPoolMember = null;
		m_GlobalLBRegion = null;
		m_GlobalLBRule = null;
		m_GlobalLBServer = null;
		m_GlobalLBTopology = null;
		m_GlobalLBVirtualServer = null;
		m_GlobalLBWideIP = null;
		m_LocalLBClass = null;
		m_LocalLBMonitor = null;
		m_LocalLBNAT = null;
		m_LocalLBNodeAddress = null;
		m_LocalLBPool = null;
		m_LocalLBPoolMember = null;
		m_LocalLBProfileAuth = null;
		m_LocalLBProfileClientSSL = null;
		m_LocalLBProfileDiameter = null;
		m_LocalLBProfileDNS = null;
		m_LocalLBProfileFastHttp = null;
		m_LocalLBProfileFastL4 = null;
		m_LocalLBProfileFTP = null;
		m_LocalLBProfileHttp = null;
		m_LocalLBProfileHttpClass = null;
		m_LocalLBProfileIIOP = null;
		m_LocalLBProfileOneConnect = null;
		m_LocalLBProfilePersistence = null;
		m_LocalLBProfileRADIUS = null;
		m_LocalLBProfileRTSP = null;
		m_LocalLBProfileSCTP = null;
		m_LocalLBProfileServerSSL = null;
		m_LocalLBProfileSIP = null;
		m_LocalLBProfileStream = null;
		m_LocalLBProfileTCP = null;
		m_LocalLBProfileUDP = null;
		m_LocalLBProfileUserStatistic = null;
		m_LocalLBProfileXML = null;
		m_LocalLBRAMCacheInformation = null;
		m_LocalLBRateClass = null;
		m_LocalLBRule = null;
		m_LocalLBSNAT = null;
		m_LocalLBSNATPool = null;
		m_LocalLBSNATPoolMember = null;
		m_LocalLBSNATTranslationAddress = null;
		m_LocalLBVirtualAddress = null;
		m_LocalLBVirtualServer = null;
		m_LTConfigClass = null;
		m_LTConfigField = null;
		m_ManagementCCLDAPConfiguration = null;
		m_ManagementCRLDPConfiguration = null;
		m_ManagementCRLDPServer = null;
		m_ManagementDBVariable = null;
		m_ManagementEventNotification = null;
		m_ManagementEventSubscription = null;
		m_ManagementKeyCertificate = null;
		m_ManagementLDAPConfiguration = null;
		m_ManagementLicenseAdministration = null;
		m_ManagementNamed = null;
		m_ManagementOCSPConfiguration = null;
		m_ManagementOCSPResponder = null;
		m_ManagementPartition = null;
		m_ManagementProvision = null;
		m_ManagementRADIUSConfiguration = null;
		m_ManagementRADIUSServer = null;
		m_ManagementResourceRecord = null;
		m_ManagementSNMPConfiguration = null;
		m_ManagementTACACSConfiguration = null;
		m_ManagementTMOSModule = null;
		m_ManagementUserManagement = null;
		m_ManagementView = null;
		m_ManagementZone = null;
		m_ManagementZoneRunner = null;
		m_NetworkingAdminIP = null;
		m_NetworkingARP = null;
		m_NetworkingInterfaces = null;
		m_NetworkingISessionAdvertisedRoute = null;
		m_NetworkingISessionLocalInterface = null;
		m_NetworkingISessionPeerDiscovery = null;
		m_NetworkingISessionRemoteInterface = null;
		m_NetworkingPacketFilter = null;
		m_NetworkingPacketFilterGlobals = null;
		m_NetworkingPortMirror = null;
		m_NetworkingProfileGRE = null;
		m_NetworkingProfileIPIP = null;
		m_NetworkingProfileWCCPGRE = null;
		m_NetworkingRouteDomain = null;
		m_NetworkingRouteTable = null;
		m_NetworkingSelfIP = null;
		m_NetworkingSelfIPPortLockdown = null;
		m_NetworkingSTPGlobals = null;
		m_NetworkingSTPInstance = null;
		m_NetworkingTrunk = null;
		m_NetworkingTunnel = null;
		m_NetworkingVLAN = null;
		m_NetworkingVLANGroup = null;
		m_SystemCluster = null;
		m_SystemConfigSync = null;
		m_SystemDisk = null;
		m_SystemFailover = null;
		m_SystemGeoIP = null;
		m_SystemInet = null;
		m_SystemServices = null;
		m_SystemSoftwareManagement = null;
		m_SystemStatistics = null;
		m_SystemSystemInfo = null;
		m_WebAcceleratorApplications = null;
		m_WebAcceleratorPolicies = null;

		m_bInitialized = true;
		
		return m_bInitialized;
	}
};