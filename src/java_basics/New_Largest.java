package java_basics;

import java.util.Scanner;

public class New_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st number : ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number : ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd number : ");
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("Largest number is:"+a);
			}
			else {
				System.out.println("Largest number is:"+c);
			}
		}
		else {
			if(b>c) {
				System.out.println("Largest number is:"+b);
			}
			else {
				System.out.println("Largest number is:"+c);
			}
		}

	}

	

}
