package match;


public class MatchBO {
	
	public void viewDetails(String matchList[]){
	  for (int i = 0; i < matchList.length; i++) {
	            System.out.println(matchList[i] + " ");
	        }
	 }

	public Match createMatch(String data, Team[] teamList) {
		Match m  = new Match();
		for (int i = 0; i < teamList.length; i++) {
			System.out.println("");
		}
		return m;
	}

	public void findTeam(String matchDate, Match[] listOfMatch) {
		int count=0;
		 for (int i = 0; i < listOfMatch.length; i++) {
		      Match dp = listOfMatch[i];
		      boolean check = dp.contains(matchDate); 
		      if(check){
		        System.out.println(listOfMatch[i]);
		        count++;
		      }
		}
	
		if(count==0) {
		 System.out.println("No Match Date Found");
		}	
	}

	public void findAllMatchesOfTeam(String teamName, Match[] listOfMatch) {
		int count=0;
		 
		 for (int i = 0; i < listOfMatch.length; i++) {
		      Match dp = listOfMatch[i];
		      boolean check = dp.contains(teamName); 
		      if(check){
		        System.out.println(listOfMatch[i].toString());
		        count++;
		      }
		}
	
		if(count==0) {
		 System.out.println("Team Name not Found");
		}	
		
	}
}


