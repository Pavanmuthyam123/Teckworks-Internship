import java.util.*;
class emptyString extends Exception
  {
    emptyString(String message)
    {
      super(message);
    }
  }
class empty
  {
    Scanner s=new Scanner(System.in);
    String str;
    void add()
     {
       System.out.println("enter the string:");
       str=s.nextLine();
       try
         {
           if(str.length()==0)
            {
              throw new emptyString("error: empty string");
            }
           else
            {
              System.out.println("it is a string");
            }
          }
      catch(emptyString e)
        {
          System.out.println(e);
        }
    }
    void stringsort()
    {
      String[] s2=str.split(" ");
      String s3;
      
      for(int i=0;i<=s2.length-1;i++)
        {
          s3=s2[i];
          int arr[]=new int[s3.length()];
          for(int j=0;j<=arr.length-1;j++)
            {
              arr[i]=(int)s3.charAt(j);
            }
          for (int x=0;x<arr.length-1;x++) 
          {
        for (int y=i+1;y<arr.length;y++) 
        {
          if (arr[x] >arr[y]) 
          {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
         }
        }
        }
        for(int k=0;k<=arr.length-1;i++)
              {
                System.out.println((char)arr[k]);
              }
          System.out.println();
      }  
    }
  }
class CustomemptyString
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the testcases:");
      int testcases=s.nextInt();
       empty ob[]=new empty[testcases];
      for(int i=0;i<=testcases;i++)
        {
         ob[i]=new empty();
          ob[i].add();
          ob[i].stringsort();
        }
    }
  }