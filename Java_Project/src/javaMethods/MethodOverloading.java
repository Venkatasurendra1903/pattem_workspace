package javaMethods;

public class MethodOverloading 
{
	static int add(int x,int y)
	{
		return x+y;
	}
	static double add(double x, double y)
	{
		return x+y;
	}

	public static void main(String[] args) 
	{
//		System.out.println("int:"+add(4,6));
//		System.out.println("double:"+add(3.5,6.3));
		int a = add(5,8);
		double b = add(4.3,7.24);
		System.out.println("int:"+a);
		System.out.println("double:"+b);

	}

}
