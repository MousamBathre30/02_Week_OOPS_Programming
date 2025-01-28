package problemStatement.libraryManagementSystem;

// Magazine Class
public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrowerName;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration is 7 days for magazines
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            this.isReserved = true;
            System.out.println("Magazine reserved for: " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
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
