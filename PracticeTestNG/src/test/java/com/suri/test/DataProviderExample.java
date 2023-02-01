package com.suri.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample 
{
	@Test(dataProvider = "loginData")
	public void TestLogin(String userName, String password) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys(password);
		driver.findElement(By.name("login-button")).click();
//		driver.findElement(By.xpath("//span[text()='Products']"))
		String s = driver.getTitle();
		System.out.println("the title of the page is:"+s);
//		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		Thread.sleep(5000);
		driver.quit();
	}
	
	@DataProvider
	public Object[][] loginData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";
		
		data[1][0] = "suri";
		data[1][1] = "secret_sauce";
		
		return data;
	}
}

