import java.util.Scanner;
class even
  {
    public static void main(String args[])
    {
      sum();
    }
    public static void sum()
    {
       int s=1,l=100,sum=0;
      while(s<=l)
        {
          if(s%2==0)
          {
            sum=sum+s;
          }
          s++;
        }
      System.out.println(sum);
    }
  }
      
        
      
      