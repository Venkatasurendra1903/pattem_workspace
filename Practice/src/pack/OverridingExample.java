package pack;
class A
{
	public void print()
	{
		System.out.println("A printed");
	}
}
class B extends A
{
	public void print()
	{
		System.out.println("A printed and B printed");
	}
}
class C extends B
{
	@Override
	public void print()
	{
		System.out.println("A printed, B printed and C printed");
	}
}

public class OverridingExample
{

	public static void main(String[] args)
	{
		C obj = new C();
		obj.print();
//		obj.printB();
//		obj.printA();
	}

}
