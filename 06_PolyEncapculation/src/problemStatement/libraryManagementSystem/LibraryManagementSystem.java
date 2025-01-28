package problemStatement.libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class LibraryManagementSystem {
    // Method to display all library items
    public static void displayLibraryItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available: " + reservableItem.checkAvailability());
            }
            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {
        // Create library items
        LibraryItem book = new Book("B101", "The Alchemist", "Paulo Coelho");
        LibraryItem magazine = new Magazine("M202", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D303", "Inception", "Christopher Nolan");

        // Add items to a list
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        // Display initial library items
        displayLibraryItems(libraryItems);

        // Reserve items
        ((Reservable) book).reserveItem("Alice");
        ((Reservable) dvd).reserveItem("Bob");

        System.out.println("\nAfter Reservations:");
        displayLibraryItems(libraryItems);
    }
}
