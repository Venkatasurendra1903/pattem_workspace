package exceptionHandling;
public class TryCatchMethod1_unckecked
{
	public static void main(String[] args) 
	{
//		int i, j, k = 0;
//		
//		i = 8;
//		j = 0;
//		
//		
//		try
//		{
//			k = i / j;
//			System.out.println(k);
//		}
//			catch(ArithmeticException e)
//		{
//				System.out.println("can't divided by zero");
//				System.out.println(e.getMessage());		// to get the error msg
//				e.printStackTrace();	//to specify the particular error location
//				
//		}
		
		
		
		try{
			int a[] = new int[4];
			for(int c = 0; c <= 5; c++)
			{
				a[c]=c+1;
			}
			for(int value:a)
			{
				System.out.println(value);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("success"+e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
