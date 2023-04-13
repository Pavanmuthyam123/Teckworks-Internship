import java.util.*;
class MaptoSet
  {
    public static void main(String[] args)
    {
      Map<Integer,String> m=new HashMap<>();
      m.put(1,"Pavan");
      m.put(2,"Muthyam");
      m.put(3,"Anil");
      m.put(4,"Kalyan");
      Set<Integer>s1=new HashSet<Integer>(m.keySet());
      Set<String>s2=new HashSet<String>(m.values());
      System.out.println(s1);
      System.out.println(s2);
    }
  }