import java.util.Scanner;
class Armstrong1toN
  {
    public static void main(String args[])
    {
      System.out.println("enter the nunber: ");
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      arm(num);
    }
    public static void arm(int num)
    {
      
      for(int k=1;k<=num;k++)
      {
        int number,res=0,rem;
        number=k;
        int i=k;
      
      while(i!=0)
        {
          rem=i%10;
          res=res+(rem*rem*rem);
          i=i/10;
        } 
    if(res==k)
      {
         System.out.println(number+" it is armstrong num");
      }
    else
      {
         System.out.println(number+" it is not armstrong num");
      }
      }
   }
}
