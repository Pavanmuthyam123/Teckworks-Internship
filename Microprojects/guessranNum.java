import java.util.Scanner;
import java.util.Random;
class guessranNum
  {
    public static void main(String args[])
    {
      char choose;
      int n=1;
      do
      {
     Scanner s=new Scanner(System.in);
      System.out.println("Guess the number");
      int g=s.nextInt();
      System.out.println("Random number from system");
      Random r=new Random();
      int system=r.nextInt(100);
      int number=s.nextInt();
        if(number==g)
        {
          System.out.println("your guess is correct");
        }
        else if(number!=g)
        {
           System.out.println("your guess is wrong");
        }
         System.out.println("do you want to continue the game: ");
        choose=s.next().charAt(0);
      }
        while(choose!='n');
    }
  }    