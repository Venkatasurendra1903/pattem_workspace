package oops;
class Father                  //parent class 1
{
	void house()
	{
		System.out.println("father has a house");
	}
}
class Mother extends Father          //parent class 2
{
	void car()
	{
		System.out.println("mother has a car");
	}
}
class Child extends Mother             //child class
{
	void both()
	{
		System.out.println("child has both house and car");
	}
}

public class MultilevelInheritance
{

	public static void main(String[] args) 
	{
		Child bd = new Child();
		bd.both();
		bd.car();
		bd.house();
	}

}
