import java.util.*;
class Combinations
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
    comb(array,n);
    }
    public static void comb(int a[],int n)
    {
       int count0=0,count2=0,count1=0;
      for(int i=0;i<=n-1;i++)
        {
         if(a[i]==0)
          {
            count0++;
          }
         if(a[i]==1)
          {
            count1++;
          }
         if(a[i]==2)
          {
            count2++;
          }
        }
      for(int i=0;i<count0;i++)
        {
          a[i]=0;
        }
       for(int i=count0;i<count0+count2;i++)
        {
          a[i]=2;
        }
      for(int i=count2+count0;i<n;i++)
        {
          a[i]=1;
        }
      
      for(int i=0;i<=n-1;i++)
        {
          System.out.print(a[i]+" ");
        }
         
      }
  }