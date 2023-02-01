package pack;
class X
{
	X get()
	{
		return this;
	}
}
class Y extends X
{
	Y get()
	{
		return this;
	}
	void msg()
	{
		System.out.println("welcome");
	}
}
public class Covarient
{

	public static void main(String[] args)
	{
		Y obj = new Y();
		obj.get().msg();
	}

}
