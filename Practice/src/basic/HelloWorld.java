
package basic;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) 
	{
		System.out.println("enter a integer");
		int a;String b;float c;double d;boolean e; byte f; long g;
		try (Scanner sc = new Scanner(System.in)) {
			a=sc.nextInt();
			System.out.println("enter a string");
			b=sc.next();
			char ch = b.charAt(4);
			System.out.println("enter a float");
			c=sc.nextFloat();
			System.out.println("enter a double");
			d=sc.nextDouble();
			System.out.println("enter a boolean");
			e=sc.nextBoolean();
			System.out.println("enter a byte");
			f=sc.nextByte();
			System.out.println("enter a long");
			g=sc.nextLong();
			short h;
			System.out.println("enter a short");
			h=sc.nextShort();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			System.out.println(h);
			System.out.println(ch);
		}
		
	}
	

}