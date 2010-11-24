/*
 * The contents of this file are subject to the "END USER LICENSE AGREEMENT FOR F5
 * Software Development Kit for iControl"; you may not use this file except in
 * compliance with the License. The License is included in the iControl
 * Software Development Kit.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is iControl Code and related documentation
 * distributed by F5.
 *
 * The Initial Developer of the Original Code is F5 Networks,
 * Inc. Seattle, WA, USA. Portions created by F5 are Copyright (C) 1996-2002 F5
 * Inc. All Rights Reserved.  iControl (TM) is a registered trademark of F5 Netw
 *
 * Alternatively, the contents of this file may be used under the terms
 * of the GNU General Public License (the "GPL"), in which case the
 * provisions of GPL are applicable instead of those above.  If you wish
 * to allow use of your version of this file only under the terms of the
 * GPL and not to allow others to use your version of this file under the
 * License, indicate your decision by deleting the provisions above and
 * replace them with the notice and other provisions required by the GPL.
 * If you do not delete the provisions above, a recipient may use your
 * version of this file under either the License or the GPL.
 */

import java.text.*;
import java.util.*;

public class PoolMember extends Object
{
	//--------------------------------------------------------------------------
	// Member Variables
	//--------------------------------------------------------------------------
	public iControl.Interfaces m_interfaces = new iControl.Interfaces();

	//--------------------------------------------------------------------------
	// Constructor
	//--------------------------------------------------------------------------
	public PoolMember()
	{
	}

	//--------------------------------------------------------------------------
	// parseArgs
	// [0] bigip
	// [1] port
	// [2] user
	// [3] pass
	// [4] poolname
	// [5] add|remove
	// [6] memberaddr
	// [7] memberport
	//--------------------------------------------------------------------------
	public boolean parseArgs(String[] args) throws Exception
	{
		boolean bSuccess = false;
		String bigip = null;
		long port = -1;
		String user = null;
		String pass = null;
		String poolname = null;
		String cmd = null;
		String memberaddr = null;
		long memberport = -1;
		String state = null;

		if ( args.length < 4 )
		{
			usage();
		}
		else
		{
			bigip = args[0];
			port = Integer.parseInt(args[1]);
			user = args[2];
			pass = args[3];
			
			if ( args.length > 4 )
			{
				poolname = args[4];
			}
			if ( args.length > 5 )
			{
				cmd = args[5];
			}
			if ( args.length > 6 )
			{
				memberaddr = args[6];
			}
			if ( args.length > 7 )
			{
				memberport = Integer.parseInt(args[7]);
			}
			if ( args.length > 8 )
			{
				state = args[8];
			}
			
			// build parameters
			m_interfaces.initialize(bigip, port, user, pass);
			
			if ( null == poolname )
			{
				displayAllPools();
			}
			else if ( null == cmd )
			{
				displayPoolMembers(poolname);
			}
			else if ( (null != cmd) && (null != memberaddr) && (-1 != memberport) )
			{
				if ( cmd.equals("add") )
				{
					addPoolMember(poolname, memberaddr, memberport);
				}
				else if (cmd.equals("remove") )
				{
					removePoolMember(poolname, memberaddr, memberport);
				}
				else if (cmd.equals("sessstate") )
				{
					setPoolMemberSessionState(poolname, memberaddr, memberport, state);
				}
				else if (cmd.equals("getstate") )
				{
					getPoolMemberEnabledState(poolname, memberaddr, memberport);
				}
				else if (cmd.equals("getgtmrule") )
				{
					getGtmRule(poolname);
				}
				else
				{
					usage();
				}
			}
			else
			{
				usage();
			}

			bSuccess = true;
		}

		return bSuccess;
	}

	//--------------------------------------------------------------------------
	//
	//--------------------------------------------------------------------------
	public void usage()
	{
		System.out.println("Usage: PoolMember hostname port username password [pool [add|remove memberaddr memberport]]\n");
	}
	
