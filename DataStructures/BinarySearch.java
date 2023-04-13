import java.util.*;
class BinarySearch
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Size: ");
      int n=s.nextInt();
      System.out.println("Enter Element to be searched: ");
      int key=s.nextInt();
      System.out.println("Enter Elements: ");
      int arr[]=new int[n];
      for(int i=0;i<n-1;i++)
        {
          arr[i]=s.nextInt();
        }
      binarySearch(arr,n,key);  
    }
public static void binarySearch(int arr[],int n,int key)
  {
  int first=0;
  int last=n-1;
  int mid=(first+last)/2;
  while(first<=last)
    {
      if(arr[mid]<key)
      {
        first=mid+1;
      }
      else if(arr[mid]==key)
      {
        System.out.println("Element is found at index:"+mid);
        break;
      }
       else 
     {
     last=mid-1;   
     }  
      mid=(first+last)/2;
  
    }
  if(first>last)
  {
    System.out.println("element is not found");
  }
  }
  }