import java.io.*;
class Exception1 {

	public static void main(String[] args) {
		
		int score, over;
		 BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		 try {
			 System.out.println("Enter the total runs scored");
			 score = Integer.parseInt(inp.readLine());
			System.out.println("Enter the total overs faced");
			over = Integer.parseInt(inp.readLine());
			float run = score / over;
			System.out.println("Current Run Rate : " + run);
		} catch (Exception e) {
		
			 System.out.println(e.toString());	
		}
		 
	}
	
}