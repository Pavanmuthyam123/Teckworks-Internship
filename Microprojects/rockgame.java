import java.util.Scanner;
import java.util.Random;
class rockgame
  {
    public static void main(String args[])
    {
     System.out.println("Enter computer choice: ");
      Scanner s=new Scanner(System.in);
      Random rand=new Random();
      int comp=rand.nextInt(3)+1;
      System.out.println(comp);
      System.out.println("select number for user \n 1.rock \n 2.paper \n 3.scissor\n");
      int user=s.nextInt();
      rock(comp,user);
    }
    public static void rock(int comp,int user)
    {
      if(comp==1 && user==3){
        System.out.println("computer wins");
      }
      else if(comp==1 && user==2)
        System.out.println("computer wins ");
      else if(comp==1 && user==1)
        System.out.println("Game tie ");
      else if(comp==2 && user==1)
        System.out.println("user wins ");
      else if(comp==3 && user==1)
        System.out.println("user wins ");
        else if(comp==2 && user==2)
        System.out.println("Game tie ");
      else if(comp==2 && user==3)
        System.out.println("user wins ");
      else if(comp==3 && user==3)
        System.out.println("Game tie ");
      else if(comp==3 && user==2)
        System.out.println("computer wins ");
    }
  }