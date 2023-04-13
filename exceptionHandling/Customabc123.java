import java.util.*;
class InvalidPinException extends Exception
  {
    public InvalidPinException(String message)
    {
      super(message);
    }
  }
class Customabc123
  {
    public void validpin(String pswd) throws InvalidPinException
    {
      if(!pswd.equals("abc123"))
      {
        throw new InvalidPinException("Invalid Password Entered: ");
      }
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter password: ");
      String password=s.nextLine();
      Customabc123 c=new Customabc123();
      try
        {
          c.validpin(password);
          System.out.println("Password is Accessable:");
        }
      catch(InvalidPinException h)
        {
          System.out.println("Password is not Accessable:");
        }
    }
  }