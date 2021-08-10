import java.io.*;
import java.util.*;

class CustomerMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the details:");
		String details = input.nextLine();
		String[] arrDetails = details.split(",", 3);
		Customer cust = new Customer();
		cust.setName(arrDetails[0]);
		cust.setAddress(arrDetails[1]);
		cust.setMobile(arrDetails[2]);
		System.out.println("Name: "+cust.getName());
		System.out.println("Address: "+cust.getAddress());
		System.out.println("Mobile: "+cust.getMobile());
	}
}
