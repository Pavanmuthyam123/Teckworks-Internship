import java.util.*;
class MenuApplication
  {
    void Insert()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter array size");
      int n=s.nextInt();
      System.out.println("enter add element");
      int ele=s.nextInt();
      System.out.println("enter position");
      int pos=s.nextInt();
      int arr1[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
        {
          arr1[i]=s.nextInt();
        }
      int arr2[]=new int[n+1];
      for(int i=0;i<n+1;i++)
        {
          if(pos>i)
          {
          arr2[i]=arr1[i];
          }
          else if(pos==i)
          {
            arr2[i]=ele;
          }
          else
          {
            arr2[i]=arr1[i-1];
          }
        }
      for(int i=0;i<n+1;i++)
        {
          System.out.println(arr2[i]);
        }
    }
    void Delete()
    {
      Scanner sc=new Scanner(System.in);
       int arr[]=new int[7];
       System.out.println("enter elements into array");
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=sc.nextInt();
       }
       System.out.println("enter an index position which you want to delete");
       int index=sc.nextInt();
       for(int i=0;i<arr.length-1;i++)
       {
           if(index==i)
           {
               arr[i]=arr[i+1];
           }
           else if(index<i)
           {
               arr[i]=arr[i+1];
           }
           else
           continue;
       }
       System.out.println("after deleting the elements from array");
       for(int i=0;i<arr.length-1;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
    void Searching()
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
        public static void main(String a[])
        {
          Scanner sc=new Scanner(System.in);
          char ch;
          int choice;
          MenuApplication obj=new MenuApplication();
          System.out.println("1.Insertion: ");
          System.out.println("2.Deletion: ");
          System.out.println("3.Searching: ");
      do
      {
        System.out.println("Enter Your choice: ");
        choice=sc.nextInt();
        switch(choice)
          {
            case 1:obj.Insert();
            break;
            case 2:obj.Delete();
            break;
            case 3:obj.Searching();
            break;
            default :System.out.println("Invalid Option");
		        break;
          } 
        System.out.println("Do tou want to continue one more Operation(y/n)");
		        ch=sc.next().charAt(0);
          }
        while(ch!='n');
      }
  }
