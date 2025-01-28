package problemStatement.onlineFoodDeliverySystem;

// NonVegItem Class
public class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double ADDITIONAL_CHARGE = 20.0; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getQuantity() * getPrice();
        return (basePrice + ADDITIONAL_CHARGE) * (1 - discount / 100);
    }

    @Override
    public void applyDiscount(double discountRate) {
        this.discount = discountRate;
        System.out.println("Discount of " + discountRate + "% applied to Non-Veg Item: " + getItemName());
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: " + discount + "%";
    }
}
