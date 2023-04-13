/* Method-1
import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListToArray 
{
   public static void main(String[] args) 
  {
      LinkedList <String> list = new LinkedList<String>();
      //Instantiating an ArrayList object
      list.add("JavaFX");
      list.add("Java");
      list.add("WebGL");
      list.add("OpenCV");
      list.add("OpenNLP");
      list.add("JOGL");
      Object[] objectAarray = list.toArray();
      int length = objectAarray.length;
      String []stringArray = new String[length];
      for(int i=0;i<length;i++) 
      {
         stringArray[i] =(String) objectAarray[i];
      }
      System.out.println("Contents of the array: \n"+Arrays.toString(stringArray));
   }
}*/


/* Method-2

import java.util.Arrays;
import java.util.LinkedList;
public class LinkedListToArray 
{
   public static void main(String[] args) 
   {
      LinkedList <String> list = new LinkedList<String>();
      //Instantiating an ArrayList object
      list.add("JavaFX");
      list.add("Java");
      list.add("WebGL");
      list.add("OpenCV");
      list.add("OpenNLP");
      String[] stringArray = list.toArray(new String[0]);
      System.out.println("Contents of the array: \n"+Arrays.toString(stringArray));
   }
}*/