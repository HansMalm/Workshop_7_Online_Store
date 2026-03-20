package Lexicon.Hans;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreMenu {
    //Create Lists to hold Product inventory, Orders and Customers.
    private static final ArrayList<Product> productList = new ArrayList<>();
    private static final ArrayList<Order> orderList = new ArrayList<>();
    private static final ArrayList<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void storeMenu() {
        //Create an inventory of Products.
        productList.add(new Product(111, "Book", 20.5));
        productList.add(new Product(222, "A4-Paper", 9.9));
        productList.add(new Product(333, "Folder", 5.0));
        productList.add(new Product(444, "Shelf", 300.0));
        productList.add(new Product(555, "Desk", 999.99));
        //Generate customers.
        customerList.add(new Customer(101, "Ada Epsen", "ada.epsen@mail.com"));
        customerList.add(new Customer(202, "Boris Boring", "boris@boring.uk"));
        customerList.add(new Customer(303, "Cecilia Cissling", "cecil@hotmail.com"));
        //Input some orders.
        orderList.add();
    }//StoreMenu
}
