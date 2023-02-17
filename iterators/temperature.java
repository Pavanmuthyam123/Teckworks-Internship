import java.util.Scanner;
class temperature
  {
    public static void main(String args[])
    {
      System.out.println("Enter celsius: ");
      Scanner s=new Scanner(System.in);
      int c=s.nextInt();
      far(c);
       System.out.println("Enter fahrenheit: ");
      double f=s.nextDouble();
      cel(f);
    }
    public static void far(int c)
    {
      double farhen=(c*9)/5+32;
      System.out.println("fahrenheit: "+farhen);
      
    }
    public static void cel(double f)
    {
      double celius=(5*f)/9-32;
       System.out.println("celius: "+celius);  
    }
  }  
      
      