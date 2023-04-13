import java.util.Scanner;
class AliceBob 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter cases: ");
      int a = s.nextInt();
      int m,n;
    while(a-->0)
      {
        m=s.nextInt();
        n=s.nextInt();
        if(m>n)
        {
          System.out.println("A");
        }
        else
        {
          System.out.println("B");
        }
      }
  }
}