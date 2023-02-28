//to dislay char a,c,e,g......
import java.util.Scanner;
class Test
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      for(char n='A';n<='Z';n=n+2)
        {
          System.out.println((char)n);
        }
        
    }
  }