package java_basics;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9,b=12,c=21;
		
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
