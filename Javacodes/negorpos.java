import java.util.Scanner;
class negorpos
  {
    public static void main(String args[])
    {
      System.out.println("Enter digit: ");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      num(a);
    }
    public static void num(int a)
    {
      if(a>0)
      {
        System.out.println("It is positive num ");
      }
      else
      {
        System.out.println("It is negative num ");
      }
    }
  }