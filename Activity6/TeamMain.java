import java.util.*;
class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Team> teamList = new ArrayList<Team>();
		
		System.out.println("Enter number of teams:");
		String teamName;
		int numberOfMatches;
		int numberOfTeams = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numberOfTeams; i++) {
			System.out.printf("Enter team %d detail \n Enter Name \n",i+1);
			teamName = sc.nextLine();
			System.out.println("Enter number of matches");
			numberOfMatches = Integer.parseInt(sc.nextLine());
			teamList.add(new Team(teamName, numberOfMatches));
		}
		Collections.sort(teamList, new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for (Team obj:teamList) {
			// Calls toString() by default
			System.out.println(obj);
		}		
		sc.close();
	}

}