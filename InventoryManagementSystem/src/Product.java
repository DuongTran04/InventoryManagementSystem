public class Product {
    //attributes
    private String ID;
    private String name;
    private double price;
    private int quantityInStock;

    //constructor


    public Product(String ID, String name, double price, int quantityInStock) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    //getter and setter
//update quantity
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    //other method
//calculate total value of product in stock
    public double calculateStockValue() {
        return this.price * this.quantityInStock;
    }


}

