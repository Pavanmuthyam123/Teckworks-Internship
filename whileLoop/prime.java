import java.util.Scanner;
class prime
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
     int i=2,flag=0;
      while(i<a)
        {
          if(a%i==0)
          {
            flag=1;
            break;
          }
          i++;
          
        }
      if(flag==0)
      {
        System.out.println("prime num");
        
      }
      else
      {
        System.out.println("not a prime num");
      }
    }
  }