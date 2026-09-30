package Inheritance;

class Student{
	void rollno() {
		int roll=20;
		System.out.println(roll);
	}
}
class Marks extends Student{
	void exam() {
		String sub="Computer";
		System.out.println(sub);
	}
}
class Result extends Marks{
	void result(){
		System.out.println("Pass");
	}
}
public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result obj=new Result();
		obj.rollno();
		obj.exam();
		obj.result();
	}

}