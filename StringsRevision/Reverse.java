import java.util.*;
class Revese
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String: ");
      String str=s.nextLine();
      char ch[]=str.toCharArray();
      String str1=" ";
      for(int i=ch.length-1;i>=0;i--)
        {
          str1=str1+ch[i];
        }
      System.out.println(str1);
    }
  }