import java.util.Scanner;
class positiveornot
  {
    public static void main(String args[])
    {
      int a;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      if(a>0)
       {
        System.out.println(" Num is positive" +a);
       }
      else
       {
        System.out.println("Num is Negative"+a);
       }
      
    }
  }