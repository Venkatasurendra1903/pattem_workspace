 package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class FlipcartHooks {
	
	@Before
	public void setup()
	{
		System.out.println("launch flipcart application");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("close the browser");
	}
}
