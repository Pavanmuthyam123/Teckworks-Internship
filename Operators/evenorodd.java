import java.util.Scanner;
class evenorodd
  {
    public static void main(String args[])
    {
      int a;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      if(a%2==0)
      {
        System.out.println("Num is Even"+a);
      }
      else
      {
        System.out.println("Num is odd"+a);
      }
    }
  }