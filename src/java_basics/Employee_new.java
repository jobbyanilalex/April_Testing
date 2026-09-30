package java_basics;

public class Employee_new {
	String name="Jobby";
	float salary=20000f;
	static String companyName="ABC";
	
	public void salary() {
		float bonus=2000f;
		float totsal=salary+bonus;
		System.out.println("Total Salary = "+totsal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_new obj=new Employee_new();
		System.out.println("Employee Name :"+obj.name);
		System.out.println("Company Name :"+companyName);
		obj.salary();
		

	}

}
