import java.util.Scanner;
class sumofdigit
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
      int temp=a,sum=0,r=0;
      while(a!=0)
        {
          r=a%10;
          sum=sum+r;
          a=a/10;
          
        }
      System.out.println(sum);
    }
  }