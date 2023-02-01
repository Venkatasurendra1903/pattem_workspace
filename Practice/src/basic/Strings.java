package basic;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) 
	{
				String str;
				System.out.println("enter a string");
				Scanner sc = new Scanner(System.in);
				str=sc.next();
				int a;
				System.out.println("enter a integer");
				a=sc.nextInt();
				float b;
				System.out.println("enter a float");
				b=sc.nextFloat();
				System.out.print(str+" ");
				System.out.print(a+" ");
				System.out.print(b);
				
				sc.close();

			}


	}

