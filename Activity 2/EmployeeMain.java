import java.io.*;
import java.util.*;

public class EmployeeMain {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter the name:");
		String name = input.nextLine();
		System.out.println("Enter Address:");
		String address = input.nextLine();
		System.out.println("Enter Mobile:");
		String mobile = input.nextLine();
		emp.setName(name);
		emp.setAddress(address);
		emp.setMobile(mobile);
		System.out.println("Employee Details");
		System.out.println("Name: "+ emp.getName());
		System.out.println("Address: "+ emp.getAddress());
		System.out.println("Mobile: "+ emp.getMobile());




	}
}
