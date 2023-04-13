import java.util.Scanner;
class lowercase 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = s.nextLine();
      lower(str);
  }
  public static void lower(String str)
  {
    String lowercase = str.toLowerCase();
    System.out.println("The string in lowercase is: " + lowercase);
  }
}