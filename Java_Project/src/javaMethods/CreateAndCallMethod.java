package javaMethods;

public class CreateAndCallMethod 
{
	static void myMethod()
	{
		System.out.println("call a method");
	}
	public static void main(String[] args) 
	{
//		CreateAndCallMethod.myMethod();
		for(int i=0;i<5;i++)
		{
			myMethod();
		}
//		myMethod();
	}

}
