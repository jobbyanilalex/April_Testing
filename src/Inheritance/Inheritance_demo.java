package Inheritance;

class First{//super class /parent class
	void concat() {
		String a="software",b="testing";
		System.out.println(a.concat(b));
	}
}
public class Inheritance_demo extends First {//sub class/child class
	void length() {
		String c="hello";
		System.out.println(c.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_demo obj=new Inheritance_demo();
		obj.concat();
		obj.length();

	}

}
