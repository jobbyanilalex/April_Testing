package demoexception;

import java.util.Scanner;

public class String_excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter String:");
			String s=sc.nextLine();
			
			System.out.println("Enter Index:");
			int i=sc.nextInt();
			
			char c=s.charAt(i);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
