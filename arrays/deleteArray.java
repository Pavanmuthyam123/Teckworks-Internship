import java.util.Scanner;
class deleteArray
  {
    public static void main(String args[])
    {
      System.out.println("enter array size: ");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println("enter array elements");
      int array[]=new int[n];
      for(int i=0;i<n;i++)
        {
          array[i]=s.nextInt();
        }
      delete(array,n);
    }
    public static void delete(int a[],int n)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter index to delete:");
      int m=s.nextInt();
      for(int i=m;i<n-1;i++)
         {
          a[i]=a[i+1];
         }
      System.out.println("Array is:");
      for(int j=0;j<n-1;j++)
         {
        System.out.println(a[j]);
         }
    }
  }