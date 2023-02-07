package oops;
class adding
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static String add(String a, String b, String c)
	{
		return a+b+c;
	}
}

public class Overloading 
{

	public static void main(String[] args) 
	{
//		adding obj = new adding();
//		obj.add(2, 4);
		System.out.println(adding.add(3, 4));
		System.out.println(adding.add("hp","dell","lenovo"));
	}

}
