import java.util.Scanner;
class vowelornot
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
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
        System.out.println("It is vowel");
      }
      else
      {
        System.out.println("It is constant ");
      }
    }
  }