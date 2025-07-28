package assignment3;

public class Bank {
    private static int totalAccounts = 0;

    public static void incrementAccount() {
        totalAccounts++;
    }

    public static int getTotalAccount() {
        return totalAccounts;
    }
}