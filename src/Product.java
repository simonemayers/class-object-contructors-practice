public class Product {
    private double cost;
    private int quantity;
    private String name;

    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void totalCost() {
        System.out.println("Total cost is " + (cost * quantity));
    }

    public void printProduct() {
        System.out.println(name + " costs " + cost + " and " + quantity + " units were purchased.");
    }

}