package shop.com.shaft;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> prodList;

    public ShoppingCart()
    {
        prodList = new ArrayList<Product>();

    }

    public void addToCart(Product product)
    {
        prodList.add(product);
    }

    public void displayProdList()
    {
        int j = 1;
        int totalCost = 0;

        for (Product i: prodList)
        {
            System.out.println(j+"." + i.getProductName() + "-" + i.getPrice());
            j++;
            totalCost = (int) (totalCost + i.getPrice());
        }
        if (totalCost > 100)
        {
            int discount = (int) (0.2 * totalCost);
            System.out.println("20% off on total greater than $100");
            totalCost = totalCost - discount;

        }
        else if (totalCost > 50)
        {
            int discount = (int) (0.15 * totalCost);
            System.out.println("15% off on total greater than $50");
            totalCost = totalCost - discount;


        }

        else if(totalCost > 20)
        {
            int discount = (int) (0.1 * totalCost);
            System.out.println("10% off on total greater than $20");
            totalCost = totalCost - discount;

        }


        System.out.println("Total cost : " +totalCost);

    }

    public ArrayList<Product> getProdList()
    {
        return prodList;
    }



}
