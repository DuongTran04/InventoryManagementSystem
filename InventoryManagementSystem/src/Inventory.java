import java.util.List;

public class Inventory {
    //attributes
    private List<Product> productsList;
//constructor

    public Inventory(List<Product> products) {
        this.productsList = products;
    }

    //getter and setter
//other method
    //add product
    public void addProduct(Product product) {
        productsList.add(product);
    }

    //remove product
    public void removeProduct(Product product) {
        productsList.remove(product);
    }


//display the inventory by toString method

    @Override
    public String toString() {
        return "Inventory{" + "productsList=" + productsList + '}';
    }

    //calculate total Inventory Value
    public double calculateInventoryValue(Product[] inventory)
    //store Product objects in an array, so also accept PerishableProduct (inheritance)
    {
        double totalValue = 0.0;

        for (Product product : inventory) {
            totalValue += product.calculateStockValue();
        }

        return totalValue;
    }


}