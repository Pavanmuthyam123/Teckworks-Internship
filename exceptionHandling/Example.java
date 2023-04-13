import java.util.*;
class Example
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      char c[]={'p','$','m'};
      try
        {
          System.out.println(x/y);
          System.out.println(c[4]);
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
      System.out.println("program Execution is completed:");
    }
  }