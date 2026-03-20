package Lexicon.Hans;


public class Main {
    static void main() {
        //StoreMenu.storeMenu();
        Product book = new Product(20, "Book", 250);
        Customer customer1 = new Customer(101, "Tore", "tor@mail.com");
        Order testOrder = new Order(10, customer1);

        System.out.println(testOrder.getId());
        testOrder.getProductList();
        testOrder.addProduct(book);
        testOrder.getProductList();
    }
}
