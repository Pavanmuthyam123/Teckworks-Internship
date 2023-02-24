import java.util.*;
class dynamicprice
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter book prices");
      int price;
      price=s.nextInt();
      int amount[]=new int[price];
       System.out.println("enter prices");
      for(int i=0;i<=price-1;i++)
          amount[i]=s.nextInt();
          displaydynamic(amount,price);
    }
    public static void displaydynamic(int a[],int n)
    {
      for(int h:a)
        System.out.println(h);
    }
    
  }