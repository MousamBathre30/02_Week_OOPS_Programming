package problemStatement.eCommercePlateform;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printFinalPrices(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println(product);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {
        // Create products
        Product laptop = new Electronics("E001", "Laptop", 60000);
        Product shirt = new Clothing("C001", "Shirt", 1500);
        Product apple = new Groceries("G001", "Apple", 100);

        // Add products to a list
        List<Product> products = new ArrayList<>();
        products.add(laptop);
        products.add(shirt);
        products.add(apple);

        // Print final prices
        printFinalPrices(products);
    }
}
