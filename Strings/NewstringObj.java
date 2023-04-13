import java.util.*;
class NewstringObj
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of characters: ");
      int n=s.nextInt();
      char c[]=new char[n];
      for(int k=0;k<n;k++)
        {
          c[k]=s.next().charAt(0);
        }
      show(c);
    }
    public static void show(char ch[])
    {
      String str=new String(c);
      System.out.println(str);  
    }
    
  }