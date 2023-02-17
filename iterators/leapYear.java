import java.util.Scanner;
class leapYear
  {
    public static void main(String args[])
    {
      System.out.println("Enter year: ");
      Scanner s=new Scanner(System.in);
      int leap=s.nextInt();
      leap_year(leap);
    }
   public static void leap_year(int leap)
    {
      if((leap%4==0 && leap%100!=0)||(leap%400==0))
         {
         System.out.println("it is leap year");
         }
      else
      {
        System.out.println("it is not leap year");
      }
    }
  }