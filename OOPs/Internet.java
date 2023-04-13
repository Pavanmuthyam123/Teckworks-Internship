import java.util.*;
class Internet
  {
    static String user_name;
    long password;
    String Ifsc;
    Internet(String a,long l,String s)
    {
      user_name=a;
      password=l;
      Ifsc=s;
      System.out.println(a);
      System.out.println(l);
      System.out.println(s);
    }
    void verify()
    {
      if(user_name=="pavan" && password==69705462)
      {
        System.out.println("User can access");
      }
      else
      {
        System.out.println("User can't access");
      }
    }
  }
    class pavan
      {
        public static void main(String[] args) 
        {
         Internet i=new Internet("pavan",69705462,"Muthyam");
         i.verify();
        }
      }