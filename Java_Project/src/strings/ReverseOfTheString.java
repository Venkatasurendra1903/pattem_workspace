package strings;

public class ReverseOfTheString 
{
	public static void main(String[] args)
	{
		String str = "welcome to javatpoint";
		int size = str.length();
		System.out.println("The original string is:"+str);
		for(int i=0;i<size;i++)
		{
			System.out.print(str.charAt(str.length()-i-1));
		}
	}

}
