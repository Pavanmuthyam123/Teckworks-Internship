import java.util.*;
class NotPrimeException extends Exception
  {
    public NotPrimeException(String message)
    {
      super(message);
    }
  }
class arrayTest
  {
    static int arr[];
    static void add()
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter elements");
        for(int i=0;i<size;i++)
          {
            arr[i]=sc.nextInt();
          }  
      }
    static void testElements()
      {
        for(int ele=0;ele<arr.length;ele++){
          try
         {
           for(int i=2;i<=arr[ele]/2;i++)
             {
               if(arr[ele]%i==0)
               {
                 throw new NotPrimeException("Entered element is not a prime: "+arr[ele]);
               }
             }
         }
        catch(NotPrimeException h)
         {
           System.out.println(h.getMessage());
         }
      }   
   } 
public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter No.of Objects: ");
    int size=s.nextInt();
    arrayTest a[]=new arrayTest[size];
    for(int i=0;i<size;i++)
      {
        a[i]=new arrayTest();
        a[i].add();
        a[i].testElements();
      }
  }
}