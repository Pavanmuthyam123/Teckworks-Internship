import java.util.*;
class Sqrt
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Number: ");
      int a=s.nextInt();
      try
        {
          double b=Math.sqrt(a);
          System.out.println(b);
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
      System.out.println("It is completed ");
    }
  }