	public void displayAllPools() throws Exception
	{
		String [] pool_list = m_interfaces.getLocalLBPool().get_list();
		System.out.println("Pools\n");
		for(int i=0; i<pool_list.length; i++)
		{
			System.out.println(pool_list[i]);
		}
	}
	
	public void displayPoolMembers(String poolname) throws Exception
	{
		iControl.CommonIPPortDefinition [][] membersAofA = m_interfaces.getLocalLBPool().get_member(new String [] { poolname } );
		System.out.println("Pool " + poolname + " members\n");
		for(int i=0; i<membersAofA[0].length; i++)
		{
			System.out.println(membersAofA[0][i].getAddress() + ":" + membersAofA[0][i].getPort());
		}
	}
	
	public void addPoolMember(String poolname, String memberaddr, long memberport) throws Exception
	{
		String [] pool_list = new String [] { poolname };
		iControl.CommonIPPortDefinition [][] membersAofA = new iControl.CommonIPPortDefinition[1][];
		membersAofA[0] = new iControl.CommonIPPortDefinition[1];
		membersAofA[0][0] = new iControl.CommonIPPortDefinition();
		membersAofA[0][0].setAddress(memberaddr);
		membersAofA[0][0].setPort(memberport);
		m_interfaces.getLocalLBPool().add_member(pool_list, membersAofA);
	}

	public void removePoolMember(String poolname, String memberaddr, long memberport) throws Exception
	{
		String [] pool_list = new String [] { poolname };
		iControl.CommonIPPortDefinition [][] membersAofA = new iControl.CommonIPPortDefinition[1][];
		membersAofA[0] = new iControl.CommonIPPortDefinition[1];
		membersAofA[0][0] = new iControl.CommonIPPortDefinition();
		membersAofA[0][0].setAddress(memberaddr);
		membersAofA[0][0].setPort(memberport);
		m_interfaces.getLocalLBPool().remove_member(pool_list, membersAofA);
	}
	
	public void setPoolMemberSessionState(String poolname, String memberaddr, long memberport, String state) throws Exception
	{
		String [] pool_list = new String [] { poolname };
		iControl.LocalLBPoolMemberMemberSessionState [][] statesAofA = new iControl.LocalLBPoolMemberMemberSessionState[1][];
		statesAofA[0] = new iControl.LocalLBPoolMemberMemberSessionState[1];
		statesAofA[0][0] = new iControl.LocalLBPoolMemberMemberSessionState();
		statesAofA[0][0].setMember(new iControl.CommonIPPortDefinition());
		statesAofA[0][0].getMember().setAddress(memberaddr);
		statesAofA[0][0].getMember().setPort(memberport);
		if ( state.equals("enable") )
		{ 
			statesAofA[0][0].setSession_state(iControl.CommonEnabledState.STATE_ENABLED);
		}
		else
		{
			statesAofA[0][0].setSession_state(iControl.CommonEnabledState.STATE_DISABLED);
		}
		m_interfaces.getLocalLBPoolMember().set_session_enabled_state(pool_list, statesAofA);
		
	}

	public void getPoolMemberEnabledState(String poolname, String memberaddr, long memberport) throws Exception
	{
		
	}
	
	public void getGtmRule(String rulename) throws Exception
	{
		iControl.GlobalLBRuleRuleDefinition [] rule_defs = m_interfaces.getGlobalLBRule().query_rule(new String[] { rulename });
		for(int i=0; i<rule_defs.length; i++)
		{
			System.out.println(rule_defs[i].getRule_name());
			System.out.println(rule_defs[i].getRule_definition());
			System.out.println("-----------------------");
		}
	}


	//--------------------------------------------------------------------------
	// Main
	//--------------------------------------------------------------------------
	public static void main(String[] args)
	{
		try
		{
			PoolMember poolMember = new PoolMember();
			poolMember.parseArgs(args);
		}
		catch(Exception ex)
		{
			ex.printStackTrace(System.out);
		}
	}
};
