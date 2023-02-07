package javaMethods;

public class MethodWithIfElse 
{
	static void age(int age)
	{
		if(age<18)
		{
			System.out.println("Access granted");
		}
		else
		{
			System.out.println("Access denied");
		}
	}

	public static void main(String[] args) 
	{
		age(20);
	}

}
