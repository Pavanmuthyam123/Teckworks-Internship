import java.util.Scanner;
class maxthree
  {
    public static void main(String args[])
    {
      System.out.println("Enter Num1 : ");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      System.out.println("Enter Num2 : ");
      int b=s.nextInt();
       System.out.println("Enter Num3 : ");
      int c=s.nextInt();
      max(a,b,c);
    }
    public static void max(int a,int b,int c)
    {
      if(a>b && a>c)
      {
        System.out.println("a is max num");
      }
      else if(b>c)
      {
         System.out.println("b is max num");
      }
      else
         System.out.println("c is max num");
    }
  }