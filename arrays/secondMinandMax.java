import java.util.*;
class secondMinandMax
  {
    public static void main(String[] a)
    {
      System.out.println("enter array size:");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int array[]=new int[n];
      System.out.println("enter array elements:");
      for(int i=0;i<=n-1;i++)
        {
          array[i]=s.nextInt();
        }
       secondlarge(array,n);
    }
    public static void secondlarge(int a[],int n)
    {
      int i=0;
      for(i=0;i<n-1;i++)
      {
        for(int j=i+1; j<n; j++){
       if(a[i]>a[j]){
        int temp=a[i];
         a[i]=a[j];
         a[j]=temp;
         }
        }
      }
      System.out.println("Second Smallest element: "+a[1]);
      System.out.println("Second largest element: "+a[n-2]);
    }
  }