package com.suri.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParametersExample 
{
	@Parameters({"a", "b"})
	@Test(invocationCount = 10)
	public void sum(int a, int b)
	{
		int sum = a + b;
		System.out.println("the sum is:"+ sum);
	}

}
