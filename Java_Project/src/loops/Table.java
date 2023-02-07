package loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
		sc.close();

	}

}
