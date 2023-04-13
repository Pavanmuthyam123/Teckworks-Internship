import java.util.*;
class weightsofProducts
  {
   public static double Products(int quantity, double weight)
    {
      return quantity*weight;
    }
    public static double products(int quantity,double weight,double packing)
    {
      return quantity*weight+packing;
    }
public static void main(String args[])
  {
  int apple_price=5;
  double apple_weight=10.5;
  double packing=56.87;
  System.out.println(apple_price);
  System.out.println(apple_weight);
  System.out.println(packing);
  }
}