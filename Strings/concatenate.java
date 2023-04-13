import java.util.Scanner;
import java.lang.String;
class concatenate
{
    public static void main(String args[])
    {
      System.out.println("enter string 1: ");
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      System.out.println("enter string 2: ");
      String str2=s.nextLine();
      concate(str1,str2);
    }
  public static void concate(String str1,String str2)
  {
    String result;
    result = str1.concat(str2);
    System.out.println("After concatination: "+result); 
  }
}