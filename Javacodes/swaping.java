import java.util.Scanner;
class swaping
  {
    public static void main(String args[])
    {
      System.out.println("Enter a value : ");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      System.out.println("Enter b value : ");
      int b=s.nextInt();
      swap(a,b);
    }
    public static void swap(int a,int b)
    {
       a=a+b;
       b=a-b;
       a=a-b;
      System.out.println("after swaping: "+ "a= "+ a + ", b=" +b);
    }
  }