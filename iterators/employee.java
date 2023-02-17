import java.util.Scanner;
class employee
  {
    public static void main(String args[])
    {
  System.out.println("Enter salary:");
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
      sal(a);
    }
    public static void sal(int a)
    {
      int annual_sal=a*12;
      int tax=0;
      System.out.println("Total sal: "+annual_sal);
      if(annual_sal<=250000)
      {  
        System.out.println("There is no Tax: ");
      }
      else 
      {
        tax=10*annual_sal/100;
        System.out.println("paying tax:"+tax);
      }
      double net=annual_sal - tax;
      System.out.println("total net salary: "+net);
    }
  }