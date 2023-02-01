package task;

import java.util.Scanner;

public class LargestElementOfArray {

	public static void main(String[] args) {
//		int [] arr = {25,11,6,35};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements of an array");
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("largest element in array is:"+max);
		sc.close();

	}

}
