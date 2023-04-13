import java.util.*;
interface Number
  {
    boolean isZero(int num);
    boolean isPositive(int num);
    boolean isNegative(int num);
    boolean isOdd(int num);
    boolean isEven(int num);
    boolean isArmstrong(int num);
    boolean isPrime(int num);
  }
class Verfication implements Number
  {
    public boolean isZero(int num)
    {
      if(num==0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    public boolean isPositive(int num)
    {
      if(num>0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    public boolean isNegative(int num)
    {
      if(num<0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    public boolean isOdd(int num)
    {
      if(num%2!=0)
      {
       return true; 
      }
      else
      {
        return false;
      }
    }
    public boolean isEven(int num)
    {
      if(num%2==0)
      {
        return true;
      }
    else
      {
        return false;
      }
    }
    public boolean isArmstrong(int num)
    {
      int sum,rem=0,temp=num;
      while(num>0)
        {
          sum=num%10;
          rem=rem+(sum*sum*sum);
          num=num/10;
        }
      if(temp==rem)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    public  boolean isPrime(int num)
    {
      for (int i=2;i<num;i++)
        {
          if (num%i==0)
          {
            return false;
          }
          else
          {
            return true;
          }
        }
    }
  }
class Verify
  {
    Public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      Verification v=new Verification();
      System.out.println(v.isZero(num));
      System.out.println(v.isPositive(num));
      System.out.println(v.isOdd(num));
      System.out.println(v.isEven(num));
      System.out.println(v.isArmstrong(num));
      System.out.println(v.isPrime(num)); 
    }
  }