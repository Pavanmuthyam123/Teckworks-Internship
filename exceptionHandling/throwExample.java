import java.util.*;
class throwExample
  {
    public static void main(String args[])
      {
      int x=-10;
      try
        {
          if(x<0)
          {
            throw new ArithmeticException();
          }
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
      }
  }