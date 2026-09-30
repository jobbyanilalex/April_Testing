package java_basics;

public class Swtich_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		String operator="/";
		
		switch(operator) {
		
		case "+":
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		case "-":
			System.out.println(a + " - " + b + " = " + (a-b));
			break;	
		case "*":
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
		case "/":
			if(b==0) {
				System.out.println("Division not possible");
			}
			else {
			
				System.out.println(a + " / " + b + " = " + (a/b));
		    }
			break;
		case "%":
			System.out.println(a + " % " + b + " = " + (a%b));
			break;
		default:
			System.out.println("Invalid operator");
			break;
		
		}
	

}
}