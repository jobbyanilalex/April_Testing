package java_basics;

public class For_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial=1;
		int num=5;
		
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
			System.out.println("Factorial="+factorial);
	}

}
