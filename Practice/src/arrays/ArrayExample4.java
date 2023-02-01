package arrays;

import java.util.Scanner;
class Student
{
	int roll_no;
	String name;
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class ArrayExample4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		System.out.println("enter the names of the students along with their roll number:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Student(sc.nextInt(),sc.next());
//			System.out.println("the roll number "+arr[i].roll_no+" "+arr[i].name);
		}
		for(int i=0;i<arr.length;i++)
		{
//			arr[i]=new Student(sc.nextInt(),sc.next());
			System.out.println("the roll number "+arr[i].roll_no+" "+arr[i].name);
			sc.close();
		}
	}

}
