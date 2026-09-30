package java_basics;


public class New_meth {
	
	public void add() {
		int a=10,b=45;
		int sum=a+b;
		System.out.println("Sum = "+sum);
	}
	
	public void sub() {
		int a=100,b=65;
		int sub=a-b;
		System.out.println("Difference = "+sub);
	}
	
	public int mul() {
		int a=10,b=45;
		int mul=a*b;
		return mul;
	}
	
	public int div() {
		int a=5,b=45;
		int div=a/b;
		return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		New_meth obj=new New_meth();
		obj.add();
		obj.sub();
		int c=obj.mul();
			System.out.println("Product = "+c);
		int d=obj.div();
			System.out.println("Remainder = "+d);

	}

}
