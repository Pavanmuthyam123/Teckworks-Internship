import java.util.*;
class InvalidPinException extends Exception
  {
    public InvalidPinException(String message)
    {
      super(message);
    }
  }
class CustomMobile
  {
    public void validpin(String num) throws InvalidPinException
    {
      if(num.length()!=10)
        {  
          throw new InvalidPinException(" "+num);
        }
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter your number: ");
      String num=s.nextLine();
      CustomMobile c=new CustomMobile();
      try
        {
          c.validpin(num);
          System.out.println("Valid number ");
        }
      catch(InvalidPinException h)
        {
          System.out.println("Invalid num");
        }
    }
   }