package collections;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
public class HashSetExample 
{
	public static void main(String[] args)
	{
/*		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("one");
		h.add("two");
		h.add("three");
		h.add("four");
		Iterator itr = h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
//		System.out.println("the intial String is:\n"+h);
	
		HashSet<String> h1 = new HashSet<String>();
		h1.add("ten");
		h1.add("30");
		h1.add("3454");
		h1.add("few");
		System.out.println(h1);
//		h.addAll(h1);
//		System.out.println(h);
		
//		ArrayList<String> al = new ArrayList<String>(h);
//		al.add("9");
//		al.add("20");
//		System.out.println(al);
//		for(String i: al)
//		{
//			System.out.println(al+" ");
//		}
//		Iterator<String> itr = al.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+" ");
//		}
	}

}
