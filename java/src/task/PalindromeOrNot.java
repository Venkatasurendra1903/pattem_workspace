package task;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int rem, rev=0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		sc.close();
		

	}

}
