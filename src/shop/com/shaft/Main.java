package shop.com.shaft;


public class Main {
    public static void main(String[] args) {

        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Welcome to Crankshaft");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println(" ");
        System.out.println("Pick your products and add them to the cart!");
        ProductList prod = new ProductList();
        prod.displayProducts();


    }
}