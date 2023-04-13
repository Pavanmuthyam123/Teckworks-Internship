import java.util.Scanner;
class productofdigit
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
      int temp=a,product=1,r=0;
      while(a!=0)
        {
          r=a%10;
          product=product*r;
          a=a/10;
          
        }
      System.out.println(product);
    }
  }