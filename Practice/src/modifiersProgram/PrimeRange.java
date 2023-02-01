package modifiersProgram;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		int i, found=0;
		System.out.println("enter n value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("prime numberts between 1 to"+n+"are");
		for(int j=2;j<=n;j++)
		{
			found=0;
			for(i=2;i<j;i++)
			{
				if(j%i==0)
				{
					found=1;
				}
			}
			if(found==0)
			{
				System.out.println(j+" ");
			}
		}
		sc.close();
	}

}
