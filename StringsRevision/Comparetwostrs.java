import java.util.*;
class Comparetwostrs
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter str1: ");
      String str1=s.nextLine();
      System.out.println("Enter str2: ");
      String str2=s.nextLine();
      int count=0;
      if(str1.length()==str2.length())
      {
        for(int i=0;i<=str1.length();i++)
          {
             if(str1.charAt(i)==str2.charAt(i))
             {
               count++;
             }
          }
      }
      if(count==str1.length())
      {
        System.out.println("It is Equal: ");
      }
      else
      {
        System.out.println("Not Equal Strings");
      }
    }
  }