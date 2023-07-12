import java.util.*;
class duplicatechar
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter first String: ");
      String str1=s.nextLine();
      System.out.println("Enter second: ");
      String str2=s.nextLine();
      Array.sort(str1);
      Array.sort(str2);
      int i1=0;i2=0;
      if(str1.length()<str2.length())
      {
        while(i1<str1.length())
          {
            if(str1.charAt(i1)==str2.charAt(i2))
            {
              System.out.println(str1.charAt(i1));
                i1++;
            }
            else
            {
              if(i1<i2)
              {
                i1++;
              }
              else
              {
                i2++;
              }
            }
          }
      }
      else
      {
        while(i2<str2.length())
          {
            if(str2.charAt(i2)==str1.charAt(i2))
            {
              System.out.println(str2.charAt(i2));
              i2++;
            }
            else
            {
              if(i1<i2)
              {
                i1++;
              }
              else
              {
                i2++;
              }
            }
          }
      }
      }
    }