package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample
{
	public static void main(String[] args) 
	{
		ArrayList<String> List = new ArrayList<String>();                    //creating new arrayList named as List
		System.out.println("the values in the list are:");
		List.add("one");
		List.add("two");                                                    //add elements in list using 'add()' method 
		List.add("three");
		List.add("four");
		System.out.println(List);
		System.out.println("print the values to array using for loop:");
		for(int i=0;i<List.size();i++)                                      //Print the elements using for loops
		{
			System.out.print(List.get(i)+" ");
		}
		System.out.println();
		System.out.println("print the elements using toString method:");
		System.out.println(List.toString());                                //print the elements using 'toString()' method 
		System.out.println("print the elements using for_each loops:");
		for(String i:List)                                                  //Print the elements using for_each loops
		{
			System.out.print(i+" ");
		}
		List.add(2, "five");                                               //add the elements certain index by using add(index, "elements")
		List.add(3,"six");
		System.out.println();
		System.out.println("after adding some elements in the list:\n"+List);
		System.out.println("the size of the List is:\n"+List.size());           //print the size of arrayList using 'size()' method
		System.out.println(List);
		System.out.println(List.contains("seven"));    //check the elements are present or not in the list by using 'contains()' method
		System.out.println(List.contains("one"));
		List.set(2, "seven");                     //override the elements using 'set()' method
		System.out.println("after override index 2 is:\n"+List);
		List.remove(3);                             //remove the particular index value using 'remove(index)' method
		System.out.println("the list after removing 3 index is:\n"+List);
		List.remove("seven");                     // remove the particular elements in the list using 'remove("element")'
		System.out.println("after removing elements seven is:\n"+List);
		System.out.println(List.contains("two"));
//		List.removeAll(List);                          //remove all the elements in the list using 'reoveAll()' method
//		System.out.println(List);
//		System.out.println(List.removeAll(List));
		ArrayList<String> List1 = new ArrayList<String>();
		System.out.println("creating new list with List2 name is:");
		List1.add("a");
		List1.add("b");
		List1.add("c");
		List1.add("d");
		for(String j:List1)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println(List1);
		List1.addAll(List);
		System.out.println("after adding list and list1 elements:\n"+List1);
		Collections.reverse(List1);         //reverse the all values present in the list using'reverse()' method
		System.out.println("the reverse of the list1 is:\n"+List1);
		Collections.sort(List1);           // sort the values using 'sort()' method
		System.out.println("the sorting of list1 is:\n"+List1);
		Collections.copy(List1, List);     // copy the values form one list to other using 'copy()' method
		ArrayList<String> List2 = new ArrayList<String>();
		System.out.println("creating new list with name List2 is:");
		List2.add("he");
		List2.add("she");
		List2.add("it");
		List2.add("they");
		System.out.println(List2);
		System.out.println();
		System.out.println();
		System.out.println();
		List.clone();
		System.out.println("clone the list is:\n"+List);
		List1.clone();
		System.out.println("clone the list1 is:\n"+List1);
		List2.clone();
		System.out.println("clone the list2 is:\n"+List2);
		List2.addAll(List1);
		System.out.println("add list1 with list2 is:\n"+List2);
		List2.removeAll(List2);
		System.out.println("after removing list2:\n"+List2);
		System.out.println("the list2 is empty or not:\n"+List2.isEmpty());
//		List2.ensureCapacity(5);
//		System.out.println(List2);
//	
		
	}

}
