import java.util.Scanner;
class sort
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
      order(array,n);
    }
    public static void order(int a[],int n)
    {
      for(int i=0;i<n-1;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(a[i]>a[j])
              {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
       for(int k=0;k<n;k++)
        {
          System.out.println(a[k]);
        }
    }
  }