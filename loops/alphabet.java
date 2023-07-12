import java.util.Scanner;
class alphabet
  {
    public static void main(String args[])
    {
      System.out.println("enter character");
      Scanner s=new Scanner(System.in);
      char ch=s.next().charAt(0);
      alpha(ch);
    }
    public static void alpha(char ch)
    {
      int s=97,l=122;
      while(s<=l)
        {
          System.out.print((char)s);
          s++;
        }
    }
  }
    