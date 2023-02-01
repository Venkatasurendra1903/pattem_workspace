package basic;

import java.util.Scanner;

public class CallingMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value:");
		int x = sc.nextInt();
		System.out.println("enter the second value:");
		int y = sc.nextInt();
		int a;
		a=Math.addExact(x, y);
		System.out.println("the sum is:"+a);
		
		
		sc.close();
	}


}
