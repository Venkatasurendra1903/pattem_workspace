package oops;
class Animal                  //parent class            
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal         //child class
{
	void bark()
	{
		System.out.println("barking");
	}
}

public class SingleLevelInheritance
{

	public static void main(String[] args) 
	{
		Dog d = new Dog();       //object creation for child class
		d.eat();                 //method calling
		d.bark();
		
	}

}
