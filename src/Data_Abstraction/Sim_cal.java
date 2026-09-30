package Data_Abstraction;

import java.util.Scanner;

public class Sim_cal implements Simple_cal {
	
	public double add(double a,double b) {
		return a+b;
	}
	public double sub(double a,double b) {
		return a-b;
	}
	public double mul(double a,double b) {
		return a*b;
	}
	public double div(double a,double b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Simple_cal c=new Sim_cal();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number =");
		double num1=sc.nextDouble();
		System.out.println("Enter second number =");
		double num2=sc.nextDouble();
		System.out.println("Enter operator(+,-,*,/) =");
		String op=sc.next();
		double result;
		
		switch(op) {
		
			case "+":
				 result=c.add(num1, num2);
				System.out.println("Sum ="+result);
			break;
			
			case "-":
				 result=c.sub(num1, num2);
				System.out.println("Difference ="+result);
			break;
			
			case "*":
				 result=c.mul(num1, num2);
				System.out.println("Product ="+result);
			break;
			
			case "/":
				 result=c.div(num1, num2);
				System.out.println("Quotient ="+result);
			break;
			
			default:
				System.out.println("Invalid operator");
			break;
			
		}
	}

}
