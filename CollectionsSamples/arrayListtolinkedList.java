/* Method-1
import java.util.*;
import java.util.stream.*;
public class arrayListtolinkedList
{
   public static void main(String args[]) 
  {
      List<String> arrList = Arrays.asList("John", "Jacob", "Kevin", "Katie", "Nathan");
      System.out.println("ArrayList = " + arrList);
      List<String> myList = arrList.stream().collect(Collectors.toCollection(LinkedList::new));
      System.out.println("LinkedList (ArrayList to LinkedList) = " + myList);
   }
}*/