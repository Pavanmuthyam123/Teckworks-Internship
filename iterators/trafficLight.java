import java.util.Scanner;
class trafficLight
  {
    public static void main(String args[])
    {
      System.out.println("enter traffic time");
     Scanner s=new Scanner(System.in);
     int time=s.nextInt();
      traffic(time);    
    }
    public static void traffic(int time)
    {
      if(time<=20 && time>=1)
      {
        System.out.println("traffic light is Green ");
      }
      else if(time>20 && time<=40)
      {
        System.out.println("traffic light is Red ");
      }
      else
      {
        System.out.println("traffic light is Yellow ");
      }
    }
  }  