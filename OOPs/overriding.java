import java.util.*;
class weightofProduct
  {
    public double Products(int quantity, double weight)
    {
      return quantity*weight;
    }
  }
class overiding extends weightofProduct 
  {
    public double Products(int quantity,double weight)
    {
      return quantity*weight;
    }
  }
class overriding
  {
    public static void main(String args[])
    {
      weightofProduct w=new weightofProduct();
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Quantity: ");
      int quantity=s.nextInt();
      System.out.println("Enter weight: ");
      double weight=s.nextDouble();
      w.Products(quantity,weight);
      w.Products(quantity,weight);
    }
  }