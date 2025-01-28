package problemStatement.libraryManagementSystem;

// Book Class
public class Book extends LibraryItem implements Reservable {
    private boolean isReserved;
    private String borrowerName;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration is 14 days for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            this.isReserved = true;
            System.out.println("Book reserved for: " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
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
