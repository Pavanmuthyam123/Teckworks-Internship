import java.util.Scanner;
class evenorodd
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
      if(a%2==0)
      {
        System.out.println("Num is even ");
      }
      else
      {
        System.out.println("Num is odd ");
      }
    }
  }