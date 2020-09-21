package shop.com.shaft;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int qty;

    public Product()
    {

    }
    public Product(int newProductId, String newName, Double newPrice, int newQty)
    {
        productId = newProductId;
        productName = newName;
        price = newPrice;
        qty = newQty;
    }

    //public void displayProduct()
    {

    }

    public int getProductId()
    {
        return productId;
    }
public String getProductName()
{
    return productName;
}
public double getPrice()
{
    return price;
}
public int getQty()
{
    return qty;
}

public void setProductId(int newProductId)
{
    productId = newProductId;
}
public void setProductName(String newProductName)
{
    productName = newProductName;
}
    public void setPrice(Double newPrice)
    {
        price = newPrice;
    }
    public void setQty(int newQty)
    {
        qty = newQty;
    }
}
