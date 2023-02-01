package com.suri.test;

import org.testng.annotations.Test;

public class GroupingExample1 
{
	@Test(groups = "smoke", priority = 0)
	public void one()
	{
		System.out.println("one");
	}
	
	@Test(groups ={"smoke", "sanity"}, priority=1)
	public void two()
	{
		System.out.println("two");

	}

	@Test(groups = {"smoke", "regression", "functional"}, priority = 2)
	public void three()
	{
		System.out.println("three");

	}


}
