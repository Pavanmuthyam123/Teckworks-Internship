import java.util.Scanner;
public class priceDetails
  {
    public static void main(String args[])
    {
      int Price;
      //double selling;
      String Product_name;
      int Mrp;
      Scanner M=new Scanner(System.in);
      System.out.println("enter produc details");
       Price=M.nextInt();
       Product_name=M.next();
       Mrp=M.nextInt();
      System.out.println("enter produt details"+Price);
      System.out.println("enter product details"+Product_name);
      System.out.println("enter product details"+ Mrp);
     int selling=(Mrp*10)/100;
  System.out.println("selling is"+selling);
    }
  }