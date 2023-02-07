package task;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		System.out.println("Enter the value of c:");
		int c = sc.nextInt();
		
//		if(a>=b && a>=c)
//		{
//			System.out.println(a+" is largest number");
//		}
//		else if(b>=a && b>=c)
//		{
//			System.out.println(b+" is largest number");
//		}
//		else
//		{
//			System.out.println(c+" is largest number");
//		}
//		sc.close();
		
		int max=a;
		if(b>max)
		{
			max=b;
			System.out.println("b is max value");
		}
		else if(c>max)
		{
			max=c;
			System.out.println("c is max value");
		}
		else
		{
			System.out.println("dummy value printed");
		}
		System.out.println(max);
		sc.close();
	}

}
