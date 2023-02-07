package pack;

import java.util.Scanner;

class Student
{
	int roll_no;
	String name;
	Student(int roll_no, String name)
	{
		this.name=name;
		this.roll_no=roll_no;
	}
}
public class ArrayExample
{

	public static void main(String[] args) 
	{
		System.out.println("enter the roll numbers:");
		Student arr[] = new Student[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the student names:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = new Student(sc.nextInt(),sc.next());
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].name + arr[i].roll_no);
		}
		sc.close();
		
	}

}
