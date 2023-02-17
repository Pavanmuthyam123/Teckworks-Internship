import java.util.Scanner;
class grade
  {
    public static void main(String args[])
    {
  System.out.println("Enter Subjects Marks:");
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
     int c=s.nextInt();
     double avg=(a+b+c)*100/300;
      System.out.println("avg of student: "+avg);
      grade(avg);
      }
    public static void grade(double avg)
    {
      if(avg>=90)
      {
        System.out.println("Excellent 'A' Grade ");
      }
      else if(avg>=80)
      {
        System.out.println("Average 'B' Grade ");
      }
      else
      {
        System.out.println("unsatisified 'c' Grade ");
      }
    }
  }