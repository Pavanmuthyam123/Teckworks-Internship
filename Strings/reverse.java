import java.util.Scanner;
import java.lang.String;
class reverse
{
    public static void main(String args[])
    {
      System.out.println("enter string 1: ");
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      rev(str);
    }
  public static void rev(String str)
  {
    String r="";
    System.out.println("Reverse of String :");
    for(int i=str.length()-1;i>=0;i--)
      {
        r=r+str.charAt(i);
      }
    System.out.println("Reverse of String: "+r);
  }
}