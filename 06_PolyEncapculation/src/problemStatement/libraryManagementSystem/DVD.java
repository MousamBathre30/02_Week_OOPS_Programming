package problemStatement.libraryManagementSystem;

// DVD Class
public class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrowerName;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3; // Loan duration is 3 days for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            this.isReserved = true;
            System.out.println("DVD reserved for: " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails() + ", Loan Duration: " + getLoanDuration() + " days";
    }
}
