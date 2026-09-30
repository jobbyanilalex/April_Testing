package demoexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter number :");
			int a=sc.nextInt();
			System.out.println("Number ="+a);
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("End");
		}
		sc.close();
	}

}
