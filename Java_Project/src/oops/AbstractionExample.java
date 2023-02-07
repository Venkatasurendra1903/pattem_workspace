package oops;
abstract class Animals
{
	public abstract void animalSound();
	public void sleep() 
	{
		System.out.println("zzz");
	}
}
class pig extends Animals
{
	public void animalSound()
	{
		System.out.println("pig");
	}
}
public class AbstractionExample 
{

	public static void main(String[] args) 
	{
		pig obj = new pig();
		obj.animalSound();
		obj.sleep();
	}

}
