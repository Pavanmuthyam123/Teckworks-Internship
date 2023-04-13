import java.util.*;
public class LinkedHashMap
{
public static void main(String args[]) 
  {
LinkedHash<Integer,String> lhmap = new LinkedHash<Integer, String>();
lhmap.put(22, "Abey");
lhmap.put(33, "Dawn");
lhmap.put(1, "Sherry");
lhmap.put(2, "Karon");
lhmap.put(100, "Jim");
// Generating a Set of entries
Set set = lhmap.entrySet();
// Displaying elements of LinkedHashMap
Iterator iterator=set.iterator();
while(iterator.hasNext()) 
{
Map.Entry me = (Map.Entry)iterator.next();
System.out.print("Key is: "+ me.getKey() + "& Value is: "+me.getValue()+"\n");
}
}
}