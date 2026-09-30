package Data_Abstraction;

abstract class Account{
	int accountNumber;
	double balance;
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	public void displayBalance() {
		System.out.println("Account Number ="+accountNumber);
		System.out.println("Balance ="+balance);
	}
}

//Savings Account
class SavingsAccount extends Account{

    public void deposit(double amount){
        balance = balance+amount;
        System.out.println("Savings Account - Deposited: " +amount);
    }

    public void withdraw(double amount) {
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Savings Account - Withdrawn: " +amount);
        }
        else{
            System.out.println("Savings Account - Insufficient balance");
        }
    }
}

//Current Account
class CurrentAccount extends Account{

    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Current Account - Deposited: " +amount);
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Current Account - Withdrawn: " +amount);
        } 
        else{
            System.out.println("Current Account - Insufficient balance");
        }
    }
}

public class Abstract_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--Savings Account--");
		SavingsAccount obj=new SavingsAccount();
		obj.accountNumber=1;
		obj.balance=40000;
		obj.deposit(1000);
		obj.withdraw(500);
		obj.displayBalance();
		
		System.out.println("--Current Account--");
		CurrentAccount obj1=new CurrentAccount();
		obj1.accountNumber=2;
		obj1.balance=30000;
		obj1.deposit(2000);
		obj1.withdraw(1000);
		obj1.displayBalance();
	}

}
