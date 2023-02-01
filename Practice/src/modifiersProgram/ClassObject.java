package modifiersProgram;

import java.util.Scanner;

public class ClassObject 
{
	static int sum()
	{
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter a value:");
			 int a = sc.nextInt();
			 System.out.print("enter b value:");
			 int b = sc.nextInt();
			 int sum = a + b;
			 return sum;
		}
	}
	static int sum1(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
	static String sum2()
	{
		String sum2 = "suri";
		return sum2;
	}
	static String sum3(String fname)
	{
//		System.out.println(fname);
		fname = "suri";
		return fname;
	}
	static void swap(int a, int b)
	{
		 int temp = a;
		 a = b;
		 b = temp;
	}
	 
	public static void main(String[] args)
	{
		sum();
		System.out.println(sum2());
//		int ans = sum();
//		System.out.println("the sum is: "+ans);
//		int ans1 = sum1(2, 4 );
//		System.out.println("the ans is: "+ ans1);
//		sum3("suri");
//		String ans2 = sum2();
//		System.out.println(ans2);
//		String ans4 = sum3(fname);
//		System.out.println(ans4);
//		String ans = sum2();
//		System.out.println(ans);
		
//		swap(2,4);
//		System.out.println(a+" "+b]);
	}
	
	
}
