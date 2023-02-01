package com.suri.test;

import org.testng.annotations.Test;

public class GroupingExample2 
{
	@Test(groups = {"smoke"})
	public void four()
	{
		System.out.println("four");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void five()
	{
		System.out.println("five");
	}
	
	@Test(groups = {"sanity", "windows"})
	public void six()
	{
		System.out.println("six");
	}

}
