import java.util.*;
class MissingArray
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter array size: ");
      int n=s.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter array elements: ");
      for(int i=0;i<n;i++)
        {
           arr[i]=s.nextInt();
        }
      int total_sum=n*(n+1)/2;
      int sum=0;
      for(int i=0;i<arr.length;i++)
        {
          sum=sum+arr[i];
        }
      int miss=total_sum-sum;
      System.out.println(miss);
    }
  }