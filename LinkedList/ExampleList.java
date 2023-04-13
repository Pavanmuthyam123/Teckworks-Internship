import java.util.*;
class ExampleList
  {
    public static void main(String args[])
    {
      LinkedList l=new LinkedList();
      l.add("pavan");
      l.addFirst("Muthyam");
      l.addLast(570);
      System.out.println(l.getFirst());
      System.out.println(l.getLast());
      System.out.println(l.removeLast());
      LinkedList<Object>l2=new LinkedList <>();
      l2.add("Ramu");
      l2.addFirst("Anil");
      l2.addLast(570);
      System.out.println(l2);
      Enumeration r=l.element();
      while(r.hasMoreElement())
        {
          System.out.println(r.nextElement());
        }
      iterator k=l.initerator();
      while(k.hasNext())
        {
          System.out.println(k.next());
        }
      Listiterator m=l.Listiterator();
      while(m.hasNext())
        {
          System.out.println(m.next());
        }
    }
  }
