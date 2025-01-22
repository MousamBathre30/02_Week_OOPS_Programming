import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Customer class
class Customer {
    private String name;
    private List<Product> products; // List of products purchased by the customer

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Add a product to the customer's purchase list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Get customer's name
    public String getName() {
        return name;
    }

    // Get purchased products
    public List<Product> getProducts() {
        return products;
    }
}

// BillGenerator class
class BillGenerator {
    // Method to compute the total bill for a customer
    public double computeTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getPrice();
        }
        return total;
    }
}

// Main class to demonstrate functionality
public class ProductBillGenerator {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 75000);
        Product product2 = new Product("Mouse", 500);
        Product product3 = new Product("Keyboard", 1500);

        // Create a customer
        Customer customer = new Customer("Mousam");

        // Add products to the customer's purchase list
        customer.addProduct(product1);
        customer.addProduct(product2);
        customer.addProduct(product3);

        // Generate bill
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.computeTotal(customer);

        // Print details
        System.out.println("Customer: " + customer.getName());
        System.out.println("Purchased Products:");
        for (Product product : customer.getProducts()) {
            System.out.println("- " + product.getName() + ": ₹" + product.getPrice());
        }
        System.out.println("Total Bill: ₹" + totalBill);
    }
}
