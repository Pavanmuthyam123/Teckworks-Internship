import java.util.Scanner;
class frndMobilenum
  {
    public static void main(String args[])
    {
       System.out.println("Enter best frnd num : ");
      Scanner s=new Scanner(System.in);
      long a=s.nextLong();
      num(a);
    }
    public static void num(long a)
    {
      long n=0,c=0;
      while(a!=0)
        {
          n=a%10;
          a=a/10;
          c=c+1;
          if(c>=1 && c<=4)
          {
            System.out.println(n);
          }
        }
    }
  }