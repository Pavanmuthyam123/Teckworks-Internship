import java.util.Scanner;
import java.lang.Math.*;
class Armstrong
  {
    public static void main(String args[])
    {
      System.out.println("enter the nunber: ");
      Scanner s=new Scanner(System.in);
      int i=s.nextInt();
      arm(i);
    }
    public static void arm(int i)
    {
      int res=0,rem,num=i;
      while(num!=0)
        {
          rem=num%10;
          res=res+(rem*rem*rem);
          num=num/10;
        } 
    if(res==i)
      {
         System.out.println("it is armstrong num");
      }
    else
      {
         System.out.println("it is not armstrong num");
      }
   }
}
