import java.util.Scanner;
class lengthofEach 
{
    public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str1 = s.nextLine();
      length(str1);
  }
  public static void length(String str1)
  {
    int start=0;
   for(int i=0;i<=str1.length()-1;i++)
     { 
       char ch=str1.charAt(i);
       if(ch==' ')
       {
         String s1=str1.substring(start,i);
         System.out.println(s1+" = "+s1.length());
         start=i+1;
       }
         else if(i==str1.length()-1)
         {
         String s1=str1.substring(start,i+1);
         System.out.println(s1+" = "+s1.length());
         }
       }
     }
  
}