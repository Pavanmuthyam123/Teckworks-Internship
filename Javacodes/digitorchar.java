import java.util.Scanner;
class digitorchar
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
       if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
      {
        System.out.println("It is alphabet ");
      }
      else if(ch>='0' && ch<='9')
      {
        System.out.println("It is digit");
      }
      else
      {
        System.out.println("Enter valid ");
      }
      }
    }