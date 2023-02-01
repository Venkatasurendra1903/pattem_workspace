package File_handling;

import java.io.File;
import java.util.Scanner;

public class readFileUsingScanner {

	public static void main(String[] args) 
	{
		Scanner sc = null;
		File obj = new File("C:\\suri.txt");
		try
		{
			sc = new Scanner(obj);
			System.out.println("the content is :");
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}


	}

}
