package File_handling;

import java.io.FileOutputStream;
import java.util.Scanner;

public class File_creating {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the file name with location path:");
			String fileName = sc.nextLine();		//sc.nextLine()--> to read the sentence
			FileOutputStream fos = new FileOutputStream(fileName, true);
			System.out.println("enter the file content:");
			String content = sc.nextLine();
			byte b[] = content.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("file is saved on the given location path");
		}
		catch (Exception e)
		{
			System.out.println("some exception is coming...");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
