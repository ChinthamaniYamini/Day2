package match;

import practice.Player;

public class TeamBO {
	String data;
	
	public Team createTeam(String data, match.Player[] listOfPlayer) {
		Team t = new Team(data, data);
		Player p = new Player();
		
		for (int i = 0; i < listOfPlayer.length; i++) {
			System.out.println("");
        }
		return t;
	}
}


//  parse the string data using Split method defined in the string class and and construct a team object. 
// Iterate through the playerList and get the player object reference.



