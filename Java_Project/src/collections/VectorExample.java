package collections;
import java.util.Vector;

public class VectorExample 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		
		Vector v = new Vector();
		v.add(1);
		v.add("2");
		System.out.println(v);
		System.out.println("the replaced values are:\n"+v.set(1,21));
		v.set(1, 21);
		System.out.println(v);
	}

}
