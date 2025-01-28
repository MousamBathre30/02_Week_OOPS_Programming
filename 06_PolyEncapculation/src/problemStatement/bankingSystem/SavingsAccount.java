package problemStatement.bankingSystem;

// SavingsAccount Class
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", Savings Account (Interest Rate: " + interestRate + "%)";
    }
}
