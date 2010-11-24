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

public class SystemInfo extends Object
{
	//--------------------------------------------------------------------------
	// Member Variables
	//--------------------------------------------------------------------------
	public iControl.Interfaces m_interfaces = new iControl.Interfaces();

	//--------------------------------------------------------------------------
	// Constructor
	//--------------------------------------------------------------------------
	public SystemInfo()
	{
	}

	//--------------------------------------------------------------------------
	// parseArgs
	//--------------------------------------------------------------------------
	public boolean parseArgs(String[] args) throws Exception
	{
		boolean bSuccess = false;

		if ( args.length < 4 )
		{
			usage();
		}
		else
		{
			// build parameters
			m_interfaces.initialize(args[0], Integer.parseInt(args[1]), args[2], args[3]);

			bSuccess = true;
		}

		return bSuccess;
	}

	//--------------------------------------------------------------------------
	//
	//--------------------------------------------------------------------------
	public void usage()
	{
		System.out.println("Usage: SystemInfo hostname username password\n");
	}

	//--------------------------------------------------------------------------
	// 
	//--------------------------------------------------------------------------
	public void getSystemInfo() throws Exception
	{
		iControl.SystemSystemInformation systemInformation = null;
		systemInformation = m_interfaces.getSystemSystemInfo().get_system_information();

		System.out.println("======================================================");
		System.out.println(" System Information");
		System.out.println("------------------------------------------------------");
		System.out.println("System Name                     : " + systemInformation.getSystem_name());
		System.out.println("Host name                       : " + systemInformation.getHost_name());
		System.out.println("OS Release                      : " + systemInformation.getOs_release());
		System.out.println("OS Machine                      : " + systemInformation.getOs_machine());
		System.out.println("OS Version                      : " + systemInformation.getOs_version());
		System.out.println("Platform                        : " + systemInformation.getPlatform());
		System.out.println("Product Category                : " + systemInformation.getProduct_category());
		System.out.println("Chassis Serial                  : " + systemInformation.getChassis_serial());
		System.out.println("Switch Board Serial             : " + systemInformation.getSwitch_board_serial());
		System.out.println("Switch Board Part Revision      : " + systemInformation.getSwitch_board_part_revision());
		System.out.println("Host Board Serial               : " + systemInformation.getHost_board_serial());
		System.out.println("host Board Part Revision        : " + systemInformation.getHost_board_part_revision());
		System.out.println("Annunciator Board Serial        : " + systemInformation.getAnnunciator_board_serial());
		System.out.println("Annunciator Board Part Revision : " + systemInformation.getAnnunciator_board_part_revision());

		String systemId = m_interfaces.getSystemSystemInfo().get_system_id();
		System.out.println("------------------------------------------------------");
		System.out.println("System Id                       : " + systemId);

		iControl.CommonTimeStamp timeStamp = null;
		timeStamp = m_interfaces.getSystemSystemInfo().get_time();

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat tf = DateFormat.getTimeInstance(DateFormat.FULL);

		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-0"));
		cal.set((int)timeStamp.getYear(), (int)timeStamp.getMonth()-1, (int)timeStamp.getDay(),
				(int)timeStamp.getHour(), (int)timeStamp.getMinute(), (int)timeStamp.getSecond());

		System.out.println("------------------------------------------------------");
		System.out.println("Time                           : " + df.format(cal.getTime()) + " " + tf.format(cal.getTime()));

		iControl.SystemProductInformation productInformation = null;
		productInformation = m_interfaces.getSystemSystemInfo().get_product_information();
		System.out.println("======================================================");
		System.out.println("Product Information");
		System.out.println("------------------------------------------------------");
		System.out.println("Product Code                    : " + productInformation.getProduct_code());
		System.out.println("Product Version                 : " + productInformation.getProduct_version());
		System.out.println("Package Version                 : " + productInformation.getPackage_version());
		System.out.println("Package Edition                 : " + productInformation.getPackage_edition());

		System.out.println("Product Features:");
		for(int i=0; i<productInformation.getProduct_features().length; i++)
		{
			System.out.println("\t" + productInformation.getProduct_features()[i]);
		}
	}


	//--------------------------------------------------------------------------
	// Main
	//--------------------------------------------------------------------------
	public static void main(String[] args)
	{
		try
		{
			SystemInfo sysInfo = new SystemInfo();
			if ( sysInfo.parseArgs(args) )
			{
				sysInfo.getSystemInfo();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace(System.out);
		}
	}
};
