import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Sample date strings
        String date1String = "2023-12-31";
        Date date3 = dateFormat.parse(date1String);
        // Create Product and Perishable Product Objects
        Product product1 = new Product("1", "Duong1", 10.0, 100);
        Product product2 = new Product("2", "Duong2", 20.0, 200);
        PerishableProduct product3 = new PerishableProduct("2", "Duong3", 15.0, 250,date3);



        // Add the products to the inventory
        Inventory inventory = new Inventory(Arrays.asList(product1, product2, product3));

        // Display the inventory
        System.out.println(inventory);

        // Calculate and display the total inventory value with expiration Date
        double totalValue = inventory.calculateInventoryValue(new Product[]{product1, product2, product3});
        System.out.println("Total Inventory Value: " + totalValue);

        // Remove a product from the inventory
        inventory.removeProduct(product1);

        // Display the inventory after removal
        System.out.println(inventory);
        System.out.println("Hello old project ");
    }
}


