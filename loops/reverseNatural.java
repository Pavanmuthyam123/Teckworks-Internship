import java.util.Scanner;
class reverseNatural
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
      int i=1;
      while(i<=n)
        {
          System.out.println(n);
          n--;
        }
    }
      
  }