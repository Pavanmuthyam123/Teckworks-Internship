import java.util.Scanner;
class uppercase 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = s.nextLine();
      upper(str);
  }
  public static void upper(String str)
  {
    String uppercase = str.toUpperCase();
    System.out.println("The string in uppercase is: " + uppercase);
  }
}
