package java_basics;

public class Nfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int num=5;
		int i=1;
		do {
			fact=fact*i;
			i++;
		}while(i<=num);
			System.out.println("Factorial of "+ num + " = " +fact);
	}

}
