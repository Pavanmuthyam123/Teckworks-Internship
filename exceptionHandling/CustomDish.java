import java.util.*;
class DishException extends Exception
  {
    public DishException(String message)
    {
      super(message);
    }
  }
class Dish
    {
      String Dish_name;
      int Dish_price;
      int num;
      void getName()
      {
        System.out.println("enter the dish name:");
        Scanner s=new Scanner(System.in);
        try
          {
             Dish_name=s.next();
          }
        catch(InputMismatchException im)
          {
            System.out.println("dish name must be in alphabets ");
          }
      }
      void getItems()
      {
        System.out.println("enter the number of items: ");
        Scanner s=new Scanner(System.in);
        int item=s.nextInt();
        System.out.println("enter the items: ");
        String items[]=new String[item];
        for(int i=0;i<item;i++)
          {
             items[i]=s.next();
          }
        for(int i=0;i<num;i++)
            {
              try
                {
                  if(d[i]==dish_name)
                  { 
                    System.out.println("Dish is matched");
                  }
                  else
                  {
                    throw new DishException("dish is already exists");
                  }
              catch(DishException h)
                {
                    System.out.println(h);
                }
            }
          }
       void removeDish()
      {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the  dish to be removed:");
        String Dish_name=s.next();
        for(int i=0;i<=d.length-1;i++)
          {
            try
              {
                if(d[i]!=dish_name)
                {
                  System.out.println("Dish is Unmatched");
                }
                else
                {
                  throw new DishException("dish is already removed");
                }
              }
            catch(DishException h)
              {
               System.out.println(h);
              }
          }
      }
       void getPrice()
      {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the price:");
        try
          {
            Dish_price=s.nextInt();
          }
         catch(InputMismatchException h)
          {
            System.out.println(h);
          }
      }
    }
class CustomDish
  {
      public static void main(String args[])
      {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of dishes:");
        int dish=s.nextInt();
        Dish d[]=new Dish[dish];
        for(int i=0;i<=dish-1;i++)
          {
            d[i]=new Dish();
            d[i].getName();
            d[i].getIngredients();
            d[i].addDish();
            d[i].removeDish();
            d[i].getPrice();
          }
      }
  }