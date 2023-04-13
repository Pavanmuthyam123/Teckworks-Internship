import java.util.*;
class PriceException extends Exception
  {
    PriceException(String message)
    {
      super(message);
    }
  }
class Product
  {
    String product_name;
    int price;
    int quality;
    void getName()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter product name: ");
      try
        {
          product_name=s.nextLine();
        }
      catch(InputMismatchException h)
        {
          System.out.println("Product name must be alphabet: ");
          getName();
        }
    }
    void getprice()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter price: ");
      price=s.nextInt();
      try
        {
          if(price<0)
          {
          throw new PriceException("Price must be greater than Zero: ");
          }
        }
      catch(PriceException h)
        {
          System.out.println(h);
        }
    }
    void getquality()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Quality: ");
      try
        {
          quality=s.nextInt();
        }
      catch(InputMismatchException h)
        {
          System.out.println(h.getMessage()); 
          getquality();
        }
    }
    void display()
    {
      System.out.println("PoductName "+product_name);
      System.out.println("Price of Product: "+price);
      System.out.println("product Quality: "+quality);
    }
  }
class CustomPrice
  {
    public static void main(String args[])
    {
      System.out.println("Enter number of products: ");
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      Product p[]=new Product[num];
      for(int i=0;i<num;i++)
        {
          p[i]=new Product();
          p[i].getName();
          p[i].getprice();
          p[i].getquality();
          p[i].display();
        }
    }
  }