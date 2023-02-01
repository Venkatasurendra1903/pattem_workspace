package collections;

//import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample 
{
	public static void main(String[] args) 
	{
		TreeSet<String> t = new TreeSet<String>();
		t.add("1");
		t.add("2");
		t.add("3");
		t.add("4");
		t.add("5");
		t.descendingIterator();
//		while(i.hasNext())
//		{
//			System.out.print(i.next());
//			
//		}
		System.out.println("initial set is:\n"+t);
		System.out.println("lowest value:\n"+t.pollLast());
		System.out.println("highest value:\n"+t.pollFirst());
		System.out.println(t.headSet("c"));
		System.out.println(t.subSet("1", "5"));
	}

}
