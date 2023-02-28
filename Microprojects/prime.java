import java.util.Scanner;
class prime
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter the starting number:");
      int p=s.nextInt();
      System.out.print("enter the ending limit:");
      int range=s.nextInt();
    for (int i = p; i <=range; i++)
      {
        int n=prime(i);
        if(n==1)
      {
        System.out.print(i + " ");
      }
      }
    }
    public static int prime(int n)
    {
      for (int i = 2; i < n; i++)
        {
         if (n % i == 0) 
           {
             return -1;
           }
        }
      return 1;
    }
  }
    