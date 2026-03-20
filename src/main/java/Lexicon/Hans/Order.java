package Lexicon.Hans;

public class Order {
    private int id;
    private double totalPrice;
    private Product[] productList;
    private Customer customer;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.totalPrice = 0;
        this.productList = new Product[1];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product[] getProductList() {
        return productList;
    }

    public void addProd(Product product) {
        //this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
