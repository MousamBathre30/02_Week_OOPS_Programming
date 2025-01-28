package problemStatement.bankingSystem;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class BankingSystem {
    // Method to process accounts
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println(account);
            System.out.println("Interest Earned: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(5000);
            }

            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {
        // Create accounts
        BankAccount savingsAccount = new SavingsAccount("SAV123", "Alice", 50000, 3.5);
        BankAccount currentAccount = new CurrentAccount("CUR456", "Bob", 10000, 20000);

        // Add accounts to a list
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Process accounts
        processAccounts(accounts);

        // Test deposit and withdrawal
        savingsAccount.deposit(1000);
        currentAccount.withdraw(2000);
    }
}
