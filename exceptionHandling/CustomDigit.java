import java.util.*;
class digitException extends Exception
  {
    digitException(String message)
    {
      super(message);
    }
  }
class String1
  {
    String str;
    void read()
    {
      System.out.println("enter the string:");
      Scanner s=new Scanner(System.in);
     try
      {
        str=s.nextLine();
  if(str.charAt(0)=='0'|| str.charAt(0)=='1'||str.charAt(0)=='2'||str.charAt(0)=='3'||str.charAt(0)=='4'|| str.charAt(0)=='5'||str.charAt(0)=='6'||
        str.charAt(0)=='7'||str.charAt(0)=='8'|| str.charAt(0)=='9')
      {
        throw new digitException("Enter only string");
      }
      else
      {
        System.out.println("your input is string");
      }
    }
      catch(digitException h)
        {
          System.out.println(h);
          read();
        }
      }
    void check()
    {
       String[] s1=str.split("");
       for(int i=0;i<=s1.length-1;i++)
        {
          String s2=s1[i];
          int a=s2.length()-1;
          int b=a-3;
          if(s2.substring(b,a).equals("ing"))
          {
            System.out.println("Yes it is ends with ing pattern");
          }
          else
          {
            System.out.println("it is not ends with ing pattern");
          }
        }
    }
  }
class CustomDigit
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number of test cases:");
      int testcases=s.nextInt();
      String1[] str2=new String1[testcases];
      for(int i=0;i<testcases;i++)
        {
          str2[i]=new String1();
          str2[i].read();
          str2[i].check();
        }
    }
  }