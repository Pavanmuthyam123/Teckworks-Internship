import java.util.*;
class Lengthoflast
  {
    public static void main(String a[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String: ");
      String str=s.nextLine();
      int len=0;
      str=str.trim();
      for(int i=str.length()-1;i>=0;i--)
        {
          if(str.charAt(i)==' ')
          {
            break;
          }
          else
          {
            len++;
          }
        }
      System.out.println("Length of last word: "+len);
    }
  }