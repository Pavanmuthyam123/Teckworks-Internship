import java.util.*;
public class MaptoList
  {
    public static void main(String[] args)
    {
      Map m=new HashMap();
      m.put(1,"Pavan");
      m.put(2,"Muthyam");
      m.put(3,"Anil");
      m.put(4,"Kalyan");
      System.out.println(m);
      List<Integer>l= new ArrayList(m.keySet());
      List<String> l1= new ArrayList(m.values());
      for(int i:l)
        {
          System.out.println(i);
        }
      for(String str:l1)
        {
          System.out.println(str);
        }
    }
  }