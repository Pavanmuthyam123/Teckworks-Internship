import java.util.Scanner;
class countofwords 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = s.nextLine();
      count(str);
  }
  public static void count(String str1)
  {
    int count=1;
    for(int i=0;i<str1.length()-1;i++)
      {
        if((str1.charAt(i)==' ')&&(str1.charAt(i+1)!=' '))
        {
          count++;
        }
      }
    System.out.println("Total words in String: "+count);
  }
}