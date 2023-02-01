package oops;
interface printable1
{
	void print();
}
interface showble
{
	void show();
}
class Test implements printable1,showble
{
	public void print() {System.out.println("print hello");}
	public void show() {System.out.println("show hello");}
}

public class MultipleInheritanceByInterface
{

	public static void main(String[] args) 
	{
		Test a = new Test();
		a.print();
		a.show();
	}

}
