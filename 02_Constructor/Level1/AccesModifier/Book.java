// Base class: Book
public class Book {
    // Public member
    public String ISBN;

    // Protected member
    protected String title;

    // Private member
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    private double fileSize; // in MB

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call superclass constructor
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        // Accessing public member
        System.out.println("ISBN: " + ISBN);
        // Accessing protected member
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("978-3-16-148410-0", "Introduction to Java", "John Doe");
        book.displayBookDetails();

        System.out.println();

        // Modify the author using setter
        book.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println();

        // Create an EBook object
        EBook ebook = new EBook("978-0-12-345678-9", "Advanced Java Programming", "Alice Smith", 2.5);
        ebook.displayBookDetails();
        ebook.displayEBookDetails();
    }
}
