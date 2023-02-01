package com.suri.test;

import org.testng.annotations.Test;

public class GroupingExample3
{
	@Test(groups = {"sanity"})
	public void x()
	{
		System.out.println("x");
	}
	
	@Test(groups = {"sanity", "regression","windows"})
	public void y()
	{
		System.out.println("y");
	}
	
	@Test(groups = {"sanity", "windows"})
	public void z()
	{
		System.out.println("z");
	}

}
