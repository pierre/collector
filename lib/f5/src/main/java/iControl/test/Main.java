import iControl.LocalLBPoolPortType;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
	  
 public class Main {
	 
	 public void GetPoolMemberStats(String bigip, String username, String password, String pool_name)
		throws RemoteException, java.lang.Exception {

		iControl.Interfaces interfaces = new iControl.Interfaces();
		 
		if (interfaces.initialize(bigip, (long)443, username, password) ) {
			
			String [] pool_list = new String[] {pool_name};
			
			iControl.LocalLBPoolMemberPortType t = interfaces.getLocalLBPoolMember();
			iControl.LocalLBPoolMemberMemberStatistics [] memberStatsA =
				t.get_all_statistics(pool_list);
			
			for(int i=0; i<memberStatsA.length; i++)
			{
				System.out.println("Pool " + pool_list[i]);
				
				iControl.LocalLBPoolMemberMemberStatisticEntry [] statEntryA = memberStatsA[i].getStatistics();
				for(int j=0; j<statEntryA.length; j++)
				{
					iControl.CommonIPPortDefinition memberDef = statEntryA[j].getMember();
					System.out.println("+ " + memberDef.getAddress() +
						memberDef.getPort());
					
					iControl.CommonStatistic[] statisticsA = 
						statEntryA[j].getStatistics();
					
					for(int k=0; k<statisticsA.length; k++)
					{
						iControl.CommonStatisticType type = statisticsA[k].getType();
						iControl.CommonULong64 ul64 = statisticsA[k].getValue();
						
						long value = (long)(ul64.getHigh()<<32) + (long)ul64.getLow();
						
						System.out.println("    " + type.toString() + " -> " + value);
						
					}
					
				}
			 }
		 }
	 }
	 
	 public static void main(String[] args) throws RemoteException, java.lang.Exception {
		 Main prog = new Main();
		 prog.GetPoolMemberStats("theboss", "admin", "admin", "xpbert-http");
	 }
 }