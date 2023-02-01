package com.suri.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DP_parameters
{
	

/*Object[] type for any parameter */

	@Test(dataProvider = "dp1")
	public void login(Object i)
	{
		System.out.println(i);
		
	}
	@DataProvider(indices = {0,3,4})
	public Object[] dp1()
	{
		Object[] data = new Object[]
		{
			1 , "suri", 20, "four", 4.6
		};
		return data;
	}

/*String type */


//	@Test(dataProvider = "dp1")
//	public void login(String[] s)
//	{
//		for(int i = 0; i < s.length; i++)
//		{
//			System.out.println(s[i]);
//		}
//		System.out.println(">>>");
//		
//	}
//
//	
//	@DataProvider()
//	public String[][] dp1()
//	{
//		String[][] data = new String[][]
//		{
//			{"one", "two"},
//			{"three", "four"},
//			{"five", "six"}
//		};
//		return data;
//	}

/* list */
//	@Test(dataProvider = "dp1")
//	public void login(String s) throws Exception  
//	{
//		System.out.println(s);
//		
//	}
//
//	
//	@DataProvider()
//	public Iterator<String> dp1()
//	{
//		List<String> data = new ArrayList<>();
//		{
//			data.add("suri");
//			data.add("is");
//			data.add("only");
//			data.add("one");
//		};
//		return data.iterator();
//	}


}
