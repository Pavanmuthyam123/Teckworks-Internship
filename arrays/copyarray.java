import java.util.Scanner;
class copyarray
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
      copy(array,n);
    }
    public static void copy(int array[],int n)
    {
      int temp[]=new int[n];
      for(int i=0;i<n;i++)
        {
          temp[i]=array[i];
        }
          System.out.println("copy array");
          for(int j=0;j<n;j++)
            {
              System.out.println(temp[j]);
            }
        }
    }
  