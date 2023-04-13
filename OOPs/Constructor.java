import java.util.*;
class ConstructorExample
  {
    int num1;
    int num2;
    ConstructorExample(int n1,int n2)//function defination
    {
     num1=n1;
     num2=n2;
     System.out.println("this constructor: ");
    }
    void getnum1()
    {
      System.out.println(num1);
    }
    void getnum2()
    {
      System.out.println(num2);
    }
    /*void setnum1()
    {
      Scanner s=new Scanner(System.in);
      num1=s.nextInt();
    }
     void setnum2()
    {
      Scanner s=new Scanner(System.in);
      num2=s.nextInt();
    }*/
  }
class ConstructorMain
  {
    public static void main(String ards[])
    {
      ConstructorExample ce=new ConstructorExample("pavan");//calling fuction
      ce.getnum1();
      ce.getnum2();
      ce.setnum1();
      ce.setnum2();
    }
  }