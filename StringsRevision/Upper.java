import java.util.*;
class Upper
  {
    public static void main(String a[])
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String str1="";
      char c='';
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='A'&&str.charA(i)<='Z')
          {
           c=(char)(str.charAt(i)+32) 
          }
          else
          {
            c=(char)(str.charAt(i));
          }
          str1=st1+c;
        }
      System.out.println(str1);
    }
  }