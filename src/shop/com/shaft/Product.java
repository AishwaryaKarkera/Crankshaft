package shop.com.shaft;

/**
 *The class specifies the attributes and behaviours of the products
 */
public class Product
{
    private int productId;
    private String productName;
    private double price;

    //The non-default constructor for the objects used in this class
    public Product(int newProductId, String newName, Double newPrice, int newQty)
    {
        productId = newProductId;
        productName = newName;
        price = newPrice;

    }
    //Default constructor
    public Product()
    {

    }
    //returns the product ID
    public int getProductId()
    {
        return productId;
    }
    //returns the product name
    public String getProductName()
    {
        return productName;
    }
    // returns the product price
    public double getPrice()
    {
        return price;
    }
    //Allows user to set the product ID
    public void setProductId(int newProductId)
    {
        productId = newProductId;
    }
    //Allows user to set the product name
    public void setProductName(String newProductName)
    {
        productName = newProductName;
    }
    //Allows user to set the product price
    public void setPrice(Double newPrice)
    {
        price = newPrice;
    }

}
