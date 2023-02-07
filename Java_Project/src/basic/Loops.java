package basic;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		int a;int b;int i;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting number:");
		a=sc.nextInt();
		System.out.println("enter the ending number:");
		b=sc.nextInt();
		for(i=a;i<=b;i++) 
		{
			
			System.out.print(i+",");
		}
		
		sc.close();
	}
}
