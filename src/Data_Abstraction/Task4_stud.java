package Data_Abstraction;

class EngineeringStudent implements Student{
	int mark=85;
	public String calculateGrade() {
		if(mark>=90) {
			return "A";
		}
		else if(mark>=80) {
			return "B";
		}
		else if(mark>=70) {
			return "c";
		}
		else {
			return "Fail";
		}
	}
}
class MedicalStudent implements Student{
	int mark=78;
	public String calculateGrade() {
		if(mark>=90) {
			return "A";
		}
		else if(mark>=80) {
			return "B";
		}
		else if(mark>=70) {
			return "c";
		}
		else {
			return "Fail";
		}
    
	}
}
public class Task4_stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	EngineeringStudent e = new EngineeringStudent();
	        System.out.println(Student.name);
	        System.out.println(Student.rollNo);
	        System.out.println(e.calculateGrade());
	        System.out.println("--------------------------------");
	        MedicalStudent m = new MedicalStudent();
	        System.out.println(Student.name);
	        System.out.println(Student.rollNo);
	        System.out.println(m.calculateGrade());
	        
	}

}
