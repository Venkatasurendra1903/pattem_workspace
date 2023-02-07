package task;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of p:");
		float p=sc.nextFloat();
		System.out.println("enter the value of t:");
		float t = sc.nextFloat();
		System.out.println("enter the value of r:");
		float r = sc.nextFloat();
		float SI = (p*t*r)/100;
		System.out.println("Simple interest is:"+SI);
		
		sc.close();
	}

}
