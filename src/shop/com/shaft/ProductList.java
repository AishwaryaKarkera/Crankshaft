package shop.com.shaft;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductList {
    private ArrayList<Product> prodList = new ArrayList<Product>();
    ShoppingCart cart = new ShoppingCart();
    public void addToCart(){

        Scanner console = new Scanner(System.in);
        int input = console.nextInt();

        for (int i = 0; i < prodList.size(); i++) {

            if (input -1 < prodList.size()) {
                cart.addToCart(prodList.get(input-1));
                System.out.println(prodList.get(input-1).getProductName() + " has been added to the cart");
                break;
            }
            else{
                System.out.println("You have entered an invalid input");
                break;
            }

        }
    }


    public void displayProducts() {

        FileReaderJson file = new FileReaderJson();

        JSONArray products = file.readFile();

       JSONArray JsonProductList = file.getArray();

       //adding to the product list

        for(Object o: JsonProductList) {
            Product prod = new Product();
            JSONObject product = (JSONObject) o;
            prod.setProductId(Math.toIntExact((Long) product.get("uuid")));

            prod.setProductName((String) product.get("name"));

            prod.setPrice(Double.valueOf((String) product.get("price")));

            prodList.add(prod);
        }
        System.out.println("Select an item to add to the cart");

        addToCart();
       int index = 1;
        System.out.println("select 1 to add another item or select 2 to checkout");
        boolean start = true;
        while(index == 1 || start == true)
        {
            if (start == false){
                System.out.println("select 1 to add another item or select 2 to checkout");
            }
           start = false;
            Scanner add = new Scanner(System.in);

                index = add.nextInt();
                if(index == 1){
                    for (int i = 1; i <= prodList.size();i++) {
                        System.out.println(i+"." + " " + prodList.get(i-1).getProductName()+ "-" + prodList.get(i-1).getPrice());
                    }
                        System.out.println("Select an item to add to the cart");

          addToCart();



                    }
                }
        if(index == 2)
        {
            cart.displayProdList();
        }

        }




    public ArrayList<Product> getProdList() {
        return prodList;
    }
}
    /*public void displayProducts() {
        ArrayList<String> prodList = new ArrayList<String>();

        FileReaderJson file = new FileReaderJson();
        prodList = file.readFile();

        int choice = 0;
        while (true) {
            System.out.println("Select the product name ");
            Scanner input = new Scanner(System.in);
            String name = input.next();

           for (int i = 1; i < prodList.size(); i++) {
                if (prodList.get(i).contains(name)) {
                    System.out.println(i + "." + prodList.get(i) + "added to the cart");
                }
            }

        }
        }
     */
