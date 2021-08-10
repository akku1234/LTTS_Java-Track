import java.io.*;
import java.util.*;

public class EmployeeMain6 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Employee6 emp = new Employee6();
		System.out.println("Enter the name:");
		String name = input.nextLine();
		System.out.println("Enter Address:");
		String address = input.nextLine();
		System.out.println("Enter Mobile:");
		String mobile = input.nextLine();
		emp.setName(name);
		emp.setAddress(address);
		emp.setMobile(mobile);
		System.out.println("Employee Details: ");
		System.out.println("Name: "+ emp.getName());
		System.out.println("Address: "+ emp.getAddress());
		System.out.println("Mobile: "+ emp.getMobile());

		System.out.println("Verify and Update the details:");
		System.out.println("Menu:");
		System.out.println("1. Update Employee name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee mobile");
		System.out.println("4. All information correct/Exit");

		System.out.println("Menu:");
		int choice;
		choice = input.nextInt();
			Scanner input1 = new Scanner(System.in);
		switch(choice)
		{
			case 1:
									System.out.println("Current name:"+ emp.getName());
									System.out.println("Enter the name:");
									name = input1.nextLine();
									emp.setName(name);
					break;
			case 2:
									System.out.println("Current address: "+ emp.getAddress());
									System.out.println("Enter the Address: ");
									address = input1.nextLine();
									emp.setAddress(address);
					break;
			case 3:
									System.out.println("Current mobile: "+ emp.getMobile());
									System.out.println("Enter the mobile: " );
									mobile = input1.nextLine();
									emp.setMobile(mobile);
					break;
			case 4:
									System.out.println("Exit" );

					break;
			}
			emp.displayemployeeDetails();
		}
}
