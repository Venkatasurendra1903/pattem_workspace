package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		Collections.addAll(list, "C", "D");
		System.out.println("print the list elements:\n"+list);
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("E");
		list1.add("F");
		System.out.println("print the list1 elements:\n"+list1);
		list1.addAll(list);
		System.out.println("after adding list and list1 is:\n"+list1);
		Collections.sort(list1);
		System.out.println("the list1 after sorting is:\n"+list1);
		Collections.reverse(list1);
		System.out.println("the list1 after reverse:\n"+list1);
		Collections.copy(list1, list);
		System.out.println("the list1 after copying the list to list1 is:\n"+list1);
		Collections.shuffle(list1);
		System.out.println("suffule the list1 is:\n"+list1);
		Collections.swap(list1, 2, 4);
		System.out.println(list1);
		Collections.binarySearch(list1,"A");
		System.out.println(list1);
		
	}

}
