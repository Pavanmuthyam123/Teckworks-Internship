import java.util.Scanner;
class sumofprime
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
     int sum=0;
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
  
        sum=sum+k;
        
      }
        }
      System.out.println(sum+" prime num");  
        
    }
  }