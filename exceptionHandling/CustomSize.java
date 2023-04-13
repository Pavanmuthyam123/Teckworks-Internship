import java.util.*;
class sizeException extends Exception
  {
    public sizeException(String message)
    {
      super(message);
    }
  }
class array
  {
    void readmethod()
    {
      System.out.println("Enter size:");
      Scanner sc=new Scanner(System.in);
      try
        {
          int n=sc.nextInt();
          if(n<5)
          {
            throw new sizeException("Invalid size: ");
          }
          else
          {
            System.out.println("array elements: ");
            int a[]=new int[n];
            for(int i=0;i<n;i++)
              {
                a[i]=sc.nextInt();
              }
            System.out.println("array: ");
            for(int i=0;i<n;i++)
              {
                System.out.println(a[i]);
              }
          }
        }
      catch(sizeException h)
        {
          System.out.println(h);
        }
    }
    void sort()
    {
      int temp=0;
      System.out.println("Sorting array: ");
      for(int i=0;i<n;i++)
        {
          for(j=0;j=i+1;j++)
            {
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      for(int h:a);
    }
  }
class Test
  {
    public static void main(String args[])
    {
      array arr[]=new arr[5];
      for(int i=0;i<n.length;i++)
        {
          arr[i]=new array();
          arr[i].readmethod();
          arr[i].sort();
        }
    }
  }