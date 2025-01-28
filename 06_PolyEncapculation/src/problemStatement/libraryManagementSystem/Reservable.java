package problemStatement.libraryManagementSystem;

// Reservable Interface
public interface Reservable {
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
