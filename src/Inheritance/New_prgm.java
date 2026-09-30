package Inheritance;

class Person{
	void emp() {
		String name="jobby";
		int age=24;
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
}
}

class Employee1 extends Person{
	void id() {
		int employeeId=2;
		int salary=50000;
		System.out.println("EmployeeId :"+employeeId);
		System.out.println("Salary :"+salary);
	}
}

class Manager1 extends Employee1{
	void dept() {
		String dep="Software";
		System.out.println("Department :"+dep);
	}
}
public class New_prgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager1 obj=new Manager1();
		obj.emp();
		obj.id();
		obj.dept();

	}

}
