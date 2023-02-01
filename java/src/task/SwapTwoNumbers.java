package task;
import java.util.Scanner;
public class SwapTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

}
