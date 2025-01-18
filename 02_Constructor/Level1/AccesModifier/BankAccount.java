// Base class: BankAccount
public class BankAccount {
    // Public member
    public String accountNumber;

    // Protected member
    protected String accountHolder;

    // Private member
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Annual interest rate in percentage

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call superclass constructor
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        // Accessing public member
        System.out.println("Account Number: " + accountNumber);
        // Accessing protected member
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("123456789", "Alice Johnson", 1500.0);
        account.displayAccountDetails();

        System.out.println();

        // Modify balance using public methods
        account.setBalance(2000.0);
        System.out.println("Updated Balance: $" + account.getBalance());

        System.out.println();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Bob Smith", 3000.0, 5.0);
        savingsAccount.displayAccountDetails();
        savingsAccount.displaySavingsAccountDetails();

        System.out.println();
        System.out.println("Calculated Interest: $" + savingsAccount.calculateInterest());
    }
}
