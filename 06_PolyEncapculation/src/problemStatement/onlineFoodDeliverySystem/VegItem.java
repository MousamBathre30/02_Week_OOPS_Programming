package problemStatement.onlineFoodDeliverySystem;

// VegItem Class
public class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice() * (1 - discount / 100);
    }

    @Override
    public void applyDiscount(double discountRate) {
        this.discount = discountRate;
        System.out.println("Discount of " + discountRate + "% applied to Veg Item: " + getItemName());
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: " + discount + "%";
    }
}
