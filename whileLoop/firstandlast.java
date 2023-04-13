import java.util.Scanner;
class firstandlast
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
      int f=0,c=0;
      f=a%10;
      System.out.println("Last Digit "+f);
      while(a!=0)
        {
          c=a%10;
          a=a/10;
          
        }
      System.out.println("First Digit "+c);
    }
  }