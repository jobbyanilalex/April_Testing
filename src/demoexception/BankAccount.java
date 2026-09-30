package demoexception;

public class BankAccount {
	
	double balance=50000;

    public void withdraw(double amount) {

        try {
            if(amount>balance) {
                System.out.println("Insufficient balance");
            } 
            else {
                balance=balance-amount;
                System.out.println("Withdrawal successful");
                System.out.println("Balance: " + balance);
            }
        }
        catch (Exception e) {
        	e.getMessage();
        }
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b = new BankAccount();
		b.withdraw(500000);
	}

}
