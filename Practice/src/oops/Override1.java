package oops;
class vehicle
{
	void run()

	{
		System.out.println("vehicle running");
	}
}
class bike extends vehicle
{
	@Override
	void run()
	{
		System.out.println("bike running");
	}
}

public class Override1
{

	public static void main(String[] args) 
	{
		bike obj = new bike();
		obj.run();
	}

}
