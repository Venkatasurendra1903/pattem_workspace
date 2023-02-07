package pack;

public class Encapsulation_account
{

	public static void main(String[] args)
	{
		Account acc = new Account();
		acc.setAcc_no(948293875L);
		acc.setName("suri");
		acc.setEmail("skjfnjshd@gmail.com");
		acc.setAmount(4567f);
		System.out.println(acc.getAcc_no());;
		System.out.println(acc.getEmail());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}

}
