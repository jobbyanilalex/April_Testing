package java_basics;

import java.util.Scanner;

public class Task {
	public void palindrome(String s) {
		//s=s.toLowerCase();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string :");
		String input=sc.nextLine();
		Task obj=new Task();
		obj.palindrome(input);
		sc.close();

	}

}
