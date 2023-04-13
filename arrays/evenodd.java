import java.util.Scanner;
class evenodd
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
      evenodd(array,n);
    }
    public static void evenodd(int array[],int n)
    {
      int even_count=0;
      int odd_count=0;
      for(int i=0;i<n;i++)
        {
          if(array[i]%2==0)
          {
            even_count++;
          }
          else
          {
            odd_count++;
          }
        }
      System.out.println("num of evens is: "+even_count);
       System.out.println("num of odd is: "+odd_count);
    }
  }