import java.util.*;
class InvalidPinException extends Exception
  {
    public InvalidPinException(String message)
    {
      super(message);
    }
  }
class CustomVowel
  {
    public void validpin(String str) throws InvalidPinException
    {      if(str.charAt(0)=='A'||str.charAt(0)=='E'||str.charAt(0)=='I'||str.charAt(0)=='O'||str.charAt(0)=='U'||str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')
    {
      throw new InvalidPinException("It is  an Vowel:");
    } 
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the letter: ");
      String str=s.nextLine();
      CustomVowel c=new CustomVowel();
      try
        {
          c.validpin(str);
          System.out.println("It is not an vowel:");
        }
      catch(InvalidPinException h)
        {
          System.out.println("It is an vowel:");
        }
    }
  }