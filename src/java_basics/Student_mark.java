package java_basics;

public class Student_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=75;
		float attendance=50.5f;
		
		if(mark>=50) {
			
			if(attendance>=90) {
				System.out.println("Eligible for Scholarship");
			}
			else {
				System.out.println("Passed but Not Eligible for Scholarship");
			}
		}
		else {
			System.out.println("Failed");
		}

	}

}
