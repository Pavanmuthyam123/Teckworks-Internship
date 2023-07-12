import java.util.Scanner;
class minandmax
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter size");
      int arraysize=s.nextInt();
      int array[]=new int[arraysize];
      System.out.println("enter the array elements");
      for(int i=0;i<array.length;i++)
        {
          array[i]=s.nextInt();
        }
      maxmin(array,arraysize);
    }
    public static void maxmin(int a[],int size)
    {
      int maxnum=a[0];
      int minnum=a[0];
      for(int i=0;i<size;i++)
        {
          if(a[i]>maxnum)
              maxnum=a[i]; 
          if(a[i]<minnum)
      {
       minnum=a[i]; 
      }
        }
    System.out.println("max num is: "+maxnum);
    System.out.println("min num is: "+minnum);
    }  
  }
    
