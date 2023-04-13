import java.util.*;
class Maxcount
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter string: ");
      String string=s.nextLine();
      max(string);
    }
    public static void max(String str)
    {
      String array[]=str.split(" ");
      String max=array[0];
      String min=array[0];
      for(int i=0;i<array.length;i++)
        {
          if(min.length()>array[i].length())
          {
            min=array[i];
          }
          else
          {
            max=array[i];
          }
        }
      System.out.println(min);
      System.out.println(max);
    }
  }