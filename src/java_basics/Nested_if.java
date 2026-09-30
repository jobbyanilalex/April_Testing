package java_basics;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=8;
		String gender="male";
		
		if(age>=18) {
			if(gender=="male") {
				System.out.println("Display male product");
			}
			else {
				System.out.println("Display kids product");
			}
		}
		else {
			System.out.println("Display casuals");
			
		}

	}
}
