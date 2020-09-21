package shop.com.shaft;

/**
 * The main class that starts the application and displays the user a list of products
 * The list of products are inherited from the ProductList class.
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Welcome to Crankshaft");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println(" ");
        System.out.println("Pick your products from the list below and add them to the cart!");
        //Creates an instance of the ProductList class
        ProductList prod = new ProductList();
        //Displays the list of products
        prod.displayProducts();

    }
}