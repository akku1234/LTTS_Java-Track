import java.util.*;
class CustomMain {
	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		int playerAge;
		String playerName;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the player name");
			playerName = sc.nextLine();
			System.out.println("Enter the player age");
			playerAge = Integer.parseInt(sc.nextLine());
			sc.close();
			if(playerAge<19) {
				throw new CustomException("InvalidAgeRangeException");
		
			}
			
			System.out.println("Player name : " +playerName);
			System.out.println("Player age : " +playerAge);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}