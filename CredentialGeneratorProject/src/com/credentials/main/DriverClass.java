package com.credentials.main;

import java.util.Scanner;

import com.credentials.model.Employee;
import com.credentials.sevice.Credentials;

public class DriverClass {
	public static void main(String[] args) {
	   
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter your FirstName::");
			
					String FirstName=in.nextLine();
					System.out.println("ENter your LastName");
					String LastName=in.nextLine();
	   Employee e1 = new Employee(LastName,FirstName);
	   Credentials c = new Credentials();
	   System.out.println("Please enter the department from the following");
	   System.out.println("1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
	   int option = in.nextInt();
	   switch (option) {
	   case 1:
		   c.showCredentials(e1, "tech");
	       break;
	   case 2 :
		   c.showCredentials(e1, "admin");
	       break;
	   case 3 :
		   c.showCredentials(e1, "HR");
	       break;
	   case 4 :
		   c.showCredentials(e1, "Legal");
	       break;
	       
	   }
		}
	}
}
	   
	   
	
	
	
	
	
	
					
					
					
					
					