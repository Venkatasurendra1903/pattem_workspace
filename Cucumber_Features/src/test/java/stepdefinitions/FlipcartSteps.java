package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartSteps
{
	
	WebDriver driver; 
//	Product product;
//	Search search;
	
	@Given("I am on filpcart page")
	public void i_am_on_filpcart_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    
	}
	@Given("I have a search field on flipcart page")
	public void i_have_a_search_field_on_flipcart_page() {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		driver.findElement(By.xpath("//input[@class='_3704LK']")).click();
	   System.out.println("I am on search page");
	   
	}

	@When("I search for a product with name {string}")
	public void i_search_for_a_product_with_name(String productName) {
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("realme 7",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Then("product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) throws InterruptedException {
		System.out.println( productName+ " is displayed");
//		Thread.sleep(4000);
		
		
	}
	@Then("Click on that {string} product")
	public void click_on_that_product(String string) {
	    driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/descendant::div[@class='_4rR01T' and text()='realme 7 (Mist White, 64 GB)']")).click();
	    
	}

	

}
