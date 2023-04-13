import java.util.Scanner;
class count
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
      int count=0;
      while(a!=0)
        {
        a=a/10;
          count++;  
        }
      System.out.println("count digit: "+count);
    }
  }