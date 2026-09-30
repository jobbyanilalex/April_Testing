package Encapsulation;

public class ATM {

	private double balance;
	
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposited :" +amount);
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Withdrawn :" +amount);
		}
		else{
            System.out.println("Insufficient balance");
        }
	}
	
	public void checkBalance() {
		System.out.println("New Balance ="+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM obj=new ATM();
		
		obj.setbalance(45000);
		
		System.out.println("Balance :"+obj.getbalance());
		
		obj.deposit(5000);
		obj.withdraw(1000);
		obj.checkBalance();
		

	}

}
