package Democollection;

import java.util.HashSet;

public class Reg_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet a=new HashSet();
		
		a.add("hi@gmail.com");
		a.add(10);
		a.add(86.3);
		a.add("ab@gmail.com");
		
		System.out.println(a);
		
		if(a.contains("ab@gmail.com")) {
			System.out.println("Registered email");
		}
		else {
			System.out.println("Not registered");
		}
	}

}
