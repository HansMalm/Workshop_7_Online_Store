package Lexicon.Hans;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreMenu {
    //Create Lists to hold Product inventory, Orders and Customers.
    private static final ArrayList<Product> productList= new ArrayList<>();
    private static final ArrayList<Order> orderList = new ArrayList<>();
    private static final ArrayList<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void storeMenu() {
        //Create an inventory of Products and List of Customers.
        for (int i = 0; i<10; i++) {
            productList.add(new Product(i,"Book" + String.valueOf(i), i * 10.5));
            customerList.add(new Customer(i,"customer" + String.valueOf(i), "customer"
                    + String.valueOf(i) + "@mail.com"));
        }
        //
    }
}
