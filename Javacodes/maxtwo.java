import java.util.Scanner;
class maxtwo
  {
    public static void main(String args[])
    {
      System.out.println("Enter Num1 : ");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      System.out.println("Enter Num2 : ");
      int b=s.nextInt();
      max(a,b);
    }
    public static void max(int a,int b)
    {
      if(a>b)
      {
        System.out.println("a is max num : ");
      }
      else
      {
        System.out.println("b is max num : ");
      }
    }
  }
    
      
      