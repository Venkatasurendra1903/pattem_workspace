package strings;

public class Example1
{
	public static void main(String[] args)
	{
		String str = "Welcome to javatpoint portal";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(i%2!=0)
			{
				System.out.println("char at "+i+" place "+str.charAt(i));
			}
		}

	}

}
