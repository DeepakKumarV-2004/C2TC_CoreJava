package assignment3;

public class Transaction {
	private final double transactionFee = 10.0;
	
	public final void performTransaction(Account acc, String type, double amount) {
		System.out.println("Processing " + type + " of ₹" + amount);
		
		if("deposit".equalsIgnoreCase(type)) {
			acc.deposit(amount);
		} else if("withdraw".equalsIgnoreCase(type)) {
			acc.withdraw(amount + transactionFee);
		} else {
			System.out.println("Invalid transaction type.");
		}
		System.out.println("Balance: ₹" + acc.getBalance());
		System.out.println("Fee: ₹" + transactionFee);
		System.out.println("---------------------");
	}
}
