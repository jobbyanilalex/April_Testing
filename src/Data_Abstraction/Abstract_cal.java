package Data_Abstraction;

abstract class Calculator{
	public abstract int add(int a,int b); 
	public abstract int subtract(int a,int b);
	public abstract int multiply(int a,int b);
	public abstract int divide(int a,int b);
}

class SimpleCalculator extends Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int divide(int a,int b) {
		return a/b;
	}
}
public class Abstract_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalculator obj=new SimpleCalculator();
		
		int sum=obj.add(4,6);
		System.out.println("Sum ="+sum);
		
		int sub=obj.subtract(18,5);
		System.out.println("Difference ="+sub);
		
		int mul=obj.multiply(8,2);
		System.out.println("Product ="+mul);
		
		int div=obj.divide(40,2);
		System.out.println("Quotient ="+div);
	}

}
