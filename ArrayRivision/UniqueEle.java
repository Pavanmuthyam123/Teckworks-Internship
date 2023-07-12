import java.util.*;
class uniqueEle
  {
    public static void unique(int arr[],int size)
    {
      for(int i=0;i<=arr.length-1;i++)
        {
          for(int j=i+1;j<=arr.length-1;j++)
            {
              if(arr[i]==arr[j])
              {
                arr[i]=-1;
                arr[j]=-1;
              }
            }
        }
      for(int k=0;k<=arr.length-1;k++)
        {
          if(arr[k]!=-1)
          {
            System.out.println(arr[k]);
          }
        }           
  }      
 public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
      System.out.print("enter the size:");
    int arraysize=s.nextInt();
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
    for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    unique(array,arraysize);
    }
}

