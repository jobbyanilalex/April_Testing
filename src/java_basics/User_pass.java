package java_basics;

import java.util.Scanner;

public class User_pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="admin";
		String pass="12345";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the username :");
		String u=sc.nextLine();
		System.out.println("Enter the password :");
		String p=sc.nextLine();
		
		if(u.equals(user)&&p.equals(pass)) {
			System.out.println("Login Successful");
			
		}
		else {
			System.out.println("Login Failed");
		}
		

	}

}
