/*Method-1
import java.io.*;
import java.util.List;
import java.util.ArrayList;
class arrayListintoarray
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Object[] objects = al.toArray();
		// Printing array of objects
		for (Object obj : objects)
			System.out.print(obj + " ");
	}
}*/



/*Method-2
import java.io.*;
import java.util.List;
import java.util.ArrayList;

class arrayListintoarray
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Integer[] arr = new Integer[al.size()];
		arr = al.toArray(arr);

		for (Integer x : arr)
			System.out.print(x + " ");
	}
}*/



/* Method-3
import java.io.*;
import java.util.List;
import java.util.ArrayList;

class arrayListintoarray
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Integer[] arr = new Integer[al.size()];

		// ArrayList to Array Conversion
		for (int i = 0; i < al.size(); i++)
			arr[i] = al.get(i);

		for (Integer x : arr)
			System.out.print(x + " ");
	}
}*/


