import java.util.Scanner;
class complex
  {
    public static void main(String args[])
    {
      System.out.println("enter number");
      Scanner p=new Scanner(System.in);
      int n=p.nextInt();
      int m=p.nextInt();
      int s=p.nextInt();
      sum(n,m,s);
    }
    public static void sum(int n,int m,int s)
    {
      while(n<=m)
        {
          if(m%2==0 && m%3==0)
          {
            if(s==m)
            {
              break;
            }
            else
            {
              System.out.println(n);
            }
          }
          n++;
        }
    }
  }