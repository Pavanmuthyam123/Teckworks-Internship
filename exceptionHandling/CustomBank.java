import java.util.*;
class withDrawException extends Exception
  {
      public withDrawException(String message)
    {
      super(message);
    }
  }
class Bank
  {
    String customer_name;
    int balance_amount;
    int withdraw_amount;
    Scanner sc=new Scanner(System.in);
    void readname()
    {
      System.out.println("Enter the customer name:");
      try
        {
          customer_name=sc.nextLine();
        }
      catch(InputmismatchException h)
        {
          System.out.println("customer name should have only one Alphabets");
          readname();
        }
    }
    void balance()
    {
      System.out.println("Enter the customer name:");
      try
        {
          balance_amount=sc.nextLine();
        }
      catch(InputmismatchException h)
        {
          System.out.println("customer name should have only one Alphabets");
          readname();
        }
    }
    void withdraw()
    {
      System.out.println("Enter the customer name:");
      try
        {
          withdraw_amount=sc.nextLine();
        }
      catch(InputmismatchException h)
        {
          System.out.println("it should be interger format");
          readname();
        }
    }
    void draw()
    {
if(withdraw_amount>balance_amount)||(withdraw_amount<0))
       try{ 
        throw new withDreawException("withdraw amount less than to balance:");
        
    }
      catch(withDreawException e)
       {
         System.out.println(e);
       }
    }
    else
    {
   balance_amount=balance_amount-withdraw_amount;
    }
    void display()
    {
      System.out.println("Customer details: ");
      System.out.println("Customer name"+customer_name);
      System.out.println("Customer name"+balance_amount);
    }
  }
class CustomBank
  {
    public static void main(String args[])
    {
      System.out.println("Enter total no.of bank customers:");
      Scanner s=new Scanner(System.in);
      int numofcust=s.nextInt();
      Bank b[]=new Bank[numofcust];
      for(int i=0;i<numofcust;i++)
      b[i]=new Bank();
      b[i].readname();
      b[i].readbalance();
      b[i].readwithdraw();
      b[i].draw();
      b[i].display();
    }
  }