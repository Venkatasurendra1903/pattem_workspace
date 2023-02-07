package conditionalStatements;

import java.util.Scanner;

public class IntegerEqualsTo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st string value str1:");
		String str1="abc";
		System.out.println("entr the 2nd stirng value str2: ");
		String str2 = "abc"; 
		System.out.println(str1==str2);
		if(str1==str2)
		{
			System.out.println(str1+" is equal to  "+str2);
		}
		else
		{
			System.out.println(str1+" is not equal to "+str2);
		}
		sc.close();
		
	}

}
