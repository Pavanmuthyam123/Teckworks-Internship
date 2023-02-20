import java.util.Scanner;
class dayofWeek
  {
    public static void main(String args[])
    {
  System.out.println("Enter week num: ");
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
      week(a);
    }
    public static void week(int a)
    {
      switch(a)
        {
          case 1:System.out.println("Monday");
            break;
          case 2:System.out.println("Tuesday");
            break;
          case 3:System.out.println("Wednesday");
            break;
          case 4:System.out.println("Thursday");
            break;
          case 5:System.out.println("Friday");
            break;
          case 6:System.out.println("Saturday");
            break;
          case 7:System.out.println("Sunday");
            break;
          default:System.out.println("Invalid num");
            break;
        }
    }
  }
      