package Data_Abstraction;

abstract class Person{
	String name;
	int age;
}

class Doctor extends Person{
	public void diagnose() {
		System.out.println(name+" is diagnosing the patient");
	}
}
class Patient extends Person{
	public void displayMedicalDetails() {
		System.out.println("--Patient Details--");
		System.out.println("Name :"+name);
        System.out.println("Age :"+age);
	}
}
public class Task2_person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor obj=new Doctor();
		obj.name="Dr.John";
		obj.age=56;
		obj.diagnose();
		Patient obj1=new Patient();
		obj1.name="Sam";
		obj1.age=25;
		obj1.displayMedicalDetails();

	}

}
