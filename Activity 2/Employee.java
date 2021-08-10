import java.io.*;
import java.util.*;

class Employee{
	private String name;
	private String address;
	private String mobile;

	public String getName(){
		return name;
	}
	public void setName(String newName){
		this.name = newName;
	}

	public String getAddress(){
		return address;
	}
	public void setAddress(String newAddress){
		this.address = newAddress;
	}

	public String getMobile(){
		return mobile;
	}
	public void setMobile(String newMobile){
		this.mobile = newMobile;
	}
}
