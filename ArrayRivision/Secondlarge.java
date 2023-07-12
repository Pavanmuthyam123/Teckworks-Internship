//How do you find the second largest element in an array in Java?
import java.util.*;
class Program
  {
    public static void main(String a[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size: ");
      int arraysize=sc.nextInt();
      int array[]=new int[arraysize];
      System.out.println("Enter the array elements: ");
      for(int i=0;i<array.length;i++)
        {
          array[i]=sc.nextInt();
        }
      second(array,arraysize);
    }
public static void second(int arr[],int size)
  {
  int k;
    for(int i=0;i<size-1;i++)
      {
        for(int j=1;j<size;j++)
          {
            if(arr[i]>arr[j])
            {
              k=arr[i];
              arr[i]=arr[j];
              arr[j]=k;
            }
          }
      }
    System.out.println(arr[size-2]);
  }
  }