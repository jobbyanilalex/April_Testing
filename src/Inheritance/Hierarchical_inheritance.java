package Inheritance;

class Employee{
	void salary() {
		int sal=75000;
		System.out.println(sal);
	}
}
class Manager extends Employee{
	void bonus() {
		int bonus=2000;
		System.out.println(bonus);
	}
}
class Executive extends Employee{
	void bonus1() {
		int bonus1=1000;
		System.out.println(bonus1);
	}
}

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager obj=new Manager();
		Executive obj1=new Executive();
		
		obj.salary();
		obj.bonus();
		obj1.salary();
		obj1.bonus1();
		
	}

}
