import java.util.*;
import java.lang.Math;
class positiveorneg
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.print("enter size: ");
      int n=s.nextInt();
      int array[]=new int[n];
      System.out.print("enter elements:\n");
      for(int i=0;i<n;i++)
      {
        array[i]=s.nextInt();
      }
    positive(array,n);
    }
      public static void positive(int a[],int n)
        {
         for(int i=0;i<n;i++)
           {
             if(a[i]>0)
             {
               System.out.println(a[i]+" it is positive num");
             }
             else
             {
               System.out.println(a[i]+" it is negative num");
             }
           }
        for(int j=0;j<n;j++)
          {
            if(a[j]%2==0)
            {
              System.out.println(a[j]+" it is even");
            }
            else
            {
              System.out.println(a[j]+" it is odd");
            }
          }
        
          for(int m=0;m<n;m++){
            int flag=0;
        for(int k=2;k<Math.abs(a[m]);k++)
            {
              if(a[m]%k==0)
              {
                flag=1;
                break;
              }
            }
        if(flag==0)
        {
           System.out.println(a[m]+" it is prime"); 
        }
        else
        {
           System.out.println(a[m]+" it is not prime");
        }
          }
    }
  }
      