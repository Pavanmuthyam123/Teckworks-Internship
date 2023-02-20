import java.util.Scanner;
class uppercaseornot
  {
    public static void main(String args[])
    {
      System.out.println("Enter character : ");
      Scanner s=new Scanner(System.in);
      char ch=s.next().charAt(0);
      letter(ch);
    }
    public static void letter(char ch)
    {
      if(ch>=65 && ch<=90)
      {
        System.out.println("It is uppercase");
      }
      else
      {
        System.out.println("It is not uppercase");
      }
    }
  }