package conditionalStatements;

public class Armstrong {

	public static void main(String[] args) {
		int n=371,realnumber,rem,result=0;
		realnumber=n;
		while(n!=0)
		{
			rem=realnumber%10;
			result+=Math.pow(rem, 3);
			realnumber/=10;
		}
		if(result==n)
		{
			System.out.println(n+" is armstrong");
		}
		else
		{
			System.out.println(n+" is not an armstrong");
		}

	}

}
