import java.io.*;
import java.util.*;

class CompanyMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the company name:");
		String name = input.nextLine();
		System.out.println("Enter the employees:");
		String employees = input.nextLine();	;
		System.out.println("Enter teamlead:");
		String teamlead = input.nextLine();


		Company inn = new Company();
		inn.setName(name);
		inn.setEmployees(employees);

		String[] list1 = employees.split(",");
		if(Arrays.asList(list1).contains(teamlead)){
			inn.setTeamlead(teamlead);
		}
		else{
			inn.setTeamlead("Invalid input");
		}


		inn.displaycompanyDetails();
	}
}
