import java.util.*;
class Bank
  {
     public void deposite(long balance,long deposite)
    {
      long deposited_ammount = balance+deposite;
      System.out.println("the deposited money is :" + deposited_ammount);
    }
    public void withdrawl(long balance,long withdraw) throws Exception
    {
      long withdrawal_amount = balance-withdraw;
      System.out.println("the withdrawal ammount is"+ withdrawal_amount);
      if(withdrawal_amount<=0)
      {
        throw new Exception("insufficients fonds");
      }
    }
    public void checkbalance(long balance,long withdrawal_amount)
    {
      System.out.println("final balance: " + withdrawal_amount);
    }
  }
class Banking
  {
    public static void main(String args[]) throws Exception
    {
      System.out.println("Enter the amount: ");
      Scanner s=new Scanner(System.in);
      long balance= s.nextLong();
      System.out.println("Enter the Withdrawl Amount: ");
      long withdraw = s.nextLong();
      System.out.println("Enter the deposit Amount: ");
      long deposite = s.nextLong();
      Bank b=new Bank();
      b.deposite(balance,deposite);
      b.withdrawl(balance,withdraw);
      b.checkbalance(balance,withdrawal_amount);
    }
  }
