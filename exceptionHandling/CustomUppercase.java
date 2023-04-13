import java.util.*;
class InvalidPinException extends Exception
  {
    public InvalidPinException(String message)
    {
      super(message);
    }
  }
class CustomUppercase
  {
    public void validpin(String str) throws InvalidPinException
    {
      if(str.charAt(0)>='a'&& str.charAt(0)<='z')
      {
        throw new InvalidPinException("Not an Uppercase: ");
      }
    }
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Alphabet: ");
       String str=s.nextLine();
       CustomUppercase c=new CustomUppercase();
        try
          {
            c.validpin(str);
            System.out.println("It is an Uppercase:");
          }
        catch(InvalidPinException h)
          {
            System.out.println("It is not an Uppercase:");
          }
      }
    }