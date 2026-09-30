package java_basics;

public class Met_divisible {
	public void checkDivisible(int n) {
		if(n%5==0) {
			System.out.println("Divisible by 5");
		}
		else {
            System.out.println("Not divisible by 5");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Met_divisible obj=new Met_divisible();
		obj.checkDivisible(35);

	}

}
