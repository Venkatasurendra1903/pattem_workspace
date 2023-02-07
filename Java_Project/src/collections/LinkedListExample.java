package collections;
import java.util.*;

public class LinkedListExample 
{
	public static void main(String[] args)
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("A");
		l1.add("B");
		l1.addFirst("C");
		l1.addLast("D");;
		l1.add(3,"E");
		System.out.println(l1);
//		Collections.shuffle(l1);
//		System.out.println(l1);
//		Collections.sort(l1);
//		System.out.println(l1);
//		l1.remove(0);
//		System.out.println(l1);
//		l1.removeFirst();
//		System.out.println(l1);
//		l1.removeLast();
//		System.out.println(l1);
		l1.set(2, "X");
		System.out.println(l1);
		
		
	}

}
