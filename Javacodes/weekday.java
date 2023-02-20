import java.util.Scanner;
import java.util.Scanner.throwfor;
class dayofWeek
  {
    public static void main(String args[])
    {
  System.out.println("Enter week num: ");
     Scanner s=new Scanner(System.in);
     string a=s.nextLine();
      week(a);
    }
    public static void week(String a)
    {
      switch(a)
        {
          case "monday":
            System.out.println(1);
            break;
          case "Tuesday":
            System.out.println(2);
            break;
          case "Wednesday":
            System.out.println(3);
            break;
          case "Thursday":
            System.out.println(4);
            break;
          case "Friday":
            System.out.println(5);
            break;
          case "Saturday":
            System.out.println(6);
            break;
          case "Sunday":
            System.out.println(7);
            break;
          default:
            System.out.println("invalid string");
            break;
        }
    }
  }