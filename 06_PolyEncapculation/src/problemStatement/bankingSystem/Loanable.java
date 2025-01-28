package problemStatement.bankingSystem;

// Loanable Interface
public interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}
