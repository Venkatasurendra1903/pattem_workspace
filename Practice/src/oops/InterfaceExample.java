package oops;
class A
{
	public void print1() {System.out.println("hello");}
}
class B extends A
{
	public void print2() {System.out.println("hello2");}
}
interface printable
{
	public  void print3();// {System.out.println("hello3");}
}
class C extends B implements printable 
{
	public void print3() {System.out.println("hello4");}
}
public class InterfaceExample
{

	public static void main(String[] args) 
	{
		C c = new C();
		c.print3();
		c.print2();
		c.print1();
//		
	}

}
