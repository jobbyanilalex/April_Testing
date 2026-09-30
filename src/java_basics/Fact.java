package java_basics;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial=1;
		int num=6;
		int i=1;
		while(i<=num) {
			factorial=factorial*i;
			i++;
			
		}
		System.out.println("Factorial of " +num+" = "+factorial);
	}

}
