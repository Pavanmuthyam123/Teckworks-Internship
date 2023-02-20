import java.util.Scanner;
class mobileNumber
  {
    public static void main(String args[])
    {
      System.out.println("Enter digit: ");
      Scanner s=new Scanner(System.in);
      String a=s.nextLine(); 
      num(a);
    }
    public static void num(String a)
    {
      if(a.length()==10 && a.length()>9)
      {
        System.out.println("mobile number is valid");
      }
      else
      {
        System.out.println("Mobile number is invalid");
      }
    }
  }