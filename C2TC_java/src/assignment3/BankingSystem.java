package assignment3;

public class BankingSystem {
	public static void main(String[] args) {
		Savings sa = new Savings("Pravven", 5000);
		AccountCheck ca = new AccountCheck("Antony", 10000);
		
		System.out.println("TotalAccounts: " + Bank.getTotalAccount());
		
		Transaction txn = new Transaction();
		txn.performTransaction(sa, "deposit", 2000);
		txn.performTransaction(sa, "withdraw", 1000);
		
		txn.performTransaction(ca, "deposit", 1500);
		txn.performTransaction(ca, "withdraw", 6000);
		
		sa.printAccountInfo();
		ca.printAccountInfo();

	}
}
