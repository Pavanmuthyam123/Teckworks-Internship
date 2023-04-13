import java.util.Scanner;
public class stringtoInt
  {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("enter string value :");
      String str1 = s.nextLine();
      int value = convert(str1);
      System.out.println(value);
    }
    public static int convert(String s){
      int value = Integer.parseInt(s);
      return value;
    }
  }