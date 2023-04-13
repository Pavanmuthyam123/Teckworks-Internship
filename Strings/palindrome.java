import java.util.Scanner;
public class palindrome
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a string :");
      String s1 = sc.nextLine();
      String s2 = palindrome(s1);
      if(s1.equals(s2))
      {
        System.out.println("palindrom");
      }
      else
      {
        System.out.println("Not a palindrom");
      }
      
    }
    public static String palindrome(String s1)
    {
      String s2 ="";
      for(int i = s1.length()-1;i>=0;i--)
      {
        s2=s2+s1.charAt(i);
      }
      return s2;
    }
  }