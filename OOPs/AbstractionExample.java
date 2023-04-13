import java.util.*;
abstract class Bank
  {
    abstract double intrestRate();
    abstract void AnnualProfit();
  }
class SBI extends Bank
  {
    double intrestRate()
    {
      return 67.87;
    }
    void AnnualProfit()
    {
      System.out.println("This year got 30% profit");
    }
  }
class ICIC extends Bank
{
  double intrestRate()
  {
    return 87.90;
  }
  void AnnualProfit()
  {
    System.out.println("This year got 17% profit: ");
  }
}
class AbstractionExample
  {
    public static void main(String args[])
    {
      SBI s=new SBI();
      ICIC ic=new ICIC();
      s.intrestRate();
      s.AnnualProfit();
      ic.AnnualProfit();
      System.out.println(s.intrestRate());
      System.out.println(ic.intrestRate()); 
    }
  }