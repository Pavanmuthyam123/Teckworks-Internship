import java.util.*;
class arrayintoArrayList
  {
    public static void main(String args[])
    {
      String [] str={"pavan","muthyam"};
      //List l=Arrays.asList(str);
      //System.out.println(l);
      List<String>l=new ArrayList <>();
      //Collections.addAll(l,str);
      //System.out.println(l);
      for(String str1:str)
        {
        l.add(str1);
        }
      System.out.println(l);
    }
  }