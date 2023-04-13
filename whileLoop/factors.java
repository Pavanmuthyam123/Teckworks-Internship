import java.util.Scanner;
class factors
  {
    public static void main(String args[])
    {
      System.out.println("Enter Number : ");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      num(a);
    }
    public static void num(int a)
    {
      for(int i=1;i<=a;i++)
        {
          if(a%i==0)
          {
            System.out.println(i);
          }
        }
    }
  }