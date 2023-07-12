import java.util.*;
class IndexOfchar
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String: ");
      String str=s.nextLine();
      char ch=s.next().charAt(0);
      for(int i=0;i<=str.length();i++)
        {
          if(ch==str.charAt(i))
          {
            System.out.println(i);
          }
        }
    }
  }