import java.util.Scanner;
   class First
  {
    public static void main(String args[])
    {
      int x;char y;double z;String k;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the values for given");
      x=s.nextInt();
      y=s.next().charAt(1);
      z=s.nextDouble();
      k=s.next();
      System.out.println("x value is"+x);
      System.out.println("y value is"+y);
      System.out.println("z value is"+z);
      System.out.println("h value is"+k);
      
        
    }
  }