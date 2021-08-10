import java.io.*;
import java.util.*;

class InningsMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the team name:");
		String teamname = input.nextLine();
		System.out.println("Enter session:");
		String session = input.nextLine();
		System.out.println("Enter runs:");
		int runs = input.nextInt();

		Innings inn = new Innings();
		inn.setTeamname(teamname);
		inn.setInningsname(session);
		inn.setRuns(runs);
		inn.displayInningsDetails();
	}
}
