package collections;
import java.util.*;
public class SetExample
{
//	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
/*		HashSet h = new HashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		System.out.println(h.add("B"));
		 System.out.println(h);
*/		
		Integer[] A = {10,20,30,40,50};
		Integer[] B = {100,50,10,200,80};
		Set<Integer> s1 = new HashSet<Integer>();
		s1.addAll(Arrays.asList(A));
		Set<Integer>s2 = new HashSet<Integer>();
		s2.addAll(Arrays.asList(B));
		Set<Integer> union_data = new HashSet<Integer>(s1);
		union_data.addAll(s2);
		System.out.println("union of s1 and s2 is:\n"+union_data);
		Set<Integer> intersection_data = new HashSet<Integer>(s1);
		intersection_data.retainAll(s2);
		System.out.println("the intersection of s1 and s2 is:\n"+intersection_data);
		Set<Integer> difference_data = new HashSet<Integer>(s1);
		difference_data.removeAll(s2);
		System.out.println("the difference of s1 and s2 is:\n"+difference_data);
	
	}

}
