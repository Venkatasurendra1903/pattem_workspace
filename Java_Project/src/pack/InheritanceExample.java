package pack;
class employee
{
//	void salary()
//	{
//		System.out.println("salary is 40000");
//	}
	float salary = 40000;
}
public class InheritanceExample extends employee
{
//	void bonus()
//	{
//		System.out.println("bonus is 10000");
//	}
	int bonus = 10000;
	
	public static void main(String[] args) 
	{
		InheritanceExample obj = new InheritanceExample();
//		obj.bonus();
//		obj.salary();
		System.out.println("the salary is:"+obj.salary);
		System.out.println("the bonus is:"+obj.bonus);
	}
}

