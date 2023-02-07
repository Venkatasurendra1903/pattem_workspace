package collections;
import java.util.*;
public class HashSetExapmle 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("a");
		hs.add("b");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");

		}
		System.out.println();
		System.out.println(hs);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(2);
		@SuppressWarnings("rawtypes")
		Iterator itr1 = lhs.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
			
		}
		
	}

}
