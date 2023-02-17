import java.util.Scanner;
class age
  {
    public static void main(String args[])
    {
      System.out.println("Enter Year: ");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      present(a);
    }
    public static void present(int a)
    {
      int age=2023-a;
      System.out.println("Current age: "+age);
      if(age>=18)
      {
       System.out.println("They are Adult: ");
      }
          
      else
      {
        System.out.println("They are Minors: ");
      }
    }
      
    }
  