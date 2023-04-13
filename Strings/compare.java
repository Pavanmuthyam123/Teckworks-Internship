import java.util.*;
class compare
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string1: ");
      String str5=s.nextLine();
      System.out.println("enter the string2: ");
      String str6=s.nextLine();
      com(str5,str6);
    }
       public static void com(String str1,String str2)
        {
          System.out.println(str1.compareTo(str2));
        }
  }