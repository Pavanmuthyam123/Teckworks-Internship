import java.util.Scanner;
class alphabet
  {
    public static void main(String args[])
    {
      char ch;
  `    Scanner s=new Scanner(System.in);
      ch=s.next().charAt(0);
      if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')        
        {
        System.out.println("character is vowel  "+ch);
        }
      else
        {
       System.out.println("character is not vowel  "+ch);
        }
    }
  }   