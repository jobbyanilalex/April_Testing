package demoexception;

import java.util.Scanner;

public class Nexception {
	public static void divideNumber(int a,int b) {
		try {
            int result=a/b;
            System.out.println("Result ="+result);
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }	
	}
	public static void stringLength(String d) {
		try {
            int l=d.length();
            System.out.println("String length ="+l);
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
        int a=sc.nextInt();

        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        divideNumber(a,b);
        
        

        stringLength(null);

        sc.close();
	}

}
