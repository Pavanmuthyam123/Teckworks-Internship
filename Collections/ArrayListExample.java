import java.util.*;
class ArrayListExample
  {
    public static void main(String args[])
    {
      ArrayList ar1=new ArrayList(2);
      ArrayList ar2=new ArrayList(5);
      System.out.println(ar1);
      System.out.println(ar2);
      ar1.add(10);
      ar1.add(20);
      System.out.println(ar1);
      ar2.add(10);
      ar2.add(20);
      ar2.add(30);
      ar2.add(40);
      ar2.add(50);
      System.out.println(ar2);
      System.out.println(ar2.get(3));
      System.out.println(ar2.remove(2));
      System.out.println(ar2.indexOf(59));
      System.out.println(ar2.set(2,100));
      System.out.println(ar2);
    }
  }