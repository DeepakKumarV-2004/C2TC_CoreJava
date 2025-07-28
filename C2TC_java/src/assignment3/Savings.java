package assignment3;

public class Savings extends Account{
	private static final double intrestRate = 0.03;
	
	public Savings(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void deposit(double amount) {

		balance += amount + (amount * intrestRate);
		
	}

	@Override
	public void withdraw(double amount) {

		if(balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds in SavingsAccount.");
		}
		
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
	
}
