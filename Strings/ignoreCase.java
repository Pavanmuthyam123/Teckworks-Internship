import java.util.*;
class ignoreCase
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string1: ");
      String string1=s.nextLine();
      System.out.println("enter the string2: ");
      String string2=s.nextLine();
      ignore(string1,string2);
    }
       public static void ignore(String str1,String str2)
      {        
        System.out.println(str1.compareToIgnoreCase(str2));
      }
  }