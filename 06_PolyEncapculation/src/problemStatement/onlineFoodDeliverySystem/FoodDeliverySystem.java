package problemStatement.onlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class FoodDeliverySystem {
    // Method to process the order
    public static void processOrder(List<FoodItem> foodItems) {
        double totalOrderPrice = 0.0;

        for (FoodItem foodItem : foodItems) {
            System.out.println(foodItem.getItemDetails());
            if (foodItem instanceof Discountable) {
                System.out.println(((Discountable) foodItem).getDiscountDetails());
            }
            double itemTotal = foodItem.calculateTotalPrice();
            System.out.println("Total Price: " + itemTotal);
            totalOrderPrice += itemTotal;
            System.out.println("-----------");
        }

        System.out.println("Total Order Price: " + totalOrderPrice);
    }

    public static void main(String[] args) {
        // Create food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2); // 200/unit, quantity = 2
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1); // 300/unit, quantity = 1

        // Apply discounts
        ((Discountable) vegItem).applyDiscount(10); // 10% discount on veg item
        ((Discountable) nonVegItem).applyDiscount(5); // 5% discount on non-veg item

        // Add items to order
        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(vegItem);
        foodItems.add(nonVegItem);

        // Process the order
        processOrder(foodItems);
    }
}
