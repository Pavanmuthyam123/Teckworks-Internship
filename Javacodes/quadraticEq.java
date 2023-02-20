import java.util.Scanner;
import java.lang.Math;
class quadraticEq
  {
    public static void main(String args[])
    {
  System.out.println("Enter num a: ");
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     System.out.println("Enter num b: ");
     int b=s.nextInt();
     System.out.println("Enter num c: ");
     int c=s.nextInt();
     double d=Math.pow(b,2)-(4*a*c);
      week(a,b,c,d);
    }
    public static void week(int a,int b,int c,double d)
    {
      if(d>0)
      {
        System.out.println("roots are real and distinct");
      }
      else if(d==0)
      {
         System.out.println("roots are real and equal");
      }
      else
      {
         System.out.println("roots are imaginary");
      }
    }
  }