import java.util.*;
class Removedup
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
      duplicate(array,n);
    }
    public static void duplicate(int array[],int n)
    {
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(array[i]==array[j])
              {
                array[i]=-1;
              }
            }
        }
         for(int i=0;i<n;i++)
         {
             if(array[i]!=-1)
             System.out.print(array[i]+" ");
         }
    }
  }