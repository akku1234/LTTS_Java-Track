import java.util.*;
import java.io.*;

public class string
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String f = sc.nextLine();
	    String s = sc.nextLine();
	    String res1 = f.substring(0, 1).toUpperCase() +f.substring(1).toLowerCase();
	    String res2 = s.substring(0).toUpperCase(); 
	    String res = res1 + " " +res2;
	    System.out.println(res);
	
	}
	
}
