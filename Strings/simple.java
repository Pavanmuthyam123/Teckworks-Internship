import java.util.Scanner;
import java.lang.String;
class simple
{
    public static void main(String args[])
    {
      System.out.println("enter string: ");
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      System.out.println("string length: ");
      System.out.println(str.length());
      System.out.println("After concatination: ");
      String str2=str.concat("muthyam");
      System.out.println(str2);
      System.out.println("character printing: ");
      char ch=str.charAt(3);
      System.out.println(ch);
    }
}