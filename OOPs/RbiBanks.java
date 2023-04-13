*//All the banks operating in India are controlled by RBI. RBI has set well-defined guidelines (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) that all banks must follow. For example, suppose RBI has set the minimum interest rate applicable to a savings bank account to be 4% annually; however, banks are free to use a 4% interest rate or to set any rates above it. Write a Java program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept. Note: Create a few classes namely Customer, Account, RBI (Base Class), and a few derived classes (SBI, ICICI, PNB, etc). Assume and implement required member variables and functions in each class.*//
import java.util.Scanner;
class Customer
  {
    String name;
    String address;
    long phone;
    public Customer(String cust_name,String cust_address,String cust_ph)
    {
      this.name=cust_name;
      this.address=cust_address;
      this.phone=cust_ph;
    }
  }
class Account
  {
    int accNum;
    double balance;
    String branch;
    public Account(int acc_num,double ac_balance,String ac_branch)
    {
      this.accNum=acc_num;
      this.balance=ac_balance;
      this.branch=ac_branch; 
    }
  }
class RBI
  {
    double minIntrest;
    double minBalance;
    double maxWithdrawl;
    public RBI(double min_Intrest,double min_Balance,double max_Withdrawl)
    {
      this.minIntrest=4.0;
      this.minBalance=683879;
      this.maxWithdrawl=50000;
    }
    public void setMin_Intrest(double min)
    {
      if(min>=this.minIntrest)
      {
        this.minIntrest=min;
      }
      else
      {
        System.out.println(this.minIntrest);
      }
    }
    public void setMin_Balance(double bal)
    {
      if(bal>=this.minBalance)
      {
        this.minBalance=bal;
      }
      else
      {
        System.out.println(this.minBalance);
      }
    }
    public void setMax_Withdrawl(double drawl)
    {
      if(drawl>=this.maxWithdrawl)
      {
        this.maxWithdrawl=drawl;
      }
      else
      {
        System.out.println(this.maxWithdrawl);
      }
    }
    public void get()
    {
      System.out.println(minIntrest);
      System.out.println(minBalance);
      System.out.println(maxWithdrawl);
    }
  } 
class SBI extends RBI
  {
    public SBI(double min_Intrest,double min_Balance,double max_Withdrawl)
    {
      super();
      setMin_Intrest(min_Intrest);
      setMin_Balance(min_Balance);
      setMax_Withdrawl(max_Withdrawl);
    }
    public void get()
    {
      System.out.println(min_Intrest);
      System.out.println(min_Balance);
      System.out.println(max_Withdrawl);
    }
  }
class ICICI extends RBI
  {
public ICICI(double min_Intrest,double min_Balance,double max_Withdrawl)
    {
      super();
      setMin_Intrest(min_Intrest);
      setMin_Balance(min_Balance);
      setMax_Withdrawl(max_Withdrawl);
    }
     public void get()
    {
      System.out.println(min_Intrest);
      System.out.println(min_Balance);
      System.out.println(max_Withdrawl);
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      Customer c=new Customer();
      c.Customer();
      Account a=new Account();
      a.Account();
      RBI r=new RBI();
      r.RBI();
      r.SBI();
      r.ICICI();
    }
  }
