package arrays;

import java.util.Scanner;

public class ArrayExample
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		System.out.println("enter the elements");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
			System.out.println();
		}
		System.out.println("the sum of elements in the array is:"+sum);
		sc.close();

	}

}
