package Data_Abstraction;

class CreditCardPayment implements Payment{
	public void makePayment(double amount) {
		System.out.println("Processing credit card payment of Rs. " +amount);
        System.out.println("Validating card details... Payment approved");
	}
}
class UPIPayment implements Payment{
	public void makePayment(double amount) {
		System.out.println("Processing UPI payment of Rs. " +amount);
        System.out.println("Verifying UPI ID and PIN... Payment successful");
	}
}
class CashPayment implements Payment{
	public void makePayment(double amount) {
		System.out.println("Processing cash payment of Rs. " +amount);
        System.out.println("No digital verification needed. Cash received");
	}
}
public class Task5_payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment obj=new CreditCardPayment();
		obj.makePayment(150.5);
		Payment obj1=new UPIPayment();
		obj1.makePayment(45.0);
		Payment obj2=new CashPayment();
		obj2.makePayment(20.0);
	}
}
