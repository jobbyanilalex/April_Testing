package java_basics;

public class Met_check {
	public void checkNumber(int n) {
		if(n>0) {
			System.out.println("The number is positive");
		}
		else if(n<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is zero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Met_check obj=new Met_check();
			obj.checkNumber(8);
		
			
			

	}

}
