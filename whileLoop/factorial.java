import java.util.Scanner;
class factorial
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
      int fact=1,i=1;
      while(i<=a)
        {
          fact=fact*i;
          i++;
        }
            System.out.println(fact);    
    }
  }