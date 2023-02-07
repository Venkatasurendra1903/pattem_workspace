package basic;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int a; float b;double sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer a:");
		a=sc.nextInt();
		System.out.println("enter the integer b:");
		b=sc.nextFloat();
		sum=a+b;
		System.out.println(sum);
		sc.close();
		
	}


}
