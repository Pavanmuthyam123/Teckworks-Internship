import java.util.*;
class Lexicographically
  {
    public static void main(String args[])
    {
      Scsnner s=new Scanner(System.in);
      System.out.println("Enter String1: ");
      String str1=s.nextLine();
      System.out.println("Enter String2: ");
      String str2=s.nextLine();
      int temp=str1.compareTo(str2);
      if(temp<0)
      {
        System.out.println(str1+"Str1 is lessthan str2"+str2);
      }
      else if(temp>0)
      {
        System.out.println(str1+"Str1 is greater than str2"+str2);
      }
      else
      {
        System.out.println(str1+"Str1 is equals to str2"+str2);
      }
    }
  }