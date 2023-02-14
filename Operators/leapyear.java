import java.util.*;
class leapyear
  {
    public static void main(String args[])
    {
      int a;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      if(a%4==0)
      {
        System.out.println("Leap year"+a);
      }
      else
      {
       System.out.println("Not aLeap year"+a); 
      }
    }
  }