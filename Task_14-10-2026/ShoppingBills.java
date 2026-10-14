public class ShoppingBill {

    public static void main(String[] args) {
        // Sample test values
        double a = 100.0;
        double b = 100.0;
        double c = 100.0;
        double d = 100.0;
        double e = 100.0;

        // Calling the main calculation method
        double finalPayableAmount = calculateDiscountedBill(a, b, c, d, e);
    }

    // Step 1: Calculate Electronics GST (18%)
    public static double calculateElectronicsGST(double a, double b) {
        double subtotal = a + b;
        return subtotal + (subtotal * 0.18);
    }

    // Step 2: Calculate Fashion GST (13%)
    public static double calculateFashionGST(double c, double d) {
        double subtotal = c + d;
        return subtotal + (subtotal * 0.13);
    }

    // Step 3: Calculate Food GST (7%)
    public static double calculateFoodGST(double e) {
        return e + (e * 0.07);
    }

    // Step 4: Calculate Total Bill after GST
    public static double totalBill(double a, double b, double c, double d, double e) {
        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);
        return electronics + fashion + food;
    }

    // Step 5: Calculate Discounted Bill (20% discount) and Print Summary
    public static double calculateDiscountedBill(double a, double b, double c, double d, double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 0.20;
        double finalPayableAmount = total - discount;

        // Printing the requested output summary format
        System.out.printf("Total after GST = %.2f | Discount = %.2f | Final payable amount = %.2f\n", 
                total, discount, finalPayableAmount);

        return finalPayableAmount;
    }
}
