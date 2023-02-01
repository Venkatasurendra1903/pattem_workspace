package com.suri.test;

import org.testng.annotations.Test;

public class Dependencies
{
	@Test
	public void x()
	{
//		System.out.println(5/0);
		System.out.println("x");
	}
	
	@Test(dependsOnMethods= {"x"})
	public void y()
	{
		System.out.println("y");
	}
	
	@Test
	public void z()
	{
		System.out.println("z");
	}

}
