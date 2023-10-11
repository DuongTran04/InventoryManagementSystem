import java.util.Date;
import java.util.Calendar;

public class PerishableProduct extends Product {
    //attributes
    private Date expirationDate;

    //constructor
    public PerishableProduct(String ID, String name, double price, int quantityInStock, Date expirationDate) {
        super(ID, name, price, quantityInStock);
        this.expirationDate = expirationDate;
    }

    //Calculate stock value include a discount of 20% if the product is within 30 days of expiration.
    @Override
    public double calculateStockValue() {
        double totalValue = super.calculateStockValue();

        // Get the current date
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();
        // Subtract 30 days from the current date
        cal.add(Calendar.DATE, -30);
        Date thirtyDaysAgo = cal.getTime();

        // Check if the product is within 30 days of expiration
        if (expirationDate.after(thirtyDaysAgo) && expirationDate.before(currentDate)) {
            totalValue *= 0.8; // Apply a 20% discount
        }

        return totalValue;
    }
}
