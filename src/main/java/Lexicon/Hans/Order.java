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

    public void setTotalPrice(Product product) {
            totalPrice += product.getPrice();
    }

    public void printProductList() {

        for (Product product : productList) {
            System.out.println((product.getName()));
        }
    }

    public void addProduct(Product product) {
        if (productList[productList.length-1] == null) {
            productList[0] = product;
        }
        else {
            productList[productList.length-1] = product;
        }
        setTotalPrice(product);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}