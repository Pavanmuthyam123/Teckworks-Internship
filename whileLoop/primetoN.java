import java.util.Scanner;
class primetoN
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
     
      for(int k=2;k<=a;k++)
        {
          int i=2,flag=0;
      while(i<k)
        {
          if(k%i==0)
          {
            flag=1;
            break;
          }
          i++;
          
        }
        
      if(flag==0)
      {
        System.out.println(k+" prime num");
        
      }
      else
      {
        System.out.println(k+" not a prime num");
      }
        }
    }
  }