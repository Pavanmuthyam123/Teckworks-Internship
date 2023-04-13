import java.util.Scanner;
class Nonrepeat
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in); 
      System.out.println("enter the string: ");
      String str=s.nextLine();
      unique(str);
    }
    public static void unique(String str)
    {
      for(int i=0;i<str.length();i++)
        {  
     if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
          {
            System.out.println(str.charAt(i));
          }
        }
    }
  }