package com.credentials.sevice;
import java.util.Random;

import com.credentials.model.Employee;
public class Credentials {
	private String generatePassword() {
		String code = "ABCDEFGHIJJKMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!_";
		String pwd = "";

		Random r = new Random();

		
		for (int i = 1; i <= 8; i++) {
			pwd = pwd + code.charAt(r.nextInt(code.length()));
			
//			pwd = pwd + (char)(r.nextInt(123-33)+33);

		}

		return pwd;
	} 
	private String generateEmailAddress(Employee e, String dept) {
		return e.getFirstName().toLowerCase() + e.getLastName().toLowerCase() + "@" + dept + ".abc.com";
	}

	
	
	
	
	
	

	public void showCredentials(Employee e1,String deparment)
	{
		System.out.println("Dear"+e1.getFirstName()+"your generated credentials are as follows :");
		
		System.out.println("Email     ---->" +generateEmailAddress(e1,deparment));
        System.out.println( "Password ------> " + generatePassword());
		
		
		
	}
	

		
	}







