import java.util.Scanner;
class sumofNatural
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
      int i=0,sum=0;
      while(i<=n)
        {
          sum=sum+i;
          i++;
          System.out.println(sum);
        }
    }
      
  }