import java.util.Scanner;
class alphabetornot
  {
    public static void main(String args[])
    {
      char ch;
      Scanner s=new Scanner(System.in);
      ch=s.next().charAt(0);
      if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'))
         {
          System.out.println("character is alphabet  "+ch);
         }
      else
        {
       System.out.println("character is not alphabet  "+ch);
        }
    }
  }