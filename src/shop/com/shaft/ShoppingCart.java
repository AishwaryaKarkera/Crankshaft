package shop.com.shaft;
/**
 * The class provides the list of products in your cart with the total price and discounts applied at checkout.
 */
    //import statement
    import java.util.ArrayList;

    public class ShoppingCart
    {
        private ArrayList<Product> cartProductList;

        public ShoppingCart()
        {
            cartProductList = new ArrayList<Product>();
        }
        //adds the product to the cart
        public void addToCart(Product product)
        {
            cartProductList.add(product);
        }
        //displays the shopping cart to the user with the discounts and the total cost
        public void displayProductList()
             {
                int j = 1;
                int totalCost = 0;
                System.out.println("Products in Shopping cart : ");
                for (Product i: cartProductList)
                {
                    System.out.println(j+"." + " "+ i.getProductName() + " " +"-" + " " + "$" +i.getPrice());
                    j++;
                    totalCost = (int) (totalCost + i.getPrice());
                }
                if ( cartProductList.size() == 0)
                {
                    System.out.println("Your cart is empty");
                }
                if (totalCost > 100)
                {
                    int discount = (int) (0.2 * totalCost);
                    System.out.println("");
                    System.out.println("20% off on total greater than $100");
                    totalCost = totalCost - discount;

                }

                else if (totalCost > 50)
                {
                    int discount = (int) (0.15 * totalCost);
                    System.out.println("");
                    System.out.println("15% off on total greater than $50");
                    totalCost = totalCost - discount;
                }

                else if(totalCost > 20)
                {
                    int discount = (int) (0.1 * totalCost);
                    System.out.println("");
                    System.out.println("10% off on total greater than $20");
                    totalCost = totalCost - discount;
                }

                System.out.println("");
                System.out.println("Total cost : " + "$"+totalCost);
            }

            public ArrayList<Product> getCartProductList()
            {
                return cartProductList;
            }
}
