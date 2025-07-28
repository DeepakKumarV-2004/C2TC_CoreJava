package assignment3;

public class AccountCheck extends Account{
	
	public AccountCheck(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

	@Override
	public void withdraw(double amount) {

		if(balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds in CheckingAccount.");
		}
		
	}

	@Override
	public double getBalance() {

		return balance;
	}
	
	
}
