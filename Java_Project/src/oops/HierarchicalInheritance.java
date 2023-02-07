package oops;
class Parent               //Parent class
{
	void threehouses()
	{
		System.out.println("parenrt has three houses");
	}
}
class child_one extends Parent          //class for first child
{
	void one_house()
	{
		System.out.println("child_one got one house from parent");
	}
}
class child_two extends Parent         //class for second child
{
	void two_house()
	{
		System.out.println("child_two gor a house from parent");
	}
}

public class HierarchicalInheritance 
{

	public static void main(String[] args) 
	{
		child_two ct = new child_two();     //object creation for second child
		child_one co = new child_one();     //object creation for first child
		ct.two_house();
		co.one_house();
		ct.threehouses();

	}

}
