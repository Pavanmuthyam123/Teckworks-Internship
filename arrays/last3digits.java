import java.util.Scanner;
import java.util.Arrays;
class last3digits
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Size: ");
      int n=s.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter digits:");
      for (int i=0;i<n;i++) 
        {
            arr[i] =s.nextInt();
        }
      fun(arr,n);
    }
    public static void fun(int a[],int n)
    {
      Arrays.sort(a);

      for(int i=0;i<3;i++)
        {
          System.out.println(a[--n]);
        }
    }
    
  }