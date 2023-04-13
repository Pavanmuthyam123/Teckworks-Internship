import java.util.Scanner;
import java.lang.String;
class peter
{
    public static void main(String args[])
    {
      System.out.println("enter string 1: ");
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      pet(str);
    }
  public static void pet(String str)
  {
      int count1=0,count2=0;
      for(int i=0;i<=str.length()-1;i++)
        {
          if(str.charAt(i)=='0')
            {
              count1++;
            }
          else
            {
             count1++;
            }
        }
      if(count1<count2)
      {
        System.out.println("Win the match");
      }
      else
      {
         System.out.println("losses the match");
      }
    }
}