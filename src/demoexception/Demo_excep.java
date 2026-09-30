package demoexception;

import java.util.Scanner;

public class Demo_excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter number:");
			int n=sc.nextInt();
			System.out.println(100/n);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//catch(Exception e) {
			//e.printstackTrace();
		//}
		System.out.println("End of Program");
		sc.close();
	}

}
