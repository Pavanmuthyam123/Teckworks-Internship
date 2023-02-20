import java.util.Scanner;
class divisible5and11
  {
    public static void main(String args[])
    {
      System.out.println("Enter Num1 : ");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      num(a);
    }
    public static void num(int a)
    {
      if(a%5==0 && a%11==0)
      {
        System.out.println("It is divisible by 5 and 11 ");
      }
      else
      {
        System.out.println("It is not divisible by 5 and 11 ");
      }
    }
  }
  