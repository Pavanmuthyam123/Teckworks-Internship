import java.util.*;
class HashMapDemo
  {
public static void main(String[] args)
    {
HashMap<Integer,String> h=new HashMap<>();
      h.put(1,"Muthyam");
      h.put(2,"pavan");
      h.put(3,"570");
      h.put(4,"Polavaram");
      System.out.println(h);
      System.out.println(h.size());
    Set s1=h.keySet();
      System.out.println(s1);
  Collection c=h.values();
  System.out.println(c);
  Set entry=h.entrySet();
    System.out.println(entry);
    System.out.println(h.remove(3));   
    }
  }