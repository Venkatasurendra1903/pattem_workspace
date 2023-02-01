package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraysExample1 
{

	public static void main(String[] args)
	{
//		String[] a = {"one", "two", "three", "four"};
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//			System.out.println(Arrays.toString(a));
//		}
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		str[3] = "fv";
		System.out.println(Arrays.toString(str));
		sc.close();

	}

}
