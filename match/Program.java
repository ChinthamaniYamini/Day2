package match;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int noOfPlayers = 0;
		int noOfTeams = 0;
		int noOfMatchs = 0;
		Scanner sc = new Scanner(System.in);
		MatchBO matchBO = new MatchBO();

		try {
			System.out.print("Enter the player count: ");
			noOfPlayers = sc.nextInt();
			sc.nextLine();
			Player[] listOfPlayer = new Player[noOfPlayers];

			for (int i = 0; i < noOfPlayers; i++) {
				String playerdetail = "";
				System.out.print("Enter Player " + (i + 1) + " details: ");
				playerdetail = sc.nextLine();
				PlayerBO playerBO = new PlayerBO();
				listOfPlayer[i] = playerBO.createPlayer(playerdetail);
			}

			System.out.println("Enter the team count: ");
			noOfTeams = sc.nextInt();
			sc.nextLine();
			Team[] listOfTeam = new Team[noOfTeams];

			for (int i = 0; i < noOfTeams; i++) {
				String teamdetail = "";
				System.out.println("Enter team " + (i + 1) + " details: ");
				teamdetail = sc.nextLine();
				TeamBO teamBO = new TeamBO();
				listOfTeam[i] = teamBO.createTeam(teamdetail, listOfPlayer);
			}

			System.out.println("Enter the match count: ");
			noOfMatchs = sc.nextInt();
			sc.nextLine();
			Match[] listOfMatch = new Match[noOfMatchs];

			for (int i = 0; i < noOfTeams; i++) {
				String matchdetail = "";
				System.out.println("Enter match " + (i + 1) + " details: ");
				matchdetail = sc.nextLine();
				listOfMatch[i] = matchBO.createMatch(matchdetail, listOfTeam);
			}

			while (true) {
				System.out.println("\nMenu : \n1) Find Team \n2) Find All Matches In A Specific Venue \n Type 1 or 2 \nEnter your choice ");
				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.println("Enter Match date: ");
					String matchDate = sc.nextLine();
					matchBO.findTeam(matchDate, listOfMatch);
					break;
				case 2:
					System.out.println("Enter Team Name: ");
					String teamName = sc.nextLine();
					matchBO.findAllMatchesOfTeam(teamName, listOfMatch);
					break;
				default:
					System.out.println("Does not exist");
					break;
				}

			}
		} catch (InputMismatchException err) {
			System.out.println("Invalid, please enter valid details.");
		} finally {
			System.exit(1);
		}
	}

}

