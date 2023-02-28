import java.util.Scanner;
class Calculator
  {
    public static void main(String args[])
    {
      int num1,num2;
      Scanner s= new Scanner(System.in);
      System.out.println("Enter a value: ");
      num1=s.nextInt();
      System.out.println("Enter b value: ");
      num2=s.nextInt();
      System.out.println("enter the operator: ");
            char operators=s.next().charAt(0);

      do
        {
          System.out.println("arthematic operations");
          System.out.println("+:addition");
          System.out.println("-:substraction");
          System.out.println("*:multiplication");
          System.out.println("/:division");
        System.out.println("%:modulo");
        System.out.println("which operation do you want perform");
        operators=s.next().charAt(0);
          Calculator c=new Calculator();
          switch(operators)
            {
              case '+':
            int add=c.addition(num1,num2);
                System.out.println(add);
                break;
              case '-':
            int sub=c.substraction(num1,num2);
                System.out.println(sub);
                break;
              case '*':
            int mul=c.multiplication(num1,num2);
            System.out.println(mul);
                break;
              case '/':
                int div=c.division(num1,num2);
                System.out.println(div);
                break;
              case '%':
                int mod=c.modulo(num1,num2);
                System.out.println(mod);
                break;
            }
        }
        while(operators!='n');
    }
  
    int addition(int num1,int num2)
    {
      return(num1 + num2);
    }
    int substraction(int num1,int num2)
    {
      return (num1 - num2);
    }
    int multiplication(int num1,int num2)
    {
      return (num1 * num2);
    }
    int division(int num1,int num2)
    {
      return (num1 / num2);
    }
    int modulo(int num1,int num2)
    {
      return (num1 % num2);
    }
  }