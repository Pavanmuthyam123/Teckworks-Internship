import java.util.*;
class program
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      for(int i=0;i<str.length();i++)
        {
          if(i%2==0)
          {
            System.out.println("Even index"+i);
          }
          else
          {
            System.out.println("odd ");
          }
        }
    }
  }