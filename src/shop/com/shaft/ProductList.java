package shop.com.shaft;
/**
 * The class stores the products in a list and allows the user to add the products into the cart
 */

//import statements
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductList
{
    private ArrayList < Product > productList = new ArrayList < Product > ();
    ShoppingCart cart = new ShoppingCart();
    //allows the user to add the products into the cart
    public void addToCart()
    {
        Scanner console = new Scanner(System.in);
        int input = -1;
        try
        {
            input = console.nextInt();
        }
        catch (InputMismatchException e)
        {

        }
        //loops through the list of products in the array and adds the product according to the user input
        for (int i = 0; i < productList.size(); i++)
        {
            if (input - 1 < productList.size() && input - 1 >= 0)
            {
                cart.addToCart(productList.get(input - 1));
                System.out.println(productList.get(input - 1).getProductName() + " has been added to the cart");
                break;
            }
            else
                {
                System.out.println("You have entered an invalid input");
                break;
                }

        }
    }
    //displays the products which are read from the FileReaderJson class and allows the user to view product options
    public void displayProducts()
    {
        FileReaderJson file = new FileReaderJson();

        JSONArray products = file.readFile();

        JSONArray JsonProductList = file.getArray();

        //gets the product from the JSON file and ,stores them into the product objects and adds them to the list
        for (Object o: JsonProductList)
        {
            Product prod = new Product();
            JSONObject product = (JSONObject) o;

            prod.setProductId(Math.toIntExact((Long) product.get("uuid")));

            prod.setProductName((String) product.get("name"));

            prod.setPrice(Double.valueOf((String) product.get("price")));

            productList.add(prod);
        }

        System.out.println("");
        System.out.println("Select the product number to add it to the cart");
        //invoking the local method
        addToCart();

        int index = 1;
        System.out.println("");
        System.out.println("Select 1 to view the list of products or select 2 to checkout or 3 to exit");

        boolean start = true;
        //displays products to the user continuously till an exit prompt is received, allows error handling and allows user to add products to cart
        while ((index != 3 && index != 2) || start == true)
        {
            if (start == false)
            {
                System.out.println("");
                System.out.println("Select 1 to view the list of products or select 2 to checkout or 3 to exit");
            }
            start = false;

            Scanner add = new Scanner(System.in);
            try
            {
                index = add.nextInt();
            }
            catch (InputMismatchException e)
            {

            }

            if (index != 1 && index != 2)
            {
                System.out.println("You have entered an invalid input");
            }

            if (index == 1)
            {
                for (int i = 1; i <= productList.size(); i++)
                {
                    System.out.println(i + "." + " " + productList.get(i - 1).getProductName() + "-" + productList.get(i - 1).getPrice());
                }
                System.out.println("");
                System.out.println("Select an item to add to the cart");
                //invoking the local method
                addToCart();
            }

        }

        if (index == 2)
        {
            cart.displayProductList();
        }

    }

    public ArrayList < Product > getProductList()
    {
        return productList;
    }
}