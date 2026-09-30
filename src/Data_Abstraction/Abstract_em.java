package Data_Abstraction;

abstract class Employee{
	public abstract void calculateSalary();
}
class permanentEmployee extends Employee{
	public void calculateSalary() {
        int basicSalary=30000;
        int bonus=5000;

        int salary=basicSalary+bonus;

        System.out.println("Permanent Employee Salary: " +salary);
    }
}
class contractEmployee extends Employee {

    public void calculateSalary() {
        int hoursWorked=160;
        int hourlyRate=200;

        int salary=hoursWorked*hourlyRate;

        System.out.println("Contract Employee Salary: " +salary);
    }
}
public class Abstract_em {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permanentEmployee p=new permanentEmployee();
		p.calculateSalary();
		contractEmployee c=new contractEmployee();
		c.calculateSalary();
	}

}
