import java.util.*;
class sumofposition
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
    sum(array,n);
    }
    public static void sum(int a[],int n)
    {
      int sum=0;
      for(int i=0;i<n;i=i+3)
        {
          sum+=(a[i]);
        }
      System.out.println(sum+" Sum of their positions: ");
    }
  }