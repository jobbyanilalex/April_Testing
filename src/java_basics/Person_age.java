package java_basics;

public class Person_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=24;
		String nationality="Indian";
		
		if(nationality=="Indian") {
			
			if(age>=18) {
				System.out.println("Eligible to Vote");
			}
			else {
				System.out.println("Not Eligible to Vote");
			}
		}
		else {
			System.out.println("Only Indian citizens can vote");
		}

	}

}
