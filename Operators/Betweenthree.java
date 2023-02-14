import java.util.Scanner;
class Betweenthree
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      if(a>b && a>c)
      {
        System.out.println("a is greater"+a);
      }
      else if(b>c)
      {
        System.out.println("b is greater"+b);
        
      }
      else
      {
       System.out.println("c is greater"+c); 
      }
    }
  }