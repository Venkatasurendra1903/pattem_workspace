package collections;
import java.util.ArrayList;
import java.util.Collections;
public class MethodsOfCollectionInterface
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);      //add values using 'add()' method
		i.add(2);
		i.add(3);
		Collections.addAll(i, 4,5,6,7,8,9);   //add many values using 'addAll()' method
		for(Integer j:i)        //printing the values using for_each loop
		{
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("print the ArrayList i:\n"+i);
//		System.out.println(i.clear());
		/* 
		i.clear();
		System.out.println(i);
		*/
		System.out.println("the ArrayList i contains 4 or not:\n"+i.contains(4));
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		System.out.println(a);
		System.out.println(a.equals(i));
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		System.out.println(b);
		Collections.shuffle(b);
		System.out.println(b);
		Collections.sort(b);
		System.out.println(b);

		
//		b.removeIf(n->(n%20==0)? YES : NO);
//		System.out.println(b);
		
		
	}

}
