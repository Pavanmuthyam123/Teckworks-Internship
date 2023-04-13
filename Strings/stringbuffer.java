import java.util.*;
class stringbuffer 
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("string :");
      String str = sc.nextLine();
      StringBuffer sb = new StringBuffer(str);
      sb.append("hi");
      System.out.println(sb);
      sb.insert(2,"33");
      System.out.println(sb);
      sb.reverse();
      System.out.println(sb);
      sb.delete(5,7);
      System.out.println(sb);
    }
  }