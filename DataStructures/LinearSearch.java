import java.util.*;
class LinearSearch
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Size: ");
      int n=s.nextInt();
      System.out.println("Enter Element: ");
      int ele=s.nextInt();
      System.out.println("Enter Elements: ");
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
        {
          arr[i]=s.nextInt();
        }
      int k=0;
      for(int i=0;i<=arr.length-1;i++)
        {
          if(arr[i]==ele)
          {
            System.out.println(ele+ "element occured: "+i);
            k=k+1;
            break;
          }
        }
      if(k==0)
      {
        System.out.println("element is not occured:");
      }
    }
  }