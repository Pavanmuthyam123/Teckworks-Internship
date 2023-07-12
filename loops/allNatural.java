import java.util.Scanner;
class allNatural
  {
    public static void main(String args[])
    {
      System.out.println("enter number");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      natural(n);
    }
    public static void natural(int n)
    {
      int i=0;
      while(i<n)
        {
          System.out.println(i);
          i++;
        }
    }
      
  }