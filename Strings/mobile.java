import java.util.*;
class mobile
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter string: ");
      String str=s.nextLine();
      mob(str);
    }
    public static void mob(String str)
    {
       int c=0;
      for(int i=0;i<=str.length()-1;i++)
        {
          if(str.charAt(i)>='0' && str.charAt(i)<='9')
          {
            c++;
          }
        }
      if(c==10)
      {
        System.out.println("it is a valid number:");
      }
      else
      {
        System.out.println("it is not a valid number");
      } 
    }
  }