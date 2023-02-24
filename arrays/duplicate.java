import java.util.Scanner;
class duplicate
  {
    public static void main(String args[])
    {
      System.out.println("enter array size: ");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println("enter array elements");
      int array[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        {
          array[i]=s.nextInt();
        }
      duplicate(array,n);
    }
    public static void duplicate(int array[],int n)
    {
      int count=0;
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(array[i]==array[j])
              {
                count++;
              }
            }
        }
      System.out.println("values are: "+count);
    }
  }