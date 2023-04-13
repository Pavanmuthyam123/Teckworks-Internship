import java.util.Scanner;
class charIndex 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = s.nextLine();
      System.out.print("Enter Index: ");
      int ind=s.nextInt();
      index(str,ind);
  }
  public static void index(String str2,int index)
  {
    System.out.println("character is "+str2.charAt(index));
  }
}