import java.util.Scanner;
class fiveSub
  {
    public static void main(String args[])
    {
      System.out.println("Enter sub1: ");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      System.out.println("Enter sub2: ");
      int b=s.nextInt();
      System.out.println("Enter sub3: ");
      int c=s.nextInt();
      System.out.println("Enter sub4: ");
      int d=s.nextInt();
      System.out.println("Enter sub5: ");
      int e=s.nextInt();
      int score=a+b+c+d+e;
      double percent;
      percent=(score*100)/500;
      marks(percent);
    }
     public static void marks(double percent)
    {
      if(percent>=90)
		{
			System.out.println("A grade");
		}
	   else if(percent>=80)
		{
			System.out.println("B grade");
		}
	   else if(percent>=70)
		{
			System.out.println("C grade");
		}
	   else if(percent>=60)
		{
			System.out.println("D grade");
		}
	   else if(percent>=40)
		{
			System.out.println("E grade");
		}
	  else
		{
			System.out.println("F grade");
		}
    }
  }
    