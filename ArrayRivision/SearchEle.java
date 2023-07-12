import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elements");
      int count=0,i;
      for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Enter key value");
      int key=sc.nextInt();
      for(i=0;i<n;i++)
        {
          if(arr[i]==key)
          {
            count++;
            break;
          }
        }
          if(count>0)
          {
              System.out.println("Enter element is found at: "+i);
          }
          else
          {
               System.out.println("Enter element is found: ");
          }
    }
  }
