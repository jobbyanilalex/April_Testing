package java_basics;

public class Number_Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-4;
		
		if(a>0) {
			System.out.println("The number is positive");
			if(a%2==0) {
				System.out.println("The number is even");
			}
			else {
				System.out.println("The number is odd");
			}
		}
		else if(a<0) {
				System.out.println("The number is negative");
				if(a%2==0) {
					System.out.println("The number is even");
				}
				else {
					System.out.println("The number is odd");
				}
			}
		else {
			System.out.println("The number is zero");
		}

	}

}
