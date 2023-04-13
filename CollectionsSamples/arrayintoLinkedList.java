/* Method-1
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class arrayintoLinkedList 
{
	public static void main(String[] args)
  {
		String[] strArr = { "A", "B", "C", "D", "E" };
		// Convert array to list
		List<String> list = Arrays.asList(strArr);
		// Create a LinkedList and
		// pass List in LinkedList constructor
		LinkedList<String>linkedList= new LinkedList<>();
		System.out.println("LinkedList of array :""+ linkedList);
	}
}*/

/* Method-2

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Class arrayintoLinkedList
public class
{
	public static void main(String[] args)
	{
		String[] strArr = { "G", "E", "E", "K", "S" };

		// Create an empty LinkedList
		LinkedList<String>linkedList= new LinkedList<>();
		// Append all elements of array to linked list
		// using Collections.addAll() method
		Collections.addAll(linkedList, strArr);
		// Print the above LinkedList received
		System.out.println("Converted LinkedList : "+linkedList);
	}
}*/
/* Method -3
  Java program to convert
  LinkedList to Array
import java.util.*;
public class arrayintoLinkedList 
{
	// Function to convert LinkedList to Array
	public static <T> Object[] convertLinkedListToArray(LinkedList<T> linkedList)
	{

		// Converting LinkedList to Array
		Object[] array = linkedList.toArray();
		return array;
	}
	public static void main(String args[])
	{
		// Creating linked list
		LinkedList<String>linkedList =new LinkedList<>();
		// Adding elements to the linked list
		linkedList.add("G");
		linkedList.add("e");
		linkedList.add("e");
		linkedList.add("k");
		linkedList.add("s");
		System.out.println("Linked list: "+ linkedList);
		// Converting LinkedList to Object Array
		Object[] objArray = convertLinkedListToArray(linkedList);
		String[] array = Arrays.copyOf(objArray,objArray.length,String[].class);
		// Print the String Array
		System.out.println("Array: "+ Arrays.toString(array));
	}
}*/


