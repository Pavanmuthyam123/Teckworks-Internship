import java.util.*;
class ConcateTwoStrs
  {
    public static void main(String a[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String1: ");
      String str1=s.nextLine();
      System.out.println("Enter the String2: ");
      String str2=s.nextLnine();
      String str3=" ";
      for(int i=0;i<=str1.length();i++)
        {
          str3=str3+str1.charAt(i);
        }
      for(int i=0;i<=str1.length();i++)
        {
          str3=str3+str2.charAt(i);
        }
      System.out.println(str3);
    }
  }