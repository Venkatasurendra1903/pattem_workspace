package arrayexamples;

import java.util.Scanner;

public class AccessAnArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("enter the elements:");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}			
		sc.close();


	}

}
