package Data_Abstraction;

interface abc{
	int a=20;//by default treated as static variable
	final int b=30;
	
	static void method_static() {
		System.out.println("static method");
	}
	
	default void method_default() {
		System.out.println("default method");
	}
	
	abstract void method_ab();
}

public class Interface_demo implements abc {
	
	public void method_ab() {
		System.out.println("abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abc ab=new Interface_demo();
		System.out.println(a);
		System.out.println(b);//we do not need to call using object because here final variable is treated as static 
		
		ab.method_default();
		ab.method_ab();
		abc.method_static();//for calling a static method in interface call the static method using interface name not with inteface object
	}

}
