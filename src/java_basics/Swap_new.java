package java_basics;

public class Swap_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=50;
		int b=20;
		
		
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a = a + b;
        b = a - b;
        a = a - b;
		
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
