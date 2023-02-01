package javaMethods;

public class MethodWithMultipleParameters 
{
	static void myMethod(int age, String name)
	{
		System.out.println(age+" for "+name);
	}

	public static void main(String[] args) 
	{
		MethodWithMultipleParameters.myMethod(3, " suri");
		MethodWithMultipleParameters.myMethod(5, " me");

	}

}
