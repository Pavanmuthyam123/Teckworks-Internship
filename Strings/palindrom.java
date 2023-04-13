import java.util.*;
class palindrom
  {
    public static void main(String a[])
    {
      System.out.println("Enter String: ");
      String str=new String();
      Scanner s=new Scanner(System.in);
      str=s.nextLine();
      
      System.out.println(str);
      boolean Palindrome = true;
      int n=str.length();
      for(int i=0;i<n/2;i++) 
        {
           if(str.charAt(i)!=str.charAt(n-i-1))
             {
                Palindrome = false;
                break;
             }
        }
           if(Palindrome)
             {
                System.out.println("It a palindrome "+str);
                StringBuffer sb=new StringBuffer(str);
                String replaceString=str.replace(str,"palindrome");
                System.out.println(replaceString);
             } 
            else
             {
                System.out.println("It is not a palindrome "+str);
             }
    }
  }