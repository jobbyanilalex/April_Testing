package Data_Abstraction;

abstract class Bank{
	
	public abstract double getInterestRate();
	
}
class SBI extends Bank{
	public double getInterestRate() {
		
		return 5;
		
	}
}
class HDFC extends Bank{
		public double getInterestRate() {
			return 7.2;
			
		}	
}
class ICICI extends Bank{
			public double getInterestRate() {
				return 7.5;
				
			}
}
public class Ntask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI obj=new SBI();
		double a=obj.getInterestRate();
		System.out.println("SBI ="+a);
		HDFC obj1=new HDFC();
		double b=obj1.getInterestRate();
		System.out.println("HDFC ="+b);
		ICICI obj2=new ICICI();
		double c=obj2.getInterestRate();
		System.out.println("ICICI ="+c);
	}

}
