import java.util.Scanner;
class Divisible5and11
  {
    public static void main(String args[])
    {
      int a;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      if(a%5==0 && a%11==0)
      {
        System.out.println("Divisible by 5 "+ a);
      }
      else
      {
        System.out.println("Divisible by 11 "+a);
      }
    }
  }