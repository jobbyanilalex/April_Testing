package java_basics;

public class Grade_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='B';
		
		switch(grade) {
		
		case 'A':
			System.out.println("Excellent Performance");
			break;
		case 'B':
			System.out.println("Good Performance");
			break;
		case 'C':
			System.out.println("Average Performance");
			break;
		case 'D':
			System.out.println("Needs Improvement");
			break;
		case 'F':
			System.out.println("Failed");
			break;	
		default:
			System.out.println("Invalid Grade");
			break;	
			
			
		}

	}

}
