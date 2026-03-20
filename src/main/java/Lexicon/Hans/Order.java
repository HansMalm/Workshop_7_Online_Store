package Lexicon.Hans;

import java.util.Arrays;

public class Order {
    private int id;
    private double totalPrice;
    private Product[] productList;
    private Customer customer;

    public Order(int id, Customer customer) {
        setId(id);
        setCustomer(customer);
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

    public void setTotalPrice(Order order) {

        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
    }

    public void getProductList() {
        System.out.println(Arrays.toString(productList));
    }

    public void addProduct(Product product) {
        productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
