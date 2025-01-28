package problemStatement.bankingSystem;

// CurrentAccount Class
public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // No interest for current accounts
        return 0;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for amount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Current Account (Overdraft Limit: " + overdraftLimit + ")";
    }
}
