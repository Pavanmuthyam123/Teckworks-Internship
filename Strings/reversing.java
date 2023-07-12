import java.util.*;
class reverse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String: ");
      String str=sc.nextLine();
      for(int i=str.length();i>=0;i++)
        {
          str1=str1+str.charAt(i);
        }
      System.out.println(str1);
    }
  }