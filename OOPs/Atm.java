import java.util.Scanner;
class Atm
  {
    int num1;
    int num2;
    String ram;
    static int d=10;
    Atm(int a,int b,String c)
    {
      num1=a;
      num2=b;
      ram=c;
      System.out.println(a+" "+b+" "+c);
    }
  }
class Sample
  {
    public static void main(String args[])
    {
      Atm p=new Atm(69,70,"pavan");
    }
  }