package java_basics;

public class BankAccount {
	String accountNumber="256321727";
	double balance=750000;
	static String bankName="NEW";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount();
		
		System.out.println("Bank Name :"+bankName);
		System.out.println("Account Number :"+obj.accountNumber);
		System.out.println("Account Number :"+obj.balance);

	}

}
