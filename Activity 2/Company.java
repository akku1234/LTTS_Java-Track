import java.io.*;
import java.util.*;

class Company{
	private String name;
	private String employees;
	private String teamlead;

	public String getName(){
		return name;
	}
	public void setName(String newName){
		this.name = newName;
	}

	public String getEmployees(){
		return employees;
	}
	public void setEmployees(String newEmployees){
		this.employees = newEmployees;
	}

	public String getTeamlead(){
		return teamlead;
	}
	public void setTeamlead(String newTeamlead){
		this.teamlead = newTeamlead;
	}

	public void displaycompanyDetails(){
		System.out.println("Name: "+name);
		System.out.println("Employees:s "+employees);
		System.out.println("Lead: "+teamlead);
	}
}
